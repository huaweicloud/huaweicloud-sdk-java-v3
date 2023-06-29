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
    @JsonProperty(value = "band_width_size")

    private Integer bandWidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_share_type")

    private Integer bandWidthShareType;

    public CreateCloudPhoneServerRequestBodyBandWidth withBandWidthId(String bandWidthId) {
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

    public CreateCloudPhoneServerRequestBodyBandWidth withBandWidthSize(Integer bandWidthSize) {
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

    public CreateCloudPhoneServerRequestBodyBandWidth withBandWidthShareType(Integer bandWidthShareType) {
        this.bandWidthShareType = bandWidthShareType;
        return this;
    }

    /**
     * 云手机服务器的带宽类型  - 0，per，独享带宽 - 1，whole，共享带宽
     * minimum: 0
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
        CreateCloudPhoneServerRequestBodyBandWidth that = (CreateCloudPhoneServerRequestBodyBandWidth) obj;
        return Objects.equals(this.bandWidthId, that.bandWidthId)
            && Objects.equals(this.bandWidthSize, that.bandWidthSize)
            && Objects.equals(this.bandWidthShareType, that.bandWidthShareType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidthId, bandWidthSize, bandWidthShareType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPhoneServerRequestBodyBandWidth {\n");
        sb.append("    bandWidthId: ").append(toIndentedString(bandWidthId)).append("\n");
        sb.append("    bandWidthSize: ").append(toIndentedString(bandWidthSize)).append("\n");
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
