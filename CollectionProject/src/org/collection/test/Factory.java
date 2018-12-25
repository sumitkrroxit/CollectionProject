package org.collection.test;

import java.util.ArrayList;
import java.util.List;

public class Factory {

	List<Databin> al=new ArrayList<Databin>();
	public Factory() {
				int i =0;
		while(i < 8) {
		testCall(i, "Test"+i);
		i++;
		}
	}

	private void testCall(int id, String name) {
			  	
		Databin databin = new Databin();
		databin.setId(id);
		if(id != 4 && id !=6) {
		databin.setName(name);
		}
		//System.out.println("id: "+id +"\n" +"Name : "+name +"\n");
		al.add(databin);
	}
	
	public void FactoryDisplay() {
		
		int collectionSize = al.size();
		System.out.println(collectionSize);
		
		if(collectionSize > 0) { 
			System.out.println(collectionSize+"True");
		for(int i = 0; i < collectionSize ; i++) {
			System.out.println("ID :"+al.get(i).getId());
			
			System.out.println("Name :"+al.get(i).getName());
		}
		
		System.out.println("ID :"+al.get(3).getId());
		System.out.println("Name :"+al.get(3).getName());
		System.out.println("***END***");
		}
		
	}
	
	
}
