package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListResourcesLevelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level_list")

    private List<ResourceLevelItem> resourceLevelList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListResourcesLevelResponse withResourceLevelList(List<ResourceLevelItem> resourceLevelList) {
        this.resourceLevelList = resourceLevelList;
        return this;
    }

    public ListResourcesLevelResponse addResourceLevelListItem(ResourceLevelItem resourceLevelListItem) {
        if (this.resourceLevelList == null) {
            this.resourceLevelList = new ArrayList<>();
        }
        this.resourceLevelList.add(resourceLevelListItem);
        return this;
    }

    public ListResourcesLevelResponse withResourceLevelList(Consumer<List<ResourceLevelItem>> resourceLevelListSetter) {
        if (this.resourceLevelList == null) {
            this.resourceLevelList = new ArrayList<>();
        }
        resourceLevelListSetter.accept(this.resourceLevelList);
        return this;
    }

    /**
     * 资源分级列表数据
     * @return resourceLevelList
     */
    public List<ResourceLevelItem> getResourceLevelList() {
        return resourceLevelList;
    }

    public void setResourceLevelList(List<ResourceLevelItem> resourceLevelList) {
        this.resourceLevelList = resourceLevelList;
    }

    public ListResourcesLevelResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 资源等级总数
     * minimum: 0
     * maximum: 1024
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourcesLevelResponse that = (ListResourcesLevelResponse) obj;
        return Objects.equals(this.resourceLevelList, that.resourceLevelList) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceLevelList, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourcesLevelResponse {\n");
        sb.append("    resourceLevelList: ").append(toIndentedString(resourceLevelList)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
