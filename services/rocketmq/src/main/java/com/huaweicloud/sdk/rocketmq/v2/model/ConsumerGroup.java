package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConsumerGroup
 */
public class ConsumerGroup {

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
    @JsonProperty(value = "group_desc")

    private String groupDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_max_time")

    private Integer retryMaxTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdAt")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<String> permissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_orderly")

    private Boolean consumeOrderly;

    public ConsumerGroup withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**： 是否可以消费。 **取值范围**： - true：可以消费。 - false：不可以消费。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ConsumerGroup withBroadcast(Boolean broadcast) {
        this.broadcast = broadcast;
        return this;
    }

    /**
     * **参数解释**： 是否广播。 **取值范围**： - true：可以广播。 - false：不可以广播。
     * @return broadcast
     */
    public Boolean getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Boolean broadcast) {
        this.broadcast = broadcast;
    }

    public ConsumerGroup withBrokers(List<String> brokers) {
        this.brokers = brokers;
        return this;
    }

    public ConsumerGroup addBrokersItem(String brokersItem) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        this.brokers.add(brokersItem);
        return this;
    }

    public ConsumerGroup withBrokers(Consumer<List<String>> brokersSetter) {
        if (this.brokers == null) {
            this.brokers = new ArrayList<>();
        }
        brokersSetter.accept(this.brokers);
        return this;
    }

    /**
     * **参数解释**： 关联的代理列表。
     * @return brokers
     */
    public List<String> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<String> brokers) {
        this.brokers = brokers;
    }

    public ConsumerGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 消费组名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConsumerGroup withGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }

    /**
     * **参数解释**： 消费组描述。 **取值范围**： 不涉及。
     * @return groupDesc
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public ConsumerGroup withRetryMaxTime(Integer retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
        return this;
    }

    /**
     * **参数解释**： 最大重试次数。 **取值范围**： 1~16。
     * @return retryMaxTime
     */
    public Integer getRetryMaxTime() {
        return retryMaxTime;
    }

    public void setRetryMaxTime(Integer retryMaxTime) {
        this.retryMaxTime = retryMaxTime;
    }

    public ConsumerGroup withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**： 创建时间戳。 **取值范围**： 不涉及。
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public ConsumerGroup withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public ConsumerGroup addPermissionsItem(String permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public ConsumerGroup withPermissions(Consumer<List<String>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /**
     * **参数解释**： 权限集。
     * @return permissions
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public ConsumerGroup withConsumeOrderly(Boolean consumeOrderly) {
        this.consumeOrderly = consumeOrderly;
        return this;
    }

    /**
     * **参数解释**： 是否按顺序消费。 **取值范围**： - true：按顺序消费。 - false：不按顺序消费。
     * @return consumeOrderly
     */
    public Boolean getConsumeOrderly() {
        return consumeOrderly;
    }

    public void setConsumeOrderly(Boolean consumeOrderly) {
        this.consumeOrderly = consumeOrderly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumerGroup that = (ConsumerGroup) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.broadcast, that.broadcast)
            && Objects.equals(this.brokers, that.brokers) && Objects.equals(this.name, that.name)
            && Objects.equals(this.groupDesc, that.groupDesc) && Objects.equals(this.retryMaxTime, that.retryMaxTime)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.permissions, that.permissions)
            && Objects.equals(this.consumeOrderly, that.consumeOrderly);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enabled, broadcast, brokers, name, groupDesc, retryMaxTime, createdAt, permissions, consumeOrderly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumerGroup {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
        sb.append("    brokers: ").append(toIndentedString(brokers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupDesc: ").append(toIndentedString(groupDesc)).append("\n");
        sb.append("    retryMaxTime: ").append(toIndentedString(retryMaxTime)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    consumeOrderly: ").append(toIndentedString(consumeOrderly)).append("\n");
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
