package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteRecordSetWithLineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteRSetWithLineReq body;

    public BatchDeleteRecordSetWithLineRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * 所属zone的ID。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public BatchDeleteRecordSetWithLineRequest withBody(BatchDeleteRSetWithLineReq body) {
        this.body = body;
        return this;
    }

    public BatchDeleteRecordSetWithLineRequest withBody(Consumer<BatchDeleteRSetWithLineReq> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteRSetWithLineReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteRSetWithLineReq getBody() {
        return body;
    }

    public void setBody(BatchDeleteRSetWithLineReq body) {
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
        BatchDeleteRecordSetWithLineRequest batchDeleteRecordSetWithLineRequest =
            (BatchDeleteRecordSetWithLineRequest) o;
        return Objects.equals(this.zoneId, batchDeleteRecordSetWithLineRequest.zoneId)
            && Objects.equals(this.body, batchDeleteRecordSetWithLineRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteRecordSetWithLineRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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