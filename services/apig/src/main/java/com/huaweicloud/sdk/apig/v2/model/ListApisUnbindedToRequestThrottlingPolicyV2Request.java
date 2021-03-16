package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListApisUnbindedToRequestThrottlingPolicyV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="throttle_id")
    
    private String throttleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_id")
    
    private String envId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_id")
    
    private String apiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_name")
    
    private String apiName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Long offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ListApisUnbindedToRequestThrottlingPolicyV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListApisUnbindedToRequestThrottlingPolicyV2Request withThrottleId(String throttleId) {
        this.throttleId = throttleId;
        return this;
    }

    


    /**
     * Get throttleId
     * @return throttleId
     */
    public String getThrottleId() {
        return throttleId;
    }

    public void setThrottleId(String throttleId) {
        this.throttleId = throttleId;
    }

    

    public ListApisUnbindedToRequestThrottlingPolicyV2Request withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    


    /**
     * Get envId
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    

    public ListApisUnbindedToRequestThrottlingPolicyV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * Get groupId
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public ListApisUnbindedToRequestThrottlingPolicyV2Request withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * Get apiId
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    

    public ListApisUnbindedToRequestThrottlingPolicyV2Request withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    


    /**
     * Get apiName
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    

    public ListApisUnbindedToRequestThrottlingPolicyV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    

    public ListApisUnbindedToRequestThrottlingPolicyV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApisUnbindedToRequestThrottlingPolicyV2Request listApisUnbindedToRequestThrottlingPolicyV2Request = (ListApisUnbindedToRequestThrottlingPolicyV2Request) o;
        return Objects.equals(this.instanceId, listApisUnbindedToRequestThrottlingPolicyV2Request.instanceId) &&
            Objects.equals(this.throttleId, listApisUnbindedToRequestThrottlingPolicyV2Request.throttleId) &&
            Objects.equals(this.envId, listApisUnbindedToRequestThrottlingPolicyV2Request.envId) &&
            Objects.equals(this.groupId, listApisUnbindedToRequestThrottlingPolicyV2Request.groupId) &&
            Objects.equals(this.apiId, listApisUnbindedToRequestThrottlingPolicyV2Request.apiId) &&
            Objects.equals(this.apiName, listApisUnbindedToRequestThrottlingPolicyV2Request.apiName) &&
            Objects.equals(this.offset, listApisUnbindedToRequestThrottlingPolicyV2Request.offset) &&
            Objects.equals(this.limit, listApisUnbindedToRequestThrottlingPolicyV2Request.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, throttleId, envId, groupId, apiId, apiName, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisUnbindedToRequestThrottlingPolicyV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    throttleId: ").append(toIndentedString(throttleId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

