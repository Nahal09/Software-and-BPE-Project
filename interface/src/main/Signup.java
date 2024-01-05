/**
 * Signup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface Signup extends java.rmi.Remote {
    public java.lang.String signup(java.lang.String firstName, java.lang.String lastName, java.lang.String email, int phn, java.lang.String add, java.lang.String pswrd) throws java.rmi.RemoteException;
}
