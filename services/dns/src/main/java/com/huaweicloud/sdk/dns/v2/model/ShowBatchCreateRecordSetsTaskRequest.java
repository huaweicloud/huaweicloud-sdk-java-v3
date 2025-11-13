package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBatchCreateRecordSetsTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_item_limit")

    private Integer errorItemLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_item_offset")

    private Integer errorItemOffset;

    public ShowBatchCreateRecordSetsTaskRequest withZoneId(String zoneId) {
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

    public ShowBatchCreateRecordSetsTaskRequest withErrorItemLimit(Integer errorItemLimit) {
        this.errorItemLimit = errorItemLimit;
        return this;
    }

    /**
     * **参数解释：** 分页查询时配置每页返回的失败条目个数。 **约束限制：** 不涉及。 **取值范围：** 0~2000。 **默认取值：** 2000
     * minimum: 0
     * maximum: 2000
     * @return errorItemLimit
     */
    public Integer getErrorItemLimit() {
        return errorItemLimit;
    }

    public void setErrorItemLimit(Integer errorItemLimit) {
        this.errorItemLimit = errorItemLimit;
    }

    public ShowBatchCreateRecordSetsTaskRequest withErrorItemOffset(Integer errorItemOffset) {
        this.errorItemOffset = errorItemOffset;
        return this;
    }

    /**
     * **参数解释：** 分页查询起始偏移量，表示从偏移量的下一个失败条目开始查询。 **约束限制：** 不涉及。 **取值范围：** 0~2000。 **默认取值：** 0
     * minimum: 0
     * maximum: 2000
     * @return errorItemOffset
     */
    public Integer getErrorItemOffset() {
        return errorItemOffset;
    }

    public void setErrorItemOffset(Integer errorItemOffset) {
        this.errorItemOffset = errorItemOffset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBatchCreateRecordSetsTaskRequest that = (ShowBatchCreateRecordSetsTaskRequest) obj;
        return Objects.equals(this.zoneId, that.zoneId) && Objects.equals(this.errorItemLimit, that.errorItemLimit)
            && Objects.equals(this.errorItemOffset, that.errorItemOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, errorItemLimit, errorItemOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchCreateRecordSetsTaskRequest {\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    errorItemLimit: ").append(toIndentedString(errorItemLimit)).append("\n");
        sb.append("    errorItemOffset: ").append(toIndentedString(errorItemOffset)).append("\n");
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
