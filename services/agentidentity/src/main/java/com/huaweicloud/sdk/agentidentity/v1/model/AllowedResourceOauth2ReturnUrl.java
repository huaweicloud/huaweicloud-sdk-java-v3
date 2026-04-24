package com.huaweicloud.sdk.agentidentity.v1.model;

import java.util.Objects;

/**
 * The list item of allowed OAuth2 return URLs for resources associated with this workload identity.
 */
public class AllowedResourceOauth2ReturnUrl {

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
        sb.append("class AllowedResourceOauth2ReturnUrl {\n");
        sb.append("}");
        return sb.toString();
    }

}
