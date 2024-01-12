package entities;

public class People {
	private String name;
	private Integer phone;
	private String ende;
	
	
	public People(){
		
	}
	public People(String name, Integer phone, String ende) {
		this.name = name;
		this.phone = phone;
		this.ende = ende;
	}
	
	public People(String name, Integer phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getEnde() {
		return ende;
	}
	public void setEnde(String ende) {
		this.ende = ende;
	}
	
	public String toString() {
		return "DADOS DO CLIENTE NOME: " 
			   + getName()  
			   +" #TELEFONE: " + getPhone() 
	           +" #ENDEREÇO: " + getEnde();
	}
	
}



