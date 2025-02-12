# Student Management System

## Overview

The **Student Management System** is a web-based application built using **Spring Boot**, **Thymeleaf**, **Spring Data JPA**, and **MySQL**. It allows users to manage student records effectively. The system provides functionalities to **add**, **update**, and **delete** student details through a simple, intuitive interface.

## Features

- **Add Student**: A form to input student details (such as name, email, etc.) and add them to the system.
- **Update Student**: After selecting an existing student, a form opens to update their details.
- **Delete Student**: Allows users to remove student records from the system.
- **Student List**: Displays a list of all added students with the options to edit or delete each record.

## Tech Stack

- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: For interacting with the MySQL database.
- **Thymeleaf**: Template engine for rendering dynamic HTML pages.
- **MySQL**: Database for storing student data.
- **Spring Boot DevTools**: Provides enhanced development experience, including automatic reload and debugging.
- **Spring Boot Starter Web**: Provides features for building web applications.

## Prerequisites

Before you begin, ensure that you have the following software installed:

- **JDK 17** or later
- **Maven** (for dependency management and building the project)
- **MySQL** (for database management)

## Setup and Installation

1. **Clone the repository**:

    ```bash
    git clone https://github.com/your-username/Student-Management-System.git
    cd Student-Management-System
    ```

2. **Configure MySQL Database**:

    - Create a database for the application:
    
    ```sql
    CREATE DATABASE sms;
    ```

    - Update `application.properties` (in `src/main/resources/application.properties`) with your MySQL database credentials:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/sms
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. **Build and Run the Application**:

    - Compile and run the application using Maven:

    ```bash
    mvn spring-boot:run
    ```

    - The application will run at `http://localhost:8080`.

## Usage

- **Home Page**: After starting the application, visit the home page at `http://localhost:8080`.
  
- **Add Student**: Click on the "Add Student" button to open a form to input details of a new student. After submitting the form, the student will be added to the list.

- **Update Student**: Click the "Edit" button next to a student's name to update their details. A new form will open for editing.

- **Delete Student**: Click the "Delete" button next to a student's name to remove them from the system.

### Screenshots

#### Home Page (List of Students)

![List](https://github.com/user-attachments/assets/24b2c0c2-cfa2-43ea-b84e-9fab649778d2)


#### Add Student Form

![Create](https://github.com/user-attachments/assets/c6f63b8e-d393-4f77-b5f3-6298e3345d31)


#### Update Student Form

![Edit](https://github.com/user-attachments/assets/a90f8ee5-a2f9-41da-92d5-948e133adc15)


## Database Schema

The system stores the following student details in the MySQL database:

- **Student ID**: Primary key, unique identifier for each student.
- **Name**: The name of the student.
- **Email**: The email address of the student.
- **Contact**: The contact number of the student
- **Marks**: Marks of student

