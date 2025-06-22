@echo off
echo Compiling...

javac -cp ".;mysql-connector-j-8.3.0.jar" Day69_TransactionManagement\BankTransaction.java -d .

echo Running...

java -cp ".;mysql-connector-j-8.3.0.jar" Day69_TransactionManagement.BankTransaction

pause
