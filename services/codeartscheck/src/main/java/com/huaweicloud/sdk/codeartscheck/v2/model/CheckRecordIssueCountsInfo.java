package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckRecordIssueCountsInfo
 */
public class CheckRecordIssueCountsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical")

    private Integer critical;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serious")

    private Integer serious;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal")

    private Integer normal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt")

    private Integer prompt;

    public CheckRecordIssueCountsInfo withCritical(Integer critical) {
        this.critical = critical;
        return this;
    }

    /**
     * **参数解释：** 致命问题数量。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
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
     * **参数解释：** 严重问题数量。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
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
     * **参数解释：** 一般问题数量。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
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
     * **参数解释：** 提示问题数量。不包括已忽略和已修复问题。 **取值范围：** 不涉及。
     * @return prompt
     */
    public Integer getPrompt() {
        return prompt;
    }

    public void setPrompt(Integer prompt) {
        this.prompt = prompt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRecordIssueCountsInfo that = (CheckRecordIssueCountsInfo) obj;
        return Objects.equals(this.critical, that.critical) && Objects.equals(this.serious, that.serious)
            && Objects.equals(this.normal, that.normal) && Objects.equals(this.prompt, that.prompt);
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
