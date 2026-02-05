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
		
			if (size == l.length) {
	            redimensionar();
			}
			this.l[size] = palabra;
			this.size++;
		
	}
	
	private void redimensionar() {
		//nl = new l me lo apunto pa que no se me olvide
        String[] nl = new String[l.length * 2];
        for (int i = 0; i < l.length; i++) {
            nl[i] = l[i];
        }
        l = nl;
    }
	
	public void add(int pos, String palabra) {
		int i;
		if(pos < length && this.size+1 <= this.length) {
			 if (size == l.length) {
		            redimensionar();
		      }
		        for (i = size; i > pos; i--) {
		            l[i] = l[i - 1];
		        }

		        l[pos] = palabra;
		        size++;
		}
		
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
		if(this.size>0) {
			String borron = this.l[size-1];
			this.l[size-1]=null;
			size--;
			return borron;
		}
		return null;		
	}
	
	public int remove(String del) {
		if(size>0) {
			int i=0;
			for(String palabra : this.l) {
				if(palabra !=null && palabra.equals(del)) {
					int posicion = i;
			
					for (i = posicion; i < size - 1; i++) {
				        l[i] = l[i + 1];
					}
					
				    l[size - 1] = null;
				    size--;
					return posicion;
				}
				i++;
			}
			return -1;
		}
		return -1;
	}
	
	public String remove(int n) {
		int i;
		if(size>0) {
			String borron = this.l[n];
			for (i = n; i < size - 1; i++) {
		        l[i] = l[i + 1];
			}
			this.l[n]=null;
			return borron;
		}
		return null;	
	}	
	
	public String toString() {
		String res="";

        for(int i = 0; i<this.l.length; i++){
        	
        		res+=l[i]+" ";	
        	
        }
        
        return res;
	}
}
