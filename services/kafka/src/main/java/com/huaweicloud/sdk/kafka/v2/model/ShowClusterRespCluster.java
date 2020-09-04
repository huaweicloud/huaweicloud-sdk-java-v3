package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ShowClusterRespClusterBrokers;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 集群基本信息。
 */
public class ShowClusterRespCluster  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="controller")
    
    private String controller;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="brokers")
    
    private List<ShowClusterRespClusterBrokers> brokers = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topics_count")
    
    private Integer topicsCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partitions_count")
    
    private Integer partitionsCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="online_partitions_count")
    
    private Integer onlinePartitionsCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replicas_count")
    
    private Integer replicasCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isr_replicas_count")
    
    private Integer isrReplicasCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consumers_count")
    
    private Integer consumersCount;

    public ShowClusterRespCluster withController(String controller) {
        this.controller = controller;
        return this;
    }

    


    /**
     * 控制器ID。
     * @return controller
     */
    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public ShowClusterRespCluster withBrokers(List<ShowClusterRespClusterBrokers> brokers) {
        this.brokers = brokers;
        return this;
    }

    
    public ShowClusterRespCluster addBrokersItem(ShowClusterRespClusterBrokers brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public ShowClusterRespCluster withBrokers(Consumer<List<ShowClusterRespClusterBrokers>> brokersSetter) {
        if(this.brokers == null ){
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * 节点列表。
     * @return brokers
     */
    public List<ShowClusterRespClusterBrokers> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<ShowClusterRespClusterBrokers> brokers) {
        this.brokers = brokers;
    }

    public ShowClusterRespCluster withTopicsCount(Integer topicsCount) {
        this.topicsCount = topicsCount;
        return this;
    }

    


    /**
     * 主题数量。
     * @return topicsCount
     */
    public Integer getTopicsCount() {
        return topicsCount;
    }

    public void setTopicsCount(Integer topicsCount) {
        this.topicsCount = topicsCount;
    }

    public ShowClusterRespCluster withPartitionsCount(Integer partitionsCount) {
        this.partitionsCount = partitionsCount;
        return this;
    }

    


    /**
     * 分区数量。
     * @return partitionsCount
     */
    public Integer getPartitionsCount() {
        return partitionsCount;
    }

    public void setPartitionsCount(Integer partitionsCount) {
        this.partitionsCount = partitionsCount;
    }

    public ShowClusterRespCluster withOnlinePartitionsCount(Integer onlinePartitionsCount) {
        this.onlinePartitionsCount = onlinePartitionsCount;
        return this;
    }

    


    /**
     * 在线分区数量。
     * @return onlinePartitionsCount
     */
    public Integer getOnlinePartitionsCount() {
        return onlinePartitionsCount;
    }

    public void setOnlinePartitionsCount(Integer onlinePartitionsCount) {
        this.onlinePartitionsCount = onlinePartitionsCount;
    }

    public ShowClusterRespCluster withReplicasCount(Integer replicasCount) {
        this.replicasCount = replicasCount;
        return this;
    }

    


    /**
     * 副本数量。
     * @return replicasCount
     */
    public Integer getReplicasCount() {
        return replicasCount;
    }

    public void setReplicasCount(Integer replicasCount) {
        this.replicasCount = replicasCount;
    }

    public ShowClusterRespCluster withIsrReplicasCount(Integer isrReplicasCount) {
        this.isrReplicasCount = isrReplicasCount;
        return this;
    }

    


    /**
     * ISR（In-Sync Replicas） 副本总数。
     * @return isrReplicasCount
     */
    public Integer getIsrReplicasCount() {
        return isrReplicasCount;
    }

    public void setIsrReplicasCount(Integer isrReplicasCount) {
        this.isrReplicasCount = isrReplicasCount;
    }

    public ShowClusterRespCluster withConsumersCount(Integer consumersCount) {
        this.consumersCount = consumersCount;
        return this;
    }

    


    /**
     * 消费组数量。
     * @return consumersCount
     */
    public Integer getConsumersCount() {
        return consumersCount;
    }

    public void setConsumersCount(Integer consumersCount) {
        this.consumersCount = consumersCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowClusterRespCluster showClusterRespCluster = (ShowClusterRespCluster) o;
        return Objects.equals(this.controller, showClusterRespCluster.controller) &&
            Objects.equals(this.brokers, showClusterRespCluster.brokers) &&
            Objects.equals(this.topicsCount, showClusterRespCluster.topicsCount) &&
            Objects.equals(this.partitionsCount, showClusterRespCluster.partitionsCount) &&
            Objects.equals(this.onlinePartitionsCount, showClusterRespCluster.onlinePartitionsCount) &&
            Objects.equals(this.replicasCount, showClusterRespCluster.replicasCount) &&
            Objects.equals(this.isrReplicasCount, showClusterRespCluster.isrReplicasCount) &&
            Objects.equals(this.consumersCount, showClusterRespCluster.consumersCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(controller, brokers, topicsCount, partitionsCount, onlinePartitionsCount, replicasCount, isrReplicasCount, consumersCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterRespCluster {\n");
        sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    topicsCount: ").append(toIndentedString(topicsCount)).append("\n");
        sb.append("    partitionsCount: ").append(toIndentedString(partitionsCount)).append("\n");
        sb.append("    onlinePartitionsCount: ").append(toIndentedString(onlinePartitionsCount)).append("\n");
        sb.append("    replicasCount: ").append(toIndentedString(replicasCount)).append("\n");
        sb.append("    isrReplicasCount: ").append(toIndentedString(isrReplicasCount)).append("\n");
        sb.append("    consumersCount: ").append(toIndentedString(consumersCount)).append("\n");
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

