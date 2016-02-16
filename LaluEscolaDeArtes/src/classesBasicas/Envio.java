package classesBasicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class Envio {
	
	private String url;
	private JSONObject json;
	private static String inicio = "http://localhost:8080/lalu/";
	private String results;
	
	public Envio(String url, JSONObject json) {
		this.url = url;
		this.json = json;
	}
	
	public void run() throws IOException, JSONException{
		HttpURLConnection con = conexao();
		OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
		wr.write(getJson().toString());
		wr.flush();
		StringBuilder sb = new StringBuilder();  
		int HttpResult = con.getResponseCode(); 
		if(HttpResult == HttpURLConnection.HTTP_OK){
		    BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF8"));  
		    String line = null;  
		    while ((line = br.readLine()) != null) {  
		        sb.append(line + "\n");  
		    }  
	
		    br.close();  
	
		    this.results = ""+sb.toString();  
	
		}else{
		    this.results = con.getResponseMessage();  
		}  
		
	}
	
	private HttpURLConnection conexao() throws IOException{
		URL object=new URL(inicio+this.url);
		HttpURLConnection con = (HttpURLConnection) object.openConnection();
		con.setDoOutput(true);
		con.setDoInput(true);
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");
		con.setRequestMethod("POST");
		return con;
	}

	public JSONObject getJson() {
		return json;
	}
	
	public String getResults() {
		return results;
	}
}
