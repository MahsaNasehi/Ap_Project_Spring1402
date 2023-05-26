package Server;

import DataBase.SQLConnection;
import DataBase.TableOfUsers;
import User.FakeUser;
import User.SocketModel;
import User.Api;
import Common.Tweet;

import java.sql.SQLException;

public class UserHandler implements UserPages {

    public <T> SocketModel signInPage(String userName, String password) throws SQLException {
        T out = SQLConnection.getUsers().select(new FakeUser(userName, password));

        if (out == null) {
            return new SocketModel(Api.TYPE_SIGNIN, (ResponseOrErrorType) out, null);
        } else {
            return new SocketModel(Api.TYPE_SIGNIN, (FakeUser)out);
        }
    }

    @Override
    public SocketModel signUpPage(String username, String firstName, String lastName, String email, String phoneNumber, String password, String birthDate) throws SQLException {
        FakeUser userModule = new FakeUser(username, password, firstName, lastName, email, phoneNumber, birthDate);
        TableOfUsers table = SQLConnection.getUsers();
        if (table.userNameExists(username)){
            return new SocketModel(Api.TYPE_SIGNUP, ResponseOrErrorType.DUPLICATE_USERNAME, false);
        }
        if (table.nameExists(firstName, lastName)) {
            return new SocketModel(Api.TYPE_SIGNUP, ResponseOrErrorType.DUPLICATE_ACCOUNTNAME, false);
        }
        if (table.emailExists(email)){
            return new SocketModel(Api.TYPE_SIGNUP, ResponseOrErrorType.DUPLICATE_EMAIL, false);
        }
        if (table.phoneNumberExists(phoneNumber)){
            return new SocketModel(Api.TYPE_SIGNUP, ResponseOrErrorType.DUPLICATE_PHONENUMBER, false);
        }
        if (SQLConnection.getUsers().insert(userModule)) {
            return new SocketModel(Api.TYPE_SIGNUP, ResponseOrErrorType.SUCCESSFUL, true);
        } else {
            return new SocketModel(Api.TYPE_SIGNUP, ResponseOrErrorType.UNSUCCESSFUL, false);
        }
    }

    @Override
    public void homePage() {

    }

    @Override
    public SocketModel addTweet(Tweet tweet) {
        return TweetsFileConnection.addTweet(tweet);
    }
    public SocketModel tweetShowPage(){
    return null;
    }
    @Override
    public void searchInUsers() {

    }

    @Override
    public void userInfoPage() {

    }

    @Override
    public void showTimeLine() {

    }
}
