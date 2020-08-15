package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.CustomerOnDemandResource;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCustomerOnDemandResourcesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<CustomerOnDemandResource> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListCustomerOnDemandResourcesResponse withResources(List<CustomerOnDemandResource> resources) {
        this.resources = resources;
        return this;
    }

    
    public ListCustomerOnDemandResourcesResponse addResourcesItem(CustomerOnDemandResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListCustomerOnDemandResourcesResponse withResources(Consumer<List<CustomerOnDemandResource>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * |参数名称：客户按需资源列表。CustomerOnDemandResource| |参数约束以及描述：客户按需资源列表。CustomerOnDemandResource|
     * @return resources
     */
    public List<CustomerOnDemandResource> getResources() {
        return resources;
    }

    public void setResources(List<CustomerOnDemandResource> resources) {
        this.resources = resources;
    }

    public ListCustomerOnDemandResourcesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：查询总数| |参数的约束及描述：查询总数|
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
        ListCustomerOnDemandResourcesResponse listCustomerOnDemandResourcesResponse = (ListCustomerOnDemandResourcesResponse) o;
        return Objects.equals(this.resources, listCustomerOnDemandResourcesResponse.resources) &&
            Objects.equals(this.totalCount, listCustomerOnDemandResourcesResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerOnDemandResourcesResponse {\n");
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

