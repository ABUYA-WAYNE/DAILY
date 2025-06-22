@echo off
echo 🛠 Compiling...

javac -cp ".;lib\mysql-connector-j-9.3.0.jar" -d out ^
model\Student.java ^
db\DatabaseConnector.java ^
dao\StudentDAO.java ^
app\StudentApp.java

if %errorlevel% neq 0 (
    echo ❌ Compilation failed.
    pause
    exit /b
)

echo ✅ Running Program...
java -cp ".;out;lib\mysql-connector-j-9.3.0.jar" app.StudentApp

pause
