import java.awt.print.Book;
import java.util.Date;

public class Rental {

    Book book;
    String id;
    Date rentStart;
    Date rentEnd;

        public Rental(Book book, String id, Date rentStart){

            this.book=book;
            this.id=id;
            this.rentStart=rentStart;
        }




        //1
        public void endRent(Date d){
           d = new Date(010,05,2021);
        }

        //2
        public int daysOfRent(){

        }



    }



