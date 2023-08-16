
package interfacereallife.interfacereallife;

public class SignUPManger {
    
    private IUserCheckService iUserCheckService;

    public SignUPManger(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }
    
    public void singUp(user User){
        
        
        if (iUserCheckService.checkUser(User)){
        System.out.println("kullanıcı kayıt oldu:"+User.getName());
        }
        else{
            System.out.println("kullanıcı kayıt olamadı:"+User.getName());
        }
        
    
    
    }
}
