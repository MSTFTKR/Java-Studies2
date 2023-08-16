/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacereallife.interfacereallife;

/**
 *
 * @author musta
 */
public class AgeUserCheckService implements IUserCheckService{

    @Override
    public boolean checkUser(user User) {
        
        if (User.getAge()>=18){
            return true;
            
        } 
        return false; 
        
            
    }
}
    
  
    
    

