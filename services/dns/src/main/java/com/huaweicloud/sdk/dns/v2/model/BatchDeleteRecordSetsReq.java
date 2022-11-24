package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteRecordSetsReq
 */
public class BatchDeleteRecordSetsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_type")

    private String zoneType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordset_ids")

    private List<String> recordsetIds = null;

    public BatchDeleteRecordSetsReq withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    /**
     * Zone的类型，取值为public或private。
     * @return zoneType
     */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public BatchDeleteRecordSetsReq withRecordsetIds(List<String> recordsetIds) {
        this.recordsetIds = recordsetIds;
        return this;
    }

    public BatchDeleteRecordSetsReq addRecordsetIdsItem(String recordsetIdsItem) {
        if (this.recordsetIds == null) {
            this.recordsetIds = new ArrayList<>();
        }
        this.recordsetIds.add(recordsetIdsItem);
        return this;
    }

    public BatchDeleteRecordSetsReq withRecordsetIds(Consumer<List<String>> recordsetIdsSetter) {
        if (this.recordsetIds == null) {
            this.recordsetIds = new ArrayList<>();
        }
        recordsetIdsSetter.accept(this.recordsetIds);
        return this;
    }

    /**
     * 待删除的Record Set ID列表。 最多支持100个。
     * @return recordsetIds
     */
    public List<String> getRecordsetIds() {
        return recordsetIds;
    }

    public void setRecordsetIds(List<String> recordsetIds) {
        this.recordsetIds = recordsetIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteRecordSetsReq batchDeleteRecordSetsReq = (BatchDeleteRecordSetsReq) o;
        return Objects.equals(this.zoneType, batchDeleteRecordSetsReq.zoneType)
            && Objects.equals(this.recordsetIds, batchDeleteRecordSetsReq.recordsetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneType, recordsetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteRecordSetsReq {\n");
        sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
        sb.append("    recordsetIds: ").append(toIndentedString(recordsetIds)).append("\n");
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
