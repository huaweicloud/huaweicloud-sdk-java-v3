package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 消费组信息 */
public class ListQueueGroupsRespGroups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "produced_messages")

    private Integer producedMessages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumed_messages")

    private Integer consumedMessages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_messages")

    private Integer availableMessages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "produced_deadletters")

    private Integer producedDeadletters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_deadletters")

    private Integer availableDeadletters;

    public ListQueueGroupsRespGroups withId(String id) {
        this.id = id;
        return this;
    }

    /** 队列的名称。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListQueueGroupsRespGroups withName(String name) {
        this.name = name;
        return this;
    }

    /** 队列的名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListQueueGroupsRespGroups withProducedMessages(Integer producedMessages) {
        this.producedMessages = producedMessages;
        return this;
    }

    /** 队列的消息总数，不包含过期删除的消息数。
     * 
     * @return producedMessages */
    public Integer getProducedMessages() {
        return producedMessages;
    }

    public void setProducedMessages(Integer producedMessages) {
        this.producedMessages = producedMessages;
    }

    public ListQueueGroupsRespGroups withConsumedMessages(Integer consumedMessages) {
        this.consumedMessages = consumedMessages;
        return this;
    }

    /** 已正常消费的消息总数。
     * 
     * @return consumedMessages */
    public Integer getConsumedMessages() {
        return consumedMessages;
    }

    public void setConsumedMessages(Integer consumedMessages) {
        this.consumedMessages = consumedMessages;
    }

    public ListQueueGroupsRespGroups withAvailableMessages(Integer availableMessages) {
        this.availableMessages = availableMessages;
        return this;
    }

    /** 该消费组可以消费的普通消息数。
     * 
     * @return availableMessages */
    public Integer getAvailableMessages() {
        return availableMessages;
    }

    public void setAvailableMessages(Integer availableMessages) {
        this.availableMessages = availableMessages;
    }

    public ListQueueGroupsRespGroups withProducedDeadletters(Integer producedDeadletters) {
        this.producedDeadletters = producedDeadletters;
        return this;
    }

    /** 该消费组产生的死信息消息总数。仅当include_deadletter为true时，才有该响应参数。
     * 
     * @return producedDeadletters */
    public Integer getProducedDeadletters() {
        return producedDeadletters;
    }

    public void setProducedDeadletters(Integer producedDeadletters) {
        this.producedDeadletters = producedDeadletters;
    }

    public ListQueueGroupsRespGroups withAvailableDeadletters(Integer availableDeadletters) {
        this.availableDeadletters = availableDeadletters;
        return this;
    }

    /** 该消费组未消费的死信消息数。仅当include_deadletter为true时，才有该响应参数。
     * 
     * @return availableDeadletters */
    public Integer getAvailableDeadletters() {
        return availableDeadletters;
    }

    public void setAvailableDeadletters(Integer availableDeadletters) {
        this.availableDeadletters = availableDeadletters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQueueGroupsRespGroups listQueueGroupsRespGroups = (ListQueueGroupsRespGroups) o;
        return Objects.equals(this.id, listQueueGroupsRespGroups.id)
            && Objects.equals(this.name, listQueueGroupsRespGroups.name)
            && Objects.equals(this.producedMessages, listQueueGroupsRespGroups.producedMessages)
            && Objects.equals(this.consumedMessages, listQueueGroupsRespGroups.consumedMessages)
            && Objects.equals(this.availableMessages, listQueueGroupsRespGroups.availableMessages)
            && Objects.equals(this.producedDeadletters, listQueueGroupsRespGroups.producedDeadletters)
            && Objects.equals(this.availableDeadletters, listQueueGroupsRespGroups.availableDeadletters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            producedMessages,
            consumedMessages,
            availableMessages,
            producedDeadletters,
            availableDeadletters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueueGroupsRespGroups {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    producedMessages: ").append(toIndentedString(producedMessages)).append("\n");
        sb.append("    consumedMessages: ").append(toIndentedString(consumedMessages)).append("\n");
        sb.append("    availableMessages: ").append(toIndentedString(availableMessages)).append("\n");
        sb.append("    producedDeadletters: ").append(toIndentedString(producedDeadletters)).append("\n");
        sb.append("    availableDeadletters: ").append(toIndentedString(availableDeadletters)).append("\n");
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
