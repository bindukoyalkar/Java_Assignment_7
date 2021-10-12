package InnerClasses;
public class Second {
        public class Inside extends First.Inner{
            public Inside(String s) {
                new First().super(s);
            }
        }
    }
