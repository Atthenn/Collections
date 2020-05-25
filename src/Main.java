import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public  static  void main(String[] args) {

        Theatre theatre = new Theatre("BroadwayShow", 8, 12);
      //  printList(theatre.getSeats());

        if(theatre.reserveSeat("D11")){
            System.out.println("please pay for D12");
        }else{
            System.out.println("seat already reserved");
        }

        if(theatre.reserveSeat("B13")){
            System.out.println("please pay for B13");
        }else{
            System.out.println("seat already reserved");
        }

        List<Theatre.Seat> reverseList = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseList);
   //     printList(reverseList);

        List<Theatre.Seat> priceSeat = new ArrayList<>(theatre.getSeats());
        priceSeat.add(theatre.new Seat("B00", 13.00));
        priceSeat.add(theatre.new Seat("A00",13));
        Collections.sort(priceSeat,Theatre.PRICE_ORDER);
        printList(priceSeat);
    }


    public static void printList(Collection<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
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
