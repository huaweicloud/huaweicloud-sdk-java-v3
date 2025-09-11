package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 时区，形如：\&quot;GMT-08:00\&quot;、\&quot;GMT+08:00\&quot;、\&quot;GMT+0:00\&quot;。    **取值范围**： 长度为[1,16]个字符。 
 */
public class EffectiveTimezoneResp {

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
        sb.append("class EffectiveTimezoneResp {\n");
        sb.append("}");
        return sb.toString();
    }

}
