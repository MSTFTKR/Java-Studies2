package interfacereallife.interfacereallife;

public class InterfaceRealLife {

    public static void main(String[] args) {
        SignUPManger signUpManager=new  SignUPManger(new ComplexUserCheckService());
        signUpManager.singUp(new user(21, "Msstafa", 19));

    }
}