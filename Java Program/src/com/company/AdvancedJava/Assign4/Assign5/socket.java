package com.company.AdvancedJava.Assign4.Assign5;

import java.io.*;
import java.net.*;
public class socket {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("172.25.171.107",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){System.out.println(e);}
    }
} 