package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Aura Dataframe Job 详情 - statement 列表响应
 */
public class DataframeJobStatementResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_id")

    private String statementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_content")

    private String statementContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuple_processed")

    private Long tupleProcessed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private OffsetDateTime finishTime;

    public DataframeJobStatementResp withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * **参数解释**：Statement ID。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return statementId
     */
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public DataframeJobStatementResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：执行状态。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataframeJobStatementResp withStatementContent(String statementContent) {
        this.statementContent = statementContent;
        return this;
    }

    /**
     * **参数解释**：SQL 执行内容。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return statementContent
     */
    public String getStatementContent() {
        return statementContent;
    }

    public void setStatementContent(String statementContent) {
        this.statementContent = statementContent;
    }

    public DataframeJobStatementResp withTupleProcessed(Long tupleProcessed) {
        this.tupleProcessed = tupleProcessed;
        return this;
    }

    /**
     * **参数解释**：已处理条数。 **约束限制**：由 operator_realtime 上报更新。 **取值范围**：不涉及。 **默认取值**：0。
     * @return tupleProcessed
     */
    public Long getTupleProcessed() {
        return tupleProcessed;
    }

    public void setTupleProcessed(Long tupleProcessed) {
        this.tupleProcessed = tupleProcessed;
    }

    public DataframeJobStatementResp withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间，使用UTC时间，ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSXXX，例如：2025-01-10T03:37:12.000+00:00。 **取值范围**：不涉及。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public DataframeJobStatementResp withFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * **参数解释**：结束时间。使用UTC时间格式，格式为yyyy-MM-ddTHH:mm:ssZ，例如2023-05-30T12:24:30.401Z。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return finishTime
     */
    public OffsetDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataframeJobStatementResp that = (DataframeJobStatementResp) obj;
        return Objects.equals(this.statementId, that.statementId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statementContent, that.statementContent)
            && Objects.equals(this.tupleProcessed, that.tupleProcessed)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.finishTime, that.finishTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statementId, status, statementContent, tupleProcessed, createTime, finishTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataframeJobStatementResp {\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statementContent: ").append(toIndentedString(statementContent)).append("\n");
        sb.append("    tupleProcessed: ").append(toIndentedString(tupleProcessed)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
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
