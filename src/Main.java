public class Main {

    public  static  void main(String[] args){

        Theatre theatre = new Theatre("BroadwayShow",8,12);
        //theatre.getSeats();

        if(theatre.reserveSeat("B13")){
            System.out.println("please pay");
        }else{
            System.out.println("sorry, seat is taken");
        }

    }
}
