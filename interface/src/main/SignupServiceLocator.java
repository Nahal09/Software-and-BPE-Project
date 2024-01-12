/**
 * SignupServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class SignupServiceLocator extends org.apache.axis.client.Service implements main.SignupService {

    public SignupServiceLocator() {
    }


    public SignupServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SignupServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Signup
    private java.lang.String Signup_address = "http://localhost:8080/Project/services/Signup";

    public java.lang.String getSignupAddress() {
        return Signup_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SignupWSDDServiceName = "Signup";

    public java.lang.String getSignupWSDDServiceName() {
        return SignupWSDDServiceName;
    }

    public void setSignupWSDDServiceName(java.lang.String name) {
        SignupWSDDServiceName = name;
    }

    public main.Signup getSignup() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Signup_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSignup(endpoint);
    }

    public main.Signup getSignup(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.SignupSoapBindingStub _stub = new main.SignupSoapBindingStub(portAddress, this);
            _stub.setPortName(getSignupWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSignupEndpointAddress(java.lang.String address) {
        Signup_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Signup.class.isAssignableFrom(serviceEndpointInterface)) {
                main.SignupSoapBindingStub _stub = new main.SignupSoapBindingStub(new java.net.URL(Signup_address), this);
                _stub.setPortName(getSignupWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Signup".equals(inputPortName)) {
            return getSignup();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "SignupService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Signup"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Signup".equals(portName)) {
            setSignupEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
