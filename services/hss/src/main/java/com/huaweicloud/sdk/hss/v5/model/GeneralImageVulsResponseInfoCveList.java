package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GeneralImageVulsResponseInfoCveList
 */
public class GeneralImageVulsResponseInfoCveList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_id")

    private String cveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cvss")

    private Float cvss;

    public GeneralImageVulsResponseInfoCveList withCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }

    /**
     * **参数解释**： CVE ID **取值范围**： 字符长度1-32位 
     * @return cveId
     */
    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public GeneralImageVulsResponseInfoCveList withCvss(Float cvss) {
        this.cvss = cvss;
        return this;
    }

    /**
     * **参数解释**： CVSS分值 **取值范围**： 字符长度1-10 
     * minimum: 0
     * maximum: 1E+1
     * @return cvss
     */
    public Float getCvss() {
        return cvss;
    }

    public void setCvss(Float cvss) {
        this.cvss = cvss;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeneralImageVulsResponseInfoCveList that = (GeneralImageVulsResponseInfoCveList) obj;
        return Objects.equals(this.cveId, that.cveId) && Objects.equals(this.cvss, that.cvss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveId, cvss);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralImageVulsResponseInfoCveList {\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    cvss: ").append(toIndentedString(cvss)).append("\n");
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
