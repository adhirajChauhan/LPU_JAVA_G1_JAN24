import java.util.logging.Level;

enum Levels{
    EASY,
    MEDIUM,
    HARD
}

class SetDifficulty{

    Levels level;

    public SetDifficulty(Levels level){
        this.level = level;
    }
    public void SetDiff(){
        switch (level) {
            case EASY:
                System.out.println("EASY MODE");
                break;
            case MEDIUM:
                System.out.println("MEDIUM MODE");
                break;  
            case HARD:
                System.out.println("HARD MODE");
                break;
            default:
                System.out.println("No Difficulty");
                break;
        }
    }
}

class LPU{
    public static void main(String args[]){
        // for(Days i : Days.values()){
        //     System.out.println(i);
        // }
        SetDifficulty sd1 = new SetDifficulty(Levels.MEDIUM);

        sd1.SetDiff();
        
    }




    
    

}
