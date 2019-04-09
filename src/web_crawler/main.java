package web_crawler;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Web_Crawler web_crawler=new Web_Crawler();

        System.out.println("Enter the url you wanna crawl:");
        String url=in.next();

        web_crawler.crawler(url);

    }
}
