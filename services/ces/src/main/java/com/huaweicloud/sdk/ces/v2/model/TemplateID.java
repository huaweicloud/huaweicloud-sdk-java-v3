package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 告警模板的ID，以at开头，后跟字母、数字，长度最长为64
 */
public class TemplateID {

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
        sb.append("class TemplateID {\n");
        sb.append("}");
        return sb.toString();
    }

}
