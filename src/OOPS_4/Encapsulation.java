package OOPS_4;
/* Access specifier are used to encapsulte the abstraction of its data members
while abstraction means to hide data without its essential details being revealed
encapsultion implements the logic of abstraction

there are few
private
protected
public
default

Another way of encapsulation is by the use of packages and inbuilt packages

 */
import java.awt.Frame;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;
import java.util.Date;
import java.util.Random;

public class Encapsulation extends Frame {

    private String fileData;
    private String hostInfo;
    private int randomNumber;
    private Date currentTime;

    public Encapsulation() {
        currentTime = getTime();
        randomNumber = getRandom();
        fileData = readFile();
        hostInfo = getHost();
        setupWindow();
    }

    private void setupWindow() {
        setTitle("Encapsulatio");
        setSize(500, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Time: " + currentTime.toString(), 50, 60);
        g.drawString("Random: " + randomNumber, 50, 90);
        g.drawString("Host: " + hostInfo, 50, 120);
        g.drawString("File: " + fileData, 50, 150);
        g.drawString("Class: " + getClass().getName(), 50, 180);
    }

    private Date getTime() {
        return new Date();
    }

    private int getRandom() {
        Random r = new Random();
        return r.nextInt(100);
    }

    private String readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String line = br.readLine();
            br.close();
            return line;
        } catch (Exception e) {
            return e.toString();
        }
    }

    private String getHost() {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            return addr.getHostName();
        } catch (Exception e) {
            return e.toString();
        }
    }

    public static void main(String[] args) {
        new Encapsulation();
    }
}

