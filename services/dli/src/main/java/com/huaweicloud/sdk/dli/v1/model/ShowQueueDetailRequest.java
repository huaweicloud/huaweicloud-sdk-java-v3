package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowQueueDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_type")

    @JacksonXmlProperty(localName = "queue_type")

    private String queueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    @JacksonXmlProperty(localName = "queue_name")

    private String queueName;

    public ShowQueueDetailRequest withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * 队列的类型,。有如下三种类型： sql general all 如果不指定，默认为sql。
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public ShowQueueDetailRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 指定查询的队列名称。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQueueDetailRequest showQueueDetailRequest = (ShowQueueDetailRequest) o;
        return Objects.equals(this.queueType, showQueueDetailRequest.queueType)
            && Objects.equals(this.queueName, showQueueDetailRequest.queueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueType, queueName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQueueDetailRequest {\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
