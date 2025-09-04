package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateAppServersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Linked-Id")

    private String xLinkedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Service-Transaction-Id")

    private String serviceTransactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateAppServerReq body;

    public CreateAppServersRequest withXLinkedId(String xLinkedId) {
        this.xLinkedId = xLinkedId;
        return this;
    }

    /**
     * 交易组件调用时下发的关联ID。
     * @return xLinkedId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Linked-Id")
    public String getXLinkedId() {
        return xLinkedId;
    }

    public void setXLinkedId(String xLinkedId) {
        this.xLinkedId = xLinkedId;
    }

    public CreateAppServersRequest withServiceTransactionId(String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
        return this;
    }

    /**
     * CBC接口回调时，请求头里带上的业务ID 包周期场景必填 按需场景无。
     * @return serviceTransactionId
     */
    public String getServiceTransactionId() {
        return serviceTransactionId;
    }

    public void setServiceTransactionId(String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
    }

    public CreateAppServersRequest withBody(CreateAppServerReq body) {
        this.body = body;
        return this;
    }

    public CreateAppServersRequest withBody(Consumer<CreateAppServerReq> bodySetter) {
        if (this.body == null) {
            this.body = new CreateAppServerReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateAppServerReq getBody() {
        return body;
    }

    public void setBody(CreateAppServerReq body) {
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
        CreateAppServersRequest that = (CreateAppServersRequest) obj;
        return Objects.equals(this.xLinkedId, that.xLinkedId)
            && Objects.equals(this.serviceTransactionId, that.serviceTransactionId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLinkedId, serviceTransactionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppServersRequest {\n");
        sb.append("    xLinkedId: ").append(toIndentedString(xLinkedId)).append("\n");
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
