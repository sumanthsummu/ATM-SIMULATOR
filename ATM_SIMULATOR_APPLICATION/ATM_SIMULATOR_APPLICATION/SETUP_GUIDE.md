# 🏧 ATM Simulator System - Complete Setup Guide

## 📋 Project Overview

This is a **complete ATM Simulator System** built with Java Swing that replicates real-world ATM functions. The system has been **modified to use SQLite database** instead of MySQL for easier setup and portability.

## ✨ Features

### 🔐 **Core Banking Operations**
- **Account Creation**: Multi-step signup process with personal details
- **Secure Login**: Card number and PIN authentication
- **Cash Withdrawal**: Standard and fast cash options
- **Money Deposit**: Add funds to account
- **Balance Inquiry**: Check current account balance
- **Mini Statement**: View recent transaction history
- **PIN Change**: Update security PIN
- **Transaction History**: Complete record of all operations

### 🛠️ **Technical Features**
- **SQLite Database**: No external database server required
- **Auto Table Creation**: Database schema created automatically
- **Java Swing GUI**: Professional desktop interface
- **Date Picker**: JCalendar integration for date selection
- **Error Handling**: Comprehensive exception management

## 🚀 Quick Start

### **Option 1: Run with Batch File (Easiest)**
```bash
# Simply double-click the batch file
run_atm.bat
```

### **Option 2: Manual Execution**
```bash
# Navigate to source directory
cd ATM-Simulator-System\src

# Run the application
java -cp "..\..\sqlite-jdbc-3.44.1.0.jar;..\..\jcalendar-1.4.jar;." ASimulatorSystem.Login
```

## 📦 Prerequisites

- **Java Development Kit (JDK) 8 or higher**
- **Windows Operating System** (batch file is Windows-specific)
- **No MySQL installation required** ✅

## 🗂️ Project Structure

```
ATM_SIMULATION_SYSTEM/
├── ATM-Simulator-System/
│   ├── src/
│   │   └── ASimulatorSystem/
│   │       ├── Login.java          # Main login interface
│   │       ├── Signup.java         # Account creation (Page 1)
│   │       ├── Signup2.java        # Account creation (Page 2)
│   │       ├── Signup3.java        # Account creation (Page 3)
│   │       ├── Transactions.java   # Main transaction menu
│   │       ├── Deposit.java        # Money deposit functionality
│   │       ├── Withdrawl.java      # Cash withdrawal
│   │       ├── FastCash.java       # Quick cash withdrawal
│   │       ├── BalanceEquiry.java  # Balance checking
│   │       ├── MiniStatement.java  # Transaction history
│   │       ├── Pin.java            # PIN change functionality
│   │       ├── Conn.java           # Database connection (Modified for SQLite)
│   │       └── icons/              # UI images and icons
│   └── build/                      # Compiled classes
├── sqlite-jdbc-3.44.1.0.jar       # SQLite JDBC driver
├── jcalendar-1.4.jar               # Date picker library
├── run_atm.bat                     # Easy execution script
├── atm_database.db                 # SQLite database (created automatically)
└── README.md                       # This file
```

## 🗄️ Database Schema

The system automatically creates these tables:

### **login** - User authentication
- `formno` (TEXT, PRIMARY KEY)
- `cardnumber` (TEXT)
- `pin` (TEXT)

### **signup** - Personal information
- `formno`, `name`, `fname`, `dob`, `gender`, `email`, `marital`, `address`, `city`, `state`, `pincode`

### **signup2** - Additional details
- `formno`, `religion`, `category`, `income`, `education`, `occupation`, `pan`, `aadhar`, `seniorcitizen`, `existingaccount`

### **signup3** - Account information
- `formno`, `accountType`, `cardnumber`, `pin`, `facility`

### **bank** - Transaction records
- `pin`, `date`, `type`, `amount`

## 🎯 How to Use

### **First Time Setup**
1. **Run the application** using `run_atm.bat`
2. **Click "SIGN UP"** to create a new account
3. **Fill out all 3 pages** of the registration form
4. **Note down your Card Number and PIN** (displayed after signup)
5. **Return to login** and use your credentials

### **Sample Account Creation**
```
Page 1: Personal Details
- Name: John Doe
- Father's Name: Robert Doe
- Date of Birth: 01/15/1990
- Gender: Male
- Email: john.doe@email.com
- Address: 123 Main Street
- City: New York
- State: NY
- Pin Code: 10001

Page 2: Additional Information
- Religion: Christian
- Category: General
- Income: 2-5 Lakh
- Education: Graduate
- Occupation: Business
- PAN: ABCDE1234F
- Aadhar: 123456789012

Page 3: Account Setup
- Account Type: Saving Account
- Services: Select desired banking services
```

## 🔧 Technical Details

### **Dependencies Included**
- **SQLite JDBC Driver** (`sqlite-jdbc-3.44.1.0.jar`)
- **JCalendar Library** (`jcalendar-1.4.jar`)

### **Key Modifications Made**
- ✅ **Database**: Changed from MySQL to SQLite
- ✅ **Auto Setup**: Tables created automatically on first run
- ✅ **Portability**: No external database server needed
- ✅ **Dependencies**: All required JARs included
- ✅ **Easy Execution**: Batch file for simple startup

## 🐛 Troubleshooting

### **Application won't start**
- Ensure Java is installed: `java -version`
- Check if JDK path is in system PATH
- Try running from command line to see error messages

### **Database errors**
- Delete `atm_database.db` file and restart application
- Check file permissions in the project directory

### **GUI issues**
- Ensure you're running on a system with GUI support
- Try running with different Java versions

### **Compilation errors**
- Verify all JAR files are present
- Check classpath in batch file

## 🤝 Contributing

Feel free to:
- Report bugs
- Suggest new features
- Submit pull requests
- Improve documentation

## 📄 License

This project is open source and available under the MIT License.

## 🙏 Acknowledgments

- Original project by [shivamverma26](https://github.com/shivamverma26/ATM_Simulator) <mcreference link="https://github.com/shivamverma26/ATM_Simulator" index="1">1</mcreference>
- Modified for SQLite compatibility and enhanced setup
- JCalendar library for date picker functionality
- SQLite for lightweight database solution

---

**🎯 Ready to use! Just run `run_atm.bat` and start banking!** 🏦