package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * KMS密钥。
 */
public class KMSCmk {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grants")

    private String grants;

    public KMSCmk withGrants(String grants) {
        this.grants = grants;
        return this;
    }

    /**
     * 用于加密密钥的授权。
     * @return grants
     */
    public String getGrants() {
        return grants;
    }

    public void setGrants(String grants) {
        this.grants = grants;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KMSCmk that = (KMSCmk) obj;
        return Objects.equals(this.grants, that.grants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grants);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KMSCmk {\n");
        sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
