package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowInstanceTopicDetailRespReplicas
 */
public class ShowInstanceTopicDetailRespReplicas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker")

    private Integer broker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leader")

    private Boolean leader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_sync")

    private Boolean inSync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lag")

    private Long lag;

    public ShowInstanceTopicDetailRespReplicas withBroker(Integer broker) {
        this.broker = broker;
        return this;
    }

    /**
     * **参数解释**： 副本所在的节点ID。 **取值范围**： 不涉及
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
     * **参数解释**： 该副本是否为leader。 **取值范围**： - true：该副本是leader。 - false：该副本不是leader。
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
     * **参数解释**： 该副本是否在ISR副本中。 **取值范围**： - true：在ISR副本中。 - false：不在ISR副本中。
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
     * **参数解释**： 该副本当前日志大小。单位：Byte。 **取值范围**： 不涉及
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowInstanceTopicDetailRespReplicas withLag(Long lag) {
        this.lag = lag;
        return this;
    }

    /**
     * **参数解释**： 该副本当前落后hw的消息数。 **取值范围**： 不涉及
     * @return lag
     */
    public Long getLag() {
        return lag;
    }

    public void setLag(Long lag) {
        this.lag = lag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceTopicDetailRespReplicas that = (ShowInstanceTopicDetailRespReplicas) obj;
        return Objects.equals(this.broker, that.broker) && Objects.equals(this.leader, that.leader)
            && Objects.equals(this.inSync, that.inSync) && Objects.equals(this.size, that.size)
            && Objects.equals(this.lag, that.lag);
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
