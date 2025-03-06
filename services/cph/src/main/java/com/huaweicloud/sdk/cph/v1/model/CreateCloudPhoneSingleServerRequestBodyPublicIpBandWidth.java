package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机裸服务器使用的带宽信息。
 */
public class CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth {

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

    public CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth withBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
        return this;
    }

    /**
     * 云手机服务器的带宽唯一标识，选共享带宽时必选。
     * @return bandWidthId
     */
    public String getBandWidthId() {
        return bandWidthId;
    }

    public void setBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
    }

    public CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth withBandWidthSize(Integer bandWidthSize) {
        this.bandWidthSize = bandWidthSize;
        return this;
    }

    /**
     * 云手机服务器的带宽大小，选独享带宽时必选。
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

    public CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth withBandWidthChargeMode(
        Integer bandWidthChargeMode) {
        this.bandWidthChargeMode = bandWidthChargeMode;
        return this;
    }

    /**
     * 云手机服务器带宽的计费方式。 0：bandwidth, 按带宽计费 1：traffic, 按流量计费
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

    public CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth withBandWidthShareType(Integer bandWidthShareType) {
        this.bandWidthShareType = bandWidthShareType;
        return this;
    }

    /**
     * 云手机服务器的带宽类型。 0：per，独享带宽 1：whole，共享带宽
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth that =
            (CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth) obj;
        return Objects.equals(this.bandWidthId, that.bandWidthId)
            && Objects.equals(this.bandWidthSize, that.bandWidthSize)
            && Objects.equals(this.bandWidthChargeMode, that.bandWidthChargeMode)
            && Objects.equals(this.bandWidthShareType, that.bandWidthShareType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidthId, bandWidthSize, bandWidthChargeMode, bandWidthShareType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth {\n");
        sb.append("    bandWidthId: ").append(toIndentedString(bandWidthId)).append("\n");
        sb.append("    bandWidthSize: ").append(toIndentedString(bandWidthSize)).append("\n");
        sb.append("    bandWidthChargeMode: ").append(toIndentedString(bandWidthChargeMode)).append("\n");
        sb.append("    bandWidthShareType: ").append(toIndentedString(bandWidthShareType)).append("\n");
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
