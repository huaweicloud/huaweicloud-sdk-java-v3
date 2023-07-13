package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class NeutronUpdateRouterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router_id")

    private String routerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NeutronUpdateRouterRequestBody body;

    public NeutronUpdateRouterRequest withRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }

    /**
     * 路由器ID
     * @return routerId
     */
    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public NeutronUpdateRouterRequest withBody(NeutronUpdateRouterRequestBody body) {
        this.body = body;
        return this;
    }

    public NeutronUpdateRouterRequest withBody(Consumer<NeutronUpdateRouterRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new NeutronUpdateRouterRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public NeutronUpdateRouterRequestBody getBody() {
        return body;
    }

    public void setBody(NeutronUpdateRouterRequestBody body) {
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
        NeutronUpdateRouterRequest that = (NeutronUpdateRouterRequest) obj;
        return Objects.equals(this.routerId, that.routerId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routerId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateRouterRequest {\n");
        sb.append("    routerId: ").append(toIndentedString(routerId)).append("\n");
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
