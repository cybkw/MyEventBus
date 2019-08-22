package com.bkw.eventbusannotation.mode;

public class EventBeans implements SubscribeInfo {

    /**
     * 订阅者对象class,如：MainActivity.class
     */
    private Class subscriberClass;

    /**
     * 订阅方法数组，参看SimpleSubscribeInfo.java 25行。
     */
    private SubscriberMethod[] methods;

    public EventBeans(Class subscriberClass, SubscriberMethod[] methods) {
        this.subscriberClass = subscriberClass;
        this.methods = methods;
    }

    @Override
    public Class<?> getSubscriberClass() {
        return subscriberClass;
    }

    @Override
    public SubscriberMethod[] getSubscriberMethods() {
        return methods;
    }
}
