package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * 身份策略版本号，以\&quot;v\&quot;开头后跟数字，例如\&quot;v5\&quot;。
 */
public class PolicyVersionId {

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
        sb.append("class PolicyVersionId {\n");
        sb.append("}");
        return sb.toString();
    }

}
