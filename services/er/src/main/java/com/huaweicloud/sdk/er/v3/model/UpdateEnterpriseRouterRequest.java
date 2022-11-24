package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEnterpriseRouterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateEnterpriseRouterRequestBody body;

    public UpdateEnterpriseRouterRequest withErId(String erId) {
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

    public UpdateEnterpriseRouterRequest withBody(UpdateEnterpriseRouterRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateEnterpriseRouterRequest withBody(Consumer<UpdateEnterpriseRouterRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateEnterpriseRouterRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateEnterpriseRouterRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateEnterpriseRouterRequestBody body) {
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
        UpdateEnterpriseRouterRequest updateEnterpriseRouterRequest = (UpdateEnterpriseRouterRequest) o;
        return Objects.equals(this.erId, updateEnterpriseRouterRequest.erId)
            && Objects.equals(this.body, updateEnterpriseRouterRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEnterpriseRouterRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
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
