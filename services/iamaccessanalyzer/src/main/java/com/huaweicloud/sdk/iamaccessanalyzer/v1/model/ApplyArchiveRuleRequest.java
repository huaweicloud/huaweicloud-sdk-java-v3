package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ApplyArchiveRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_id")

    private String analyzerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive_rule_id")

    private String archiveRuleId;

    public ApplyArchiveRuleRequest withAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
        return this;
    }

    /**
     * 分析器的唯一标识符。
     * @return analyzerId
     */
    public String getAnalyzerId() {
        return analyzerId;
    }

    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }

    public ApplyArchiveRuleRequest withArchiveRuleId(String archiveRuleId) {
        this.archiveRuleId = archiveRuleId;
        return this;
    }

    /**
     * 存档规则的唯一标识符。
     * @return archiveRuleId
     */
    public String getArchiveRuleId() {
        return archiveRuleId;
    }

    public void setArchiveRuleId(String archiveRuleId) {
        this.archiveRuleId = archiveRuleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyArchiveRuleRequest that = (ApplyArchiveRuleRequest) obj;
        return Objects.equals(this.analyzerId, that.analyzerId)
            && Objects.equals(this.archiveRuleId, that.archiveRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analyzerId, archiveRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyArchiveRuleRequest {\n");
        sb.append("    analyzerId: ").append(toIndentedString(analyzerId)).append("\n");
        sb.append("    archiveRuleId: ").append(toIndentedString(archiveRuleId)).append("\n");
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
