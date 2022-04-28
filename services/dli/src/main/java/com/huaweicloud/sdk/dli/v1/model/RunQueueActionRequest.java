package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RunQueueActionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RunQueueActionReq body;

    public RunQueueActionRequest withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * Get queueName
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public RunQueueActionRequest withBody(RunQueueActionReq body) {
        this.body = body;
        return this;
    }

    public RunQueueActionRequest withBody(Consumer<RunQueueActionReq> bodySetter) {
        if (this.body == null) {
            this.body = new RunQueueActionReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RunQueueActionReq getBody() {
        return body;
    }

    public void setBody(RunQueueActionReq body) {
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
        RunQueueActionRequest runQueueActionRequest = (RunQueueActionRequest) o;
        return Objects.equals(this.queueName, runQueueActionRequest.queueName)
            && Objects.equals(this.body, runQueueActionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunQueueActionRequest {\n");
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
