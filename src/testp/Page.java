package testp;

/**
 * Created by Lena on 24.05.2016.
 */
public class Page {
        private String url;
        String title;
        public int numberOfSomething;

        public Page(String url, String title, int numberOfSomething){
            this.url = url;
            this.title = title;
            this.numberOfSomething = numberOfSomething;
        }

        public Page(){
            this.url = "";
            this.title = "";
            this.numberOfSomething = 100;
        }

        public String getUrl(){
            return url;
        }
        public String getTitle(){
            return title;
        }
        public int getNumbers(){
            return numberOfSomething;
        }
    public void setURL(String url){
        this.url = url;
    }


}


