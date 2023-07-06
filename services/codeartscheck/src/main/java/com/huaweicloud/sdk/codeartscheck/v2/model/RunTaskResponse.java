package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RunTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_id")

    private String execId;

    public RunTaskResponse withExecId(String execId) {
        this.execId = execId;
        return this;
    }

    /**
     * 执行id
     * @return execId
     */
    public String getExecId() {
        return execId;
    }

    public void setExecId(String execId) {
        this.execId = execId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunTaskResponse that = (RunTaskResponse) obj;
        return Objects.equals(this.execId, that.execId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(execId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunTaskResponse {\n");
        sb.append("    execId: ").append(toIndentedString(execId)).append("\n");
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
