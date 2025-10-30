package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CveInfo
 */
public class CveInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_id")

    private String cveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cvss_score")

    private Float cvssScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private Long publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CveInfo withCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }

    /**
     * **参数解释** CVE id **取值范围** 字符长度0-128位 
     * @return cveId
     */
    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public CveInfo withCvssScore(Float cvssScore) {
        this.cvssScore = cvssScore;
        return this;
    }

    /**
     * **参数解释** CVSS分数 **取值范围** 取值0-100 
     * minimum: 0
     * maximum: 1E+2
     * @return cvssScore
     */
    public Float getCvssScore() {
        return cvssScore;
    }

    public void setCvssScore(Float cvssScore) {
        this.cvssScore = cvssScore;
    }

    public CveInfo withPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * **参数解释** CVE公布时间，时间单位：毫秒（ms） **取值范围** 取值0-3857960855552
     * minimum: 0
     * maximum: 3857960855552
     * @return publishTime
     */
    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public CveInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** CVE描述 **取值范围** 字符长度0-256位
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CveInfo that = (CveInfo) obj;
        return Objects.equals(this.cveId, that.cveId) && Objects.equals(this.cvssScore, that.cvssScore)
            && Objects.equals(this.publishTime, that.publishTime) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveId, cvssScore, publishTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CveInfo {\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    cvssScore: ").append(toIndentedString(cvssScore)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
