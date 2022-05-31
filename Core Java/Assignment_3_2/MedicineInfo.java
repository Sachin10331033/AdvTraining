package Assignment_3_2;

public class MedicineInfo {
	  public void displayLabel()
			{
			  System.out.println("Company : xyz Pharma");
			  System.out.println("Address : pune");
			}
			}

			class Tablet extends MedicineInfo{
				 
			public void displayLabel()
			{
			  System.out.println("store in a cool dry place");
			}
			}

			class Syrup extends MedicineInfo
			{
			  public void displayLabel()
			{
			  System.out.println("Consumption as directed by thephysician");
			}
			}
			class Ointment extends MedicineInfo
			{
			  public void displayLabel()
			{
			System.out.println("for external use only");
			}
}
