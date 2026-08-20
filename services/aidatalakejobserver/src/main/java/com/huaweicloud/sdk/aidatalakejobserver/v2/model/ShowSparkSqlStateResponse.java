package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSparkSqlStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_id")

    private String statementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    public ShowSparkSqlStateResponse withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * **参数解释**：SparkSql作业的ID，用于唯一标识一次SparkSql作业执行。 **取值范围**：采用UUID格式，长度为36个字符，例如：6c98db52-cac2-4ff1-9a91-b7793e95557d。
     * @return statementId
     */
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public ShowSparkSqlStateResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：SparkSql作业的执行状态。 **取值范围**：   - QUEUED：排队中。   - RUNNING：运行中。   - CANCELING：取消中。   - CANCELED：已取消。   - FAILED：运行失败。   - QUEUED_TIMEOUT：排队超时。   - RUNNING_TIMEOUT：运行超时。   - SUCCEED：运行成功。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkSqlStateResponse that = (ShowSparkSqlStateResponse) obj;
        return Objects.equals(this.statementId, that.statementId) && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statementId, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkSqlStateResponse {\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
