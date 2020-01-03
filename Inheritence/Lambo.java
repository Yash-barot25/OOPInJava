package OOP.Inheritence;

 class Lambo extends Car {

     Lambo() {
        super("lambo", "sport car", 400, 2, 2, 4,5);
    }

     void accelaration(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity <= 0){
            stop();
        } else if (newVelocity <= 15){
               chageGear(1);
        }  else if (newVelocity <= 20){
           chageGear(2);
        }  else if (newVelocity <= 40){
           chageGear(3);
        }   else if (newVelocity <= 55){
            chageGear(4);
        }   else
        {
            chageGear(5);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }


}
