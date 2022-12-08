package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateConsumerGroupOrBatchDeleteConsumerGroupReq
 */
public class CreateConsumerGroupOrBatchDeleteConsumerGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<String> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broadcast")

    private Boolean broadcast;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brokers")

    private List<String> brokers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_max_time")

    private BigDecimal retryMaxTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_beginning")

    private Boolean fromBeginning;

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq addGroupsItem(String groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq withGroups(Consumer<List<String>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 待删除的消费组列表。
     * @return groups
     */
    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq withEnabled(Boolean enabled) {
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

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq withBroadcast(Boolean broadcast) {
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

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq withBrokers(List<String> brokers) {
        this.brokers = brokers;
        return this;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq addBrokersItem(String brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq withBrokers(Consumer<List<String>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * 关联的代理列表。
     * @return brokers
     */
    public List<String> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<String> brokers) {
        this.brokers = brokers;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消费组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq withRetryMaxTime(BigDecimal retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
        return this;
    }

    /**
     * 最大重试次数。
     * @return retryMaxTime
     */
    public BigDecimal getRetryMaxTime() {
        return retryMaxTime;
    }

    public void setRetryMaxTime(BigDecimal retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
    }

    public CreateConsumerGroupOrBatchDeleteConsumerGroupReq withFromBeginning(Boolean fromBeginning) {
        this.fromBeginning = fromBeginning;
        return this;
    }

    /**
     * 是否重头消费。
     * @return fromBeginning
     */
    public Boolean getFromBeginning() {
        return fromBeginning;
    }

    public void setFromBeginning(Boolean fromBeginning) {
        this.fromBeginning = fromBeginning;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConsumerGroupOrBatchDeleteConsumerGroupReq createConsumerGroupOrBatchDeleteConsumerGroupReq =
            (CreateConsumerGroupOrBatchDeleteConsumerGroupReq) o;
        return Objects.equals(this.groups, createConsumerGroupOrBatchDeleteConsumerGroupReq.groups)
            && Objects.equals(this.enabled, createConsumerGroupOrBatchDeleteConsumerGroupReq.enabled)
            && Objects.equals(this.broadcast, createConsumerGroupOrBatchDeleteConsumerGroupReq.broadcast)
            && Objects.equals(this.brokers, createConsumerGroupOrBatchDeleteConsumerGroupReq.brokers)
            && Objects.equals(this.name, createConsumerGroupOrBatchDeleteConsumerGroupReq.name)
            && Objects.equals(this.retryMaxTime, createConsumerGroupOrBatchDeleteConsumerGroupReq.retryMaxTime)
            && Objects.equals(this.fromBeginning, createConsumerGroupOrBatchDeleteConsumerGroupReq.fromBeginning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups, enabled, broadcast, brokers, name, retryMaxTime, fromBeginning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConsumerGroupOrBatchDeleteConsumerGroupReq {\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    retryMaxTime: ").append(toIndentedString(retryMaxTime)).append("\n");
        sb.append("    fromBeginning: ").append(toIndentedString(fromBeginning)).append("\n");
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
