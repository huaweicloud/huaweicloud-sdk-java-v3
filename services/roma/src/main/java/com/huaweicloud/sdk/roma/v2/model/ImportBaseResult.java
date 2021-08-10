package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ImportBaseResult */
public class ImportBaseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<Success> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    private List<Failure> failure = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swagger")

    private Swagger swagger;

    public ImportBaseResult withSuccess(List<Success> success) {
        this.success = success;
        return this;
    }

    public ImportBaseResult addSuccessItem(Success successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public ImportBaseResult withSuccess(Consumer<List<Success>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /** 导入成功信息
     * 
     * @return success */
    public List<Success> getSuccess() {
        return success;
    }

    public void setSuccess(List<Success> success) {
        this.success = success;
    }

    public ImportBaseResult withFailure(List<Failure> failure) {
        this.failure = failure;
        return this;
    }

    public ImportBaseResult addFailureItem(Failure failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public ImportBaseResult withFailure(Consumer<List<Failure>> failureSetter) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /** 导入失败信息
     * 
     * @return failure */
    public List<Failure> getFailure() {
        return failure;
    }

    public void setFailure(List<Failure> failure) {
        this.failure = failure;
    }

    public ImportBaseResult withSwagger(Swagger swagger) {
        this.swagger = swagger;
        return this;
    }

    public ImportBaseResult withSwagger(Consumer<Swagger> swaggerSetter) {
        if (this.swagger == null) {
            this.swagger = new Swagger();
            swaggerSetter.accept(this.swagger);
        }

        return this;
    }

    /** Get swagger
     * 
     * @return swagger */
    public Swagger getSwagger() {
        return swagger;
    }

    public void setSwagger(Swagger swagger) {
        this.swagger = swagger;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportBaseResult importBaseResult = (ImportBaseResult) o;
        return Objects.equals(this.success, importBaseResult.success)
            && Objects.equals(this.failure, importBaseResult.failure)
            && Objects.equals(this.swagger, importBaseResult.swagger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failure, swagger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportBaseResult {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
        sb.append("    swagger: ").append(toIndentedString(swagger)).append("\n");
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
