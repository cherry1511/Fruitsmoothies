
public class SpinningMenu {
	public static void main(String[] args) {
			fruit b1 = new Coconut();
			b1 = new Topping(b1);
		    System.out.println(b1.getDescription() + " $"+b1.cost());
				
		    fruit b2 = new lemon();
		    b2 = new Topping(b2);
            System.out.println(b2.getDescription() + " $"+b2.cost());
		    
            fruit b3 = new pineapplejuice();
		    b3 = new Topping(b3);
            System.out.println(b3.getDescription() + " $"+b3.cost());
		    
            fruit b4 = new Strawberryspin();
		    b4 = new Topping(b4);
            System.out.println(b4.getDescription() + " $"+b4.cost());
		    
            fruit b5 = new orange();
		    b5 = new Topping(b5);
            System.out.println(b5.getDescription() + " $"+b5.cost());
	}

}

