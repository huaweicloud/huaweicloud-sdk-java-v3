package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机使用的带宽信息。独占带宽按流量计费，共享带宽可选择带宽大小
 */
public class CreateCloudPhoneServerRequestBodyBandWidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_id")

    private String bandWidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_share_type")

    private Integer bandWidthShareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_size")

    private Integer bandWidthSize;

    public CreateCloudPhoneServerRequestBodyBandWidth withBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
        return this;
    }

    /**
     * 共享带宽ID，优先用该参数为云手机绑定带宽
     * @return bandWidthId
     */
    public String getBandWidthId() {
        return bandWidthId;
    }

    public void setBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
    }

    public CreateCloudPhoneServerRequestBodyBandWidth withBandWidthShareType(Integer bandWidthShareType) {
        this.bandWidthShareType = bandWidthShareType;
        return this;
    }

    /**
     * band_width_id不存在时必选 - 0 表示独享带宽 - 1 表示共享带宽
     * @return bandWidthShareType
     */
    public Integer getBandWidthShareType() {
        return bandWidthShareType;
    }

    public void setBandWidthShareType(Integer bandWidthShareType) {
        this.bandWidthShareType = bandWidthShareType;
    }

    public CreateCloudPhoneServerRequestBodyBandWidth withBandWidthSize(Integer bandWidthSize) {
        this.bandWidthSize = bandWidthSize;
        return this;
    }

    /**
     * 当band_width_share_type为共享带宽时必选 共享带宽默认取值范围5Mbit/s~2000Mbit/s 独享带宽的默认带宽是300Mbit/s
     * @return bandWidthSize
     */
    public Integer getBandWidthSize() {
        return bandWidthSize;
    }

    public void setBandWidthSize(Integer bandWidthSize) {
        this.bandWidthSize = bandWidthSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCloudPhoneServerRequestBodyBandWidth createCloudPhoneServerRequestBodyBandWidth =
            (CreateCloudPhoneServerRequestBodyBandWidth) o;
        return Objects.equals(this.bandWidthId, createCloudPhoneServerRequestBodyBandWidth.bandWidthId)
            && Objects.equals(this.bandWidthShareType, createCloudPhoneServerRequestBodyBandWidth.bandWidthShareType)
            && Objects.equals(this.bandWidthSize, createCloudPhoneServerRequestBodyBandWidth.bandWidthSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidthId, bandWidthShareType, bandWidthSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPhoneServerRequestBodyBandWidth {\n");
        sb.append("    bandWidthId: ").append(toIndentedString(bandWidthId)).append("\n");
        sb.append("    bandWidthShareType: ").append(toIndentedString(bandWidthShareType)).append("\n");
        sb.append("    bandWidthSize: ").append(toIndentedString(bandWidthSize)).append("\n");
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
