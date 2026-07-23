package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateCoreIngressNetworkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_id")

    private UUID ingressId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateCoreIngressNetworkRequestBody body;

    public CreateCoreIngressNetworkRequest withIngressId(UUID ingressId) {
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

    public CreateCoreIngressNetworkRequest withBody(CreateCoreIngressNetworkRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateCoreIngressNetworkRequest withBody(Consumer<CreateCoreIngressNetworkRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateCoreIngressNetworkRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateCoreIngressNetworkRequestBody getBody() {
        return body;
    }

    public void setBody(CreateCoreIngressNetworkRequestBody body) {
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
        CreateCoreIngressNetworkRequest that = (CreateCoreIngressNetworkRequest) obj;
        return Objects.equals(this.ingressId, that.ingressId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingressId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreIngressNetworkRequest {\n");
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
