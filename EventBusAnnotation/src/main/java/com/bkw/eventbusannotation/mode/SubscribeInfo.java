package com.bkw.eventbusannotation.mode;

public interface SubscribeInfo {
    /**
     * 订阅所属类
     *
     * @return
     */
    Class<?> getSubscriberClass();

    /**
     * 获取订阅所属类中所有订阅事件的方法（此处不使用List是因为注解处理器每次都要list.clear()，麻烦！）
     *
     * @return
     */
    SubscriberMethod[] getSubscriberMethods();
}
