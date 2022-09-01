package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListProtectedInstancesByTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    @JacksonXmlProperty(localName = "resources")

    private List<ResourceParams> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    public ListProtectedInstancesByTagsResponse withResources(List<ResourceParams> resources) {
        this.resources = resources;
        return this;
    }

    public ListProtectedInstancesByTagsResponse addResourcesItem(ResourceParams resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListProtectedInstancesByTagsResponse withResources(Consumer<List<ResourceParams>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 返回的保护实例列表。
     * @return resources
     */
    public List<ResourceParams> getResources() {
        return resources;
    }

    public void setResources(List<ResourceParams> resources) {
        this.resources = resources;
    }

    public ListProtectedInstancesByTagsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。该值不受过滤条件的影响。
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
        ListProtectedInstancesByTagsResponse listProtectedInstancesByTagsResponse =
            (ListProtectedInstancesByTagsResponse) o;
        return Objects.equals(this.resources, listProtectedInstancesByTagsResponse.resources)
            && Objects.equals(this.totalCount, listProtectedInstancesByTagsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProtectedInstancesByTagsResponse {\n");
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
