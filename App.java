import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        String myTop5TouristDestinationInPh = "BOHOLPUERTOPRINCESSALIGHTHOUSEKAPURPURAWANBORACAY";

        String[] myTop5TouristDestinationInPhilippines = {"BOHOL","PUERTOPRINCESSA","LIGHTHOUSE","KAPURPURAWAN","BORACAY"};

        //BOHOL = 0
for (int i = 0; i < 5; i++) {
        System.out.println(myTop5TouristDestinationInPhilippines[i]);
    }

      Stack <String> stk = new Stack<>();   
        stk.push("underwear");
        stk.push("handkerchief");
        stk.push("socks");

        stk.pop();
        System.out.println(stk);




//Queue
            Queue<String> ResortReservation = new LinkedList<>();
            ResortReservation.add("grace");
            ResortReservation.add("melanie");
            ResortReservation.add("caliwan");
            ResortReservation.add("arnold");
            ResortReservation.add("gavin");

            System.out.println("The queue is: " + ResortReservation);
            ResortReservation.remove();

            System.out.println("The queue is: " + ResortReservation);



}
}
