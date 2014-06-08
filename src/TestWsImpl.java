

import org.apache.cxf.aegis.databinding.AegisDatabinding;
import org.apache.cxf.frontend.ServerFactoryBean;

public class TestWsImpl implements TestWs{

	@Override
	public void setCeBeans(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);

	}

	public static void main(String[] args){
		TestWs testWsServer = new TestWsImpl();
		ServerFactoryBean serverFactoryBean = new ServerFactoryBean();
		serverFactoryBean.setServiceClass(TestWs.class);
		serverFactoryBean.setAddress("http://localhost:9100/TestWs");
		serverFactoryBean.setServiceBean(testWsServer);
		serverFactoryBean.setDataBinding(new AegisDatabinding());
		serverFactoryBean.create();

	}
}
