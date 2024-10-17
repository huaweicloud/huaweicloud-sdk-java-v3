package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新中心网络连接信息。 * 带宽类型：按照带宽包分配、按照流量计费（当前版本暂不支持，预留后续支持按流量计费模式）、测试带宽类型 * 带宽包ID：按照带宽包分配必填，其他类型不填； * 带宽取值：按照带宽包分配和按照流量计费必填，代表限速带宽，按照带宽包分配下不能超过带宽包大小，测试带宽类型不填；
 */
public class UpdateCentralNetworkConnection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private BandwidthTypeEnum bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_connection_bandwidth_id")

    private String globalConnectionBandwidthId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_size")

    private Long bandwidthSize;

    public UpdateCentralNetworkConnection withBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /**
     * Get bandwidthType
     * @return bandwidthType
     */
    public BandwidthTypeEnum getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(BandwidthTypeEnum bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    public UpdateCentralNetworkConnection withGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
        return this;
    }

    /**
     * 全域互联带宽ID。
     * @return globalConnectionBandwidthId
     */
    public String getGlobalConnectionBandwidthId() {
        return globalConnectionBandwidthId;
    }

    public void setGlobalConnectionBandwidthId(String globalConnectionBandwidthId) {
        this.globalConnectionBandwidthId = globalConnectionBandwidthId;
    }

    public UpdateCentralNetworkConnection withBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
        return this;
    }

    /**
     * 带宽值，单位Mbps。
     * minimum: 1
     * maximum: 999999
     * @return bandwidthSize
     */
    public Long getBandwidthSize() {
        return bandwidthSize;
    }

    public void setBandwidthSize(Long bandwidthSize) {
        this.bandwidthSize = bandwidthSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCentralNetworkConnection that = (UpdateCentralNetworkConnection) obj;
        return Objects.equals(this.bandwidthType, that.bandwidthType)
            && Objects.equals(this.globalConnectionBandwidthId, that.globalConnectionBandwidthId)
            && Objects.equals(this.bandwidthSize, that.bandwidthSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthType, globalConnectionBandwidthId, bandwidthSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCentralNetworkConnection {\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    globalConnectionBandwidthId: ")
            .append(toIndentedString(globalConnectionBandwidthId))
            .append("\n");
        sb.append("    bandwidthSize: ").append(toIndentedString(bandwidthSize)).append("\n");
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
