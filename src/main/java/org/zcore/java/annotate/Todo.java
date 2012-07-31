package org.zcore.java.annotate;

import java.lang.annotation.*;

/**
 * Simple interface defining a "todo" with a string "value"
 * @author rob <rob@zcore.org>
 */
@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String value();
}
