package com.huaweicloud.sdk.dis.v2.model;

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
public class ShowConsumerStateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more")

    private Boolean hasMore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_consuming_states")

    private List<PartitionConsumingStates> partitionConsumingStates = null;

    public ShowConsumerStateResponse withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * 是否还有更多满足条件的App。  - true：是。 - false：否。
     * @return hasMore
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public ShowConsumerStateResponse withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 要查询的通道名称。
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public ShowConsumerStateResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 要查询的APP的名称，用户数据消费程序的唯一标识符。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ShowConsumerStateResponse withPartitionConsumingStates(
        List<PartitionConsumingStates> partitionConsumingStates) {
        this.partitionConsumingStates = partitionConsumingStates;
        return this;
    }

    public ShowConsumerStateResponse addPartitionConsumingStatesItem(
        PartitionConsumingStates partitionConsumingStatesItem) {
        if (this.partitionConsumingStates == null) {
            this.partitionConsumingStates = new ArrayList<>();
        }
        this.partitionConsumingStates.add(partitionConsumingStatesItem);
        return this;
    }

    public ShowConsumerStateResponse withPartitionConsumingStates(
        Consumer<List<PartitionConsumingStates>> partitionConsumingStatesSetter) {
        if (this.partitionConsumingStates == null) {
            this.partitionConsumingStates = new ArrayList<>();
        }
        partitionConsumingStatesSetter.accept(this.partitionConsumingStates);
        return this;
    }

    /**
     * 当前分区消费状态.
     * @return partitionConsumingStates
     */
    public List<PartitionConsumingStates> getPartitionConsumingStates() {
        return partitionConsumingStates;
    }

    public void setPartitionConsumingStates(List<PartitionConsumingStates> partitionConsumingStates) {
        this.partitionConsumingStates = partitionConsumingStates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConsumerStateResponse that = (ShowConsumerStateResponse) obj;
        return Objects.equals(this.hasMore, that.hasMore) && Objects.equals(this.streamName, that.streamName)
            && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.partitionConsumingStates, that.partitionConsumingStates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasMore, streamName, appName, partitionConsumingStates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConsumerStateResponse {\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    partitionConsumingStates: ").append(toIndentedString(partitionConsumingStates)).append("\n");
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
