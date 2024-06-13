package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListUserPopupInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private PopUpInfo result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private CommonResponseErrorOfAPITest error;

    public ListUserPopupInfoResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 是否请求成功
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListUserPopupInfoResponse withResult(PopUpInfo result) {
        this.result = result;
        return this;
    }

    public ListUserPopupInfoResponse withResult(Consumer<PopUpInfo> resultSetter) {
        if (this.result == null) {
            this.result = new PopUpInfo();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public PopUpInfo getResult() {
        return result;
    }

    public void setResult(PopUpInfo result) {
        this.result = result;
    }

    public ListUserPopupInfoResponse withError(CommonResponseErrorOfAPITest error) {
        this.error = error;
        return this;
    }

    public ListUserPopupInfoResponse withError(Consumer<CommonResponseErrorOfAPITest> errorSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserPopupInfoResponse that = (ListUserPopupInfoResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.result, that.result)
            && Objects.equals(this.error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, result, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserPopupInfoResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
