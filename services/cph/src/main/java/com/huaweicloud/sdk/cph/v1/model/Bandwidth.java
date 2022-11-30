package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 带宽信息响应
 */
public class Bandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_name")

    private String bandWidthName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_id")

    private String bandWidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_size")

    private Integer bandWidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_charge_mode")

    private Integer bandWidthChargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_share_type")

    private Integer bandWidthShareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public Bandwidth withBandWidthName(String bandWidthName) {
        this.bandWidthName = bandWidthName;
        return this;
    }

    /**
     * 云手机服务器的带宽名称
     * @return bandWidthName
     */
    public String getBandWidthName() {
        return bandWidthName;
    }

    public void setBandWidthName(String bandWidthName) {
        this.bandWidthName = bandWidthName;
    }

    public Bandwidth withBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
        return this;
    }

    /**
     * 云手机服务器的带宽唯一标识
     * @return bandWidthId
     */
    public String getBandWidthId() {
        return bandWidthId;
    }

    public void setBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
    }

    public Bandwidth withBandWidthSize(Integer bandWidthSize) {
        this.bandWidthSize = bandWidthSize;
        return this;
    }

    /**
     * 云手机服务器的带宽大小
     * minimum: 0
     * maximum: 8096
     * @return bandWidthSize
     */
    public Integer getBandWidthSize() {
        return bandWidthSize;
    }

    public void setBandWidthSize(Integer bandWidthSize) {
        this.bandWidthSize = bandWidthSize;
    }

    public Bandwidth withBandWidthChargeMode(Integer bandWidthChargeMode) {
        this.bandWidthChargeMode = bandWidthChargeMode;
        return this;
    }

    /**
     * 云手机服务器带宽的计费方式  取值范围：  - 0，bandwidth, 按带宽计费  - 1，traffic, 按流量计费
     * minimum: -128
     * maximum: 128
     * @return bandWidthChargeMode
     */
    public Integer getBandWidthChargeMode() {
        return bandWidthChargeMode;
    }

    public void setBandWidthChargeMode(Integer bandWidthChargeMode) {
        this.bandWidthChargeMode = bandWidthChargeMode;
    }

    public Bandwidth withBandWidthShareType(Integer bandWidthShareType) {
        this.bandWidthShareType = bandWidthShareType;
        return this;
    }

    /**
     * 云手机服务器的带宽类型  - 0，per，独享带宽 - 1，whole，共享带宽
     * minimum: -128
     * maximum: 128
     * @return bandWidthShareType
     */
    public Integer getBandWidthShareType() {
        return bandWidthShareType;
    }

    public void setBandWidthShareType(Integer bandWidthShareType) {
        this.bandWidthShareType = bandWidthShareType;
    }

    public Bandwidth withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 带宽创建时间  时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Bandwidth withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 带宽更新时间  时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bandwidth bandwidth = (Bandwidth) o;
        return Objects.equals(this.bandWidthName, bandwidth.bandWidthName)
            && Objects.equals(this.bandWidthId, bandwidth.bandWidthId)
            && Objects.equals(this.bandWidthSize, bandwidth.bandWidthSize)
            && Objects.equals(this.bandWidthChargeMode, bandwidth.bandWidthChargeMode)
            && Objects.equals(this.bandWidthShareType, bandwidth.bandWidthShareType)
            && Objects.equals(this.createTime, bandwidth.createTime)
            && Objects.equals(this.updateTime, bandwidth.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidthName,
            bandWidthId,
            bandWidthSize,
            bandWidthChargeMode,
            bandWidthShareType,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bandwidth {\n");
        sb.append("    bandWidthName: ").append(toIndentedString(bandWidthName)).append("\n");
        sb.append("    bandWidthId: ").append(toIndentedString(bandWidthId)).append("\n");
        sb.append("    bandWidthSize: ").append(toIndentedString(bandWidthSize)).append("\n");
        sb.append("    bandWidthChargeMode: ").append(toIndentedString(bandWidthChargeMode)).append("\n");
        sb.append("    bandWidthShareType: ").append(toIndentedString(bandWidthShareType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
