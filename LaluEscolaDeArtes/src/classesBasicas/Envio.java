package classesBasicas;

import org.json.JSONObject;

public class Envio {
	
	public String url;
	private JSONObject json;
	
	public Envio(String url, classesBasicas.JSONObject json) {
		super();
		this.url = url;
		this.json = json;
	}
	
	JSONObject cred = new JSONObject();
	JSONObject auth=new JSONObject();
	JSONObject parent=new JSONObject();

	cred.put("username","adm");
	cred.put("password", "pwd");

	auth.put("tenantName", "adm");
	auth.put("passwordCredentials", cred);

	parent.put("auth", auth);

	OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
	wr.write(parent.toString());
	wr.flush();

	//display what returns the POST request

	StringBuilder sb = new StringBuilder();  
	int HttpResult = con.getResponseCode(); 
	if(HttpResult == HttpURLConnection.HTTP_OK){
	    BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));  
	    String line = null;  
	    while ((line = br.readLine()) != null) {  
	        sb.append(line + "\n");  
	    }  

	    br.close();  

	    System.out.println(""+sb.toString());  

	}else{
	    System.out.println(con.getResponseMessage());  
	}  

	
	
}
