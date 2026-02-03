package arrayList;

public class MyArrayList {
	private int length;
	private int size;
	private String [] l;

	public MyArrayList(int length) {
		l = new String [length];
		this.length = length;
		this.size = 0;
	}

	public MyArrayList() {
		this.length = 10;
		l = new String [this.length];
		this.size = 0;
		
	}

	public int getSize() {
		return this.size;
	}
	public int length() {
		return length;
	}
	
	public void add(String palabra) {
		this.l[size] = palabra;
		this.size++;
	}
	
	public void add(int pos, String palabra) {
		int i=pos;
		if(this.size+1 <= this.length) {
			String now;
			String next;
			while(l[i]!=null && i<l.length-1) {
				
				
			}
		}
		this.l[pos] = palabra;
		this.size++;
	}
	
	public void set(int pos, String palabra) {
		this.l[pos] = palabra;
	}
	
	public String get(int pos) {
		if(pos>=0 && pos<=size) {
			return this.l[pos];
		}
		return null;
	}
	
	public int getPos(String palabra) {
		int pos = 0;
		for(String p : this.l) {
			if(p != null && p.equals(palabra)) {
				return pos;
			}
			pos++;
		}
		return -1;
	}

	public String remove() {
		if(size>0) {
			String borron = this.l[size];
			this.l[size]=null;
			return borron;
		}
		return null;		
	}
	
	public int remove(String del) {
		if(size>0) {
			int i=0;
			for(String palabra : this.l) {
				if(palabra !=null && palabra.equals(del)) {
					this.l[i] = null;
					return i;
				}
				i++;
			}
			return -1;
		}
		return -1;
	}
	
	public String remove(int n) {
		if(size>0) {
			String borron = this.l[n];
			this.l[n]=null;
			return borron;
		}
		return null;	
	}	
	
	public String toString() {
		String res="";

        for(int i = 0; i<this.l.length; i++){
        	if(l[i]!=null) {
        		res+=l[i]+" ";	
        	}
        }
        
        return res;
	}
}
