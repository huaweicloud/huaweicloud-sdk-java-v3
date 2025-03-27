package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 企业项目ID，不填时会使用默认的企业项目ID
 */
public class EnterpriseProjectID {

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
        sb.append("class EnterpriseProjectID {\n");
        sb.append("}");
        return sb.toString();
    }

}
