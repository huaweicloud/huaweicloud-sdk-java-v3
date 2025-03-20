package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * 三段式的授权项名称，例如\&quot;iam:policies:createV5\&quot;。
 */
public class ActionName {

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
        sb.append("class ActionName {\n");
        sb.append("}");
        return sb.toString();
    }

}
