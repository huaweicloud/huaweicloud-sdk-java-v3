package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAnalyzerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_id")

    private String analyzerId;

    public DeleteAnalyzerRequest withAnalyzerId(String analyzerId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAnalyzerRequest that = (DeleteAnalyzerRequest) obj;
        return Objects.equals(this.analyzerId, that.analyzerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analyzerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAnalyzerRequest {\n");
        sb.append("    analyzerId: ").append(toIndentedString(analyzerId)).append("\n");
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
