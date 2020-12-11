
class grandfather{
    void showGrandfatherDetails(){
        System.out.println("Hey...This is grandfather class");
    }
}

interface father{
    void showFatherDetails();
}

class son extends grandfather implements father{
    public void showFatherDetails() {
        System.out.println("This method is from father interface");
    }

    void showSonDetails(){
        System.out.println("This method is from son class");
    }
}

public class interfaces {
    public static void main(String[] args) {
        son s = new son();

        System.out.println("This is an example of how to implement multiple inheritance through interfaces");
        s.showGrandfatherDetails();
        s.showFatherDetails();
        s.showSonDetails();
    }
}
