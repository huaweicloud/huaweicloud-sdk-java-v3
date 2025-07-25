package com.huaweicloud.sdk.codeartsbuild.v3.model;

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
public class ShowDefaultProjectPermissionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<ShowDefaultProjectPermissionResponseBodyResult> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowDefaultProjectPermissionResponse withResult(
        List<ShowDefaultProjectPermissionResponseBodyResult> result) {
        this.result = result;
        return this;
    }

    public ShowDefaultProjectPermissionResponse addResultItem(
        ShowDefaultProjectPermissionResponseBodyResult resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public ShowDefaultProjectPermissionResponse withResult(
        Consumer<List<ShowDefaultProjectPermissionResponseBodyResult>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 返回结果
     * @return result
     */
    public List<ShowDefaultProjectPermissionResponseBodyResult> getResult() {
        return result;
    }

    public void setResult(List<ShowDefaultProjectPermissionResponseBodyResult> result) {
        this.result = result;
    }

    public ShowDefaultProjectPermissionResponse withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * 返回错误信息
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public ShowDefaultProjectPermissionResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 返回状态信息
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
        ShowDefaultProjectPermissionResponse that = (ShowDefaultProjectPermissionResponse) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.error, that.error)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, error, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDefaultProjectPermissionResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
