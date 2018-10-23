import arc.ARCAlgorithm;
import database.models.Page;
import java.util.Scanner;

/**
 * Created by shakir on 23/10/18.
 */
public class Demo {
    public static void main(String[] args) {
        firstTestCase();
        secondTestCase();
        thirdTestCase();
        fourthTestCase();
    }

    public static void firstTestCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Running test case 1 - Please enter the max size of Cache");
        int maxSize = scanner.nextInt();
        ARCAlgorithm arc = new ARCAlgorithm(maxSize);

        Page page1 = new Page(1, 1);
        Page page2 = new Page(2, 2);
        Page page3 = new Page(3, 3);
        Page page4 = new Page(4, 4);
        Page page5 = new Page(5, 5);
        Page page6 = new Page(6, 6);
        Page page7 = new Page(7, 7);
        Page page8 = new Page(8, 8);

        arc.putCache(page1.getPageId(), page1);
        arc.putCache(page2.getPageId(), page2);
        arc.putCache(page3.getPageId(), page3);
        arc.putCache(page4.getPageId(), page4);
        arc.putCache(page5.getPageId(), page5);
        arc.putCache(page6.getPageId(), page6);
        arc.putCache(page7.getPageId(), page7);
        arc.putCache(page8.getPageId(), page8);

        arc.printCacheIdsFromQueue();
    }

    public static void secondTestCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Running test case 2 - Please enter the max size of Cache");
        int maxSize = scanner.nextInt();
        ARCAlgorithm arc = new ARCAlgorithm(maxSize);

        Page page1 = new Page(1, 1);
        Page page2 = new Page(2, 2);
        Page page3 = new Page(3, 3);
        Page page4 = new Page(4, 4);
        Page page5 = new Page(5, 5);
        Page page6 = new Page(6, 6);
        Page page7 = new Page(7, 7);
        Page page8 = new Page(8, 8);

        arc.putCache(page1.getPageId(), page1);
        arc.putCache(page2.getPageId(), page2);
        arc.putCache(page3.getPageId(), page3);
        arc.putCache(page4.getPageId(), page4);
        arc.putCache(page5.getPageId(), page5);
        arc.putCache(page6.getPageId(), page6);
        arc.putCache(page7.getPageId(), page7);
        arc.putCache(page8.getPageId(), page8);

        arc.printCacheIdsFromQueue();
    }

    public static void thirdTestCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Running test case 3 - Please enter the max size of Cache");
        int maxSize = scanner.nextInt();
        ARCAlgorithm arc = new ARCAlgorithm(maxSize);

        Page page1 = new Page(1, 1);
        Page page2 = new Page(2, 2);
        Page page3 = new Page(3, 3);
        Page page4 = new Page(4, 4);
        Page page5 = new Page(5, 5);
        Page page6 = new Page(6, 6);
        Page page7 = new Page(7, 7);
        Page page8 = new Page(8, 8);

        arc.putCache(page1.getPageId(), page1);
        arc.putCache(page2.getPageId(), page2);
        arc.putCache(page3.getPageId(), page3);
        arc.putCache(page4.getPageId(), page4);
        arc.putCache(page5.getPageId(), page5);
        arc.putCache(page6.getPageId(), page6);
        arc.putCache(page7.getPageId(), page7);
        arc.putCache(page8.getPageId(), page8);

        arc.printCacheIdsFromQueue();
    }

    public static void fourthTestCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Running test case 4 - Please enter the max size of Cache");
        int maxSize = scanner.nextInt();
        ARCAlgorithm arc = new ARCAlgorithm(maxSize);

        Page page1 = new Page(1, 1);
        Page page2 = new Page(2, 2);
        Page page3 = new Page(3, 3);
        Page page4 = new Page(4, 4);
        Page page5 = new Page(5, 5);
        Page page6 = new Page(6, 6);
        Page page7 = new Page(7, 7);
        Page page8 = new Page(8, 8);

        arc.putCache(page1.getPageId(), page1);
        arc.putCache(page2.getPageId(), page2);
        arc.putCache(page3.getPageId(), page3);
        arc.putCache(page4.getPageId(), page4);
        arc.putCache(page5.getPageId(), page5);
        arc.putCache(page6.getPageId(), page6);
        arc.putCache(page7.getPageId(), page7);
        arc.putCache(page8.getPageId(), page8);

        arc.printCacheIdsFromQueue();
    }
}
