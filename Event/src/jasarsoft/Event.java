
package jasarsoft;

public class Event {

    public static void main(String[] args) {
        MouseDirectionEventListener mdel = new MouseDirectionEventListener(100) {
            @Override
            public void movedLeft() {
                System.out.println("lijevo");
            }
            
            @Override
            public void movedRight() {
                System.out.println("desno");
            }
            
            @Override
            public void movedUp() {
                System.out.println("gore");
            }
            
            @Override
            public void movedDown() {
                System.out.println("dolje");
            }
        };
    }
    
}
