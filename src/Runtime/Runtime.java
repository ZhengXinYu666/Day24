package Runtime;

public class Runtime{
    private Runtime(){}
        private static Runtime currentRuntime = new Runtime();
        public static Runtime getRuntime(){
            return currentRuntime;
        }
    }
