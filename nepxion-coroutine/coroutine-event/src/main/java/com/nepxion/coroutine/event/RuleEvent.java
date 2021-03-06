package com.nepxion.coroutine.event;

/**
 * <p>Title: Nepxion Coroutine</p>
 * <p>Description: Nepxion Coroutine For Distribution</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Nepxion</p>
 * @author Neptune
 * @email 1394997@qq.com
 * @version 1.0
 */

import java.io.Serializable;

import com.nepxion.coroutine.event.eventbus.Event;

public abstract class RuleEvent extends Event implements Serializable {
    private static final long serialVersionUID = -2273803178346854104L;

    private String categoryName;
    private String ruleName;

    public RuleEvent(String categoryName, String ruleName) {
        this.categoryName = categoryName;
        this.ruleName = ruleName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public static String getEventName() {
        return RuleEvent.class.getName();
    }
}