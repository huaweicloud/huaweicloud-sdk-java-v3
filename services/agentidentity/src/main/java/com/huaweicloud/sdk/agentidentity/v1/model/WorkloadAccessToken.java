package com.huaweicloud.sdk.agentidentity.v1.model;

import java.util.Objects;

/**
 * An opaque token representing the identity of both the workload and the user (or just the workload if not acting on behalf of a user)
 */
public class WorkloadAccessToken {

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
        sb.append("class WorkloadAccessToken {\n");
        sb.append("}");
        return sb.toString();
    }

}
