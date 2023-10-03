import java.util.Scanner;

class Publication {
    protected String title;
    protected float price;

    public Publication(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }
}

class Book extends Publication implements Sale {
    private int pageCount;

    public Book(String title, float price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

    public void display() {
        super.display();
        System.out.println("Page Count: " + pageCount);
        displaySalesData();
    }

    @Override
    public void getSalesData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of copies sold for the book '" + title + "': ");
        int copiesSold = scanner.nextInt();
        setSalesData(copiesSold);
    }
}

class Tape extends Publication implements Sale {
    private float playingTime;

    public Tape(String title, float price, float playingTime) {
        super(title, price);
        this.playingTime = playingTime;
    }

    public void display() {
        super.display();
        System.out.println("Playing Time (minutes): " + playingTime);
        displaySalesData();
    }

    @Override
    public void getSalesData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of copies sold for the tape '" + title + "': ");
        int copiesSold = scanner.nextInt();
        setSalesData(copiesSold);
    }
}

interface Sale {
    void getSalesData();
    
    default void displaySalesData() {
        System.out.println("Sales Data: Not Available");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("Sample Book", 20.0f, 250);
        book.getSalesData();
        book.display();

        // Create a Tape object
        Tape tape = new Tape("Sample Tape", 15.0f, 60.0f);
        tape.getSalesData();
        tape.display();
    }
}
