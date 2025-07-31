package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteRecordSetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordset_id")

    private String recordsetId;

    public DeleteRecordSetsRequest withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * **参数解释：** 域名ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public DeleteRecordSetsRequest withRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
        return this;
    }

    /**
     * **参数解释：** 记录集ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return recordsetId
     */
    public String getRecordsetId() {
        return recordsetId;
    }

    public void setRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteRecordSetsRequest that = (DeleteRecordSetsRequest) obj;
        return Objects.equals(this.zoneId, that.zoneId) && Objects.equals(this.recordsetId, that.recordsetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, recordsetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRecordSetsRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    recordsetId: ").append(toIndentedString(recordsetId)).append("\n");
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
