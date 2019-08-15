package TimerTest;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ForkJoinPool;

/**
 * 需求：在指定时间删除我们指定目录
 * /Users/Z/DeskTop/Demo1
 * /Users/Z/DeskTop/Demo2
 *
 * 任务：定是删除Demo文件夹
 *
 */
class DeleteFolder extends TimerTask {
    @Override
    public void run() {
        File srcFolder = new File("/Users/Z/DeskTop/Demo1");
        deleteFolder(srcFolder);
    }

    //递归删除目录
    public void deleteFolder(File srcFolder) {
        File[] fileArray = srcFolder.listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                if (file.isDirectory()) {
                    deleteFolder(file);
                } else {
                    System.out.println(file.getName() + ":" + file.delete());
                }
            }
            srcFolder.delete();
        }
    }
}


    public class TimerTest {
        public static void main(String[] args) throws ParseException {
            Timer t = new Timer();

            String s = "2019-08-15 15:08:30";
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            Date d = sdf.parse(s);


            t.schedule(new DeleteFolder(), d);
        }
    }
