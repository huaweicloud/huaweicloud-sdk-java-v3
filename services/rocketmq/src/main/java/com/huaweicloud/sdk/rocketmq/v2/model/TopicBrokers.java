package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TopicBrokers
 */
public class TopicBrokers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "broker_name")

    @JacksonXmlProperty(localName = "broker_name")

    private String brokerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_queue_num")

    @JacksonXmlProperty(localName = "read_queue_num")

    private BigDecimal readQueueNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_queue_num")

    @JacksonXmlProperty(localName = "write_queue_num")

    private BigDecimal writeQueueNum;

    public TopicBrokers withBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }

    /**
     * 代理名称。
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
     * 读队列个数。
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
     * 写队列个数。
     * @return writeQueueNum
     */
    public BigDecimal getWriteQueueNum() {
        return writeQueueNum;
    }

    public void setWriteQueueNum(BigDecimal writeQueueNum) {
        this.writeQueueNum = writeQueueNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopicBrokers topicBrokers = (TopicBrokers) o;
        return Objects.equals(this.brokerName, topicBrokers.brokerName)
            && Objects.equals(this.readQueueNum, topicBrokers.readQueueNum)
            && Objects.equals(this.writeQueueNum, topicBrokers.writeQueueNum);
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
