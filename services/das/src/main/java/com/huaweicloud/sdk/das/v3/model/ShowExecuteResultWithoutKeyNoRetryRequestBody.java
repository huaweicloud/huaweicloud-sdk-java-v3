package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询SQL执行结果请求体
 */
public class ShowExecuteResultWithoutKeyNoRetryRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_id")

    private String executeId;

    public ShowExecuteResultWithoutKeyNoRetryRequestBody withExecuteId(String executeId) {
        this.executeId = executeId;
        return this;
    }

    /**
     * SQL执行ID
     * @return executeId
     */
    public String getExecuteId() {
        return executeId;
    }

    public void setExecuteId(String executeId) {
        this.executeId = executeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExecuteResultWithoutKeyNoRetryRequestBody that = (ShowExecuteResultWithoutKeyNoRetryRequestBody) obj;
        return Objects.equals(this.executeId, that.executeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExecuteResultWithoutKeyNoRetryRequestBody {\n");
        sb.append("    executeId: ").append(toIndentedString(executeId)).append("\n");
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
