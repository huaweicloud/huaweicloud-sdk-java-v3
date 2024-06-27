package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCasesStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private CommonResponseErrorOfobject error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private QueryCasesStatusResponseV2 result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ListCasesStatusResponse withError(CommonResponseErrorOfobject error) {
        this.error = error;
        return this;
    }

    public ListCasesStatusResponse withError(Consumer<CommonResponseErrorOfobject> errorSetter) {
        if (this.error == null) {
            this.error = new CommonResponseErrorOfobject();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public CommonResponseErrorOfobject getError() {
        return error;
    }

    public void setError(CommonResponseErrorOfobject error) {
        this.error = error;
    }

    public ListCasesStatusResponse withResult(QueryCasesStatusResponseV2 result) {
        this.result = result;
        return this;
    }

    public ListCasesStatusResponse withResult(Consumer<QueryCasesStatusResponseV2> resultSetter) {
        if (this.result == null) {
            this.result = new QueryCasesStatusResponseV2();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public QueryCasesStatusResponseV2 getResult() {
        return result;
    }

    public void setResult(QueryCasesStatusResponseV2 result) {
        this.result = result;
    }

    public ListCasesStatusResponse withStatus(String status) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCasesStatusResponse that = (ListCasesStatusResponse) obj;
        return Objects.equals(this.error, that.error) && Objects.equals(this.result, that.result)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, result, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCasesStatusResponse {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
