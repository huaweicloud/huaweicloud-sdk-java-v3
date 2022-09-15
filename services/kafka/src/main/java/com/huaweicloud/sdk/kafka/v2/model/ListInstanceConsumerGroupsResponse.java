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
    @JsonProperty(value = "group_ids")

    private List<String> groupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_offset")

    private Integer nextOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_offset")

    private Integer previousOffset;

    public ListInstanceConsumerGroupsResponse withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    public ListInstanceConsumerGroupsResponse addGroupIdsItem(String groupIdsItem) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        this.groupIds.add(groupIdsItem);
        return this;
    }

    public ListInstanceConsumerGroupsResponse withGroupIds(Consumer<List<String>> groupIdsSetter) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        groupIdsSetter.accept(this.groupIds);
        return this;
    }

    /**
     * 所有的消费组ID
     * @return groupIds
     */
    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    public ListInstanceConsumerGroupsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 所有的消费组总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInstanceConsumerGroupsResponse withNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }

    /**
     * 下一个消费组序号
     * @return nextOffset
     */
    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public ListInstanceConsumerGroupsResponse withPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
        return this;
    }

    /**
     * 上一个消费组序号
     * @return previousOffset
     */
    public Integer getPreviousOffset() {
        return previousOffset;
    }

    public void setPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
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
        return Objects.equals(this.groupIds, listInstanceConsumerGroupsResponse.groupIds)
            && Objects.equals(this.total, listInstanceConsumerGroupsResponse.total)
            && Objects.equals(this.nextOffset, listInstanceConsumerGroupsResponse.nextOffset)
            && Objects.equals(this.previousOffset, listInstanceConsumerGroupsResponse.previousOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupIds, total, nextOffset, previousOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceConsumerGroupsResponse {\n");
        sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
        sb.append("    previousOffset: ").append(toIndentedString(previousOffset)).append("\n");
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
