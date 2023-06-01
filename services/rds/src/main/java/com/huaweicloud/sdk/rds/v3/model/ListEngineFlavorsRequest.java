package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEngineFlavorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_ids")

    private String availabilityZoneIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private String haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code_like")

    private String specCodeLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_category_type")

    private String flavorCategoryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_rha_flavor")

    private Boolean isRhaFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListEngineFlavorsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListEngineFlavorsRequest withAvailabilityZoneIds(String availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    /**
     * 可用区，多个用\",\"分割，如cn-southwest-244a,cn-southwest-244b
     * @return availabilityZoneIds
     */
    public String getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(String availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }

    public ListEngineFlavorsRequest withHaMode(String haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * 模式，包括如下类型： ha：主备实例。 replica：只读实例。 single：单实例。
     * @return haMode
     */
    public String getHaMode() {
        return haMode;
    }

    public void setHaMode(String haMode) {
        this.haMode = haMode;
    }

    public ListEngineFlavorsRequest withSpecCodeLike(String specCodeLike) {
        this.specCodeLike = specCodeLike;
        return this;
    }

    /**
     * 性能规格,如rds.dec.pg.s1.medium，模糊匹配该规格类型
     * @return specCodeLike
     */
    public String getSpecCodeLike() {
        return specCodeLike;
    }

    public void setSpecCodeLike(String specCodeLike) {
        this.specCodeLike = specCodeLike;
    }

    public ListEngineFlavorsRequest withFlavorCategoryType(String flavorCategoryType) {
        this.flavorCategoryType = flavorCategoryType;
        return this;
    }

    /**
     * 规格类型，包括如下类型：simple、dec
     * @return flavorCategoryType
     */
    public String getFlavorCategoryType() {
        return flavorCategoryType;
    }

    public void setFlavorCategoryType(String flavorCategoryType) {
        this.flavorCategoryType = flavorCategoryType;
    }

    public ListEngineFlavorsRequest withIsRhaFlavor(Boolean isRhaFlavor) {
        this.isRhaFlavor = isRhaFlavor;
        return this;
    }

    /**
     * 是否显示高可用只读类型
     * @return isRhaFlavor
     */
    public Boolean getIsRhaFlavor() {
        return isRhaFlavor;
    }

    public void setIsRhaFlavor(Boolean isRhaFlavor) {
        this.isRhaFlavor = isRhaFlavor;
    }

    public ListEngineFlavorsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。 从第一条数据偏移offset条数据后开始查询，默认为0。 取值必须为数字，且不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEngineFlavorsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询个数上限值。 取值范围：1~100。 不传该参数时，默认查询前100条信息。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEngineFlavorsRequest listEngineFlavorsRequest = (ListEngineFlavorsRequest) o;
        return Objects.equals(this.instanceId, listEngineFlavorsRequest.instanceId)
            && Objects.equals(this.availabilityZoneIds, listEngineFlavorsRequest.availabilityZoneIds)
            && Objects.equals(this.haMode, listEngineFlavorsRequest.haMode)
            && Objects.equals(this.specCodeLike, listEngineFlavorsRequest.specCodeLike)
            && Objects.equals(this.flavorCategoryType, listEngineFlavorsRequest.flavorCategoryType)
            && Objects.equals(this.isRhaFlavor, listEngineFlavorsRequest.isRhaFlavor)
            && Objects.equals(this.offset, listEngineFlavorsRequest.offset)
            && Objects.equals(this.limit, listEngineFlavorsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            availabilityZoneIds,
            haMode,
            specCodeLike,
            flavorCategoryType,
            isRhaFlavor,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEngineFlavorsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    specCodeLike: ").append(toIndentedString(specCodeLike)).append("\n");
        sb.append("    flavorCategoryType: ").append(toIndentedString(flavorCategoryType)).append("\n");
        sb.append("    isRhaFlavor: ").append(toIndentedString(isRhaFlavor)).append("\n");
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
