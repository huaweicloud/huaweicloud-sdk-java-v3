package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GcbRemoteSiteCode
 */
public class GcbRemoteSiteCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_site_code")

    private String remoteSiteCode;

    public GcbRemoteSiteCode withRemoteSiteCode(String remoteSiteCode) {
        this.remoteSiteCode = remoteSiteCode;
        return this;
    }

    /**
     * 功能说明：远端接入点的编码。
     * @return remoteSiteCode
     */
    public String getRemoteSiteCode() {
        return remoteSiteCode;
    }

    public void setRemoteSiteCode(String remoteSiteCode) {
        this.remoteSiteCode = remoteSiteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GcbRemoteSiteCode that = (GcbRemoteSiteCode) obj;
        return Objects.equals(this.remoteSiteCode, that.remoteSiteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteSiteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GcbRemoteSiteCode {\n");
        sb.append("    remoteSiteCode: ").append(toIndentedString(remoteSiteCode)).append("\n");
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
