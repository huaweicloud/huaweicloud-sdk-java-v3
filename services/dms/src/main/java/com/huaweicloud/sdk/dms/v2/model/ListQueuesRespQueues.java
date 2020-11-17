package com.huaweicloud.sdk.dms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ListQueuesRespQueues
 */
public class ListQueuesRespQueues  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_mode")
    
    private String queueMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reservation")
    
    private Integer reservation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_msg_size_byte")
    
    private Integer maxMsgSizeByte;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="produced_messages")
    
    private Integer producedMessages;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redrive_policy")
    
    private String redrivePolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_consume_count")
    
    private Integer maxConsumeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_count")
    
    private Integer groupCount;

    public ListQueuesRespQueues withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 队列ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListQueuesRespQueues withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 队列的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListQueuesRespQueues withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 队列的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListQueuesRespQueues withQueueMode(String queueMode) {
        this.queueMode = queueMode;
        return this;
    }

    


    /**
     * 队列类型。
     * @return queueMode
     */
    public String getQueueMode() {
        return queueMode;
    }

    public void setQueueMode(String queueMode) {
        this.queueMode = queueMode;
    }

    public ListQueuesRespQueues withReservation(Integer reservation) {
        this.reservation = reservation;
        return this;
    }

    


    /**
     * 消息在队列中允许保留的时长（单位分钟）。
     * @return reservation
     */
    public Integer getReservation() {
        return reservation;
    }

    public void setReservation(Integer reservation) {
        this.reservation = reservation;
    }

    public ListQueuesRespQueues withMaxMsgSizeByte(Integer maxMsgSizeByte) {
        this.maxMsgSizeByte = maxMsgSizeByte;
        return this;
    }

    


    /**
     * 队列中允许的最大消息大小（单位Byte）。
     * @return maxMsgSizeByte
     */
    public Integer getMaxMsgSizeByte() {
        return maxMsgSizeByte;
    }

    public void setMaxMsgSizeByte(Integer maxMsgSizeByte) {
        this.maxMsgSizeByte = maxMsgSizeByte;
    }

    public ListQueuesRespQueues withProducedMessages(Integer producedMessages) {
        this.producedMessages = producedMessages;
        return this;
    }

    


    /**
     * 队列的消息总数。
     * @return producedMessages
     */
    public Integer getProducedMessages() {
        return producedMessages;
    }

    public void setProducedMessages(Integer producedMessages) {
        this.producedMessages = producedMessages;
    }

    public ListQueuesRespQueues withRedrivePolicy(String redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
        return this;
    }

    


    /**
     * 该队列是否开启死信消息。仅当include_deadletter为true时，才有该响应参数。 - enable：表示开启。 - disable：表示不开启。
     * @return redrivePolicy
     */
    public String getRedrivePolicy() {
        return redrivePolicy;
    }

    public void setRedrivePolicy(String redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
    }

    public ListQueuesRespQueues withMaxConsumeCount(Integer maxConsumeCount) {
        this.maxConsumeCount = maxConsumeCount;
        return this;
    }

    


    /**
     * 最大确认消费失败的次数，当达到最大确认失败次数后，DMS会将该条消息转存到死信队列中。  仅当include_deadletter为true时，才有该响应参数。
     * @return maxConsumeCount
     */
    public Integer getMaxConsumeCount() {
        return maxConsumeCount;
    }

    public void setMaxConsumeCount(Integer maxConsumeCount) {
        this.maxConsumeCount = maxConsumeCount;
    }

    public ListQueuesRespQueues withGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }

    


    /**
     * 该队列下的消费组数量。
     * @return groupCount
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQueuesRespQueues listQueuesRespQueues = (ListQueuesRespQueues) o;
        return Objects.equals(this.id, listQueuesRespQueues.id) &&
            Objects.equals(this.name, listQueuesRespQueues.name) &&
            Objects.equals(this.description, listQueuesRespQueues.description) &&
            Objects.equals(this.queueMode, listQueuesRespQueues.queueMode) &&
            Objects.equals(this.reservation, listQueuesRespQueues.reservation) &&
            Objects.equals(this.maxMsgSizeByte, listQueuesRespQueues.maxMsgSizeByte) &&
            Objects.equals(this.producedMessages, listQueuesRespQueues.producedMessages) &&
            Objects.equals(this.redrivePolicy, listQueuesRespQueues.redrivePolicy) &&
            Objects.equals(this.maxConsumeCount, listQueuesRespQueues.maxConsumeCount) &&
            Objects.equals(this.groupCount, listQueuesRespQueues.groupCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, queueMode, reservation, maxMsgSizeByte, producedMessages, redrivePolicy, maxConsumeCount, groupCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueuesRespQueues {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    queueMode: ").append(toIndentedString(queueMode)).append("\n");
        sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
        sb.append("    maxMsgSizeByte: ").append(toIndentedString(maxMsgSizeByte)).append("\n");
        sb.append("    producedMessages: ").append(toIndentedString(producedMessages)).append("\n");
        sb.append("    redrivePolicy: ").append(toIndentedString(redrivePolicy)).append("\n");
        sb.append("    maxConsumeCount: ").append(toIndentedString(maxConsumeCount)).append("\n");
        sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
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

