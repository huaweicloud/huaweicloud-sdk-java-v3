package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResourceNamePrimitiveTypeHolder
 */
public class ResourceNamePrimitiveTypeHolder  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    

    private String resourceName;

    public ResourceNamePrimitiveTypeHolder withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 资源的名称，默认为资源的逻辑名称  以HCL格式的模板为例，resource_name 为 my_hello_world_vpc  ```hcl resource \"huaweicloud_vpc\" \"my_hello_world_vpc\" {   name = \"test_vpc\" } ```  以json格式的模板为例，resource_name 为 my_hello_world_vpc  ```json {   \"resource\": {     \"huaweicloud_vpc\": {       \"my_hello_world_vpc\": {         \"name\": \"test_vpc\"       }     }   } } ```
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceNamePrimitiveTypeHolder resourceNamePrimitiveTypeHolder = (ResourceNamePrimitiveTypeHolder) o;
        return Objects.equals(this.resourceName, resourceNamePrimitiveTypeHolder.resourceName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceNamePrimitiveTypeHolder {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

