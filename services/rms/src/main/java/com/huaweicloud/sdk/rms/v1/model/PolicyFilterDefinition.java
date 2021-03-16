package com.huaweicloud.sdk.rms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 规则过滤器
 */
public class PolicyFilterDefinition  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_provider")
    
    private String resourceProvider;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_key")
    
    private String tagKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_value")
    
    private String tagValue;

    public PolicyFilterDefinition withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    

    public PolicyFilterDefinition withResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    


    /**
     * 资源服务
     * @return resourceProvider
     */
    public String getResourceProvider() {
        return resourceProvider;
    }

    public void setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    

    public PolicyFilterDefinition withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public PolicyFilterDefinition withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public PolicyFilterDefinition withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    


    /**
     * 标签键
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    

    public PolicyFilterDefinition withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    


    /**
     * 标签值
     * @return tagValue
     */
    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyFilterDefinition policyFilterDefinition = (PolicyFilterDefinition) o;
        return Objects.equals(this.regionId, policyFilterDefinition.regionId) &&
            Objects.equals(this.resourceProvider, policyFilterDefinition.resourceProvider) &&
            Objects.equals(this.resourceType, policyFilterDefinition.resourceType) &&
            Objects.equals(this.resourceId, policyFilterDefinition.resourceId) &&
            Objects.equals(this.tagKey, policyFilterDefinition.tagKey) &&
            Objects.equals(this.tagValue, policyFilterDefinition.tagValue);
    }
    @Override
    public int hashCode() {
        return Objects.hash(regionId, resourceProvider, resourceType, resourceId, tagKey, tagValue);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyFilterDefinition {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceProvider: ").append(toIndentedString(resourceProvider)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
        sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
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

