package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SkuSpecBaseResponseSkuResponses
 */
public class SkuSpecBaseResponseSkuResponses {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbcSkuId")

    private String cbcSkuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calcSpec")

    private String calcSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageSpec")

    private String storageSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specDesc")

    private String specDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandSize")

    private String bandSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargeMode")

    private Integer chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxResolution")

    private String maxResolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poolInfo")

    private SkuSpecBaseResponsePoolInfo poolInfo;

    public SkuSpecBaseResponseSkuResponses withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，枚举：ENTERPRISE, PERSONAL
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SkuSpecBaseResponseSkuResponses withCbcSkuId(String cbcSkuId) {
        this.cbcSkuId = cbcSkuId;
        return this;
    }

    /**
     * 实例的sku_id信息，对应订购的instanceSkuId
     * @return cbcSkuId
     */
    public String getCbcSkuId() {
        return cbcSkuId;
    }

    public void setCbcSkuId(String cbcSkuId) {
        this.cbcSkuId = cbcSkuId;
    }

    public SkuSpecBaseResponseSkuResponses withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规格名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SkuSpecBaseResponseSkuResponses withCalcSpec(String calcSpec) {
        this.calcSpec = calcSpec;
        return this;
    }

    /**
     * CPU|内存规格
     * @return calcSpec
     */
    public String getCalcSpec() {
        return calcSpec;
    }

    public void setCalcSpec(String calcSpec) {
        this.calcSpec = calcSpec;
    }

    public SkuSpecBaseResponseSkuResponses withStorageSpec(String storageSpec) {
        this.storageSpec = storageSpec;
        return this;
    }

    /**
     * 存储规格
     * @return storageSpec
     */
    public String getStorageSpec() {
        return storageSpec;
    }

    public void setStorageSpec(String storageSpec) {
        this.storageSpec = storageSpec;
    }

    public SkuSpecBaseResponseSkuResponses withSpecDesc(String specDesc) {
        this.specDesc = specDesc;
        return this;
    }

    /**
     * 规格描述
     * @return specDesc
     */
    public String getSpecDesc() {
        return specDesc;
    }

    public void setSpecDesc(String specDesc) {
        this.specDesc = specDesc;
    }

    public SkuSpecBaseResponseSkuResponses withBandSize(String bandSize) {
        this.bandSize = bandSize;
        return this;
    }

    /**
     * 该实例对应的带宽大小，返回类型是个字符串，如\"2,4,8\"，表示有三种类型带宽可以选
     * @return bandSize
     */
    public String getBandSize() {
        return bandSize;
    }

    public void setBandSize(String bandSize) {
        this.bandSize = bandSize;
    }

    public SkuSpecBaseResponseSkuResponses withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * '0:包周期 1：按需 2：包周期和按需'
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public SkuSpecBaseResponseSkuResponses withMaxResolution(String maxResolution) {
        this.maxResolution = maxResolution;
        return this;
    }

    /**
     * 最高分辨率
     * @return maxResolution
     */
    public String getMaxResolution() {
        return maxResolution;
    }

    public void setMaxResolution(String maxResolution) {
        this.maxResolution = maxResolution;
    }

    public SkuSpecBaseResponseSkuResponses withPoolInfo(SkuSpecBaseResponsePoolInfo poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }

    public SkuSpecBaseResponseSkuResponses withPoolInfo(Consumer<SkuSpecBaseResponsePoolInfo> poolInfoSetter) {
        if (this.poolInfo == null) {
            this.poolInfo = new SkuSpecBaseResponsePoolInfo();
            poolInfoSetter.accept(this.poolInfo);
        }

        return this;
    }

    /**
     * Get poolInfo
     * @return poolInfo
     */
    public SkuSpecBaseResponsePoolInfo getPoolInfo() {
        return poolInfo;
    }

    public void setPoolInfo(SkuSpecBaseResponsePoolInfo poolInfo) {
        this.poolInfo = poolInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkuSpecBaseResponseSkuResponses that = (SkuSpecBaseResponseSkuResponses) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.cbcSkuId, that.cbcSkuId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.calcSpec, that.calcSpec)
            && Objects.equals(this.storageSpec, that.storageSpec) && Objects.equals(this.specDesc, that.specDesc)
            && Objects.equals(this.bandSize, that.bandSize) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.maxResolution, that.maxResolution) && Objects.equals(this.poolInfo, that.poolInfo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, cbcSkuId, name, calcSpec, storageSpec, specDesc, bandSize, chargeMode, maxResolution, poolInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuSpecBaseResponseSkuResponses {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cbcSkuId: ").append(toIndentedString(cbcSkuId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    calcSpec: ").append(toIndentedString(calcSpec)).append("\n");
        sb.append("    storageSpec: ").append(toIndentedString(storageSpec)).append("\n");
        sb.append("    specDesc: ").append(toIndentedString(specDesc)).append("\n");
        sb.append("    bandSize: ").append(toIndentedString(bandSize)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    maxResolution: ").append(toIndentedString(maxResolution)).append("\n");
        sb.append("    poolInfo: ").append(toIndentedString(poolInfo)).append("\n");
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
