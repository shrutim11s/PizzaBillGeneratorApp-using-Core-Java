package pizza.abc;

public class Pizza {
          private String type;
          private double basePrice;
          private boolean extraCheese;
          private int extraToppings;
          
          public Pizza(String type, boolean extraCheese, int extraToppings) {
              this.type = type;
              this.extraCheese = extraCheese;
              this.extraToppings = extraToppings;
              setBasePrice();
          }

          private void setBasePrice() {
              switch (type.toLowerCase()) {
                  case "veg pizza":
                      basePrice = 10.00;
                      break;
                  case "non-veg pizza":
                      basePrice = 20.00;
                      break;
                  case "delux veg pizza":
                      basePrice = 25.00; 
                      extraCheese = false; 
                      extraToppings = 0; 
                      break;
                  case "delux non-veg pizza":
                      basePrice = 35.00; 
                      extraCheese = false; 
                      extraToppings = 0;    
                      break;
                  default:
                      basePrice = 0.00;
                      break;
              }
          }
          
          public double calculateTotal() {
        	  
              double total = basePrice;
              if (extraCheese) {
                  total += 1.50; 
              }
              
              total += extraToppings * 1.00;
              return total;
          }

          public String getBill() {
              StringBuilder bill = new StringBuilder();
              bill.append("Pizza Type: ").append(type).append("\n")
                  .append("Base Price: $").append(basePrice).append("\n");
              
              if (extraCheese) {
                  bill.append("Extra Cheese: $1.50\n");
              }
              
              if (extraToppings > 0) {
                  bill.append("Extra Toppings: $").append(extraToppings).append("\n");
              }
              
              bill.append("Total Price: $").append(calculateTotal());
              return bill.toString();
          }
      }

