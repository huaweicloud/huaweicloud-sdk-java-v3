package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceType
 */
public class ResourceType  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_code")
    
    private String resourceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_name")
    
    private String resourceTypeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_desc")
    
    private String resourceTypeDesc;

    public ResourceType withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    


    /**
     * 资源类型的编码。例如ECS的VM为“hws.resource.type.vm”。
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public ResourceType withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    


    /**
     * 资源类型的名称。
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public ResourceType withResourceTypeDesc(String resourceTypeDesc) {
        this.resourceTypeDesc = resourceTypeDesc;
        return this;
    }

    


    /**
     * 资源类型的描述。
     * @return resourceTypeDesc
     */
    public String getResourceTypeDesc() {
        return resourceTypeDesc;
    }

    public void setResourceTypeDesc(String resourceTypeDesc) {
        this.resourceTypeDesc = resourceTypeDesc;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceType resourceType = (ResourceType) o;
        return Objects.equals(this.resourceTypeCode, resourceType.resourceTypeCode) &&
            Objects.equals(this.resourceTypeName, resourceType.resourceTypeName) &&
            Objects.equals(this.resourceTypeDesc, resourceType.resourceTypeDesc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceTypeCode, resourceTypeName, resourceTypeDesc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceType {\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    resourceTypeDesc: ").append(toIndentedString(resourceTypeDesc)).append("\n");
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

