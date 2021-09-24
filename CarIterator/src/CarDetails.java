
public class CarDetails {
	
	
	public CarDetails()
	{
		
		
	}
	public String getModel(String company)
	{
		if(company.equals("Toyota"))
		{
			return "Yaris";
		}
		else if(company.equals("Honda"))
		{
			return "Civic";
		}
		else if(company.equals("Kia"))
		{
			return "Sportage";
		}
		else if(company.equals("Hyundai"))
		{
			return "Tucson";
		}
		return null;
	}
	public int getYear(String company)
	{
		if(company.equals("Toyota"))
		{
			return 2021;
		}
		else if(company.equals("Honda"))
		{
			return 2020;
		}
		else if(company.equals("Kia"))
		{
			return 2019;
		}
		else if(company.equals("Hyundai"))
		{
			return 2020;
		}
		return 0;
	}
	public String getType(String company)
	{
		if(company.equals("Toyota"))
		{
			return "Sedan";
		}
		else if(company.equals("Honda"))
		{
			return "Sedan";
		}
		else if(company.equals("Kia"))
		{
			return "Crossover";
		}
		else if(company.equals("Hyundai"))
		{
			return "Crossover";
		}
		return null;
	}

}
