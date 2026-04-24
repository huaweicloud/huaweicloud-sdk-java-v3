package com.huaweicloud.sdk.agentidentity.v1.model;

import java.util.Objects;

/**
 * The URN of the agency used to obtain IAM temporary credentials.
 */
public class AgencyUrn {

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
        sb.append("class AgencyUrn {\n");
        sb.append("}");
        return sb.toString();
    }

}
