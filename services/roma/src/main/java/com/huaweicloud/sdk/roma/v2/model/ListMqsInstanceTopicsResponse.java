package com.huaweicloud.sdk.roma.v2.model;

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
public class ListMqsInstanceTopicsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<String> permissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<ListInstanceTopicsRespTopics> topics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_partitions")

    private Integer remainPartitions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_partitions")

    private Integer maxPartitions;

    public ListMqsInstanceTopicsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * topic的总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListMqsInstanceTopicsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 当前查询的topic数量。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListMqsInstanceTopicsResponse withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public ListMqsInstanceTopicsResponse addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public ListMqsInstanceTopicsResponse withPermissions(Consumer<List<String>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * 允许操作的权限。
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public ListMqsInstanceTopicsResponse withTopics(List<ListInstanceTopicsRespTopics> topics) {
        this.topics = topics;
        return this;
    }

    public ListMqsInstanceTopicsResponse addTopicsItem(ListInstanceTopicsRespTopics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ListMqsInstanceTopicsResponse withTopics(Consumer<List<ListInstanceTopicsRespTopics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * Topic列表。
     * @return topics
     */
    public List<ListInstanceTopicsRespTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<ListInstanceTopicsRespTopics> topics) {
        this.topics = topics;
    }

    public ListMqsInstanceTopicsResponse withRemainPartitions(Integer remainPartitions) {
        this.remainPartitions = remainPartitions;
        return this;
    }

    /**
     * 剩余分区数。
     * @return remainPartitions
     */
    public Integer getRemainPartitions() {
        return remainPartitions;
    }

    public void setRemainPartitions(Integer remainPartitions) {
        this.remainPartitions = remainPartitions;
    }

    public ListMqsInstanceTopicsResponse withMaxPartitions(Integer maxPartitions) {
        this.maxPartitions = maxPartitions;
        return this;
    }

    /**
     * 分区总数。
     * @return maxPartitions
     */
    public Integer getMaxPartitions() {
        return maxPartitions;
    }

    public void setMaxPartitions(Integer maxPartitions) {
        this.maxPartitions = maxPartitions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMqsInstanceTopicsResponse listMqsInstanceTopicsResponse = (ListMqsInstanceTopicsResponse) o;
        return Objects.equals(this.total, listMqsInstanceTopicsResponse.total)
            && Objects.equals(this.size, listMqsInstanceTopicsResponse.size)
            && Objects.equals(this.permissions, listMqsInstanceTopicsResponse.permissions)
            && Objects.equals(this.topics, listMqsInstanceTopicsResponse.topics)
            && Objects.equals(this.remainPartitions, listMqsInstanceTopicsResponse.remainPartitions)
            && Objects.equals(this.maxPartitions, listMqsInstanceTopicsResponse.maxPartitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, permissions, topics, remainPartitions, maxPartitions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMqsInstanceTopicsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    remainPartitions: ").append(toIndentedString(remainPartitions)).append("\n");
        sb.append("    maxPartitions: ").append(toIndentedString(maxPartitions)).append("\n");
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
