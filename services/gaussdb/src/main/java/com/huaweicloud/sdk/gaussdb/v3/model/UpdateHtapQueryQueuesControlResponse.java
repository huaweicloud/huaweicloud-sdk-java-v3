package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateHtapQueryQueuesControlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    public UpdateHtapQueryQueuesControlResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：  响应返回结果。   **取值范围**：  - success：成功。 - failed：失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateHtapQueryQueuesControlResponse withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * **参数解释**：  响应错误信息。  **取值范围**：  不涉及。
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHtapQueryQueuesControlResponse that = (UpdateHtapQueryQueuesControlResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, msg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHtapQueryQueuesControlResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
