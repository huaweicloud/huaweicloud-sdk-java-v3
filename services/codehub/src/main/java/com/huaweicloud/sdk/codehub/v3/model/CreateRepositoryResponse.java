package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateRepositoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private Error error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Repository result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CreateRepositoryResponse withError(Error error) {
        this.error = error;
        return this;
    }

    public CreateRepositoryResponse withError(Consumer<Error> errorSetter) {
        if (this.error == null) {
            this.error = new Error();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /** Get error
     * 
     * @return error */
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public CreateRepositoryResponse withResult(Repository result) {
        this.result = result;
        return this;
    }

    public CreateRepositoryResponse withResult(Consumer<Repository> resultSetter) {
        if (this.result == null) {
            this.result = new Repository();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /** Get result
     * 
     * @return result */
    public Repository getResult() {
        return result;
    }

    public void setResult(Repository result) {
        this.result = result;
    }

    public CreateRepositoryResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 响应状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRepositoryResponse createRepositoryResponse = (CreateRepositoryResponse) o;
        return Objects.equals(this.error, createRepositoryResponse.error)
            && Objects.equals(this.result, createRepositoryResponse.result)
            && Objects.equals(this.status, createRepositoryResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error, result, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRepositoryResponse {\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
