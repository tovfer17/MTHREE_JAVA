package UserIOclassLab;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fer
 */
public interface UserIO {
    public void print(String message);

    public String readString(String prompt);

    public int readInt(String prompt);

    //public int readInt(String prompt, int min, int max);

    public double readDouble(String prompt);

   // public double readDouble(String prompt, double min, double max);

    public float readFloat(String prompt);

    //public float readFloat(String prompt, float min, float max);

    public long readLong(String prompt);

    //public long readLong(String prompt, long min, long max);
}
