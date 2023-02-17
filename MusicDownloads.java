//imports ArrayList package
import java.util.ArrayList;
//declares MusicDOwnloads class
public class MusicDownloads {

    //declares ArrayList instance variable
    private ArrayList<DownloadInfo> downloadList;

    //constructor for MusicDownloads 
    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo>();
    }

    //adds variables to the ArrayList, setter
    public void setter(DownloadInfo addedObject) {
        downloadList.add(addedObject);
    }

    //getter method for checking test cases
    public String getter() {
        return downloadList.get(downloadList.size() - 1).toString();
    }

    public ArrayList<DownloadInfo> returnArrayList() {
        return downloadList;
    }

    //method that checks for specific variable, and if it's there return the object
    public DownloadInfo getDownloadInfo(String title) {
        // for loop that loops thru entire array
        for(int i = 0; i <downloadList.size(); i++) {
            //checks for the title and returns if found
            if(downloadList.get(i).getTitle().equals(title)) {
                return downloadList.get(i);
            }
        }
        return null;
    }
    
    //method that updates the downlkoad variable
    public void updateDownloads(ArrayList<String> titles) {
        for (int i = 0; i <= downloadList.size(); i++) {
            // check if the title needs to be added, and if not increment it
            if (getDownloadInfo(titles.get(i)) != null) {
                getDownloadInfo(titles.get(i)).incrementTimesDownload();
            }
            // add any missing titles
            else {
                downloadList.add(new DownloadInfo(titles.get(i), 1));
            }
        }
    }




}
