@echo off
setlocal

:: Define CLASSPATH to include your MySQL driver JAR
set CLASSPATH=.;lib\mysql-connector-j-9.3.0.jar

:: Compile ALL Java files in ALL folders
javac -cp %CLASSPATH% -d . src\model\Student.java src\config\DatabaseConfig.java src\db\DatabaseConnector.java src\dao\StudentDAO.java src\app\StudentApp.java

:: Run the app with classpath
java -cp %CLASSPATH% app.StudentApp

endlocal
pause
