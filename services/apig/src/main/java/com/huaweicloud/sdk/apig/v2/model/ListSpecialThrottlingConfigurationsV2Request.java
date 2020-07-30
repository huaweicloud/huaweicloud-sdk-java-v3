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
public class ListSpecialThrottlingConfigurationsV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="strategy_id")
    
    private String strategyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_type")
    
    private String objectType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Long offset = 0l;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 20;

    public ListSpecialThrottlingConfigurationsV2Request withInstanceId(String instanceId) {
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

    public ListSpecialThrottlingConfigurationsV2Request withStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    


    /**
     * Get strategyId
     * @return strategyId
     */
    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public ListSpecialThrottlingConfigurationsV2Request withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    


    /**
     * Get objectType
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ListSpecialThrottlingConfigurationsV2Request withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * Get appName
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListSpecialThrottlingConfigurationsV2Request withOffset(Long offset) {
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

    public ListSpecialThrottlingConfigurationsV2Request withLimit(Integer limit) {
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
        ListSpecialThrottlingConfigurationsV2Request listSpecialThrottlingConfigurationsV2Request = (ListSpecialThrottlingConfigurationsV2Request) o;
        return Objects.equals(this.instanceId, listSpecialThrottlingConfigurationsV2Request.instanceId) &&
            Objects.equals(this.strategyId, listSpecialThrottlingConfigurationsV2Request.strategyId) &&
            Objects.equals(this.objectType, listSpecialThrottlingConfigurationsV2Request.objectType) &&
            Objects.equals(this.appName, listSpecialThrottlingConfigurationsV2Request.appName) &&
            Objects.equals(this.offset, listSpecialThrottlingConfigurationsV2Request.offset) &&
            Objects.equals(this.limit, listSpecialThrottlingConfigurationsV2Request.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, strategyId, objectType, appName, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecialThrottlingConfigurationsV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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

