/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetailsprint;

/**Creating local respositary in laptop
 * intialise versioning git
 * gitconfig file
 * gitignore file
 * commit
 * 
 * 
 * @author brittrathore
 */
import java.util.*;
public class StudentDetailsPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array of object declaration
        Student[] list = new Student[3];
        // take student details i/p from user
        Scanner inp = new Scanner(System.in);
        // store 3 student object in array, also define each student name, age
        for(int i=0;i<list.length;i++)
        {
            String n = inp.nextLine();
            int a = inp.nextInt();
            //create object?
            Student s1 = new Student(); // one object s1 details name, age
            s1.setName(n);
            

            s1.setAge(a);
            list[i]=s1;
        }
        for (Student list1 : list) {
            System.out.println(list1.getName() + " " + list1.getAge());
        }
    }
        
    }
    

