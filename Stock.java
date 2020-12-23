// Stock Object
// Programmed by @brennenho

public class Stock
{

    // Initializing the polygon API
    PolygonAPI polygonAPI = new PolygonAPI();

    // Initializing the alpaca API
    AlpacaAPI alpacaAPI = new AlpacaAPI();

    // Variables
    String ticker; // Stock name
    float price; // Current price
    float close; // Previous day's close
    float open; // Open of the day
    float beta; // Current beta
    int stake; // Number of stocks we have currently

    // Default constructor

    public Stock ()
    {

        ticker = "";
        price = 0.0;
        close = 0.0;
        beta = 0.0;
        stake = 0;

    }

    // Normal constructor
    public Stock (String name)
    {

        ticker = name;
        price = polygonAPI.getLastTrade(ticker);
        close = polygonAPI.getPreviousClose(ticker,true); // Second value is making results not being adjusted for splits
        open = alpacaAPI.getOpenPositionBySymbol(ticker);
        stake = alpacaAPI.getAssetBySymbol(ticker);

    }
}
