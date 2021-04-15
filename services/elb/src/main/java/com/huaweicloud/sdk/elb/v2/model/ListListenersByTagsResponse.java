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
public class ListListenersByTagsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<ResourcesByTag> resources = null;
    
    public ListListenersByTagsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数。当resources为空时，表示名称为matches字段中指定的value的资源个数；resources不为空时，表示和tags字段匹配的资源的个数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    public ListListenersByTagsResponse withResources(List<ResourcesByTag> resources) {
        this.resources = resources;
        return this;
    }

    
    public ListListenersByTagsResponse addResourcesItem(ResourcesByTag resourcesItem) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListListenersByTagsResponse withResources(Consumer<List<ResourcesByTag>> resourcesSetter) {
        if(this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 根据tag查询出的资源对象。 当请求中的action为filters，返回体中有该字段。 当请求中的action为count时，返回体中无该字段。
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
        ListListenersByTagsResponse listListenersByTagsResponse = (ListListenersByTagsResponse) o;
        return Objects.equals(this.totalCount, listListenersByTagsResponse.totalCount) &&
            Objects.equals(this.resources, listListenersByTagsResponse.resources);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, resources);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListListenersByTagsResponse {\n");
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

