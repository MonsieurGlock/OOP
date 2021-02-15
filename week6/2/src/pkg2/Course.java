/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author admin
 */
public class Course {
    String courseName;
    //String[] students = new String[8];
    String[] students = new String[2];
    int numberOfStudents; 
    private int index;
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public int getIndex() {
        return index;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudnets() {
        return students;
    }

    public int getNumberOfStudebts() {
        return numberOfStudents;
    }
    
    public void addStudent(String s){
        //System.out.println(students.length);
        
        if(index < students.length){
            students[index] = s;
            index++;
        }
        else if(index >= students.length){
            String[] newStudents = new String[students.length];
            for(int i = 0 ; i < students.length ; i++){
                 newStudents[i] = students[i];
            }
            students = new String[index + 1];
            for(int i = 0 ; i < newStudents.length ; i++){
                students[i] = newStudents[i];
            }
            students[index] = s;
            index++;
        }
        
        
    }
    public void dropStudent(String s){
        int temp = 0;
        for(int i = 0 ; i < students.length ; i++){
            if(s == students[i]){
                students[i] = "";
                temp = i;
                
                break;
            }
        }
        for(int i = temp ; i < students.length-1 ; i++){
            students[i] = students[i+1];
            
        }
        String[] newStudents = new String[students.length];
            for(int i = 0 ; i < students.length ; i++){
                 newStudents[i] = students[i];
            }
            students = new String[index-1];
            for(int i = 0 ; i < newStudents.length-1 ; i++){
                students[i] = newStudents[i];
            }
        index--;
    }
    public void clear(){
        students = new String[2];
        index = 0;
    }
}
