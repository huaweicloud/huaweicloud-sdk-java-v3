package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteZonesReq
 */
public class DeleteZonesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_type")

    private String zoneType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_ids")

    private List<String> zoneIds = null;

    public DeleteZonesReq withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    /**
     * 待删除zone类型，当前仅支持 public 或 private
     * @return zoneType
     */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public DeleteZonesReq withZoneIds(List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }

    public DeleteZonesReq addZoneIdsItem(String zoneIdsItem) {
        if (this.zoneIds == null) {
            this.zoneIds = new ArrayList<>();
        }
        this.zoneIds.add(zoneIdsItem);
        return this;
    }

    public DeleteZonesReq withZoneIds(Consumer<List<String>> zoneIdsSetter) {
        if (this.zoneIds == null) {
            this.zoneIds = new ArrayList<>();
        }
        zoneIdsSetter.accept(this.zoneIds);
        return this;
    }

    /**
     * 待删除Zone ID。
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
        DeleteZonesReq deleteZonesReq = (DeleteZonesReq) o;
        return Objects.equals(this.zoneType, deleteZonesReq.zoneType)
            && Objects.equals(this.zoneIds, deleteZonesReq.zoneIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneType, zoneIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteZonesReq {\n");
        sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
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
