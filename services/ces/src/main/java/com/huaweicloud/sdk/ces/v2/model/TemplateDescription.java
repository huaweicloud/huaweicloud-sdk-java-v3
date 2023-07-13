package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 告警模板的描述，长度范围[0,256]，该字段默认值为空字符串
 */
public class TemplateDescription {

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
        sb.append("class TemplateDescription {\n");
        sb.append("}");
        return sb.toString();
    }

}
