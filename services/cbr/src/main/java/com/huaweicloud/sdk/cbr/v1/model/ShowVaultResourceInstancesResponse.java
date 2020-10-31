package com.huaweicloud.sdk.cbr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.TagResource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowVaultResourceInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<TagResource> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ShowVaultResourceInstancesResponse withResources(List<TagResource> resources) {
        this.resources = resources;
        return this;
    }

    
    public ShowVaultResourceInstancesResponse addResourcesItem(TagResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowVaultResourceInstancesResponse withResources(Consumer<List<TagResource>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 符合查询条件的资源列表（action为count时无此参数）。
     * @return resources
     */
    public List<TagResource> getResources() {
        return resources;
    }

    public void setResources(List<TagResource> resources) {
        this.resources = resources;
    }

    public ShowVaultResourceInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 符合查询条件的资源总个数
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
        ShowVaultResourceInstancesResponse showVaultResourceInstancesResponse = (ShowVaultResourceInstancesResponse) o;
        return Objects.equals(this.resources, showVaultResourceInstancesResponse.resources) &&
            Objects.equals(this.totalCount, showVaultResourceInstancesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVaultResourceInstancesResponse {\n");
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

