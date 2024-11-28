package com.huaweicloud.sdk.codeartsinspector.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePurchaseOrderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCbcOrderRequestBody body;

    public UpdatePurchaseOrderRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * servicename,购买vss服务时使用\"webscan\"
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public UpdatePurchaseOrderRequest withBody(UpdateCbcOrderRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePurchaseOrderRequest withBody(Consumer<UpdateCbcOrderRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCbcOrderRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCbcOrderRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCbcOrderRequestBody body) {
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
        UpdatePurchaseOrderRequest that = (UpdatePurchaseOrderRequest) obj;
        return Objects.equals(this.service, that.service) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePurchaseOrderRequest {\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
