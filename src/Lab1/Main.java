package Lab1;

public class Main {
    public static void main(String[] args)
    {
        Singer singer1 = new Singer();

        singer1.setSingerID(1);
        singer1.setSingerName("Sabrina Carpenter");
        singer1.setSingerAddress("USA");
        singer1.setDateOfBirth("11-May-1999");
        singer1.setNumberOfAlbums(6);

        Singer singer2 = new Singer();
        singer2.setSingerAtOnce(2,"Taylor Swift","USA","13-Dec-1989",11);

        //display
        System.out.println("Singer Details of Singer: "+singer1.getSingerID());
        System.out.println("Singer Name "+singer1.getSingerName());
        System.out.println("Singer Address "+singer1.getSingerAddress());
        System.out.println("Date of Birth "+singer1.getDateOfBirth());
        System.out.println("Number of Albums "+singer1.getNumberOfAlbums());
        System.out.println();

        System.out.println("Singer Details of Singer: "+singer2.getSingerID());
        System.out.println("Singer Name "+singer2.getSingerName());
        System.out.println("Singer Address "+singer2.getSingerAddress());
        System.out.println("Date of Birth "+singer2.getDateOfBirth());
        System.out.println("Number of Albums "+singer2.getNumberOfAlbums());
        System.out.println();
    }
}
