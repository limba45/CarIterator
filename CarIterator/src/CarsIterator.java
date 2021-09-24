
public class CarsIterator implements Iterator {
	
	String car_names[];
	
	int count;
	public CarsIterator(String [] car_names)
	{
		this.car_names=car_names;
		
	}
	public boolean hasNext()
	{
		if(count<car_names.length)
		{
			return true;
		}
		return false;
	}
	
	public Object next()
	{
		if(this.hasNext())
		{
			return car_names[count++];
		}
		return null;
	}

}
