package com.itscholl.library.unit_test.test_mock.injection;

public class MyServiceClass {

    private DependencyOne dependencyOne;

    private DependencyTwo dependencyTwo;

    public MyServiceClass(DependencyOne dependencyOne, DependencyTwo dependencyTwo) {
        this.dependencyOne = dependencyOne;
        this.dependencyTwo = dependencyTwo;
    }

    public String useDependencies() {
        return dependencyOne.doSomething() + " " + dependencyTwo.doSomething();
    }
}
