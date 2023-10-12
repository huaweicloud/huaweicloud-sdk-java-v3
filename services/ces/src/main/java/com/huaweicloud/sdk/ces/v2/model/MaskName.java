package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 屏蔽规则名称，只能为字母、数字、汉字、-、_，最大长度为64
 */
public class MaskName {

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
        sb.append("class MaskName {\n");
        sb.append("}");
        return sb.toString();
    }

}
