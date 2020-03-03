
public class LSInfoItem {
    String LSTime;
    String LSAreas;

    public LSInfoItem(String LSLine){
        //Find position of last _ value
        int pos = LSLine.lastIndexOf("_");

        //copy from _ value +2 and store in LSTime
        this.LSTime = LSLine.substring(0,pos +3);
        if (LSLine.length() > pos + 3){
        //Store remaining info of LSLine into LSAreasDraft
        String LSAreasDraft = LSLine.substring(pos + 3);

        //Remove spaces of the location and store in LSAreas
        this.LSAreas = LSAreasDraft.replace(" ", "");
        }
        else{
            this.LSAreas = null;
        }
    }

    public String getLSTime(){
        return LSTime;
    }

    public String getLSAreas(){
        return LSAreas;
    }

    //public int compareTo(String timeIn){
    //    return LSTime.compareTo(timeIn);

    public int compareTo(LSInfoItem item){
        String itemTime = item.LSTime;
        return itemTime.compareTo(LSTime);
    }

    public String toString(){
        return "Time: " + LSTime + System.lineSeparator() + "Areas: " +LSAreas + System.lineSeparator();
    }
}