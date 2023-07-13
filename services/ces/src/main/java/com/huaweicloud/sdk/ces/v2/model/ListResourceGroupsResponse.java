package com.huaweicloud.sdk.ces.v2.model;

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
public class ListResourceGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_groups")

    private List<OneResourceGroupResp> resourceGroups = null;

    public ListResourceGroupsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 资源分组总数
     * minimum: 0
     * maximum: 1000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListResourceGroupsResponse withResourceGroups(List<OneResourceGroupResp> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }

    public ListResourceGroupsResponse addResourceGroupsItem(OneResourceGroupResp resourceGroupsItem) {
        if (this.resourceGroups == null) {
            this.resourceGroups = new ArrayList<>();
        }
        this.resourceGroups.add(resourceGroupsItem);
        return this;
    }

    public ListResourceGroupsResponse withResourceGroups(Consumer<List<OneResourceGroupResp>> resourceGroupsSetter) {
        if (this.resourceGroups == null) {
            this.resourceGroups = new ArrayList<>();
        }
        resourceGroupsSetter.accept(this.resourceGroups);
        return this;
    }

    /**
     * 资源分组列表
     * @return resourceGroups
     */
    public List<OneResourceGroupResp> getResourceGroups() {
        return resourceGroups;
    }

    public void setResourceGroups(List<OneResourceGroupResp> resourceGroups) {
        this.resourceGroups = resourceGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourceGroupsResponse that = (ListResourceGroupsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.resourceGroups, that.resourceGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, resourceGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceGroupsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    resourceGroups: ").append(toIndentedString(resourceGroups)).append("\n");
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
