

import org.apache.cxf.aegis.databinding.AegisDatabinding;
import org.apache.cxf.frontend.ClientProxyFactoryBean;

public class TestWsClient {

	public static void main(String[] args){
		ClientProxyFactoryBean clientProxyFactoryBean = new ClientProxyFactoryBean();
		clientProxyFactoryBean.setServiceClass(TestWs.class);
		clientProxyFactoryBean.setAddress("http://localhost:9100/TestWs");
		
		clientProxyFactoryBean.getServiceFactory().setDataBinding(new AegisDatabinding());
		TestWs client = (TestWs) clientProxyFactoryBean.create();
		client.setCeBeans("gi cung dc");

	}
}
