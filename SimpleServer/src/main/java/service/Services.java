package service;

import rest.GoodbyeRestService;
import rest.HelloRestService;

public class Services {
	
	private static String[] services = {
			HelloRestService.class.getCanonicalName(),
			GoodbyeRestService.class.getCanonicalName()
	};
	
	public static String[] getServices(){
		return services;
	}
}
