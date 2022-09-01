package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * CheckRecordIssueCountsInfo
 */
public class CheckRecordIssueCountsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical")

    @JacksonXmlProperty(localName = "critical")

    private Integer critical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serious")

    @JacksonXmlProperty(localName = "serious")

    private Integer serious;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal")

    @JacksonXmlProperty(localName = "normal")

    private Integer normal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt")

    @JacksonXmlProperty(localName = "prompt")

    private Integer prompt;

    public CheckRecordIssueCountsInfo withCritical(Integer critical) {
        this.critical = critical;
        return this;
    }

    /**
     * 致命问题
     * @return critical
     */
    public Integer getCritical() {
        return critical;
    }

    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    public CheckRecordIssueCountsInfo withSerious(Integer serious) {
        this.serious = serious;
        return this;
    }

    /**
     * 严重问题
     * @return serious
     */
    public Integer getSerious() {
        return serious;
    }

    public void setSerious(Integer serious) {
        this.serious = serious;
    }

    public CheckRecordIssueCountsInfo withNormal(Integer normal) {
        this.normal = normal;
        return this;
    }

    /**
     * 常规问题
     * @return normal
     */
    public Integer getNormal() {
        return normal;
    }

    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    public CheckRecordIssueCountsInfo withPrompt(Integer prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * 提示问题
     * @return prompt
     */
    public Integer getPrompt() {
        return prompt;
    }

    public void setPrompt(Integer prompt) {
        this.prompt = prompt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRecordIssueCountsInfo checkRecordIssueCountsInfo = (CheckRecordIssueCountsInfo) o;
        return Objects.equals(this.critical, checkRecordIssueCountsInfo.critical)
            && Objects.equals(this.serious, checkRecordIssueCountsInfo.serious)
            && Objects.equals(this.normal, checkRecordIssueCountsInfo.normal)
            && Objects.equals(this.prompt, checkRecordIssueCountsInfo.prompt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(critical, serious, normal, prompt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRecordIssueCountsInfo {\n");
        sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
        sb.append("    serious: ").append(toIndentedString(serious)).append("\n");
        sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
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
