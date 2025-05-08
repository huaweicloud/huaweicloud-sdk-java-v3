package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchUpdateConsumerGroup
 */
public class BatchUpdateConsumerGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broadcast")

    private Boolean broadcast;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_max_time")

    private Integer retryMaxTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_orderly")

    private Boolean consumeOrderly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_desc")

    private String groupDesc;

    public BatchUpdateConsumerGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消费组名称，只能由英文字母、数字、百分号、竖线、中划线、下划线组成，长度3~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchUpdateConsumerGroup withBroadcast(Boolean broadcast) {
        this.broadcast = broadcast;
        return this;
    }

    /**
     * 是否广播。
     * @return broadcast
     */
    public Boolean getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Boolean broadcast) {
        this.broadcast = broadcast;
    }

    public BatchUpdateConsumerGroup withRetryMaxTime(Integer retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
        return this;
    }

    /**
     * 最大重试次数，取值范围为1~16。
     * @return retryMaxTime
     */
    public Integer getRetryMaxTime() {
        return retryMaxTime;
    }

    public void setRetryMaxTime(Integer retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
    }

    public BatchUpdateConsumerGroup withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否可以消费。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public BatchUpdateConsumerGroup withConsumeOrderly(Boolean consumeOrderly) {
        this.consumeOrderly = consumeOrderly;
        return this;
    }

    /**
     * 是否按顺序消费（仅RocketMQ实例5.x版本需要填写此参数）。
     * @return consumeOrderly
     */
    public Boolean getConsumeOrderly() {
        return consumeOrderly;
    }

    public void setConsumeOrderly(Boolean consumeOrderly) {
        this.consumeOrderly = consumeOrderly;
    }

    public BatchUpdateConsumerGroup withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * 消费组描述，长度0~200个字符。
     * @return groupDesc
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateConsumerGroup that = (BatchUpdateConsumerGroup) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.broadcast, that.broadcast)
            && Objects.equals(this.retryMaxTime, that.retryMaxTime) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.consumeOrderly, that.consumeOrderly)
            && Objects.equals(this.groupDesc, that.groupDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, broadcast, retryMaxTime, enabled, consumeOrderly, groupDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateConsumerGroup {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
        sb.append("    retryMaxTime: ").append(toIndentedString(retryMaxTime)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    consumeOrderly: ").append(toIndentedString(consumeOrderly)).append("\n");
        sb.append("    groupDesc: ").append(toIndentedString(groupDesc)).append("\n");
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
