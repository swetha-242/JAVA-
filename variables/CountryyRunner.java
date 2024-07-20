class CountryyRunner
{
	public static void main(String[] args)
	{
	 System.out.println("the countryrunner contains details are:");
	 String[] countrys={"Andhra pradesh","Arunachal pradesh","Assam","Bihar","Chattisgarh","Goa","Gujurat","Haryana","Himachal pradesh","Jharkhand",
	                         "Karnataka","Kerala","Madhya pradesh","Maharashtra","Maniput","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan",
							 "Sikkim","Tamil Nadu","Telangana","Triput","Uttar pradesh"};
	 Countryy.setState(countrys);
	 
	 System.out.println("the countryRunner contains pincode are:");
	 int[] pinCode={577201,577302,577341,577345,577202,674521,453271,455267,577200,577333};
	 Countryy.getPin(pinCode);
	 
	 System.out.println("the countryrunner contains details are:");
	 String[] primeMinister={"jawaharlal nehru","indira gandhi","morarji desai","atal bihari vajpayee","manmohan sigh","narendra modi","Gulzarilal nanda","indira gandhi","charan singh","rajiv gandhi",
	                         "vishwanath pratap singh","chandra shekar","p v narasimha rao","H D deve gowda","manmohan singh"};
	 Countryy.pM(primeMinister);
	 
	 System.out.println("the countryrunner contains details are:");
	 String[] cabinetMinister={"Piyush goshal","dharmend ra pradhan","jitan ram manjhi","lalan singh","Rajnath singh","dv sadananda gowda","narendra sing tomar","ramesh pokhriyal","ravi shankar prasad","mukhtar abbas naqvi",
	                         "arvind ganpath sawant","amit shah","nirmala sitharamam","arjun munda","giriraj singh","jawaharlal nehru","indira gandhi","morarji desai","atal bihari vajpayee","manmohan sigh","narendra modi","Gulzarilal nanda","indira gandhi","charan singh","rajiv gandhi",
	                         "vishwanath pratap singh","chandra shekar","p v narasimha rao","H D deve gowda","manmohan singh"};
	 Countryy.cM(cabinetMinister);
	 
	 System.out.println("the countryrunner contains details are:");
	 String[] politicalParties={"bharathiya janatha party","india national congress","nationalist compress party","communist party of india","all india trinamol congress"};
	 Country.pP(politicalParties);
	}
}