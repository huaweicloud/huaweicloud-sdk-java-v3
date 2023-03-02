package com.huaweicloud.sdk.kafka.v2.model;

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
public class ListInstanceConsumerGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<GroupInfoSimple> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceConsumerGroupsResponse withGroups(List<GroupInfoSimple> groups) {
        this.groups = groups;
        return this;
    }

    public ListInstanceConsumerGroupsResponse addGroupsItem(GroupInfoSimple groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ListInstanceConsumerGroupsResponse withGroups(Consumer<List<GroupInfoSimple>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 所有的消费组。
     * @return groups
     */
    public List<GroupInfoSimple> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupInfoSimple> groups) {
        this.groups = groups;
    }

    public ListInstanceConsumerGroupsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 所有的消费组总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceConsumerGroupsResponse listInstanceConsumerGroupsResponse = (ListInstanceConsumerGroupsResponse) o;
        return Objects.equals(this.groups, listInstanceConsumerGroupsResponse.groups)
            && Objects.equals(this.total, listInstanceConsumerGroupsResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceConsumerGroupsResponse {\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
