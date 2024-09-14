package Lab1;

public class Singer {
    private int singerID;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int numberOfAlbums;
    //constructors
    public Singer() {}

    public Singer(int singerID) {
        this.singerID = singerID;
    }
    public Singer(int singerID, String singerName)
    {
        this.singerID = singerID;
        this.singerName = singerName;
    }
    public Singer(int singerID, String singerName, String singerAddress)
    {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
    }
    public Singer(int singerID, String singerName, String singerAddress, String dateOfBirth)
    {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
    }
    public Singer(int singerID, String singerName, String singerAddress, String dateOfBirth, int numberOfAlbums)
    {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbums = numberOfAlbums;
    }



    //method to set and get
    public int getSingerID()
    {
        return singerID;
    }

    public String getSingerAddress()
    {
        return singerAddress;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    public String getSingerName()
    {
        return singerName;
    }

    public int getNumberOfAlbums()
    {
        return numberOfAlbums;
    }
    public void setSingerID(int singerID)
    {
        this.singerID = singerID;
    }
    public void setSingerName(String singerName)
    {
        this.singerName = singerName;
    }
    public void setSingerAddress(String singerAddress)
    {
        this.singerAddress = singerAddress;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    public void setNumberOfAlbums(int numberOfAlbums)
    {
        this.numberOfAlbums = numberOfAlbums;
    }
    public void setSingerAtOnce(int id, String name, String address, String dateOfBirth, int numberOfAlbums )
    {
        this.singerID = id;
        this.singerName = name;
        this.singerAddress = address;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbums = numberOfAlbums;
    }
}
