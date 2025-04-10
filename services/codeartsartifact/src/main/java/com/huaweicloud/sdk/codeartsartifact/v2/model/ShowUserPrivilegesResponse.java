package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUserPrivilegesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traceId")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private PrivilegesResponseResult result;

    public ShowUserPrivilegesResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**:  请求成功、失败状态。 **取值范围**: success: 请求成功。 error: 请求失败。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowUserPrivilegesResponse withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * **参数解释**:  请求id，当前请求唯一标识。 **取值范围**: 数字及中划线(-)组成的字符串。 
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public ShowUserPrivilegesResponse withResult(PrivilegesResponseResult result) {
        this.result = result;
        return this;
    }

    public ShowUserPrivilegesResponse withResult(Consumer<PrivilegesResponseResult> resultSetter) {
        if (this.result == null) {
            this.result = new PrivilegesResponseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public PrivilegesResponseResult getResult() {
        return result;
    }

    public void setResult(PrivilegesResponseResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserPrivilegesResponse that = (ShowUserPrivilegesResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.traceId, that.traceId)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, traceId, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserPrivilegesResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
