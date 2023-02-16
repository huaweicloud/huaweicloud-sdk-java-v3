package com.huaweicloud.sdk.dbss.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dbss.v1.model.ResourceInstanceResponseResources;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CountResourceInstanceByTagResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    
    private List<ResourceInstanceResponseResources> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public CountResourceInstanceByTagResponse withResources(List<ResourceInstanceResponseResources> resources) {
        this.resources = resources;
        return this;
    }

    
    public CountResourceInstanceByTagResponse addResourcesItem(ResourceInstanceResponseResources resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public CountResourceInstanceByTagResponse withResources(Consumer<List<ResourceInstanceResponseResources>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源实例列表
     * @return resources
     */
    public List<ResourceInstanceResponseResources> getResources() {
        return resources;
    }

    public void setResources(List<ResourceInstanceResponseResources> resources) {
        this.resources = resources;
    }

    

    public CountResourceInstanceByTagResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountResourceInstanceByTagResponse countResourceInstanceByTagResponse = (CountResourceInstanceByTagResponse) o;
        return Objects.equals(this.resources, countResourceInstanceByTagResponse.resources) &&
            Objects.equals(this.totalCount, countResourceInstanceByTagResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountResourceInstanceByTagResponse {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

