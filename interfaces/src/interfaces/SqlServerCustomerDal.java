package interfaces;

public class SqlServerCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Veriler islendi: Sql Server.");
		
	}

}
