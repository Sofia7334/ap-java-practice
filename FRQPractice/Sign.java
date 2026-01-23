package FRQPractice;

public class Sign {
    private String message;
    private int width;

    public Sign (String message, int width){
        this.message = message;
        this.width = width;
    }

    public int numberOfLines (){
        int numLines = (message.length() + width - 1) / width;
        return numLines;
    }

    public String getLines(){
        String concatenated = "";
        int numLines = numberOfLines();
        for (int i = 1; i <=(numLines); i++){
            if (i == 1){
                concatenated = message.substring(0, width);
            } else {
                concatenated = concatenated + ";" + message.substring(((width * i) - width), width * i);
            }
        }
        return concatenated;
    }
}