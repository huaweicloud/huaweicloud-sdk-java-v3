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

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining")

    private Integer remaining;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_offset")

    private Integer nextOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_offset")

    private Integer previousOffset;

    public ListInstanceConsumerGroupsResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 消费组总数。 **取值范围**： 不涉及。
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
     * **参数解释**： 消费组列表。
     * @return groups
     */
    public List<ConsumerGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<ConsumerGroup> groups) {
        this.groups = groups;
    }

    public ListInstanceConsumerGroupsResponse withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * **参数解释**： 最大可创建消费组数量。 **取值范围**： 不涉及。
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public ListInstanceConsumerGroupsResponse withRemaining(Integer remaining) {
        this.remaining = remaining;
        return this;
    }

    /**
     * **参数解释**： 剩余可创建消费组数量。 **取值范围**： 不涉及。
     * @return remaining
     */
    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public ListInstanceConsumerGroupsResponse withNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }

    /**
     * **参数解释**： 下个分页的offset。 **取值范围**： 不涉及。
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
     * **参数解释**： 上个分页的offset。 **取值范围**： 不涉及。
     * @return previousOffset
     */
    public Integer getPreviousOffset() {
        return previousOffset;
    }

    public void setPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceConsumerGroupsResponse that = (ListInstanceConsumerGroupsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.groups, that.groups)
            && Objects.equals(this.max, that.max) && Objects.equals(this.remaining, that.remaining)
            && Objects.equals(this.nextOffset, that.nextOffset)
            && Objects.equals(this.previousOffset, that.previousOffset);
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
