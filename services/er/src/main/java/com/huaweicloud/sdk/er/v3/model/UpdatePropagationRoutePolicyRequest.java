package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePropagationRoutePolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table_id")

    private String routeTableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propagation_id")

    private String propagationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePropagationRequestBody body;

    public UpdatePropagationRoutePolicyRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * 企业路由器实例ID
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public UpdatePropagationRoutePolicyRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * 路由表ID
     * @return routeTableId
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public UpdatePropagationRoutePolicyRequest withPropagationId(String propagationId) {
        this.propagationId = propagationId;
        return this;
    }

    /**
     * 传播ID
     * @return propagationId
     */
    public String getPropagationId() {
        return propagationId;
    }

    public void setPropagationId(String propagationId) {
        this.propagationId = propagationId;
    }

    public UpdatePropagationRoutePolicyRequest withBody(UpdatePropagationRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePropagationRoutePolicyRequest withBody(Consumer<UpdatePropagationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePropagationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePropagationRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePropagationRequestBody body) {
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
        UpdatePropagationRoutePolicyRequest that = (UpdatePropagationRoutePolicyRequest) obj;
        return Objects.equals(this.erId, that.erId) && Objects.equals(this.routeTableId, that.routeTableId)
            && Objects.equals(this.propagationId, that.propagationId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, routeTableId, propagationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePropagationRoutePolicyRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    propagationId: ").append(toIndentedString(propagationId)).append("\n");
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
