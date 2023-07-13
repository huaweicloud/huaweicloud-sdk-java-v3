package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DisassociateHealthCheckRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordset_id")

    private String recordsetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssociateHealthCheckReq body;

    public DisassociateHealthCheckRequest withRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
        return this;
    }

    /**
     * Record Set关联健康检查。
     * @return recordsetId
     */
    public String getRecordsetId() {
        return recordsetId;
    }

    public void setRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
    }

    public DisassociateHealthCheckRequest withBody(AssociateHealthCheckReq body) {
        this.body = body;
        return this;
    }

    public DisassociateHealthCheckRequest withBody(Consumer<AssociateHealthCheckReq> bodySetter) {
        if (this.body == null) {
            this.body = new AssociateHealthCheckReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AssociateHealthCheckReq getBody() {
        return body;
    }

    public void setBody(AssociateHealthCheckReq body) {
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
        DisassociateHealthCheckRequest that = (DisassociateHealthCheckRequest) obj;
        return Objects.equals(this.recordsetId, that.recordsetId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordsetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateHealthCheckRequest {\n");
        sb.append("    recordsetId: ").append(toIndentedString(recordsetId)).append("\n");
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
