package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralBalance {

	Map<String,Account> accounts;
	List<Adjust> adjusts;
	public GeneralBalance() {
		adjusts = new ArrayList<Adjust>();
		accounts= new HashMap<>();
	}
	
	public ArrayList<String> loadData(String path, int linesToSkip) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(path)); 
		ArrayList<String> data = new ArrayList<>();
		String line = "";
		
		for(int i=0;i<linesToSkip;i++) {
			line = br.readLine();
		}
		
		line = br.readLine();
		while(line!=null) {
			String[] splitLine = line.split(",");
			line = splitLine[0]+","+splitLine[splitLine.length-1];
			data.add(line);
			line = br.readLine();
		}
		
		br.close();
		return data;
	}
	
	
	public void loadAccounts(String path) throws IOException {
		List<String> accounts = loadData(path,1);
		
		for(int i=0;i<accounts.size();i++) {
			String[] info = accounts.get(i).split(",");
			Account account = new Account(info[0],Double.parseDouble(info[1]));
			
			this.accounts.put(info[0], account);
		}
	}
}
