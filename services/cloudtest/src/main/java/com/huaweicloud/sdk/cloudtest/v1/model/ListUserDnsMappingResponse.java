package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListUserDnsMappingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private CommonResponseErrorOfAPITest error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private DnsMapping result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    public ListUserDnsMappingResponse withError(CommonResponseErrorOfAPITest error) {
        this.error = error;
        return this;
    }

    public ListUserDnsMappingResponse withError(Consumer<CommonResponseErrorOfAPITest> errorSetter) {
        if (this.error == null) {
            this.error = new CommonResponseErrorOfAPITest();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public CommonResponseErrorOfAPITest getError() {
        return error;
    }

    public void setError(CommonResponseErrorOfAPITest error) {
        this.error = error;
    }

    public ListUserDnsMappingResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 错误原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ListUserDnsMappingResponse withResult(DnsMapping result) {
        this.result = result;
        return this;
    }

    public ListUserDnsMappingResponse withResult(Consumer<DnsMapping> resultSetter) {
        if (this.result == null) {
            this.result = new DnsMapping();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public DnsMapping getResult() {
        return result;
    }

    public void setResult(DnsMapping result) {
        this.result = result;
    }

    public ListUserDnsMappingResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态值，如success、error
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListUserDnsMappingResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 错误码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserDnsMappingResponse that = (ListUserDnsMappingResponse) obj;
        return Objects.equals(this.error, that.error) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.result, that.result) && Objects.equals(this.status, that.status)
            && Objects.equals(this.code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, reason, result, status, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserDnsMappingResponse {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
