package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchSetRecordSetsStatusReq
 */
public class BatchSetRecordSetsStatusReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_ids")

    private List<String> zoneIds = null;

    public BatchSetRecordSetsStatusReq withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 待设置Record Se状态，当前仅支持DISABLE或ENABLE。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BatchSetRecordSetsStatusReq withZoneIds(List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }

    public BatchSetRecordSetsStatusReq addZoneIdsItem(String zoneIdsItem) {
        if (this.zoneIds == null) {
            this.zoneIds = new ArrayList<>();
        }
        this.zoneIds.add(zoneIdsItem);
        return this;
    }

    public BatchSetRecordSetsStatusReq withZoneIds(Consumer<List<String>> zoneIdsSetter) {
        if (this.zoneIds == null) {
            this.zoneIds = new ArrayList<>();
        }
        zoneIdsSetter.accept(this.zoneIds);
        return this;
    }

    /**
     * 待设置Record Set ID列表。 最多支持50个。
     * @return zoneIds
     */
    public List<String> getZoneIds() {
        return zoneIds;
    }

    public void setZoneIds(List<String> zoneIds) {
        this.zoneIds = zoneIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchSetRecordSetsStatusReq batchSetRecordSetsStatusReq = (BatchSetRecordSetsStatusReq) o;
        return Objects.equals(this.status, batchSetRecordSetsStatusReq.status)
            && Objects.equals(this.zoneIds, batchSetRecordSetsStatusReq.zoneIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, zoneIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetRecordSetsStatusReq {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    zoneIds: ").append(toIndentedString(zoneIds)).append("\n");
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
