package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GcbLocalSiteCode
 */
public class GcbLocalSiteCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_site_code")

    private String localSiteCode;

    public GcbLocalSiteCode withLocalSiteCode(String localSiteCode) {
        this.localSiteCode = localSiteCode;
        return this;
    }

    /**
     * 功能说明：本端接入点的编码。
     * @return localSiteCode
     */
    public String getLocalSiteCode() {
        return localSiteCode;
    }

    public void setLocalSiteCode(String localSiteCode) {
        this.localSiteCode = localSiteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GcbLocalSiteCode that = (GcbLocalSiteCode) obj;
        return Objects.equals(this.localSiteCode, that.localSiteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localSiteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GcbLocalSiteCode {\n");
        sb.append("    localSiteCode: ").append(toIndentedString(localSiteCode)).append("\n");
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
