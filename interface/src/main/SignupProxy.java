package main;

public class SignupProxy implements main.Signup {
  private String _endpoint = null;
  private main.Signup signup = null;
  
  public SignupProxy() {
    _initSignupProxy();
  }
  
  public SignupProxy(String endpoint) {
    _endpoint = endpoint;
    _initSignupProxy();
  }
  
  private void _initSignupProxy() {
    try {
      signup = (new main.SignupServiceLocator()).getSignup();
      if (signup != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)signup)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)signup)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (signup != null)
      ((javax.xml.rpc.Stub)signup)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Signup getSignup() {
    if (signup == null)
      _initSignupProxy();
    return signup;
  }
  
  public java.lang.String signup(java.lang.String firstName, java.lang.String lastName, java.lang.String email, int phn, java.lang.String add, java.lang.String pswrd) throws java.rmi.RemoteException{
    if (signup == null)
      _initSignupProxy();
    return signup.signup(firstName, lastName, email, phn, add, pswrd);
  }
  
  
}