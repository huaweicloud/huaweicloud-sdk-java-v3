package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * 信任委托最大会话时长，默认为3600秒，取值范围为[3600,43200]。
 */
public class TrustMaxSessionDuration {

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
        sb.append("class TrustMaxSessionDuration {\n");
        sb.append("}");
        return sb.toString();
    }

}
