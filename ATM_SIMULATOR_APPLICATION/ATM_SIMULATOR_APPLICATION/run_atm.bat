@echo off
echo Starting ATM Simulator System...
cd ATM-Simulator-System\src
java -cp "..\..\sqlite-jdbc-3.44.1.0.jar;..\..\jcalendar-1.4.jar;." ASimulatorSystem.Login
pause