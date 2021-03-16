package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.SwaggerFailureResp;
import com.huaweicloud.sdk.roma.v2.model.SwaggerInfoResp;
import com.huaweicloud.sdk.roma.v2.model.SwaggerSuccessResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ImportApiDefinitionsV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failure")
    
    private List<SwaggerFailureResp> failure = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="success")
    
    private List<SwaggerSuccessResp> success = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="swagger")
    
    private SwaggerInfoResp swagger;

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

    

    public ImportApiDefinitionsV2Response withFailure(List<SwaggerFailureResp> failure) {
        this.failure = failure;
        return this;
    }

    
    public ImportApiDefinitionsV2Response addFailureItem(SwaggerFailureResp failureItem) {
        this.failure.add(failureItem);
        return this;
    }

    public ImportApiDefinitionsV2Response withFailure(Consumer<List<SwaggerFailureResp>> failureSetter) {
        if(this.failure == null ){
            this.failure = new ArrayList<>();
        }
        failureSetter.accept(this.failure);
        return this;
    }

    /**
     * 导入失败信息
     * @return failure
     */
    public List<SwaggerFailureResp> getFailure() {
        return failure;
    }

    public void setFailure(List<SwaggerFailureResp> failure) {
        this.failure = failure;
    }

    

    public ImportApiDefinitionsV2Response withSuccess(List<SwaggerSuccessResp> success) {
        this.success = success;
        return this;
    }

    
    public ImportApiDefinitionsV2Response addSuccessItem(SwaggerSuccessResp successItem) {
        this.success.add(successItem);
        return this;
    }

    public ImportApiDefinitionsV2Response withSuccess(Consumer<List<SwaggerSuccessResp>> successSetter) {
        if(this.success == null ){
            this.success = new ArrayList<>();
        }
        successSetter.accept(this.success);
        return this;
    }

    /**
     * 导入成功信息
     * @return success
     */
    public List<SwaggerSuccessResp> getSuccess() {
        return success;
    }

    public void setSuccess(List<SwaggerSuccessResp> success) {
        this.success = success;
    }

    

    public ImportApiDefinitionsV2Response withSwagger(SwaggerInfoResp swagger) {
        this.swagger = swagger;
        return this;
    }

    public ImportApiDefinitionsV2Response withSwagger(Consumer<SwaggerInfoResp> swaggerSetter) {
        if(this.swagger == null ){
            this.swagger = new SwaggerInfoResp();
            swaggerSetter.accept(this.swagger);
        }
        
        return this;
    }


    /**
     * Get swagger
     * @return swagger
     */
    public SwaggerInfoResp getSwagger() {
        return swagger;
    }

    public void setSwagger(SwaggerInfoResp swagger) {
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
        ImportApiDefinitionsV2Response importApiDefinitionsV2Response = (ImportApiDefinitionsV2Response) o;
        return Objects.equals(this.groupId, importApiDefinitionsV2Response.groupId) &&
            Objects.equals(this.failure, importApiDefinitionsV2Response.failure) &&
            Objects.equals(this.success, importApiDefinitionsV2Response.success) &&
            Objects.equals(this.swagger, importApiDefinitionsV2Response.swagger);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupId, failure, success, swagger);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportApiDefinitionsV2Response {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    swagger: ").append(toIndentedString(swagger)).append("\n");
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

