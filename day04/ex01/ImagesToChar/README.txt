mkdir target && mkdir target/resources;
javac -d target/ src/java/edu/school21/printer/app/Program.java src/java/edu/school21/printer/logic/Convert.java &&
cp src/resources/image.bmp target/resources &&
jar cvfm target/images-to-chars-printer.jar src/manifest.txt -C target ./edu/school21/printer &&
java -jar ./target/images-to-chars-printer.jar
