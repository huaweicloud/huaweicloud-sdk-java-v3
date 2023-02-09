package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规格信息
 */
public class Spec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stride")

    private Integer stride;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_stride_num")

    private Integer minStrideNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_stride_num")

    private Integer maxStrideNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_measure_id")

    private Integer usageMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_factor")

    private String usageFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stride_num_whitelist")

    private List<Integer> strideNumWhitelist = null;

    public Spec withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public Spec withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源编码
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Spec withStride(Integer stride) {
        this.stride = stride;
        return this;
    }

    /**
     * 步长
     * @return stride
     */
    public Integer getStride() {
        return stride;
    }

    public void setStride(Integer stride) {
        this.stride = stride;
    }

    public Spec withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Spec withMinStrideNum(Integer minStrideNum) {
        this.minStrideNum = minStrideNum;
        return this;
    }

    /**
     * 最小步数
     * @return minStrideNum
     */
    public Integer getMinStrideNum() {
        return minStrideNum;
    }

    public void setMinStrideNum(Integer minStrideNum) {
        this.minStrideNum = minStrideNum;
    }

    public Spec withMaxStrideNum(Integer maxStrideNum) {
        this.maxStrideNum = maxStrideNum;
        return this;
    }

    /**
     * 最大步数
     * @return maxStrideNum
     */
    public Integer getMaxStrideNum() {
        return maxStrideNum;
    }

    public void setMaxStrideNum(Integer maxStrideNum) {
        this.maxStrideNum = maxStrideNum;
    }

    public Spec withUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
        return this;
    }

    /**
     * 使用量单位标识
     * @return usageMeasureId
     */
    public Integer getUsageMeasureId() {
        return usageMeasureId;
    }

    public void setUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
    }

    public Spec withUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
        return this;
    }

    /**
     * 使用量因子
     * @return usageFactor
     */
    public String getUsageFactor() {
        return usageFactor;
    }

    public void setUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
    }

    public Spec withStrideNumWhitelist(List<Integer> strideNumWhitelist) {
        this.strideNumWhitelist = strideNumWhitelist;
        return this;
    }

    public Spec addStrideNumWhitelistItem(Integer strideNumWhitelistItem) {
        if (this.strideNumWhitelist == null) {
            this.strideNumWhitelist = new ArrayList<>();
        }
        this.strideNumWhitelist.add(strideNumWhitelistItem);
        return this;
    }

    public Spec withStrideNumWhitelist(Consumer<List<Integer>> strideNumWhitelistSetter) {
        if (this.strideNumWhitelist == null) {
            this.strideNumWhitelist = new ArrayList<>();
        }
        strideNumWhitelistSetter.accept(this.strideNumWhitelist);
        return this;
    }

    /**
     * 步数白名单，返回时，步数必须是白名单中的值
     * @return strideNumWhitelist
     */
    public List<Integer> getStrideNumWhitelist() {
        return strideNumWhitelist;
    }

    public void setStrideNumWhitelist(List<Integer> strideNumWhitelist) {
        this.strideNumWhitelist = strideNumWhitelist;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Spec spec = (Spec) o;
        return Objects.equals(this.specCode, spec.specCode) && Objects.equals(this.resourceType, spec.resourceType)
            && Objects.equals(this.stride, spec.stride) && Objects.equals(this.unit, spec.unit)
            && Objects.equals(this.minStrideNum, spec.minStrideNum)
            && Objects.equals(this.maxStrideNum, spec.maxStrideNum)
            && Objects.equals(this.usageMeasureId, spec.usageMeasureId)
            && Objects.equals(this.usageFactor, spec.usageFactor)
            && Objects.equals(this.strideNumWhitelist, spec.strideNumWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode,
            resourceType,
            stride,
            unit,
            minStrideNum,
            maxStrideNum,
            usageMeasureId,
            usageFactor,
            strideNumWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Spec {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    stride: ").append(toIndentedString(stride)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    minStrideNum: ").append(toIndentedString(minStrideNum)).append("\n");
        sb.append("    maxStrideNum: ").append(toIndentedString(maxStrideNum)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
        sb.append("    usageFactor: ").append(toIndentedString(usageFactor)).append("\n");
        sb.append("    strideNumWhitelist: ").append(toIndentedString(strideNumWhitelist)).append("\n");
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
