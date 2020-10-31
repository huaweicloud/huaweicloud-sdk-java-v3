package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceBasicInfo
 */
public class ResourceBasicInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_code")
    
    private String resourceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_owner_service")
    
    private String productOwnerService;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public ResourceBasicInfo withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    


    /**
     * |参数名称：资源类型编码| |参数约束及描述：资源类型编码|
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public ResourceBasicInfo withProductOwnerService(String productOwnerService) {
        this.productOwnerService = productOwnerService;
        return this;
    }

    


    /**
     * |参数名称：资源类型归属的服务类型编码| |参数约束及描述：资源类型归属的服务类型编码|
     * @return productOwnerService
     */
    public String getProductOwnerService() {
        return productOwnerService;
    }

    public void setProductOwnerService(String productOwnerService) {
        this.productOwnerService = productOwnerService;
    }

    public ResourceBasicInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * |参数名称：资源名称，按照请求的X-Language返回对应语言的名称| |参数约束及描述：资源名称，按照请求的X-Language返回对应语言的名称|
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceBasicInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * |参数名称：资源描述，按照请求的X-Language返回对应语言的描述| |参数约束及描述：资源描述，按照请求的X-Language返回对应语言的描述|
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceBasicInfo resourceBasicInfo = (ResourceBasicInfo) o;
        return Objects.equals(this.resourceTypeCode, resourceBasicInfo.resourceTypeCode) &&
            Objects.equals(this.productOwnerService, resourceBasicInfo.productOwnerService) &&
            Objects.equals(this.name, resourceBasicInfo.name) &&
            Objects.equals(this.description, resourceBasicInfo.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceTypeCode, productOwnerService, name, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceBasicInfo {\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    productOwnerService: ").append(toIndentedString(productOwnerService)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

