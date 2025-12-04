package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CVE漏洞列表
 */
public class CVEAllowlistItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_id")

    private String cveId;

    public CVEAllowlistItem withCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }

    /**
     * CVE的ID, 比如：CVE-2019-10164
     * @return cveId
     */
    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CVEAllowlistItem that = (CVEAllowlistItem) obj;
        return Objects.equals(this.cveId, that.cveId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CVEAllowlistItem {\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
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
