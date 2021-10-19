package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowKafkaTopicPartitionDiskusageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_list")

    private List<DiskusageEntity> brokerList = null;

    public ShowKafkaTopicPartitionDiskusageResponse withBrokerList(List<DiskusageEntity> brokerList) {
        this.brokerList = brokerList;
        return this;
    }

    public ShowKafkaTopicPartitionDiskusageResponse addBrokerListItem(DiskusageEntity brokerListItem) {
        if (this.brokerList == null) {
            this.brokerList = new ArrayList<>();
        }
        this.brokerList.add(brokerListItem);
        return this;
    }

    public ShowKafkaTopicPartitionDiskusageResponse withBrokerList(Consumer<List<DiskusageEntity>> brokerListSetter) {
        if (this.brokerList == null) {
            this.brokerList = new ArrayList<>();
        }
        brokerListSetter.accept(this.brokerList);
        return this;
    }

    /** Broker列表。
     * 
     * @return brokerList */
    public List<DiskusageEntity> getBrokerList() {
        return brokerList;
    }

    public void setBrokerList(List<DiskusageEntity> brokerList) {
        this.brokerList = brokerList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowKafkaTopicPartitionDiskusageResponse showKafkaTopicPartitionDiskusageResponse =
            (ShowKafkaTopicPartitionDiskusageResponse) o;
        return Objects.equals(this.brokerList, showKafkaTopicPartitionDiskusageResponse.brokerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brokerList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKafkaTopicPartitionDiskusageResponse {\n");
        sb.append("    brokerList: ").append(toIndentedString(brokerList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
