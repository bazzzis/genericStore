package util.enums;

public enum AddressType {
	CUSTOMER("Customer Address"),
	DROPSHIPPERLEGAL("DropShipper legal Address"),
	DROPSHIPPERDEPOT("DropShipper depot Address");
	
	private final String name;
	
	private AddressType(String s){
		this.name=s;
		
	}
	public String toString() {
        return this.name;
     }

}
