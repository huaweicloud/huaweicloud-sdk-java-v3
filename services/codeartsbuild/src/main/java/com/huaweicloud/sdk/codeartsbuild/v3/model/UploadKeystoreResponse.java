package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UploadKeystoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private UploadKeystoreResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public UploadKeystoreResponse withResult(UploadKeystoreResult result) {
        this.result = result;
        return this;
    }

    public UploadKeystoreResponse withResult(Consumer<UploadKeystoreResult> resultSetter) {
        if (this.result == null) {
            this.result = new UploadKeystoreResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public UploadKeystoreResult getResult() {
        return result;
    }

    public void setResult(UploadKeystoreResult result) {
        this.result = result;
    }

    public UploadKeystoreResponse withError(String error) {
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

    public UploadKeystoreResponse withStatus(String status) {
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
        UploadKeystoreResponse that = (UploadKeystoreResponse) obj;
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
        sb.append("class UploadKeystoreResponse {\n");
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
