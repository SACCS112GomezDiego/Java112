
public class Automobile2 {
	private String m_name, m_hornSound, m_color;
	private int m_doors, m_cylinders;
	public Automobile2(String name, String color, int doors, int cylinders, String hornSound){
		m_name = name;
	 	m_color = color;
	 	m_doors = doors;
	 	m_cylinders = cylinders;
	 	m_hornSound = hornSound;
	}	
		public String description(){
		String type = " "+ m_name +" " + m_color +" " + m_doors + " " + m_cylinders + "" + m_hornSound;
		return type;
						
		}
		@Override
		public String toString() { // Overriding description method
			return " " + description();
		}
		public String Honks(){
		return m_hornSound;
		}
		public static String Honk(){
			return "Beep beep bep";
		}
		public static String Honks(String Sound){
			return Sound;
		}
	}

