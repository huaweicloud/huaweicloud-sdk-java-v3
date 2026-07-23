package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCoreIngressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_id")

    private UUID ingressId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateIngressRequestBody body;

    public UpdateCoreIngressRequest withIngressId(UUID ingressId) {
        this.ingressId = ingressId;
        return this;
    }

    /**
     * Ingress ID，用于唯一标识一个Ingress实例。
     * @return ingressId
     */
    public UUID getIngressId() {
        return ingressId;
    }

    public void setIngressId(UUID ingressId) {
        this.ingressId = ingressId;
    }

    public UpdateCoreIngressRequest withBody(UpdateIngressRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCoreIngressRequest withBody(Consumer<UpdateIngressRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateIngressRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateIngressRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateIngressRequestBody body) {
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
        UpdateCoreIngressRequest that = (UpdateCoreIngressRequest) obj;
        return Objects.equals(this.ingressId, that.ingressId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingressId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreIngressRequest {\n");
        sb.append("    ingressId: ").append(toIndentedString(ingressId)).append("\n");
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
