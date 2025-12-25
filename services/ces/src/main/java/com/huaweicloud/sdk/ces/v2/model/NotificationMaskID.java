package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 屏蔽规则ID **约束限制**： 不涉及 **取值范围**： 以nm开头，后跟[0,62]位字母或数字。 **默认取值**： 不涉及 
 */
public class NotificationMaskID {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationMaskID {\n");
        sb.append("}");
        return sb.toString();
    }

}
