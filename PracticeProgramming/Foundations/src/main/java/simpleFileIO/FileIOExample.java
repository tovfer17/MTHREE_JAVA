/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simpleFileIO;

/**
 *
 * @author fer
 */
public class FileIOExample {
    public static void main(String[] args) throws Exception {
        
        //write to a file
PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
out.println("this is a line in my file...");
out.println("a second line in my file...");
out.println("a third line in my file...");
out.flush();
out.close();

    //read from a file
    Scanner sc = new Scanner(
    new BufferedReader(new FileReader("OutFile.txt")));
// go through the file line by line
while (sc.hasNextLine()) {
    String currentLine = sc.nextLine();
    System.out.println(currentLine);
}
}
}