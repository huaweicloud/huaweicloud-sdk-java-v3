package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 资源信息
 */
public class CloudWafSubscriptioResponseResources  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceId")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloudServiceType")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceType")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceSpecCode")
    
    private String resourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expireTime")
    
    private String expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resourceSize")
    
    private Integer resourceSize;

    public CloudWafSubscriptioResponseResources withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public CloudWafSubscriptioResponseResources withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * 云服务产品对应的云服务类型
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    

    public CloudWafSubscriptioResponseResources withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 云服务产品的资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public CloudWafSubscriptioResponseResources withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    


    /**
     * 云服务产品的资源规格
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    

    public CloudWafSubscriptioResponseResources withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 资源状态，0：解冻/正常，1：冻结，2：删除
     * minimum: 0
     * maximum: 2
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public CloudWafSubscriptioResponseResources withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * 资源到期时间
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    

    public CloudWafSubscriptioResponseResources withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    


    /**
     * 资源数量
     * minimum: 1
     * maximum: 1000
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudWafSubscriptioResponseResources cloudWafSubscriptioResponseResources = (CloudWafSubscriptioResponseResources) o;
        return Objects.equals(this.resourceId, cloudWafSubscriptioResponseResources.resourceId) &&
            Objects.equals(this.cloudServiceType, cloudWafSubscriptioResponseResources.cloudServiceType) &&
            Objects.equals(this.resourceType, cloudWafSubscriptioResponseResources.resourceType) &&
            Objects.equals(this.resourceSpecCode, cloudWafSubscriptioResponseResources.resourceSpecCode) &&
            Objects.equals(this.status, cloudWafSubscriptioResponseResources.status) &&
            Objects.equals(this.expireTime, cloudWafSubscriptioResponseResources.expireTime) &&
            Objects.equals(this.resourceSize, cloudWafSubscriptioResponseResources.resourceSize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceId, cloudServiceType, resourceType, resourceSpecCode, status, expireTime, resourceSize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudWafSubscriptioResponseResources {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
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

