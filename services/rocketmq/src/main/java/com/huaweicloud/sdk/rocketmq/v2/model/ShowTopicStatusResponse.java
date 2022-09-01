package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
    @JsonProperty(value = "brokers")

    @JacksonXmlProperty(localName = "brokers")

    private List<ShowTopicStatusRespBrokers> brokers = null;

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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTopicStatusResponse showTopicStatusResponse = (ShowTopicStatusResponse) o;
        return Objects.equals(this.brokers, showTopicStatusResponse.brokers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brokers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopicStatusResponse {\n");
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
