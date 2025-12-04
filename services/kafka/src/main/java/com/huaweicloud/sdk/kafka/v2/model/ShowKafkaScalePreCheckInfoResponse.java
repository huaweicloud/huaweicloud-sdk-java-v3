package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowKafkaScalePreCheckInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<ShowKafkaScalePreCheckInfoResponseBody> body = null;

    public ShowKafkaScalePreCheckInfoResponse withBody(List<ShowKafkaScalePreCheckInfoResponseBody> body) {
        this.body = body;
        return this;
    }

    public ShowKafkaScalePreCheckInfoResponse addBodyItem(ShowKafkaScalePreCheckInfoResponseBody bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ShowKafkaScalePreCheckInfoResponse withBody(
        Consumer<List<ShowKafkaScalePreCheckInfoResponseBody>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<ShowKafkaScalePreCheckInfoResponseBody> getBody() {
        return body;
    }

    public void setBody(List<ShowKafkaScalePreCheckInfoResponseBody> body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKafkaScalePreCheckInfoResponse that = (ShowKafkaScalePreCheckInfoResponse) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKafkaScalePreCheckInfoResponse {\n");
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
