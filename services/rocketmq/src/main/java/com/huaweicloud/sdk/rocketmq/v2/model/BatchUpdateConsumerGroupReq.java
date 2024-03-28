package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateConsumerGroupReq
 */
public class BatchUpdateConsumerGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<CreateOrUpdateConsumerGroup> groups = null;

    public BatchUpdateConsumerGroupReq withGroups(List<CreateOrUpdateConsumerGroup> groups) {
        this.groups = groups;
        return this;
    }

    public BatchUpdateConsumerGroupReq addGroupsItem(CreateOrUpdateConsumerGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public BatchUpdateConsumerGroupReq withGroups(Consumer<List<CreateOrUpdateConsumerGroup>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 消费组列表。
     * @return groups
     */
    public List<CreateOrUpdateConsumerGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<CreateOrUpdateConsumerGroup> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateConsumerGroupReq that = (BatchUpdateConsumerGroupReq) obj;
        return Objects.equals(this.groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateConsumerGroupReq {\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
