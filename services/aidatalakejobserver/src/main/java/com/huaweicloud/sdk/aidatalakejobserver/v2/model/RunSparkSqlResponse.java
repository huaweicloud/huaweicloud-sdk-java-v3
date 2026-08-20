package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RunSparkSqlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_id")

    private String statementId;

    public RunSparkSqlResponse withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * **参数解释**：作业ID，用于唯一标识本次执行的SparkSql作业。可通过此ID查询作业状态和执行结果。 **取值范围**：采用UUID格式，长度为36个字符，例如：6c98db52-cac2-4ff1-9a91-b7793e95557d。
     * @return statementId
     */
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunSparkSqlResponse that = (RunSparkSqlResponse) obj;
        return Objects.equals(this.statementId, that.statementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statementId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSparkSqlResponse {\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
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
