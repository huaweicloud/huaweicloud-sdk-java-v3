package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Severity
 */
public class Severity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normalize_score")

    private Integer normalizeScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_score")

    private Integer originalScore;

    public Severity withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 严重性等级取值范围：TIPS、LOW、MEDIUM、HIGH、FATAL。 TIPS：未发现任何问题。 LOW：无需针对问题执行任何操作。 MEDIUM：问题需要处理，但不紧急。 HIGH：问题必须优先处理。 FATAL：问题必须立即处理，以防止产生进一步的损害。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Severity withNormalizeScore(Integer normalizeScore) {
        this.normalizeScore = normalizeScore;
        return this;
    }

    /**
     * 严重性评分取值范围：0-100； 与严重性等级的对应关系： TIPS 0； LOW 1-39； MEDIUM 40-69； HIGH 70-89； FATAL 90-100。
     * minimum: 0
     * maximum: 100
     * @return normalizeScore
     */
    public Integer getNormalizeScore() {
        return normalizeScore;
    }

    public void setNormalizeScore(Integer normalizeScore) {
        this.normalizeScore = normalizeScore;
    }

    public Severity withOriginalScore(Integer originalScore) {
        this.originalScore = originalScore;
        return this;
    }

    /**
     * 严重性原始评分，指在数据源产品中的评分。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return originalScore
     */
    public Integer getOriginalScore() {
        return originalScore;
    }

    public void setOriginalScore(Integer originalScore) {
        this.originalScore = originalScore;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Severity severity = (Severity) o;
        return Objects.equals(this.label, severity.label)
            && Objects.equals(this.normalizeScore, severity.normalizeScore)
            && Objects.equals(this.originalScore, severity.originalScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, normalizeScore, originalScore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Severity {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    normalizeScore: ").append(toIndentedString(normalizeScore)).append("\n");
        sb.append("    originalScore: ").append(toIndentedString(originalScore)).append("\n");
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
