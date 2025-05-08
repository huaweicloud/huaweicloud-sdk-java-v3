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
public class ListInstanceConsumerGroupMessageOffsetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_message_offsets")

    private List<GroupMessageOffsetsDetailEntity> groupMessageOffsets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceConsumerGroupMessageOffsetResponse withGroupMessageOffsets(
        List<GroupMessageOffsetsDetailEntity> groupMessageOffsets) {
        this.groupMessageOffsets = groupMessageOffsets;
        return this;
    }

    public ListInstanceConsumerGroupMessageOffsetResponse addGroupMessageOffsetsItem(
        GroupMessageOffsetsDetailEntity groupMessageOffsetsItem) {
        if (this.groupMessageOffsets == null) {
            this.groupMessageOffsets = new ArrayList<>();
        }
        this.groupMessageOffsets.add(groupMessageOffsetsItem);
        return this;
    }

    public ListInstanceConsumerGroupMessageOffsetResponse withGroupMessageOffsets(
        Consumer<List<GroupMessageOffsetsDetailEntity>> groupMessageOffsetsSetter) {
        if (this.groupMessageOffsets == null) {
            this.groupMessageOffsets = new ArrayList<>();
        }
        groupMessageOffsetsSetter.accept(this.groupMessageOffsets);
        return this;
    }

    /**
     * 消费组消息位点详情
     * @return groupMessageOffsets
     */
    public List<GroupMessageOffsetsDetailEntity> getGroupMessageOffsets() {
        return groupMessageOffsets;
    }

    public void setGroupMessageOffsets(List<GroupMessageOffsetsDetailEntity> groupMessageOffsets) {
        this.groupMessageOffsets = groupMessageOffsets;
    }

    public ListInstanceConsumerGroupMessageOffsetResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceConsumerGroupMessageOffsetResponse that = (ListInstanceConsumerGroupMessageOffsetResponse) obj;
        return Objects.equals(this.groupMessageOffsets, that.groupMessageOffsets)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupMessageOffsets, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceConsumerGroupMessageOffsetResponse {\n");
        sb.append("    groupMessageOffsets: ").append(toIndentedString(groupMessageOffsets)).append("\n");
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
