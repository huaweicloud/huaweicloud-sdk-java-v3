package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： RocketMQ元数据迁移，RocketMQ Topic元数据。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class MigrationRocketMqTopicConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private Boolean order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perm")

    private Integer perm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_queue_nums")

    private Integer readQueueNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_queue_nums")

    private Integer writeQueueNums;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_filter_type")

    private String topicFilterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_sys_flag")

    private Integer topicSysFlag;

    public MigrationRocketMqTopicConfig withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * **参数解释**： Topic名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public MigrationRocketMqTopicConfig withOrder(Boolean order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释**： 是否有序消息。 **约束限制**： 不涉及。 **取值范围**： - true：有序消息。 - false：无序消息。 **默认取值**： false。
     * @return order
     */
    public Boolean getOrder() {
        return order;
    }

    public void setOrder(Boolean order) {
        this.order = order;
    }

    public MigrationRocketMqTopicConfig withPerm(Integer perm) {
        this.perm = perm;
        return this;
    }

    /**
     * **参数解释**： Topic权限。 **约束限制**： 不涉及。 **取值范围**： - PUB：拥有发布权限。 - SUB：拥有订阅权限。 - PUB|SUB：拥有发布订阅权限。 - DENY：无权限。 **默认取值**： 6。
     * @return perm
     */
    public Integer getPerm() {
        return perm;
    }

    public void setPerm(Integer perm) {
        this.perm = perm;
    }

    public MigrationRocketMqTopicConfig withReadQueueNums(Integer readQueueNums) {
        this.readQueueNums = readQueueNums;
        return this;
    }

    /**
     * **参数解释**： 读队列个数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 16。
     * @return readQueueNums
     */
    public Integer getReadQueueNums() {
        return readQueueNums;
    }

    public void setReadQueueNums(Integer readQueueNums) {
        this.readQueueNums = readQueueNums;
    }

    public MigrationRocketMqTopicConfig withWriteQueueNums(Integer writeQueueNums) {
        this.writeQueueNums = writeQueueNums;
        return this;
    }

    /**
     * **参数解释**： 写队列个数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 16。
     * @return writeQueueNums
     */
    public Integer getWriteQueueNums() {
        return writeQueueNums;
    }

    public void setWriteQueueNums(Integer writeQueueNums) {
        this.writeQueueNums = writeQueueNums;
    }

    public MigrationRocketMqTopicConfig withTopicFilterType(String topicFilterType) {
        this.topicFilterType = topicFilterType;
        return this;
    }

    /**
     * **参数解释**： Topic过滤类型。 **约束限制**： 不涉及。 **取值范围**： - SINGLE_TAG：单标签   - MULTI_TAG：多标签 **默认取值**： 不涉及。
     * @return topicFilterType
     */
    public String getTopicFilterType() {
        return topicFilterType;
    }

    public void setTopicFilterType(String topicFilterType) {
        this.topicFilterType = topicFilterType;
    }

    public MigrationRocketMqTopicConfig withTopicSysFlag(Integer topicSysFlag) {
        this.topicSysFlag = topicSysFlag;
        return this;
    }

    /**
     * **参数解释**： Topic系统标志位。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 0。
     * @return topicSysFlag
     */
    public Integer getTopicSysFlag() {
        return topicSysFlag;
    }

    public void setTopicSysFlag(Integer topicSysFlag) {
        this.topicSysFlag = topicSysFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrationRocketMqTopicConfig that = (MigrationRocketMqTopicConfig) obj;
        return Objects.equals(this.topicName, that.topicName) && Objects.equals(this.order, that.order)
            && Objects.equals(this.perm, that.perm) && Objects.equals(this.readQueueNums, that.readQueueNums)
            && Objects.equals(this.writeQueueNums, that.writeQueueNums)
            && Objects.equals(this.topicFilterType, that.topicFilterType)
            && Objects.equals(this.topicSysFlag, that.topicSysFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicName, order, perm, readQueueNums, writeQueueNums, topicFilterType, topicSysFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationRocketMqTopicConfig {\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
        sb.append("    readQueueNums: ").append(toIndentedString(readQueueNums)).append("\n");
        sb.append("    writeQueueNums: ").append(toIndentedString(writeQueueNums)).append("\n");
        sb.append("    topicFilterType: ").append(toIndentedString(topicFilterType)).append("\n");
        sb.append("    topicSysFlag: ").append(toIndentedString(topicSysFlag)).append("\n");
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
