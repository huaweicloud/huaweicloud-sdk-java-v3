package com.huaweicloud.sdk.rms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rms.v1.model.PageInfo;
import com.huaweicloud.sdk.rms.v1.model.ResourceEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListResourcesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    private List<ResourceEntity> resources = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_info")
    
    private PageInfo pageInfo;

    public ListResourcesResponse withResources(List<ResourceEntity> resources) {
        this.resources = resources;
        return this;
    }

    
    public ListResourcesResponse addResourcesItem(ResourceEntity resourcesItem) {
        this.resources.add(resourcesItem);
        return this;
    }

    public ListResourcesResponse withResources(Consumer<List<ResourceEntity>> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表
     * @return resources
     */
    public List<ResourceEntity> getResources() {
        return resources;
    }

    public void setResources(List<ResourceEntity> resources) {
        this.resources = resources;
    }

    

    public ListResourcesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResourcesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if(this.pageInfo == null ){
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }
        
        return this;
    }


    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourcesResponse listResourcesResponse = (ListResourcesResponse) o;
        return Objects.equals(this.resources, listResourcesResponse.resources) &&
            Objects.equals(this.pageInfo, listResourcesResponse.pageInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resources, pageInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourcesResponse {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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

