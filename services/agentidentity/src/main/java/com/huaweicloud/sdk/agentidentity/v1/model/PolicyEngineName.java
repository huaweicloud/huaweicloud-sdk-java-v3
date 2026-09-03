package com.huaweicloud.sdk.agentidentity.v1.model;

import java.util.Objects;

/**
 * Customer-assigned immutable name for the policy engine.
 */
public class PolicyEngineName {

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
        sb.append("class PolicyEngineName {\n");
        sb.append("}");
        return sb.toString();
    }

}
