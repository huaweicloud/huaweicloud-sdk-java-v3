package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ResourceBasicInfo
 */
public class ResourceBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_code")

    @JacksonXmlProperty(localName = "resource_type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_owner_service")

    @JacksonXmlProperty(localName = "product_owner_service")

    private String productOwnerService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public ResourceBasicInfo withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    /**
     * 资源类型编码。例如：hws.resource.type.general。
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
     * 资源类型归属的服务类型编码。例如：hws.service.type.offline。
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
     * 资源类型名称。例如：通用规格。
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
     * 资源类型描述。
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
        return Objects.equals(this.resourceTypeCode, resourceBasicInfo.resourceTypeCode)
            && Objects.equals(this.productOwnerService, resourceBasicInfo.productOwnerService)
            && Objects.equals(this.name, resourceBasicInfo.name)
            && Objects.equals(this.description, resourceBasicInfo.description);
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
