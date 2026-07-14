import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
class ThrowsEx
{
    static void fetchFile() throws IOException
    {
        File file = new File("new.txt");
        FileInputStream st = new FileInputStream(file);
    }

    public static void main(String args[])
    {
        try
        {
            fetchFile();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}