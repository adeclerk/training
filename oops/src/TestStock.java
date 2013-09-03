import com.declerk.stock.Exchange;
import com.declerk.stock.Holder;
import com.declerk.stock.StockFactory;


public class TestStock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Holder stockHolder = StockFactory.getStock();
		stockHolder.viewQuote();
		Exchange stockExchange = StockFactory.getStock();
		stockExchange.setQuote(3242);
		stockHolder.viewQuote();

	}

}
