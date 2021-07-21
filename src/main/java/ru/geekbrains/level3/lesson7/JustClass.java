package ru.geekbrains.level3.lesson7;

public class JustClass {
    @BeforeSuite
    public void methodBeforeSuite() {System.out.println("methodBeforeSuite"); }
    @Test(priority = 3)
    public void firstMethod() {System.out.println("firstMethod"); }
    @Test(priority = 2)
    public void secondMethod() {System.out.println("secondMethod"); }
    @Test(priority = 1)
    public void thirdMethod() {System.out.println("thirdMethod"); }
    @Test(priority = 4)
    public void fourthMethod() {System.out.println("fourthMethod"); }
    @AfterSuite
    public void finished() {System.out.println("finished"); }
}
