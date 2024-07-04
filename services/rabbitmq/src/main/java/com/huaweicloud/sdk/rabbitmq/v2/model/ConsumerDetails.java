package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConsumerDetails
 */
public class ConsumerDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumer_tag")

    private String consumerTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_details")

    private ChannelDetails channelDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ack_required")

    private Boolean ackRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefetch_count")

    private Integer prefetchCount;

    public ConsumerDetails withConsumerTag(String consumerTag) {
        this.consumerTag = consumerTag;
        return this;
    }

    /**
     * 消费者标识
     * @return consumerTag
     */
    public String getConsumerTag() {
        return consumerTag;
    }

    public void setConsumerTag(String consumerTag) {
        this.consumerTag = consumerTag;
    }

    public ConsumerDetails withChannelDetails(ChannelDetails channelDetails) {
        this.channelDetails = channelDetails;
        return this;
    }

    public ConsumerDetails withChannelDetails(Consumer<ChannelDetails> channelDetailsSetter) {
        if (this.channelDetails == null) {
            this.channelDetails = new ChannelDetails();
            channelDetailsSetter.accept(this.channelDetails);
        }

        return this;
    }

    /**
     * Get channelDetails
     * @return channelDetails
     */
    public ChannelDetails getChannelDetails() {
        return channelDetails;
    }

    public void setChannelDetails(ChannelDetails channelDetails) {
        this.channelDetails = channelDetails;
    }

    public ConsumerDetails withAckRequired(Boolean ackRequired) {
        this.ackRequired = ackRequired;
        return this;
    }

    /**
     * 消费者客户端是否设置手动ack
     * @return ackRequired
     */
    public Boolean getAckRequired() {
        return ackRequired;
    }

    public void setAckRequired(Boolean ackRequired) {
        this.ackRequired = ackRequired;
    }

    public ConsumerDetails withPrefetchCount(Integer prefetchCount) {
        this.prefetchCount = prefetchCount;
        return this;
    }

    /**
     * 消费者客户端预取值
     * @return prefetchCount
     */
    public Integer getPrefetchCount() {
        return prefetchCount;
    }

    public void setPrefetchCount(Integer prefetchCount) {
        this.prefetchCount = prefetchCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumerDetails that = (ConsumerDetails) obj;
        return Objects.equals(this.consumerTag, that.consumerTag)
            && Objects.equals(this.channelDetails, that.channelDetails)
            && Objects.equals(this.ackRequired, that.ackRequired)
            && Objects.equals(this.prefetchCount, that.prefetchCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumerTag, channelDetails, ackRequired, prefetchCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumerDetails {\n");
        sb.append("    consumerTag: ").append(toIndentedString(consumerTag)).append("\n");
        sb.append("    channelDetails: ").append(toIndentedString(channelDetails)).append("\n");
        sb.append("    ackRequired: ").append(toIndentedString(ackRequired)).append("\n");
        sb.append("    prefetchCount: ").append(toIndentedString(prefetchCount)).append("\n");
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
