package lambda;


//Functional interface
@FunctionalInterface
interface NotificationService {
void notifyUser();
}

public class WithoutPara {

public static void main(String[] args) {
   // Lambda with no parameters
   NotificationService notification = () -> 
       System.out.println("You have a new notification in your dashboard.");

   notification.notifyUser();
}
}