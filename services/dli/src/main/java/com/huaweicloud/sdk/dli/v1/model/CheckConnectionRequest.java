package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CheckConnectionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private VerityConnectivityReq body;

    public CheckConnectionRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public CheckConnectionRequest withBody(VerityConnectivityReq body) {
        this.body = body;
        return this;
    }

    public CheckConnectionRequest withBody(Consumer<VerityConnectivityReq> bodySetter) {
        if (this.body == null) {
            this.body = new VerityConnectivityReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public VerityConnectivityReq getBody() {
        return body;
    }

    public void setBody(VerityConnectivityReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckConnectionRequest checkConnectionRequest = (CheckConnectionRequest) o;
        return Objects.equals(this.queueName, checkConnectionRequest.queueName)
            && Objects.equals(this.body, checkConnectionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckConnectionRequest {\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
