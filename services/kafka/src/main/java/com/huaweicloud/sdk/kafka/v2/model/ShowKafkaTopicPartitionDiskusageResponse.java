package com.huaweicloud.sdk.kafka.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ShowKafkaTopicPartitionDiskusageRespBrokerList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowKafkaTopicPartitionDiskusageResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="broker_list")
    
    private List<ShowKafkaTopicPartitionDiskusageRespBrokerList> brokerList = null;
    
    public ShowKafkaTopicPartitionDiskusageResponse withBrokerList(List<ShowKafkaTopicPartitionDiskusageRespBrokerList> brokerList) {
        this.brokerList = brokerList;
        return this;
    }

    
    public ShowKafkaTopicPartitionDiskusageResponse addBrokerListItem(ShowKafkaTopicPartitionDiskusageRespBrokerList brokerListItem) {
        if(this.brokerList == null) {
            this.brokerList = new ArrayList<>();
        }
        this.brokerList.add(brokerListItem);
        return this;
    }

    public ShowKafkaTopicPartitionDiskusageResponse withBrokerList(Consumer<List<ShowKafkaTopicPartitionDiskusageRespBrokerList>> brokerListSetter) {
        if(this.brokerList == null) {
            this.brokerList = new ArrayList<>();
        }
        brokerListSetter.accept(this.brokerList);
        return this;
    }

    /**
     * Broker列表。
     * @return brokerList
     */
    public List<ShowKafkaTopicPartitionDiskusageRespBrokerList> getBrokerList() {
        return brokerList;
    }

    public void setBrokerList(List<ShowKafkaTopicPartitionDiskusageRespBrokerList> brokerList) {
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
        ShowKafkaTopicPartitionDiskusageResponse showKafkaTopicPartitionDiskusageResponse = (ShowKafkaTopicPartitionDiskusageResponse) o;
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

