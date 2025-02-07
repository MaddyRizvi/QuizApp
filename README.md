# QuizApp

## Description
A simple **Quiz Application** built using **Java (Android Studio)** for the frontend, **PHP & MySQL (XAMPP Server)** for the backend. The app allows users to answer multiple-choice questions and get their score at the end.

## Features
- **Multiple-choice questions** with answer selection
- **Navigation** between questions
- **Result calculation** at the end
- **Backend with MySQL & PHP** for storing questions and answers
- **User-friendly UI** built with Android Studio

## Technologies Used
### Frontend
- Java
- Android Studio

### Backend
- PHP
- MySQL (XAMPP Server)

## Installation & Setup

### Prerequisites
- Android Studio installed
- XAMPP Server installed and running
- MySQL database set up

### Steps

#### 1. Clone the Repository
```sh
git clone https://github.com/MaddyRizvi


### 2. Import Project in Android Studio
- Open **Android Studio**
- Click **Open an Existing Project** and select the project folder

### 3. Set Up XAMPP Server
- Start **Apache** and **MySQL** in XAMPP
- Import `quiz_database.sql` into MySQL (using phpMyAdmin)
- Update `config.php` with your database credentials

### 4. Run the Application
- Connect an emulator or a real device
- Click **Run** in Android Studio

## Database Structure
The MySQL database contains a table `questions` with the following structure:

| Column         | Type              | Description    |
|--------------|----------------|----------------|
| `id`        | INT (AUTO_INCREMENT) | Question ID   |
| `question`  | TEXT              | Quiz question  |
| `option_a`  | VARCHAR(255)     | Option A      |
| `option_b`  | VARCHAR(255)     | Option B      |
| `option_c`  | VARCHAR(255)     | Option C      |
| `option_d`  | VARCHAR(255)     | Option D      |
| `correct_answer` | VARCHAR(255) | Correct option |

## Screenshots
*(Include screenshots of the app UI here)*

## Contributing
Contributions are welcome! Feel free to fork the repository and submit a pull request.

## License
This project is available for public use; no license has been specified.


---

### Developed by **Maddy Rizvi** 🚀

