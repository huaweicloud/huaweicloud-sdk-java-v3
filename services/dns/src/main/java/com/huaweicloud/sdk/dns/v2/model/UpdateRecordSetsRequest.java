package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRecordSetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordset_id")

    private String recordsetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRecordSetsReq body;

    public UpdateRecordSetsRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * 域名ID。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public UpdateRecordSetsRequest withRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
        return this;
    }

    /**
     * 记录集ID。
     * @return recordsetId
     */
    public String getRecordsetId() {
        return recordsetId;
    }

    public void setRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
    }

    public UpdateRecordSetsRequest withBody(UpdateRecordSetsReq body) {
        this.body = body;
        return this;
    }

    public UpdateRecordSetsRequest withBody(Consumer<UpdateRecordSetsReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRecordSetsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateRecordSetsReq getBody() {
        return body;
    }

    public void setBody(UpdateRecordSetsReq body) {
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
        UpdateRecordSetsRequest that = (UpdateRecordSetsRequest) obj;
        return Objects.equals(this.zoneId, that.zoneId) && Objects.equals(this.recordsetId, that.recordsetId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, recordsetId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecordSetsRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
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
