class VariableExample {

  static int num = 55;


  long num1 = 546687;
  
  public void display() {
  char a = 'M';
  double num2 = 45.767;
  System.out.println("local variable value : "+a);
  System.out.println("local variable value : "+num2);
}

public static void main(String args[]) {
   VariableExample obj = new VariableExample();
    obj.display();
    System.out.println("Instance variable value : "+ obj.num1);
    System.out.println("static variable value : " + num);

  }
}