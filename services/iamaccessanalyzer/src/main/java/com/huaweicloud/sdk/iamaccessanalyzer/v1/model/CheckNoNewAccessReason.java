package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckNoNewAccessReason
 */
public class CheckNoNewAccessReason {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_id")

    private String statementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_index")

    private Integer statementIndex;

    public CheckNoNewAccessReason withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对访问权限检查结果的推理的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckNoNewAccessReason withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * 新增权限statement的sid标识符。
     * @return statementId
     */
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public CheckNoNewAccessReason withStatementIndex(Integer statementIndex) {
        this.statementIndex = statementIndex;
        return this;
    }

    /**
     * 新增权限statement的index，从0开始。
     * @return statementIndex
     */
    public Integer getStatementIndex() {
        return statementIndex;
    }

    public void setStatementIndex(Integer statementIndex) {
        this.statementIndex = statementIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckNoNewAccessReason that = (CheckNoNewAccessReason) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.statementId, that.statementId)
            && Objects.equals(this.statementIndex, that.statementIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, statementId, statementIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckNoNewAccessReason {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    statementIndex: ").append(toIndentedString(statementIndex)).append("\n");
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
