# 🏦 ATM Simulator Application

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![SQLite](https://img.shields.io/badge/SQLite-07405E?style=for-the-badge&logo=sqlite&logoColor=white)](https://www.sqlite.org/)
[![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/uiswing/)

A comprehensive **ATM Banking Simulator** built with Java Swing, featuring secure authentication, complete banking operations, and SQLite database integration.

## 🚀 Quick Start

### **Option 1: One-Click Run**
```bash
git clone https://github.com/Dhanush2662/ATM_SIMULATOR_APPLICATION.git
cd ATM_SIMULATOR_APPLICATION
run_atm.bat  # Windows
```

### **Option 2: Manual Run**
```bash
cd ATM-Simulator-System/src
java -cp "../../*.jar;." ASimulatorSystem.Login
```

## ✨ Features

### 🔐 **Authentication System**
- Secure login with Card Number & PIN
- 3-step account registration process
- Auto-generated 16-digit card numbers
- 4-digit PIN system

### 💰 **Banking Operations**
- **💳 Deposit** - Add money to account
- **💸 Withdrawal** - Cash withdrawal with validation
- **⚡ Fast Cash** - Quick predefined amounts
- **📊 Balance Inquiry** - Real-time balance check
- **📋 Mini Statement** - Transaction history
- **🔑 PIN Change** - Secure PIN modification

### 🗄️ **Database Features**
- SQLite embedded database
- Auto-table creation
- Transaction logging
- Multi-user support

## 🛠️ Technology Stack

- **Frontend**: Java Swing GUI
- **Backend**: Core Java
- **Database**: SQLite
- **Dependencies**: JDBC, JCalendar, SLF4J

## 📱 Screenshots

### Login Interface
![Login Screen](https://via.placeholder.com/400x300/2196F3/FFFFFF?text=ATM+Login+Interface)

### Account Creation
![Signup Process](https://via.placeholder.com/400x300/4CAF50/FFFFFF?text=3-Step+Signup+Process)

### Banking Operations
![Banking Menu](https://via.placeholder.com/400x300/FF9800/FFFFFF?text=Banking+Operations+Menu)

## 🏗️ Project Structure

```
ATM_SIMULATOR_APPLICATION/
├── ATM-Simulator-System/
│   └── src/ASimulatorSystem/
│       ├── Login.java          # Main login interface
│       ├── Signup.java         # Registration page 1
│       ├── Signup2.java        # Registration page 2
│       ├── Signup3.java        # Account creation
│       ├── Conn.java           # Database connection
│       ├── Deposit.java        # Deposit operations
│       ├── Withdrawl.java      # Withdrawal operations
│       └── [Other banking modules]
├── Dependencies/
│   ├── sqlite-jdbc-3.44.1.0.jar
│   ├── jcalendar-1.4.jar
│   └── slf4j-*.jar
├── run_atm.bat                 # Quick launcher
└── Documentation/
```

## 🎯 How to Use

### **Step 1: Create Account**
1. Run the application
2. Click "SIGN UP"
3. Complete all 3 registration pages
4. Note your generated Card Number & PIN

### **Step 2: Login & Bank**
1. Use your Card Number & PIN to login
2. Choose from available banking operations
3. Perform transactions as needed

## 📋 Requirements

- **Java**: JDK 8 or higher
- **OS**: Windows/Linux/macOS
- **Memory**: 512MB RAM minimum
- **Storage**: 50MB free space

## 🔧 Installation

### **Prerequisites**
```bash
# Check Java installation
java -version

# If not installed, download from:
# https://www.oracle.com/java/technologies/downloads/
```

### **Setup**
```bash
# Clone repository
git clone https://github.com/Dhanush2662/ATM_SIMULATOR_APPLICATION.git

# Navigate to project
cd ATM_SIMULATOR_APPLICATION

# Run application
run_atm.bat  # Windows
# OR
./run_atm.sh  # Linux/macOS
```

## 🧪 Testing

Refer to `TESTING_GUIDE.md` for comprehensive testing instructions covering:
- Account creation workflow
- Login functionality
- All banking operations
- Error handling scenarios

## 📚 Documentation

- **[Setup Guide](SETUP_GUIDE.md)** - Technical setup instructions
- **[Testing Guide](TESTING_GUIDE.md)** - Complete testing procedures
- **[Project Manual](PROJECT_MANUAL.md)** - Comprehensive project documentation

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🎯 Key Highlights

- ✅ **Complete Banking System** - Full ATM functionality
- ✅ **Secure Authentication** - PIN-based security
- ✅ **Professional GUI** - Intuitive Swing interface
- ✅ **Database Integration** - SQLite with auto-setup
- ✅ **Zero Configuration** - Ready to run out of the box
- ✅ **Cross Platform** - Works on Windows/Linux/macOS

## 📞 Support

- **Issues**: [GitHub Issues](https://github.com/Dhanush2662/ATM_SIMULATOR_APPLICATION/issues)
- **Documentation**: Check the `/docs` folder
- **Email**: [Your Email] (Optional)

---

### 🌟 **Star this repository if you found it helpful!**

**Built with ❤️ using Java & SQLite**

*Perfect for learning Java GUI development, database integration, and software engineering principles.*
