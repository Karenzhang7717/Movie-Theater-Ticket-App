package Control;


public class MainController {
	private LogisticsController logisticConrol;
	private PaymentController paymentControl;
	private DBController dbControl;
	private UserController userControl;
	private ViewController viewControl;
	
	public void DatabaseImport() {
		
		DBController dbControl = new DBController();
		dbControl.populateList();
	}
	
	
	public void DatabaseExport() {
		
	}
    
	public static void main(String[] args) {
		
	}

	
	
}
