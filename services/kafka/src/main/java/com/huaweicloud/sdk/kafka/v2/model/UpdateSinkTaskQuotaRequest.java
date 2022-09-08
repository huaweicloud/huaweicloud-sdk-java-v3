package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSinkTaskQuotaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateSinkTaskQuotaReq body;

    public UpdateSinkTaskQuotaRequest withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 实例转储ID。 请参考[实例生命周期][查询实例]接口返回的数据。
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public UpdateSinkTaskQuotaRequest withBody(UpdateSinkTaskQuotaReq body) {
        this.body = body;
        return this;
    }

    public UpdateSinkTaskQuotaRequest withBody(Consumer<UpdateSinkTaskQuotaReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateSinkTaskQuotaReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateSinkTaskQuotaReq getBody() {
        return body;
    }

    public void setBody(UpdateSinkTaskQuotaReq body) {
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
        UpdateSinkTaskQuotaRequest updateSinkTaskQuotaRequest = (UpdateSinkTaskQuotaRequest) o;
        return Objects.equals(this.connectorId, updateSinkTaskQuotaRequest.connectorId)
            && Objects.equals(this.body, updateSinkTaskQuotaRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectorId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSinkTaskQuotaRequest {\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
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
