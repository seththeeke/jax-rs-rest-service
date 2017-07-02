package service;

public class Services {
	
	private static String[] services = {
			HelloRestService.class.getCanonicalName(),
			GoodbyeRestService.class.getCanonicalName()
	};
	
	public static String[] getServices(){
		return services;
	}
}
