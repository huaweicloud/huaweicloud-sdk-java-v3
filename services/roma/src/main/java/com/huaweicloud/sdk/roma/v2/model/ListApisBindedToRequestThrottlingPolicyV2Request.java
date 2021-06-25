package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListApisBindedToRequestThrottlingPolicyV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Long offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


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

    public ListApisBindedToRequestThrottlingPolicyV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListApisBindedToRequestThrottlingPolicyV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    

    public ListApisBindedToRequestThrottlingPolicyV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页显示的条目数量
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

    

    public ListApisBindedToRequestThrottlingPolicyV2Request withThrottleId(String throttleId) {
        this.throttleId = throttleId;
        return this;
    }

    


    /**
     * 流控策略编号
     * @return throttleId
     */
    public String getThrottleId() {
        return throttleId;
    }

    public void setThrottleId(String throttleId) {
        this.throttleId = throttleId;
    }

    

    public ListApisBindedToRequestThrottlingPolicyV2Request withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    


    /**
     * 环境的ID
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    

    public ListApisBindedToRequestThrottlingPolicyV2Request withGroupId(String groupId) {
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

    

    public ListApisBindedToRequestThrottlingPolicyV2Request withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * API编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    

    public ListApisBindedToRequestThrottlingPolicyV2Request withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    


    /**
     * API名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApisBindedToRequestThrottlingPolicyV2Request listApisBindedToRequestThrottlingPolicyV2Request = (ListApisBindedToRequestThrottlingPolicyV2Request) o;
        return Objects.equals(this.instanceId, listApisBindedToRequestThrottlingPolicyV2Request.instanceId) &&
            Objects.equals(this.offset, listApisBindedToRequestThrottlingPolicyV2Request.offset) &&
            Objects.equals(this.limit, listApisBindedToRequestThrottlingPolicyV2Request.limit) &&
            Objects.equals(this.throttleId, listApisBindedToRequestThrottlingPolicyV2Request.throttleId) &&
            Objects.equals(this.envId, listApisBindedToRequestThrottlingPolicyV2Request.envId) &&
            Objects.equals(this.groupId, listApisBindedToRequestThrottlingPolicyV2Request.groupId) &&
            Objects.equals(this.apiId, listApisBindedToRequestThrottlingPolicyV2Request.apiId) &&
            Objects.equals(this.apiName, listApisBindedToRequestThrottlingPolicyV2Request.apiName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, throttleId, envId, groupId, apiId, apiName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisBindedToRequestThrottlingPolicyV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    throttleId: ").append(toIndentedString(throttleId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
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

