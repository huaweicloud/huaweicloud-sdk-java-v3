package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateInstancePeriodRequestProductInfos
 */
public class CreateInstancePeriodRequestProductInfos  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_spec_code")
    
    
    private String resourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_spec_desc")
    
    
    private String productSpecDesc;

    public CreateInstancePeriodRequestProductInfos withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 产品ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public CreateInstancePeriodRequestProductInfos withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * 服务类型： 默认hws.service.type.dbss
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    

    public CreateInstancePeriodRequestProductInfos withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 资源类型: 默认hws.resource.type.dbss
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public CreateInstancePeriodRequestProductInfos withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    


    /**
     * 资源规格： dbss.bypassaudit.low、dbss.bypassaudit.medium、dbss.bypassaudit.high
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    

    public CreateInstancePeriodRequestProductInfos withProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
        return this;
    }

    


    /**
     * 产品规格描述
     * @return productSpecDesc
     */
    public String getProductSpecDesc() {
        return productSpecDesc;
    }

    public void setProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstancePeriodRequestProductInfos createInstancePeriodRequestProductInfos = (CreateInstancePeriodRequestProductInfos) o;
        return Objects.equals(this.productId, createInstancePeriodRequestProductInfos.productId) &&
            Objects.equals(this.cloudServiceType, createInstancePeriodRequestProductInfos.cloudServiceType) &&
            Objects.equals(this.resourceType, createInstancePeriodRequestProductInfos.resourceType) &&
            Objects.equals(this.resourceSpecCode, createInstancePeriodRequestProductInfos.resourceSpecCode) &&
            Objects.equals(this.productSpecDesc, createInstancePeriodRequestProductInfos.productSpecDesc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productId, cloudServiceType, resourceType, resourceSpecCode, productSpecDesc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstancePeriodRequestProductInfos {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
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

