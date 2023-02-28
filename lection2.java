import java.io.File;
public class lection2 {
    public static void main(String[] args) {
        // String str = "";
        // for(int i = 0; i < 1_000_000; i++){
        //     str += "+";
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < 1_000_000; i++){
        //     sb.append("+"); // it is much faster

        // FILES

        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        }
    }
}
