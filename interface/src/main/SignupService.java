/**
 * SignupService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface SignupService extends javax.xml.rpc.Service {
    public java.lang.String getSignupAddress();

    public main.Signup getSignup() throws javax.xml.rpc.ServiceException;

    public main.Signup getSignup(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
