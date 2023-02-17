import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        //Testing if the correct method is grabbed
        MusicDownloads webMusicA = new MusicDownloads();
        webMusicA.setter(new DownloadInfo("Hey Jude", 5));
        webMusicA.setter(new DownloadInfo("Soul Sister", 3));
        webMusicA.setter(new DownloadInfo("Aqualung", 10));
        System.out.println(webMusicA.getter() + " should be printed and printed is: " + webMusicA.getDownloadInfo("Aqualung"));
        System.out.println("null should be printed and printed is: " + webMusicA.getDownloadInfo("Happy Birthday"));

        //Testing the incremental and if it actually updates and all of the work
        ArrayList<String> songTitles = new ArrayList<String>();
        songTitles.add("Lights");
        songTitles.add("Aqualung");
        songTitles.add("Soul Sister");
        songTitles.add("Go Now");
        songTitles.add("Lights");
        songTitles.add("Soul Sister");
        MusicDownloads webMusicB = new MusicDownloads();
        webMusicB.setter(new DownloadInfo("Hey Jude", 5));
        webMusicB.setter(new DownloadInfo("Soul Sister", 3));
        webMusicB.setter(new DownloadInfo("Aqualung", 10));
        webMusicB.updateDownloads(songTitles);
        ArrayList<DownloadInfo> tester = webMusicB.returnArrayList();
        System.out.println("Hey Jude's download should be 5 and is: " + tester.get(0).getTimesDownload());
        System.out.println("Soul Sister's download should be 5 and is: " + tester.get(1).getTimesDownload());
        System.out.println("Aqualung's download should be 11 and is: " + tester.get(2).getTimesDownload());
        System.out.println("Light's download should be 2 and is: " + tester.get(3).getTimesDownload());
        System.out.println("Go Now's download should be 1 and is: " + tester.get(4).getTimesDownload());
    }

}
