package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 站点编码。
 */
public class SiteCode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_code")

    private String siteCode;

    public SiteCode withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * 站点编码。
     * @return siteCode
     */
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SiteCode that = (SiteCode) obj;
        return Objects.equals(this.siteCode, that.siteCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SiteCode {\n");
        sb.append("    siteCode: ").append(toIndentedString(siteCode)).append("\n");
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
