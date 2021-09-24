
public class Cars implements CarModels {
	
	 public String car_names[] = {"Toyota" , "Honda" ,"Kia" , "Hyundai"};
	
	
	public Iterator createIterator()
	{
		return new CarsIterator(car_names);
	}

}
