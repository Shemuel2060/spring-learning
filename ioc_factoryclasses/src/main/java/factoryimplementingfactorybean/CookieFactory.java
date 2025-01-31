package factoryimplementingfactorybean;

import org.springframework.beans.factory.FactoryBean;

public class CookieFactory implements FactoryBean<Cookies> {

	private String cookieName;
	@Override
	public Cookies getObject() throws Exception {
		
		Cookies c = (Cookies) Class.forName(getCookieName()).getConstructor().newInstance();
		return c;
	}

	@Override
	public Class<?> getObjectType() {
		
		return Cookies.class; // return cookie implementations only
	}
	
	@Override
	public boolean isSingleton() {
		return true; // the default
	}

	public String getCookieName() {
		return cookieName;
	}

	public void setCookieName(String cookieName) {
		this.cookieName = cookieName;
	}

}
