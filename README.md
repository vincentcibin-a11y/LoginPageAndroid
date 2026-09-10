# LoginPageAndroid

A clean Android login screen built with **Java, XML, AndroidX, and Material Components**. This project demonstrates Android UI development, form validation, click handling, password input, and user feedback.

## ✨ Features

- Clean, centered login UI
- Username/email input
- Password input with masking
- Empty-field validation
- Demo credential validation
- Clear success and error feedback
- Edge-to-edge system-bar handling
- Java + XML implementation

## 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| Java | Application logic |
| XML | User interface |
| Android SDK | Mobile platform |
| AndroidX | App compatibility and UI support |
| Material Components | Modern Android UI components |
| Gradle Kotlin DSL | Build configuration |

## 🔐 Demo Credentials

This is an educational project and uses local demo credentials:

| Field | Value |
|---|---|
| Username | `admin` |
| Password | `1234` |

> **Security note:** These credentials are intentionally hard-coded for demonstration. This project does **not** implement production authentication or secure credential storage.

## 📱 Application Flow

1. Enter the username.
2. Enter the password.
3. Tap **Login**.
4. Empty fields are rejected with inline validation.
5. The demo credentials are checked locally.
6. A success or error message is shown.

## 📂 Project Structure

```text
LoginPageAndroid/
├── app/
│   └── src/
│       ├── main/
│       │   ├── java/com/example/loginpage/
│       │   │   └── MainActivity.java
│       │   ├── res/
│       │   │   └── layout/activity_main.xml
│       │   └── AndroidManifest.xml
│       ├── test/           # Unit tests
│       └── androidTest/    # Instrumentation/UI tests
├── gradle/
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
└── README.md
```

## 🚀 Getting Started

### Requirements

- Android Studio
- Android SDK
- JDK 11 or the JDK configured by Android Studio

### Run locally

```bash
git clone https://github.com/vincentcibin-a11y/LoginPageAndroid.git
cd LoginPageAndroid
```

Open the project in Android Studio, allow Gradle sync to complete, then run the `app` configuration on an emulator or Android device.

## 🎯 Learning Objectives

This project was created to practice:

- Building Android layouts with XML
- Connecting XML views to Java code
- Handling button click events
- Reading and validating `EditText` input
- Password input handling
- Providing user feedback
- Working with AndroidX and Material Components
- Handling system-bar insets

## 🔮 Future Improvements

- Replace hard-coded credentials with secure authentication
- Add Firebase or REST API authentication
- Add password visibility toggle
- Add loading/progress state
- Add automated UI tests
- Improve accessibility with Material text fields and clearer error states
- Add screenshots and an app demo GIF

## 👨‍💻 Author

**Cibin Vincent**

[GitHub Profile](https://github.com/vincentcibin-a11y)

## 📄 License

This project is intended for educational and portfolio purposes.
