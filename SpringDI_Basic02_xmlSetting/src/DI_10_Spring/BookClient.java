package DI_10_Spring;

import java.util.Properties;

public class BookClient {

	private Properties config;  //properties => hashmap 인데 특수한 hashmap, key도 value도 string
	public void setConfig(Properties config) {
		this.config = config;
	}
	
	//일반함수 
	public void connect() {
		String server = config.getProperty("server");
		String timeout = config.getProperty("connectiontimeout");
		
		System.out.println("server : " + server);
		System.out.println("timeout : " + timeout);
	}
	
}
