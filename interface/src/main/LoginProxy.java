package main;

public class LoginProxy implements main.Login {
  private String _endpoint = null;
  private main.Login login = null;
  
  public LoginProxy() {
    _initLoginProxy();
  }
  
  public LoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginProxy();
  }
  
  private void _initLoginProxy() {
    try {
      login = (new main.LoginServiceLocator()).getLogin();
      if (login != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)login)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (login != null)
      ((javax.xml.rpc.Stub)login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Login getLogin() {
    if (login == null)
      _initLoginProxy();
    return login;
  }
  
  public java.lang.String login(java.lang.String email, java.lang.String pswrd) throws java.rmi.RemoteException{
    if (login == null)
      _initLoginProxy();
    return login.login(email, pswrd);
  }
  
  
}