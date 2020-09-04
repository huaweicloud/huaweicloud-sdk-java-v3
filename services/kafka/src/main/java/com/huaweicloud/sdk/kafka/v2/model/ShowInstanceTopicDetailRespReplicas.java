package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowInstanceTopicDetailRespReplicas
 */
public class ShowInstanceTopicDetailRespReplicas  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="broker")
    
    private Integer broker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="leader")
    
    private Boolean leader;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="in_sync")
    
    private Boolean inSync;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lag")
    
    private Integer lag;

    public ShowInstanceTopicDetailRespReplicas withBroker(Integer broker) {
        this.broker = broker;
        return this;
    }

    


    /**
     * 副本所在的节点ID。
     * @return broker
     */
    public Integer getBroker() {
        return broker;
    }

    public void setBroker(Integer broker) {
        this.broker = broker;
    }

    public ShowInstanceTopicDetailRespReplicas withLeader(Boolean leader) {
        this.leader = leader;
        return this;
    }

    


    /**
     * 该副本是否为leader。
     * @return leader
     */
    public Boolean getLeader() {
        return leader;
    }

    public void setLeader(Boolean leader) {
        this.leader = leader;
    }

    public ShowInstanceTopicDetailRespReplicas withInSync(Boolean inSync) {
        this.inSync = inSync;
        return this;
    }

    


    /**
     * 该副本是否在ISR副本中。
     * @return inSync
     */
    public Boolean getInSync() {
        return inSync;
    }

    public void setInSync(Boolean inSync) {
        this.inSync = inSync;
    }

    public ShowInstanceTopicDetailRespReplicas withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 该副本当前日志大小。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowInstanceTopicDetailRespReplicas withLag(Integer lag) {
        this.lag = lag;
        return this;
    }

    


    /**
     * 该副本当前落后hw的消息数。
     * @return lag
     */
    public Integer getLag() {
        return lag;
    }

    public void setLag(Integer lag) {
        this.lag = lag;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowInstanceTopicDetailRespReplicas showInstanceTopicDetailRespReplicas = (ShowInstanceTopicDetailRespReplicas) o;
        return Objects.equals(this.broker, showInstanceTopicDetailRespReplicas.broker) &&
            Objects.equals(this.leader, showInstanceTopicDetailRespReplicas.leader) &&
            Objects.equals(this.inSync, showInstanceTopicDetailRespReplicas.inSync) &&
            Objects.equals(this.size, showInstanceTopicDetailRespReplicas.size) &&
            Objects.equals(this.lag, showInstanceTopicDetailRespReplicas.lag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(broker, leader, inSync, size, lag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceTopicDetailRespReplicas {\n");
        sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
        sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
        sb.append("    inSync: ").append(toIndentedString(inSync)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    lag: ").append(toIndentedString(lag)).append("\n");
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

