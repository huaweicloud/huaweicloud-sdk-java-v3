package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.ResourcesByTag;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListLoadbalancersByTagsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<ResourcesByTag> resources = null;
    
    public ListLoadbalancersByTagsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数。当resources为空时，表示名称为matches字段中指定的value的负载均衡器个数；resources不为空时，表示和tags字段匹配的负载均衡器的个数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    public ListLoadbalancersByTagsResponse withResources(List<ResourcesByTag> resources) {
        this.resources = resources;
        return this;
    }

    
    public ListLoadbalancersByTagsResponse addResourcesItem(ResourcesByTag resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListLoadbalancersByTagsResponse withResources(Consumer<List<ResourcesByTag>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 根据tag查询出的负载均衡器对象。 当请求中的action为filters，返回体中有该字段。 当请求中的action为count时，返回体中无该字段。
     * @return resources
     */
    public List<ResourcesByTag> getResources() {
        return resources;
    }

    public void setResources(List<ResourcesByTag> resources) {
        this.resources = resources;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLoadbalancersByTagsResponse listLoadbalancersByTagsResponse = (ListLoadbalancersByTagsResponse) o;
        return Objects.equals(this.totalCount, listLoadbalancersByTagsResponse.totalCount) &&
            Objects.equals(this.resources, listLoadbalancersByTagsResponse.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLoadbalancersByTagsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

