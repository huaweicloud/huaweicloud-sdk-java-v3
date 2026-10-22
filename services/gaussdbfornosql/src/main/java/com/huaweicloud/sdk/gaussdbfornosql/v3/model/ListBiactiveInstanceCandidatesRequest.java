package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListBiactiveInstanceCandidatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_region_code")

    private String targetRegionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_name")

    private String targetInstanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sync_mode")

    private String dataSyncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListBiactiveInstanceCandidatesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释：** 实例ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListBiactiveInstanceCandidatesRequest withTargetRegionCode(String targetRegionCode) {
        this.targetRegionCode = targetRegionCode;
        return this;
    }

    /**
     * **参数解释：** 目标Region的编码。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return targetRegionCode
     */
    public String getTargetRegionCode() {
        return targetRegionCode;
    }

    public void setTargetRegionCode(String targetRegionCode) {
        this.targetRegionCode = targetRegionCode;
    }

    public ListBiactiveInstanceCandidatesRequest withTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
        return this;
    }

    /**
     * **参数解释：** 按目标实例名称过滤。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return targetInstanceName
     */
    public String getTargetInstanceName() {
        return targetInstanceName;
    }

    public void setTargetInstanceName(String targetInstanceName) {
        this.targetInstanceName = targetInstanceName;
    }

    public ListBiactiveInstanceCandidatesRequest withDataSyncMode(String dataSyncMode) {
        this.dataSyncMode = dataSyncMode;
        return this;
    }

    /**
     * **参数解释：** 数据同步模式。 **约束限制：** 不涉及。 **取值范围：** - TABLE：表级数据同步模式。 **默认取值：** 不传该参数时表示实例级数据同步模式。
     * @return dataSyncMode
     */
    public String getDataSyncMode() {
        return dataSyncMode;
    }

    public void setDataSyncMode(String dataSyncMode) {
        this.dataSyncMode = dataSyncMode;
    }

    public ListBiactiveInstanceCandidatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 索引位置偏移量，表示从最新一条记录开始偏移offset条数据后查询。 **约束限制：** 取值大于或等于0。 **取值范围：** 不涉及。 **默认取值：** 不传该参数时，查询偏移量默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListBiactiveInstanceCandidatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 查询实例个数上限值。 **约束限制：** 不涉及。 **取值范围：** 1~100。 **默认取值：** 不传该参数时，默认查询前100条实例信息。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBiactiveInstanceCandidatesRequest that = (ListBiactiveInstanceCandidatesRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.targetRegionCode, that.targetRegionCode)
            && Objects.equals(this.targetInstanceName, that.targetInstanceName)
            && Objects.equals(this.dataSyncMode, that.dataSyncMode) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, targetRegionCode, targetInstanceName, dataSyncMode, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBiactiveInstanceCandidatesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    targetRegionCode: ").append(toIndentedString(targetRegionCode)).append("\n");
        sb.append("    targetInstanceName: ").append(toIndentedString(targetInstanceName)).append("\n");
        sb.append("    dataSyncMode: ").append(toIndentedString(dataSyncMode)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
