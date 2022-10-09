package in.placement.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.placement.database.DbConn;

@Component("m")
@ConfigurationProperties(prefix="my.app")
public class MyDataRunner implements CommandLineRunner{

	private DbConn db;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(db);
	}

	public DbConn getDb() {
		return db;
	}

	public void setDb(DbConn db) {
		this.db = db;
	}
	

}
