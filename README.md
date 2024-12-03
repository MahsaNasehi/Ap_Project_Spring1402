# Twitter

A simple implementation of a Twitter-like platform. This project was created as part of an Advanced Programming course and allows users to perform essential social media activities in an intuitive and lightweight way.

## Features
### User Management

- Sign up, log in, and manage your account.
- View and edit your profile picture.
- View other users' profile pictures.

### Timeline & Tweets

- Explore a timeline that displays tweets from users you follow.
- Tweet, retweet, reply, and quote other users' tweets.
- Attach photos to your tweets.
- Like and unlike tweets.
- Filter tweets by hashtags, user mentions, or keywords.

### Search

- Search for users.
- Search for specific hashtags.

### Social Interactions

- Follow, unfollow, and block users.

### Messaging

- Send and receive direct messages.

## Technologies Utilized

- **Java:** Core programming language
- **JavaFX:** For designing the user interface
- **CSS:** Applied for styling and enhancing visual aesthetics
- **MySQL:** Database management system

## Installation

1. Clone the Repository
   Clone this repository to your local machine using the following command:
```bash
git clone https://github.com/MahsaNasehi/Twitter_App.git
```
2. Set Up the MySQL Database

    - Create a MySQL database for the project (using MySQL Workbench or another tool).
    - Import any provided SQL scripts (if available) to initialize the database schema and tables.
    - Update the database connection information in the model/database/SQLConnection file (around line 37). Replace the placeholders with your actual database credentials:
  ```bash
connection = DriverManager.getConnection("jdbc:mysql://<hostname>:<port>/<database_name>", "<username>", "<password>");
```
3.Open the Project in Your Java IDE
  Open the project in your preferred Java IDE (e.g., IntelliJ IDEA or Eclipse) to start development or testing.

4. Set Up and Run the **Server** and **Client**
    - Run the server file first to start the server.
    - Then, run the client file to launch the client application.
    - Ensure both the server and client are running simultaneously for the application to function correctly.

## Usage

1. Launch the Application
<img src="https://github.com/MahsaNasehi/Tweeter_Application/assets/116074621/289b8ce8-40bd-4d52-a61a-f07d44312526" width="650" height="500">

3. Sign Up
   Create an account to get started.
   <img src="[https://github.com/MahsaNasehi/Tweeter_Application/assets/116074621/289b8ce8-40bd-4d52-a61a-f07d44312526](https://github.com/MahsaNasehi/Tweeter_Application/assets/116074621/18587524-0d89-4198-81be-acb4a97805cd)" width="650" height="500">
5. Explore and Engage
   Use the user-friendly interface to:
    - Post tweets and engage with other users.
    - Browse your timeline and apply filters to customize your feed.
    - Manage social interactions, including direct messaging.
    - Edit your profile as needed, including options like avatar, header, bio, and other settings.
    - Look up other users (ensure to search for names of users who have already signed up).
    - Navigate through your followers and followings to manage and discover connections.
    - When you're done, you can safely exit the application.

## License



## Authors  
- **Mahsa Nasehi** [GitHub Profile](https://github.com/MahsaNasehi)
- **Mehrnaz Sahebi** [GitHub Profile](https://github.com/Mehrnaz-Sahebi)  
---
