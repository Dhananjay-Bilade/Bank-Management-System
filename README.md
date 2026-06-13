# Bank Management System (ATM Simulator)

## Overview

The **Bank Management System** is a Java-based desktop application that simulates the core functionalities of an Automated Teller Machine (ATM). The project allows users to create bank accounts, perform secure transactions, manage account details, and access banking services through a user-friendly interface.

The system is designed to provide a realistic banking experience with secure PIN authentication and account management features.

---

## Features

### Account Creation

* Three-step user registration process.
* Collection of personal and account-related information.
* Automatic generation of:

  * Unique Account Number
  * Secure PIN

### Authentication

* Secure login using Account Number and PIN.
* User verification before accessing banking services.

### Banking Operations

* Cash Deposit
* Cash Withdrawal
* Fast Cash Transactions
* Balance Inquiry
* Mini Statement Generation
* PIN Change Facility

### Security

* PIN-based authentication system.
* User data stored securely in a database.
* Validation checks during transactions.

---

## Technologies Used

* **Programming Language:** Java
* **GUI Framework:** Java Swing
* **Database:** MySQL
* **JDBC:** Database Connectivity
* **IDE:** Eclipse / IntelliJ IDEA / NetBeans

---

## Project Structure

```text
BankManagementSystem/
│
├── src/
│   ├── Login.java
│   ├── Signup.java
│   ├── SignupTwo.java
│   ├── SignupThree.java
│   ├── Transactions.java
│   ├── Deposit.java
│   ├── Withdrawl.java
│   ├── BalanceEnquiry.java
│   ├── PinChange.java
│   └── Conn.java
│
├── icons/
├── database/
└── README.md
```

---

## How It Works

1. User creates a new account through a three-step registration process.
2. The system generates a unique Account Number and PIN.
3. User logs in using the generated credentials.
4. After successful authentication, the user can:

   * Deposit money
   * Withdraw cash
   * Check account balance
   * View transaction details
   * Change PIN

---

## Future Enhancements

* Online fund transfer
* Account statement export (PDF)
* Email and SMS notifications
* Password recovery system
* Admin dashboard
* Enhanced security using OTP verification

---

## Learning Outcomes

Through this project, I gained practical experience in:

* Java Programming
* Object-Oriented Programming (OOP)
* Java Swing GUI Development
* JDBC Connectivity
* MySQL Database Management
* Banking Transaction Logic
* Authentication and Security Concepts

---

## Author

**Dhananjay Bilade**

If you found this project useful, feel free to star the repository.
