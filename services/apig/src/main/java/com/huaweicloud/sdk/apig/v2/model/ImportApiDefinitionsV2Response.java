package com.huaweicloud.sdk.apig.v2.model;

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
public class ImportApiDefinitionsV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private List<Success> success = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure")

    private List<Failure> failure = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swagger")

    private Swagger swagger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore")

    private List<Ignore> ignore = null;

    public ImportApiDefinitionsV2Response withSuccess(List<Success> success) {
        this.success = success;
        return this;
    }

    public ImportApiDefinitionsV2Response addSuccessItem(Success successItem) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        this.success.add(successItem);
        return this;
    }

    public ImportApiDefinitionsV2Response withSuccess(Consumer<List<Success>> successSetter) {
        if (this.success == null) {
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 导入成功信息
     * @return success
     */
    public List<Success> getSuccess() {
        return success;
    }

    public void setSuccess(List<Success> success) {
        this.success = success;
    }

    public ImportApiDefinitionsV2Response withFailure(List<Failure> failure) {
        this.failure = failure;
        return this;
    }

    public ImportApiDefinitionsV2Response addFailureItem(Failure failureItem) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        this.failure.add(failureItem);
        return this;
    }

    public ImportApiDefinitionsV2Response withFailure(Consumer<List<Failure>> failureSetter) {
        if (this.failure == null) {
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 导入失败信息
     * @return failure
     */
    public List<Failure> getFailure() {
        return failure;
    }

    public void setFailure(List<Failure> failure) {
        this.failure = failure;
    }

    public ImportApiDefinitionsV2Response withSwagger(Swagger swagger) {
        this.swagger = swagger;
        return this;
    }

    public ImportApiDefinitionsV2Response withSwagger(Consumer<Swagger> swaggerSetter) {
        if (this.swagger == null) {
            this.swagger = new Swagger();
            swaggerSetter.accept(this.swagger);
        }

        return this;
    }

    /**
     * Get swagger
     * @return swagger
     */
    public Swagger getSwagger() {
        return swagger;
    }

    public void setSwagger(Swagger swagger) {
        this.swagger = swagger;
    }

    public ImportApiDefinitionsV2Response withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * API分组编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ImportApiDefinitionsV2Response withIgnore(List<Ignore> ignore) {
        this.ignore = ignore;
        return this;
    }

    public ImportApiDefinitionsV2Response addIgnoreItem(Ignore ignoreItem) {
        if (this.ignore == null) {
            this.ignore = new ArrayList<>();
        }
        this.ignore.add(ignoreItem);
        return this;
    }

    public ImportApiDefinitionsV2Response withIgnore(Consumer<List<Ignore>> ignoreSetter) {
        if (this.ignore == null) {
            this.ignore = new ArrayList<>();
        }
        ignoreSetter.accept(this.ignore);
        return this;
    }

    /**
     * 被忽略导入的API信息
     * @return ignore
     */
    public List<Ignore> getIgnore() {
        return ignore;
    }

    public void setIgnore(List<Ignore> ignore) {
        this.ignore = ignore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportApiDefinitionsV2Response that = (ImportApiDefinitionsV2Response) obj;
        return Objects.equals(this.success, that.success) && Objects.equals(this.failure, that.failure)
            && Objects.equals(this.swagger, that.swagger) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.ignore, that.ignore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, failure, swagger, groupId, ignore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportApiDefinitionsV2Response {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
        sb.append("    swagger: ").append(toIndentedString(swagger)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
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
