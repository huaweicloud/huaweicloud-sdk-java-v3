package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TopicBrokers
 */
public class TopicBrokers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_name")

    private String brokerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_queue_num")

    private BigDecimal readQueueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_queue_num")

    private BigDecimal writeQueueNum;

    public TopicBrokers withBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }

    /**
     * **参数解释**： 代理名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return brokerName
     */
    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public TopicBrokers withReadQueueNum(BigDecimal readQueueNum) {
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

    public TopicBrokers withWriteQueueNum(BigDecimal writeQueueNum) {
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
        TopicBrokers that = (TopicBrokers) obj;
        return Objects.equals(this.brokerName, that.brokerName) && Objects.equals(this.readQueueNum, that.readQueueNum)
            && Objects.equals(this.writeQueueNum, that.writeQueueNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brokerName, readQueueNum, writeQueueNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopicBrokers {\n");
        sb.append("    brokerName: ").append(toIndentedString(brokerName)).append("\n");
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
