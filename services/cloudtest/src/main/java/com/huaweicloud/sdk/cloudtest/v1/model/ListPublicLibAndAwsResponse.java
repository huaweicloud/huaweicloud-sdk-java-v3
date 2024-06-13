package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPublicLibAndAwsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private CommonResponseErrorOfAPITest error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<GetPublicLibAndAwsResp> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ListPublicLibAndAwsResponse withCode(String code) {
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

    public ListPublicLibAndAwsResponse withError(CommonResponseErrorOfAPITest error) {
        this.error = error;
        return this;
    }

    public ListPublicLibAndAwsResponse withError(Consumer<CommonResponseErrorOfAPITest> errorSetter) {
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

    public ListPublicLibAndAwsResponse withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 失败原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ListPublicLibAndAwsResponse withResult(List<GetPublicLibAndAwsResp> result) {
        this.result = result;
        return this;
    }

    public ListPublicLibAndAwsResponse addResultItem(GetPublicLibAndAwsResp resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ListPublicLibAndAwsResponse withResult(Consumer<List<GetPublicLibAndAwsResp>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 公共aw信息
     * @return result
     */
    public List<GetPublicLibAndAwsResp> getResult() {
        return result;
    }

    public void setResult(List<GetPublicLibAndAwsResp> result) {
        this.result = result;
    }

    public ListPublicLibAndAwsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPublicLibAndAwsResponse that = (ListPublicLibAndAwsResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.error, that.error)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.result, that.result)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, error, reason, result, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicLibAndAwsResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
