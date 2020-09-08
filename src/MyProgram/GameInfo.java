/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProgram;

/**
 *
 * @author 3z
 */
public class GameInfo {
 private String name;
 private String ID;

 public GameInfo(){
     
 }
 public GameInfo(String name, String ID){
     setName(name);
     setID(ID);
     
 }
 public void setName(String name){
     this.name = name;
     
 }
 public String getName(){
     return name;
 }
 public void setID(String ID){
     if(ID.startsWith("2") || ID.startsWith("1") || ID.endsWith("0")){
         this.ID = ID;
     }
     else
         throw new IllegalArgumentException("ID can't start with 2, 1, or 0");
 }
 public String getID(){
     return ID;
 }
 public String toString(){
     return String.format("Game's Name: %s | ID: %s", name, ID);
 }
}
