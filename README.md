# LoginPageAndroid

A simple Android login screen built with Java and XML. This project demonstrates basic Android UI design, form input handling, click events, credential validation, and user feedback with Toast messages.

## Features

- Username input field
- Password input field
- Login button
- Basic credential validation
- Success and error feedback using Toast
- Edge-to-edge window inset handling

## Tech Stack

- **Language:** Java
- **UI:** XML layouts
- **Build System:** Gradle
- **IDE:** Android Studio
- **Minimum SDK:** See `app/build.gradle.kts`

## Project Structure

```text
LoginPageAndroid/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/loginpage/
│           │   └── MainActivity.java
│           └── res/
│               └── layout/
│                   └── activity_main.xml
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

## How to Run

1. Clone the repository.
2. Open the project in Android Studio.
3. Let Gradle sync and finish downloading dependencies.
4. Connect an Android device or start an emulator.
5. Run the `app` configuration.

## Demo Credentials

This project uses hard-coded credentials for demonstration purposes only:

```text
Username: admin
Password: 1234
```

> **Note:** This is an educational UI/login-validation demo. Hard-coded credentials should not be used in a production authentication system.

## What I Practiced

- Designing Android layouts with XML
- Working with `EditText` and `Button`
- Handling button click events
- Reading and validating user input
- Displaying feedback with `Toast`
- Handling system-bar insets with AndroidX

## Future Improvements

- Add input validation and error messages directly on the fields
- Add a loading state
- Replace hard-coded credentials with a secure authentication backend
- Add Material Design components and improved accessibility
- Add automated UI/unit tests

## Author

**Cibin Vincent**

GitHub: [@vincentcibin-a11y](https://github.com/vincentcibin-a11y)
