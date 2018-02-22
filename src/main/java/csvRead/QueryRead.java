package csvRead;

public class QueryRead {
	    String q = "select id,winner from ipl.csv";
	    
    //Tokenizing the input query
    public String[] token() {
    	String[] tok=q.split(" "); 
    	
    	for(String s:tok)
    		System.out.println(s);
    	return tok;
    }
    
    //Extracting the file name
    public String fileName() {
    	String a[] = q.split("from");
    	String b[]=a[1].split("where");
    	return b[0];
    }
    
    
    
	public String[] columns() {
		
      //Getting the columns to be retrieved
        String a[]= q.split("select ");
        String b[]= a[1].split(" from");
        String c[]=b[0].split(",");
        return c;
	}
	
	public String[] condition(){
		String a[] = q.split("where ");
		return a;
	}
	
	public String same() {
		return q;
	}
	
}
	
	
