package com.huaweicloud.sdk.rocketmq.v2.model;

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
public class ShowTopicStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_offset")

    private Integer maxOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_offset")

    private Integer minOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<ShowTopicStatusRespBrokers> brokers = null;

    public ShowTopicStatusResponse withMaxOffset(Integer maxOffset) {
        this.maxOffset = maxOffset;
        return this;
    }

    /**
     * 最大偏移量。
     * @return maxOffset
     */
    public Integer getMaxOffset() {
        return maxOffset;
    }

    public void setMaxOffset(Integer maxOffset) {
        this.maxOffset = maxOffset;
    }

    public ShowTopicStatusResponse withMinOffset(Integer minOffset) {
        this.minOffset = minOffset;
        return this;
    }

    /**
     * 最小偏移量。
     * @return minOffset
     */
    public Integer getMinOffset() {
        return minOffset;
    }

    public void setMinOffset(Integer minOffset) {
        this.minOffset = minOffset;
    }

    public ShowTopicStatusResponse withBrokers(List<ShowTopicStatusRespBrokers> brokers) {
        this.brokers = brokers;
        return this;
    }

    public ShowTopicStatusResponse addBrokersItem(ShowTopicStatusRespBrokers brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public ShowTopicStatusResponse withBrokers(Consumer<List<ShowTopicStatusRespBrokers>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * 代理。
     * @return brokers
     */
    public List<ShowTopicStatusRespBrokers> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<ShowTopicStatusRespBrokers> brokers) {
        this.brokers = brokers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTopicStatusResponse that = (ShowTopicStatusResponse) obj;
        return Objects.equals(this.maxOffset, that.maxOffset) && Objects.equals(this.minOffset, that.minOffset)
            && Objects.equals(this.brokers, that.brokers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxOffset, minOffset, brokers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopicStatusResponse {\n");
        sb.append("    maxOffset: ").append(toIndentedString(maxOffset)).append("\n");
        sb.append("    minOffset: ").append(toIndentedString(minOffset)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
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
