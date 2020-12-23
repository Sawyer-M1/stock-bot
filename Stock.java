// Stock Object
// Programmed by @brennenho

public class Stock
{

    // Variables
    String ticker; // Stock name
    float price; // Current price
    float beta; // Current beta
    float weekPrice; // Stock price 1 week ago
    int stake; // Number of stocks we have currently

    // Default constructor

    public Stock ()
    {

        ticker = "";
        price = 0.0;
        beta = 0.0;
        weekPrice = 0.0;
        stake = 0;

    }
}