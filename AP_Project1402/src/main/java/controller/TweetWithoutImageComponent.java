package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import model.client.SendMessage;
import model.common.Api;
import model.common.ResponseOrErrorType;
import model.common.SocketModel;
import model.common.Tweet;

import java.io.File;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class TweetWithoutImageComponent extends AnchorPane{





    private VBox first_layer_vbox;
    private HBox second_layer_hbox1;
    private HBox second_layer_hbox2;
    private Line line1;
    private Line line2;
    private VBox third_layer_vbox1;
    private VBox third_layer_vbox2;
    private Label likes_label;
    private Label retweets_label;
    private Label quotes_label;
    private Label replies_label;
    private HBox fourth_layer_hbox;
    private VBox fourth_layer_vbox;
    private Button like_button;
    private Button retweet_button;
    private Button quote_button;
    private Circle profile_photo;
    private Label name_label;
    private Label username_label;
    private TextArea tweet_text;
    private Tweet tweet;


    public TweetWithoutImageComponent(Tweet tweet , String myUsername , Socket socket, ObjectOutputStream writer, String jwt) {
        super();
        this.tweet = tweet;
        //making
        first_layer_vbox = new VBox();
        second_layer_hbox1 = new HBox();
        second_layer_hbox2 = new HBox();
        line1 = new Line();
        line2 = new Line();
        third_layer_vbox1 = new VBox();
        third_layer_vbox2 = new VBox();
        likes_label = new Label();
        retweets_label = new Label();
        quotes_label = new Label();
        replies_label = new Label();
        fourth_layer_hbox = new HBox();
        fourth_layer_vbox = new VBox();
        like_button = new Button("like");
        retweet_button = new Button();
        quote_button = new Button();
        profile_photo = new Circle();
        name_label = new Label();
        username_label = new Label();
        tweet_text = new TextArea();
        //container
        this.getChildren().add(first_layer_vbox);
        //first-layer
        first_layer_vbox.getChildren().add(second_layer_hbox1);
        first_layer_vbox.getChildren().add(line1);
        first_layer_vbox.getChildren().add(second_layer_hbox2);
        first_layer_vbox.getChildren().add(line2);
        //second-layer
        second_layer_hbox1.getChildren().add(third_layer_vbox1);
        second_layer_hbox1.getChildren().add(third_layer_vbox2);
        second_layer_hbox2.getChildren().add(likes_label);
        second_layer_hbox2.getChildren().add(retweets_label);
        second_layer_hbox2.getChildren().add(quotes_label);
        second_layer_hbox2.getChildren().add(replies_label);
        //third-layer
        third_layer_vbox1.getChildren().add(fourth_layer_hbox);
        third_layer_vbox1.getChildren().add(fourth_layer_vbox);
        third_layer_vbox2.getChildren().add(like_button);
        third_layer_vbox2.getChildren().add(retweet_button);
        third_layer_vbox2.getChildren().add(quote_button);
        //fourth_layer
        fourth_layer_hbox.getChildren().add(profile_photo);
        fourth_layer_hbox.getChildren().add(name_label);
        fourth_layer_hbox.getChildren().add(username_label);
        fourth_layer_vbox.getChildren().add(tweet_text);

        //nodes
        //AnchorPane
        this.setMinWidth(USE_PREF_SIZE);
        this.setMinHeight(USE_PREF_SIZE);
        this.setPrefWidth(850);
        this.setPrefHeight(USE_COMPUTED_SIZE);
        this.setMaxWidth(USE_PREF_SIZE);
        this.setMaxHeight(USE_PREF_SIZE);

        //first_layer_vbox
        first_layer_vbox.setAlignment(Pos.TOP_CENTER);
        first_layer_vbox.setPadding(new Insets(0,0,5,0));
        first_layer_vbox.setMinWidth(USE_PREF_SIZE);
        first_layer_vbox.setMinHeight(USE_PREF_SIZE);
        first_layer_vbox.setPrefWidth(850);
        first_layer_vbox.setPrefHeight(USE_COMPUTED_SIZE);
        first_layer_vbox.setMaxWidth(USE_PREF_SIZE);
        first_layer_vbox.setMaxHeight(USE_PREF_SIZE);

        //second-layer-hbox1
        second_layer_hbox1.setMinWidth(USE_PREF_SIZE);
        second_layer_hbox1.setMinHeight(USE_PREF_SIZE);
        second_layer_hbox1.setPrefWidth(850);
        second_layer_hbox1.setPrefHeight(USE_COMPUTED_SIZE);
        second_layer_hbox1.setMaxWidth(USE_PREF_SIZE);
        second_layer_hbox1.setMaxHeight(USE_PREF_SIZE);

        //line1
        line1.setStroke(Paint.valueOf("#000000"));
        line1.setStrokeWidth(1);
        line1.setOpacity(0.18);
        line1.setStartX(-90);
        line1.setStartY(0);
        line1.setEndX(741);
        line1.setEndY(0);

        //second_layer_hbox2
        second_layer_hbox2.setAlignment(Pos.CENTER);
        second_layer_hbox2.setPadding(new Insets(5,5,5,5));
        second_layer_hbox2.setSpacing(160);
        second_layer_hbox2.setMinWidth(USE_PREF_SIZE);
        second_layer_hbox2.setMinHeight(USE_PREF_SIZE);
        second_layer_hbox2.setPrefWidth(850);
        second_layer_hbox2.setPrefHeight(USE_COMPUTED_SIZE);
        second_layer_hbox2.setMaxWidth(USE_PREF_SIZE);
        second_layer_hbox2.setMaxHeight(USE_PREF_SIZE);

        //line2
        line2.setStroke(Paint.valueOf("#209de5"));
        line2.setStrokeWidth(2);
        line2.setOpacity(0.43);
        line2.setStartX(-100);
        line2.setStartY(0);
        line2.setEndX(751);
        line2.setEndY(0);

        //third_layer_vbox1
        third_layer_vbox1.setMinWidth(USE_PREF_SIZE);
        third_layer_vbox1.setMinHeight(USE_PREF_SIZE);
        third_layer_vbox1.setPrefWidth(740);
        third_layer_vbox1.setPrefHeight(USE_COMPUTED_SIZE);
        third_layer_vbox1.setMaxWidth(USE_PREF_SIZE);
        third_layer_vbox1.setMaxHeight(USE_PREF_SIZE);

        //third_layer_vbox2
        third_layer_vbox2.setAlignment(Pos.TOP_CENTER);
        third_layer_vbox2.setPadding(new Insets(58,20,10,5));
        third_layer_vbox2.setSpacing(15);
        third_layer_vbox2.setMinWidth(USE_PREF_SIZE);
        third_layer_vbox2.setMinHeight(USE_PREF_SIZE);
        third_layer_vbox2.setPrefWidth(740);
        third_layer_vbox2.setPrefHeight(USE_COMPUTED_SIZE);
        third_layer_vbox2.setMaxWidth(USE_PREF_SIZE);
        third_layer_vbox2.setMaxHeight(USE_PREF_SIZE);
        third_layer_vbox2.setStyle("-fx-border-color: black");

        //likes_label
        likes_label.textProperty().bind(new SimpleStringProperty(tweet.getLikes().size()+" Likes"));
        likes_label.setFont(Font.font("System",13));
        likes_label.setMinWidth(USE_COMPUTED_SIZE);
        likes_label.setMinHeight(USE_COMPUTED_SIZE);
        likes_label.setPrefWidth(USE_COMPUTED_SIZE);
        likes_label.setPrefHeight(USE_COMPUTED_SIZE);
        likes_label.setMaxWidth(USE_COMPUTED_SIZE);
        likes_label.setMinHeight(USE_COMPUTED_SIZE);

        //retweets_label
        retweets_label.textProperty().bind(new SimpleStringProperty(tweet.getRetweets().size()+" Retweets"));
        retweets_label.setFont(Font.font("System",13));
        retweets_label.setMinWidth(USE_COMPUTED_SIZE);
        retweets_label.setMinHeight(USE_COMPUTED_SIZE);
        retweets_label.setPrefWidth(USE_COMPUTED_SIZE);
        retweets_label.setPrefHeight(USE_COMPUTED_SIZE);
        retweets_label.setMaxWidth(USE_COMPUTED_SIZE);
        retweets_label.setMinHeight(USE_COMPUTED_SIZE);

        //quotes_label
        quotes_label.textProperty().bind(new SimpleStringProperty(tweet.getQuoteTweets().size()+" Quotes"));
        quotes_label.setFont(Font.font("System",13));
        quotes_label.setMinWidth(USE_COMPUTED_SIZE);
        quotes_label.setMinHeight(USE_COMPUTED_SIZE);
        quotes_label.setPrefWidth(USE_COMPUTED_SIZE);
        quotes_label.setPrefHeight(USE_COMPUTED_SIZE);
        quotes_label.setMaxWidth(USE_COMPUTED_SIZE);
        quotes_label.setMinHeight(USE_COMPUTED_SIZE);

        //replies_label
        replies_label.textProperty().bind(new SimpleStringProperty(tweet.getReplies().size()+" Replies"));
        replies_label.setFont(Font.font("System",13));
        replies_label.setMinWidth(USE_COMPUTED_SIZE);
        replies_label.setMinHeight(USE_COMPUTED_SIZE);
        replies_label.setPrefWidth(USE_COMPUTED_SIZE);
        replies_label.setPrefHeight(USE_COMPUTED_SIZE);
        replies_label.setMaxWidth(USE_COMPUTED_SIZE);
        replies_label.setMinHeight(USE_COMPUTED_SIZE);

        //fourth_layer_hbox
        fourth_layer_hbox.setPadding(new Insets(10,10,10,10));
        fourth_layer_hbox.setSpacing(15);
        fourth_layer_hbox.setMinWidth(USE_PREF_SIZE);
        fourth_layer_hbox.setMinHeight(USE_PREF_SIZE);
        fourth_layer_hbox.setPrefWidth(740);
        fourth_layer_hbox.setPrefHeight(USE_COMPUTED_SIZE);
        fourth_layer_hbox.setMaxWidth(USE_PREF_SIZE);
        fourth_layer_hbox.setMinHeight(USE_PREF_SIZE);

        //fourth_layer_vbox
        fourth_layer_vbox.setAlignment(Pos.TOP_CENTER);
        fourth_layer_vbox.setPadding(new Insets(5,15,10,20));
        fourth_layer_vbox.setSpacing(10);
        fourth_layer_vbox.setMinWidth(USE_PREF_SIZE);
        fourth_layer_vbox.setMinHeight(USE_PREF_SIZE);
        fourth_layer_vbox.setPrefWidth(740);
        fourth_layer_vbox.setPrefHeight(USE_COMPUTED_SIZE);
        fourth_layer_vbox.setMaxWidth(USE_PREF_SIZE);
        fourth_layer_vbox.setMinHeight(USE_PREF_SIZE);

        //like_button
        if(!tweet.isLikedBy(myUsername)){
            like_button.setText("Like");
            like_button.setStyle("-fx-background-color: white;\n" +
                    "    -fx-background-radius: 5px;\n" +
                    "    -fx-text-fill: #ff005e;\n" +
                    "    -fx-border-width: 1px;\n" +
                    "    -fx-border-color: #ff005e;\n" +
                    "    -fx-border-radius: 5px;");
            like_button.setOnMouseEntered(new EventHandler<MouseEvent>(){

                @Override
                public void handle(MouseEvent mouseEvent) {
                    like_button.setStyle("-fx-background-color: #ff005e;\n" +
                            "    -fx-text-fill: #ffffff;");
                }
            });

        }
        else {
            like_button.setText("Unlike");
            like_button.setStyle("-fx-background-color: #ff005e;\n" +
                    "    -fx-background-radius: 5px;\n" +
                    "    -fx-text-fill: white;\n" +
                    "    -fx-border-width: 1px;\n" +
                    "    -fx-border-color: #ff005e;\n" +
                    "    -fx-border-radius: 5px;");
            like_button.setOnMouseEntered(new EventHandler<MouseEvent>(){

                @Override
                public void handle(MouseEvent mouseEvent) {
                    like_button.setStyle("-fx-background-color: white;\n" +
                            "    -fx-text-fill: #ff005e;");
                }
            });
        }
        like_button.setFont(Font.font("System",12));
        like_button.setAlignment(Pos.CENTER_LEFT);
        like_button.setMinWidth(USE_PREF_SIZE);
        like_button.setMinHeight(USE_PREF_SIZE);
        like_button.setPrefWidth(82);
        like_button.setPrefHeight(USE_COMPUTED_SIZE);
        like_button.setMaxWidth(USE_PREF_SIZE);
        like_button.setMinHeight(USE_PREF_SIZE);
        like_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(!tweet.isLikedBy(myUsername)) {
                    SendMessage.write(socket, new SocketModel(Api.TYPE_LIKE, ResponseOrErrorType.UNSUCCESSFUL_FILE), writer);
                    tweet.getLiked(myUsername);
                    like_button.setStyle("-fx-background-color: #ff005e;\n" +
                            "    -fx-background-radius: 5px;\n" +
                            "    -fx-text-fill: white;\n" +
                            "    -fx-border-width: 1px;\n" +
                            "    -fx-border-color: #ff005e;\n" +
                            "    -fx-border-radius: 5px;");
                    like_button.setText("Unlike");
                }
                else{
                    SendMessage.write(socket, new SocketModel(Api.TYPE_UNLIKE, ResponseOrErrorType.UNSUCCESSFUL_FILE), writer);
                    tweet.getUnLiked(myUsername);
                    like_button.setStyle("-fx-background-color: white;\n" +
                            "    -fx-background-radius: 5px;\n" +
                            "    -fx-text-fill: #ff005e;\n" +
                            "    -fx-border-width: 1px;\n" +
                            "    -fx-border-color: #ff005e;\n" +
                            "    -fx-border-radius: 5px;");
                    like_button.setText("Like");
                }
            }
        });

        //retweet_button
        retweet_button.setText("Retweet");
        retweet_button.setFont(Font.font("System",12));
        retweet_button.setAlignment(Pos.CENTER_LEFT);
        retweet_button.setMinWidth(USE_PREF_SIZE);
        retweet_button.setMinHeight(USE_COMPUTED_SIZE);
        retweet_button.setPrefWidth(82);
        retweet_button.setPrefHeight(27);
        retweet_button.setMaxWidth(USE_PREF_SIZE);
        retweet_button.setMinHeight(USE_COMPUTED_SIZE);

        //quote_button
        quote_button.setText("Quote Tweet");
        quote_button.setFont(Font.font("System",12));
        quote_button.setAlignment(Pos.CENTER_LEFT);
        quote_button.setMinWidth(USE_PREF_SIZE);
        quote_button.setMinHeight(USE_COMPUTED_SIZE);
        quote_button.setPrefWidth(82);
        quote_button.setPrefHeight(27);
        quote_button.setMaxWidth(USE_PREF_SIZE);
        quote_button.setMinHeight(USE_COMPUTED_SIZE);

        //profile_photo
        profile_photo.setRadius(16);
        if(tweet.getProfile()!=null && new File(tweet.getProfile()).exists()){
            Image image = new Image(tweet.getProfile());
            profile_photo.setFill(new ImagePattern(image));
        } else {
            Image image = new Image(".//.//.//.//images//download2.png");
            profile_photo.setFill(new ImagePattern(image));
        }

        //name_label
        name_label.setText(tweet.getAuthorName());
        name_label.setFont(Font.font("System",16));
        HBox.setMargin(name_label,new Insets(5,0,0,0));
        name_label.setMinWidth(USE_COMPUTED_SIZE);
        name_label.setMinHeight(USE_COMPUTED_SIZE);
        name_label.setPrefWidth(USE_COMPUTED_SIZE);
        name_label.setPrefHeight(USE_COMPUTED_SIZE);
        name_label.setMaxWidth(USE_COMPUTED_SIZE);
        name_label.setMinHeight(USE_COMPUTED_SIZE);

        //username_label
        String dateToShow = null;
        Date now = new Date();
        long differenceOFDays = now.getTime() - tweet.getDate().getTime();
        differenceOFDays = TimeUnit.MINUTES.convert(differenceOFDays, TimeUnit.MILLISECONDS);
        if(differenceOFDays<60){
            dateToShow = differenceOFDays + "m";
        } else if (differenceOFDays>=60 && differenceOFDays <24*60) {
            dateToShow = differenceOFDays/60 + "h";
        }else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(tweet.getDate());
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            dateToShow = day +" " + monthNames[month];
        }
        username_label.setText("@"+tweet.getAuthorUsername()+ " . " + dateToShow);
        username_label.setFont(Font.font("System",14));
        username_label.setOpacity(0.50);
        HBox.setMargin(username_label,new Insets(8,0,0,0));
        username_label.setMinWidth(USE_COMPUTED_SIZE);
        username_label.setMinHeight(USE_COMPUTED_SIZE);
        username_label.setPrefWidth(USE_COMPUTED_SIZE);
        username_label.setPrefHeight(USE_COMPUTED_SIZE);
        username_label.setMaxWidth(USE_COMPUTED_SIZE);
        username_label.setMinHeight(USE_COMPUTED_SIZE);

        //tweet_text
        tweet_text.setEditable(false);
        tweet_text.setText(tweet.getText());
        tweet_text.setFont(Font.font("System",15));
        tweet_text.setMinWidth(USE_PREF_SIZE);
        tweet_text.setMinHeight(USE_COMPUTED_SIZE);
        tweet_text.setPrefWidth(715);
        tweet_text.setPrefHeight(39);
        tweet_text.setMaxWidth(USE_PREF_SIZE);
        tweet_text.setMinHeight(USE_PREF_SIZE);
    }

}
