package web_crawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Web_Crawler {

    private Queue<String> queue;
    private List<String> visitedUrls;

    public Web_Crawler() {
        this.queue = new LinkedList<>();
        this.visitedUrls=new ArrayList<>();
    }

    private String readURL(String string){

        String rawHtml="";

        try {
            URL url=new URL(string);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine="";
            while((inputLine=bufferedReader.readLine())!=null) rawHtml += inputLine;

            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return rawHtml;
    }

    public void crawler(String url){

        this.queue.add(url);
        this.visitedUrls.add(url);

        while(!queue.isEmpty()){
            String presenturl=queue.remove();
            String rawHtml=readURL(presenturl);
            System.out.println("Reaching ... "+presenturl);


            String regExp="https://(\\w+\\.)*(\\w+)";
            Pattern pattern=Pattern.compile(regExp);
            Matcher matcher=pattern.matcher(rawHtml);

            while(matcher.find()){
                String actualUrl=matcher.group();

                if(!visitedUrls.contains(actualUrl)){
                    this.queue.add(actualUrl);
                    this.visitedUrls.add(actualUrl);
                }
            }
        }
    }
}
