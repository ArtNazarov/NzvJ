# NzvJ
lightweight library for Java console apps

How to use
===

``` 
     new NzvApp()
            .onCommand("test", params -> 
                System.out.println("Test route: " + params))
            .onCommand("other", MyApp::testHello)
            .process("test", "some test sentence")
            .process("other", "other phrase");
```

See the example in MyApp folder
