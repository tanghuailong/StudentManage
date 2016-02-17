package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class TestStudent {

	@Test
	public void testSchemaExport() {
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegister = new ServiceRegistryBuilder()
				.applySettings(config.getProperties()).buildServiceRegistry();

		SessionFactory sessionfactory = config.buildSessionFactory(serviceRegister);
		//Session session = sessionfactory.getCurrentSession();
		SchemaExport schemaExport = new SchemaExport(config);
		
		schemaExport.create(true,true);
	}

}
