public class MusicDownloads{
  private List<DownloadInfo> downloadList;

  public MusicDownloads()
  {   downloadList = new ArrayList<DownloadInfo>();   }

  public DownloadInfo getDownloadInfo(String title)
  {
    /* To be implemented in part (a) */
    for(int a = 0; a<downloadList.size(); a++)
    {
      if(downloadList.getTitle(a).equals(title))
      {
        return downloadInfo(downloadList(a));
      }
    }
    return null;

  }

  public void updateDownloadInfo(List<String> titles)
  {
    /* To be implemented in part (b) */
    for(int a = 0; a<titles.size(); a++)
    {
      for(int b = 0; b<downloadList.size(); b++)
      {
        if(titles.getTitle(a).equals(downloadList.getTitle(b)))
        {
          downloadList.incrementTimesDownLoaded();
        }
      }
    }


  }
}
