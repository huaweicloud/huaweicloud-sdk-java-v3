package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RestartSparkSqlClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    public RestartSparkSqlClusterResponse withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * **参数解释**：重启操作ID，用于标识本次重启操作。 **取值范围**：只能由英文字母、数字及中划线组成，且长度为1~64个字符。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestartSparkSqlClusterResponse that = (RestartSparkSqlClusterResponse) obj;
        return Objects.equals(this.operationId, that.operationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartSparkSqlClusterResponse {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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
