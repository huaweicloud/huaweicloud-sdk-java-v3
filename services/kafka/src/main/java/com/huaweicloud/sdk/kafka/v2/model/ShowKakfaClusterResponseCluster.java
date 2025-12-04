package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 集群信息。
 */
public class ShowKakfaClusterResponseCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<ShowKakfaClusterResponseClusterBrokers> brokers = null;

    public ShowKakfaClusterResponseCluster withBrokers(List<ShowKakfaClusterResponseClusterBrokers> brokers) {
        this.brokers = brokers;
        return this;
    }

    public ShowKakfaClusterResponseCluster addBrokersItem(ShowKakfaClusterResponseClusterBrokers brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public ShowKakfaClusterResponseCluster withBrokers(
        Consumer<List<ShowKakfaClusterResponseClusterBrokers>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * **参数解释**： broker详情。
     * @return brokers
     */
    public List<ShowKakfaClusterResponseClusterBrokers> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<ShowKakfaClusterResponseClusterBrokers> brokers) {
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
        ShowKakfaClusterResponseCluster that = (ShowKakfaClusterResponseCluster) obj;
        return Objects.equals(this.brokers, that.brokers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brokers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKakfaClusterResponseCluster {\n");
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
