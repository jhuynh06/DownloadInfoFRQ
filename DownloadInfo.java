// declares class
public class DownloadInfo {
    //Creates two instance variables 
    private String downloadedTitle;
    private int timesDownloaded = 0;

    //declares constructor
    public DownloadInfo (String title, int initDownloaded) {
        downloadedTitle = title;
        timesDownloaded = initDownloaded;
    }

    //declares getter method for downloadedTitle variable
    public String getTitle() {
        return downloadedTitle;
    }

    //declares getter method for timesDownloaded variable
    public int getTimesDownload() {
        return timesDownloaded;
    }
    
    //declares increase method that increases timesDownloaded by 1
    public void incrementTimesDownload() {
        timesDownloaded += 1;
    }
}
