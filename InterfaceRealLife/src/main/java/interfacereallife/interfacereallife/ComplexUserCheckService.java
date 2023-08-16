/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacereallife.interfacereallife;

/**
 *
 * @author musta
 */
public class ComplexUserCheckService implements IUserCheckService{

    @Override
    public boolean checkUser(user User) {
        if (User.getAge()>=18&&User.getName().startsWith("Mu")){
            return true;
            
        } 
        return false; 
        
    }
    
}
