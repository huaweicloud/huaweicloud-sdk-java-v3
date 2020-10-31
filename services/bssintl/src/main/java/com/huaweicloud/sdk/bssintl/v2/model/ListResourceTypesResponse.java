package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.ResourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListResourceTypesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_types")
    
    private List<ResourceType> resourceTypes = null;
    
    public ListResourceTypesResponse withResourceTypes(List<ResourceType> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    
    public ListResourceTypesResponse addResourceTypesItem(ResourceType resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public ListResourceTypesResponse withResourceTypes(Consumer<List<ResourceType>> resourceTypesSetter) {
        if(this.resourceTypes == null ){
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * |参数名称：返回数据| |参数约束以及描述：返回数据|
     * @return resourceTypes
     */
    public List<ResourceType> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<ResourceType> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceTypesResponse listResourceTypesResponse = (ListResourceTypesResponse) o;
        return Objects.equals(this.resourceTypes, listResourceTypesResponse.resourceTypes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceTypes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceTypesResponse {\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
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

