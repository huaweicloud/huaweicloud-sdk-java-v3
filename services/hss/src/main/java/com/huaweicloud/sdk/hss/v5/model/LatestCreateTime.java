package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 最近生成时间，毫秒(如果返回值为null，代表暂未生成) **取值范围**: 不涉及 
 */
public class LatestCreateTime {

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
        sb.append("class LatestCreateTime {\n");
        sb.append("}");
        return sb.toString();
    }

}
