package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ApplyDesktopsInternetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Service-Transaction-Id")

    private String serviceTransactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ApplyDesktopsInternetReq body;

    public ApplyDesktopsInternetRequest withServiceTransactionId(String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
        return this;
    }

    /**
     * CBC接口回调时，请求头里带上的业务ID
     * @return serviceTransactionId
     */
    public String getServiceTransactionId() {
        return serviceTransactionId;
    }

    public void setServiceTransactionId(String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
    }

    public ApplyDesktopsInternetRequest withBody(ApplyDesktopsInternetReq body) {
        this.body = body;
        return this;
    }

    public ApplyDesktopsInternetRequest withBody(Consumer<ApplyDesktopsInternetReq> bodySetter) {
        if (this.body == null) {
            this.body = new ApplyDesktopsInternetReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ApplyDesktopsInternetReq getBody() {
        return body;
    }

    public void setBody(ApplyDesktopsInternetReq body) {
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
        ApplyDesktopsInternetRequest that = (ApplyDesktopsInternetRequest) obj;
        return Objects.equals(this.serviceTransactionId, that.serviceTransactionId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceTransactionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyDesktopsInternetRequest {\n");
        sb.append("    serviceTransactionId: ").append(toIndentedString(serviceTransactionId)).append("\n");
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
