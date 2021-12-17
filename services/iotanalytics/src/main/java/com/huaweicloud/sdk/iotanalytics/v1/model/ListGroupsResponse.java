package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<GetGroup> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListGroupsResponse withGroups(List<GetGroup> groups) {
        this.groups = groups;
        return this;
    }

    public ListGroupsResponse addGroupsItem(GetGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ListGroupsResponse withGroups(Consumer<List<GetGroup>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /** 存储组列表
     * 
     * @return groups */
    public List<GetGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<GetGroup> groups) {
        this.groups = groups;
    }

    public ListGroupsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 返回的 data-store-group 数量 minimum: 0 maximum: 4
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGroupsResponse listGroupsResponse = (ListGroupsResponse) o;
        return Objects.equals(this.groups, listGroupsResponse.groups)
            && Objects.equals(this.count, listGroupsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupsResponse {\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
