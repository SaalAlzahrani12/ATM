/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rexxr
 */
public class Name {
    String first;
    String middle;
    String last;
    
    public Name(String f, String m, String lt){
       this.first=f;
       this.middle=m;
       this.last=lt;
    }
    public Name(String wholeName){
        String a[]=wholeName.split(" ");
        this.first=a[0];
        this.middle=a[1];
        this.last=a[2];
        
    }
    public String intials(){
        String s;
        s = first.substring(0,1)+" "+middle.substring(0,1)+" "+last.substring(0,1);
        return s;
    }
    public String toString(){
        String s;
        s=first+" "+middle.substring(0,1)+" "+last;
        return s;
    }
    public String toFullString(){
        String s;
        s = first+middle+last;
        return s;
    }
    public String toLastString(){
        String s ;
        s = last+","+first;
        return s;
    }
    public String toUpperCase(){
        String s;
        s = first.toUpperCase()+" "+middle.toUpperCase()+" "+last.toUpperCase();
        return s;
    }
}
