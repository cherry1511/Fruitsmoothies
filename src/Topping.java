public class Topping extends condimenDecorator {
	fruit fruit;
	public Topping(fruit fruit){
		this.fruit = fruit;
	}
  public String getDescription() {
		// TODO Auto-generated method stub
		return fruit.getDescription()+ ", Topping";
	}
 public double cost(){
	 return 10 + fruit.cost();
 }
}