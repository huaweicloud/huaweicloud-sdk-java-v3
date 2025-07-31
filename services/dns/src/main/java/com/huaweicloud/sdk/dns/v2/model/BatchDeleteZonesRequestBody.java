package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteZonesRequestBody
 */
public class BatchDeleteZonesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_type")

    private String zoneType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_ids")

    private List<String> zoneIds = null;

    public BatchDeleteZonesRequestBody withZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }

    /**
     * **参数解释：** 待删除域名的类型。 **约束限制：** 不涉及。 **取值范围：** - public：公网域名 - private：内网域名  **默认取值：** 不涉及。
     * @return zoneType
     */
    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public BatchDeleteZonesRequestBody withZoneIds(List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }

    public BatchDeleteZonesRequestBody addZoneIdsItem(String zoneIdsItem) {
        if (this.zoneIds == null) {
            this.zoneIds = new ArrayList<>();
        }
        this.zoneIds.add(zoneIdsItem);
        return this;
    }

    public BatchDeleteZonesRequestBody withZoneIds(Consumer<List<String>> zoneIdsSetter) {
        if (this.zoneIds == null) {
            this.zoneIds = new ArrayList<>();
        }
        zoneIdsSetter.accept(this.zoneIds);
        return this;
    }

    /**
     * **参数解释：** 待删除域名ID列表。 **约束限制：** 最多支持50个。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return zoneIds
     */
    public List<String> getZoneIds() {
        return zoneIds;
    }

    public void setZoneIds(List<String> zoneIds) {
        this.zoneIds = zoneIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteZonesRequestBody that = (BatchDeleteZonesRequestBody) obj;
        return Objects.equals(this.zoneType, that.zoneType) && Objects.equals(this.zoneIds, that.zoneIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneType, zoneIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteZonesRequestBody {\n");
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
