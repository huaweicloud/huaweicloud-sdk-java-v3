package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * UpdateTopicQueueEntity
 */
public class UpdateTopicQueueEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker")

    private String broker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_queue_num")

    private BigDecimal readQueueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_queue_num")

    private BigDecimal writeQueueNum;

    public UpdateTopicQueueEntity withBroker(String broker) {
        this.broker = broker;
        return this;
    }

    /**
     * **参数解释**： Broker名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return broker
     */
    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public UpdateTopicQueueEntity withReadQueueNum(BigDecimal readQueueNum) {
        this.readQueueNum = readQueueNum;
        return this;
    }

    /**
     * **参数解释**： 读队列个数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return readQueueNum
     */
    public BigDecimal getReadQueueNum() {
        return readQueueNum;
    }

    public void setReadQueueNum(BigDecimal readQueueNum) {
        this.readQueueNum = readQueueNum;
    }

    public UpdateTopicQueueEntity withWriteQueueNum(BigDecimal writeQueueNum) {
        this.writeQueueNum = writeQueueNum;
        return this;
    }

    /**
     * **参数解释**： 写队列个数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return writeQueueNum
     */
    public BigDecimal getWriteQueueNum() {
        return writeQueueNum;
    }

    public void setWriteQueueNum(BigDecimal writeQueueNum) {
        this.writeQueueNum = writeQueueNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTopicQueueEntity that = (UpdateTopicQueueEntity) obj;
        return Objects.equals(this.broker, that.broker) && Objects.equals(this.readQueueNum, that.readQueueNum)
            && Objects.equals(this.writeQueueNum, that.writeQueueNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(broker, readQueueNum, writeQueueNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicQueueEntity {\n");
        sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
        sb.append("    readQueueNum: ").append(toIndentedString(readQueueNum)).append("\n");
        sb.append("    writeQueueNum: ").append(toIndentedString(writeQueueNum)).append("\n");
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
