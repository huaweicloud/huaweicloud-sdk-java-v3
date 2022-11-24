package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstanceConsumerGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<ConsumerGroup> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private BigDecimal max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining")

    private BigDecimal remaining;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_offset")

    private BigDecimal nextOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_offset")

    private BigDecimal previousOffset;

    public ListInstanceConsumerGroupsResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 消费组总数。
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ListInstanceConsumerGroupsResponse withGroups(List<ConsumerGroup> groups) {
        this.groups = groups;
        return this;
    }

    public ListInstanceConsumerGroupsResponse addGroupsItem(ConsumerGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ListInstanceConsumerGroupsResponse withGroups(Consumer<List<ConsumerGroup>> groupsSetter) {
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
    public List<ConsumerGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<ConsumerGroup> groups) {
        this.groups = groups;
    }

    public ListInstanceConsumerGroupsResponse withMax(BigDecimal max) {
        this.max = max;
        return this;
    }

    /**
     * 最大可创建消费组数量。
     * @return max
     */
    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public ListInstanceConsumerGroupsResponse withRemaining(BigDecimal remaining) {
        this.remaining = remaining;
        return this;
    }

    /**
     * 剩余可创建消费组数量。
     * @return remaining
     */
    public BigDecimal getRemaining() {
        return remaining;
    }

    public void setRemaining(BigDecimal remaining) {
        this.remaining = remaining;
    }

    public ListInstanceConsumerGroupsResponse withNextOffset(BigDecimal nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }

    /**
     * 下个分页的offset。
     * @return nextOffset
     */
    public BigDecimal getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(BigDecimal nextOffset) {
        this.nextOffset = nextOffset;
    }

    public ListInstanceConsumerGroupsResponse withPreviousOffset(BigDecimal previousOffset) {
        this.previousOffset = previousOffset;
        return this;
    }

    /**
     * 上个分页的offset。
     * @return previousOffset
     */
    public BigDecimal getPreviousOffset() {
        return previousOffset;
    }

    public void setPreviousOffset(BigDecimal previousOffset) {
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
        return Objects.equals(this.total, listInstanceConsumerGroupsResponse.total)
            && Objects.equals(this.groups, listInstanceConsumerGroupsResponse.groups)
            && Objects.equals(this.max, listInstanceConsumerGroupsResponse.max)
            && Objects.equals(this.remaining, listInstanceConsumerGroupsResponse.remaining)
            && Objects.equals(this.nextOffset, listInstanceConsumerGroupsResponse.nextOffset)
            && Objects.equals(this.previousOffset, listInstanceConsumerGroupsResponse.previousOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, groups, max, remaining, nextOffset, previousOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceConsumerGroupsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
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
