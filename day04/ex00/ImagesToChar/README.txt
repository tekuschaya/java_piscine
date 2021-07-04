mkdir target && mkdir target/edu.school21.printer;
javac -d target/edu.school21.printer src/java/edu.school21.printer/app/Program.java src/java/edu.school21.printer/logic/Convert.java
java -cp target/edu.school21.printer/ Program it.bmp;
rm -rf target