package exercise_10_1;

public class Data {
    public static double average(Measureable[] objects){
        double sum = 0;
        for( int i = 0; i<objects.length; i++){
            sum = sum + objects[i].getMeasure();
        }
        if(objects.length > 0){
            return sum / objects.length;
        }
        else{
            return 0;
        }
    }

    public static double max(Measureable[] objects) {
        double largest = 0;
        for(int i=0; i < objects.length;i++){
            if(objects[i].getMeasure() > largest){
                largest = objects[i].getMeasure();
            }
        }
        return largest;
    }
}
