import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public  static  void main(String[] args) {

        Theatre theatre = new Theatre("BroadwayShow", 8, 12);

        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);
        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("please pay for A02");
        }else{
            System.out.println("seat already reserved");
        }

       // Collections.reverse(seatCopy);
        Collections.shuffle(seatCopy);
        System.out.println("printing seat copy");
        printList(seatCopy);
        System.out.println("printing theater.seat ");
        printList(theatre.seats);


        Theatre.Seat maxSeat = Collections.max(seatCopy);
        Theatre.Seat minSeat = Collections.min(seatCopy);
        System.out.println("min seat number is " + minSeat.getSeatNumber());
        System.out.println("max seat number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("printing sorted seat copy");

        printList(seatCopy);

    }


    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=====================================================================");

    }

    public static void sortList(List<? extends Theatre.Seat> list){

        for (int i = 0; i < list.size()-1 ; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list, i ,j);
                }
            }
        }

    }
}
