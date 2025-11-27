package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 公网ip
 */
public class PublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Integer bandwidthSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_share_type")

    private String bandwidthShareType;

    public PublicIp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 弹性公网IP类型，默认为5_bgp。 详细类型请参考EIP服务API文档中“查询弹性公网IP详情”部分，查看响应参数的中type字段描述
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PublicIp withBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽大小，单位：Mbit/s。 调整带宽时的最小单位会根据带宽范围不同存在差异。 小于等于300Mbit/s，默认最小单位为1Mbit/s。300Mbit/s~1000Mbit/s，默认最小单位为50Mbit/s。大于1000Mbit/s：默认最小单位为500Mbit/s。
     * minimum: 1
     * maximum: 2000
     * @return bandwidthSize
     */
    public Integer getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Integer bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    public PublicIp withBandwidthShareType(String bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
        return this;
    }

    /**
     * 带宽共享类型（长文本信息，非枚举数据，来源于EIP服务） 详细类型请参考EIP服务API文档中“查询弹性公网IP详情”部分，查看响应参数的中bandwidth_share_type字段描述
     * @return bandwidthShareType
     */
    public String getBandwidthShareType() {
        return bandwidthShareType;
    }

    public void setBandwidthShareType(String bandwidthShareType) {
        this.bandwidthShareType = bandwidthShareType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicIp that = (PublicIp) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.bandwidthSize, that.bandwidthSize)
            && Objects.equals(this.bandwidthShareType, that.bandwidthShareType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, bandwidthSize, bandwidthShareType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
        sb.append("    bandwidthShareType: ").append(toIndentedString(bandwidthShareType)).append("\n");
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
