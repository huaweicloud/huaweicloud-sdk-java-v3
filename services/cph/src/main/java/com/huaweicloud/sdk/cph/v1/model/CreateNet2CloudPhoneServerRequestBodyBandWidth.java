package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机使用的带宽信息
 */
public class CreateNet2CloudPhoneServerRequestBodyBandWidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_share_type")

    private Integer bandWidthShareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_size")

    private Integer bandWidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width_id")

    private String bandWidthId;

    public CreateNet2CloudPhoneServerRequestBodyBandWidth withBandWidthShareType(Integer bandWidthShareType) {
        this.bandWidthShareType = bandWidthShareType;
        return this;
    }

    /**
     * 带宽类型 - 0 表示独享带宽 - 1 表示共享带宽
     * @return bandWidthShareType
     */
    public Integer getBandWidthShareType() {
        return bandWidthShareType;
    }

    public void setBandWidthShareType(Integer bandWidthShareType) {
        this.bandWidthShareType = bandWidthShareType;
    }

    public CreateNet2CloudPhoneServerRequestBodyBandWidth withBandWidthSize(Integer bandWidthSize) {
        this.bandWidthSize = bandWidthSize;
        return this;
    }

    /**
     * 功能说明：带宽大小  带宽（Mbit/s），取值范围为[1,2000]。  调整带宽时的最小单位会根据带宽范围不同存在差异。  小于等于300Mbit/s：默认最小单位为1Mbit/s。 300Mbit/s~1000Mbit/s：默认最小单位为50Mbit/s。 大于1000Mbit/s：默认最小单位为500Mbit/s。 说明：  如果share_type是独享带宽，该参数必选项；如果share_type是共享带宽并且id有值，该参数会忽略
     * @return bandWidthSize
     */
    public Integer getBandWidthSize() {
        return bandWidthSize;
    }

    public void setBandWidthSize(Integer bandWidthSize) {
        this.bandWidthSize = bandWidthSize;
    }

    public CreateNet2CloudPhoneServerRequestBodyBandWidth withBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
        return this;
    }

    /**
     * 带宽ID，创建共享带宽类型带宽的弹性IP时可以指定之前的共享带宽创建。  取值范围：共享带宽类型的带宽ID。  说明：  当创建共享带宽类型的带宽时，该字段必选
     * @return bandWidthId
     */
    public String getBandWidthId() {
        return bandWidthId;
    }

    public void setBandWidthId(String bandWidthId) {
        this.bandWidthId = bandWidthId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNet2CloudPhoneServerRequestBodyBandWidth createNet2CloudPhoneServerRequestBodyBandWidth =
            (CreateNet2CloudPhoneServerRequestBodyBandWidth) o;
        return Objects.equals(this.bandWidthShareType,
            createNet2CloudPhoneServerRequestBodyBandWidth.bandWidthShareType)
            && Objects.equals(this.bandWidthSize, createNet2CloudPhoneServerRequestBodyBandWidth.bandWidthSize)
            && Objects.equals(this.bandWidthId, createNet2CloudPhoneServerRequestBodyBandWidth.bandWidthId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidthShareType, bandWidthSize, bandWidthId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNet2CloudPhoneServerRequestBodyBandWidth {\n");
        sb.append("    bandWidthShareType: ").append(toIndentedString(bandWidthShareType)).append("\n");
        sb.append("    bandWidthSize: ").append(toIndentedString(bandWidthSize)).append("\n");
        sb.append("    bandWidthId: ").append(toIndentedString(bandWidthId)).append("\n");
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
