package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.DedicatedResource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDedicatedResourcesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    
    private List<DedicatedResource> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListDedicatedResourcesResponse withResources(List<DedicatedResource> resources) {
        this.resources = resources;
        return this;
    }

    
    public ListDedicatedResourcesResponse addResourcesItem(DedicatedResource resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListDedicatedResourcesResponse withResources(Consumer<List<DedicatedResource>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 专属资源池信息
     * @return resources
     */
    public List<DedicatedResource> getResources() {
        return resources;
    }

    public void setResources(List<DedicatedResource> resources) {
        this.resources = resources;
    }

    

    public ListDedicatedResourcesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 专属资源池数量
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
        ListDedicatedResourcesResponse listDedicatedResourcesResponse = (ListDedicatedResourcesResponse) o;
        return Objects.equals(this.resources, listDedicatedResourcesResponse.resources) &&
            Objects.equals(this.totalCount, listDedicatedResourcesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDedicatedResourcesResponse {\n");
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

