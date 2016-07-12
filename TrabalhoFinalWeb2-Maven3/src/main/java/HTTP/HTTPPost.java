/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HTTP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class HTTPPost {
    String responseString;
    String Title;
    String Description;
    URL connectURL;
    

    public HTTPPost(String modelName,String method){
        String URL  = "http://localhost:8080/TrabalhoFinalWeb2-REST/webresources/"+modelName+"/"+method;
        
        try {
            connectURL = new URL(URL);
        } catch (MalformedURLException ex) {
            Logger.getLogger(HTTPPost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    public HTTPPost(String modelName,String method,String value){
        String URL  = "http://localhost:8080/TrabalhoFinalWeb2-REST/webresources/"+modelName+"/"+method+"/"+value;
        
        try {
            connectURL = new URL(URL);
        } catch (MalformedURLException ex) {
            Logger.getLogger(HTTPPost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    public String sendPost(String xml) {
        try {
            HttpURLConnection con = (HttpURLConnection)connectURL.openConnection();
            //con.setRequestMethod("POST");
            
            // Send post request
            con.setDoOutput(true);
            con.setRequestProperty("content-type", "application/json");
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(xml);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();
            
            BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
            }
            in.close();
            //print result 
            
           // XMLParser parser = new XMLParser();
            //UserData user = parser.parse(response.toString());
            //return user;
            return response.toString();
            
        } catch (IOException ex) {
            Logger.getLogger(HTTPPost.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
        public String sendGet(String xml) {
        try {
            HttpURLConnection con = (HttpURLConnection)connectURL.openConnection();
            

            int responseCode = con.getResponseCode();
            
            BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());
            
            return response.toString();
            
        } catch (IOException ex) {
            Logger.getLogger(HTTPPost.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
