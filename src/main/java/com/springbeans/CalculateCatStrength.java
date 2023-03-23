
package com.springbeans;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

 @Retention(value= RetentionPolicy.RUNTIME)
public @interface CalculateCatStrength {
    int minStrenght();
    int maxStrenght();
}
