package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 绑定队列的请求body体。
 */
public class AssociateConnectionQueueReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    @JacksonXmlProperty(localName = "queues")

    private List<String> queues = null;

    public AssociateConnectionQueueReq withQueues(List<String> queues) {
        this.queues = queues;
        return this;
    }

    public AssociateConnectionQueueReq addQueuesItem(String queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public AssociateConnectionQueueReq withQueues(Consumer<List<String>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * 需要使用跨源的队列名列表。
     * @return queues
     */
    public List<String> getQueues() {
        return queues;
    }

    public void setQueues(List<String> queues) {
        this.queues = queues;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateConnectionQueueReq associateConnectionQueueReq = (AssociateConnectionQueueReq) o;
        return Objects.equals(this.queues, associateConnectionQueueReq.queues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateConnectionQueueReq {\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
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
