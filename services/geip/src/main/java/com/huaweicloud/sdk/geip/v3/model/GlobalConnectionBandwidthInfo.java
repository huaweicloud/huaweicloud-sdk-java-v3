package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GlobalConnectionBandwidthInfo
 */
public class GlobalConnectionBandwidthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcb_id")

    private String gcbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcb_type")

    private String gcbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state")

    private String adminState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_level")

    private String slaLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dscp")

    private Integer dscp;

    public GlobalConnectionBandwidthInfo withGcbId(String gcbId) {
        this.gcbId = gcbId;
        return this;
    }

    /**
     * 骨干带宽id
     * @return gcbId
     */
    public String getGcbId() {
        return gcbId;
    }

    public void setGcbId(String gcbId) {
        this.gcbId = gcbId;
    }

    public GlobalConnectionBandwidthInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 骨干带宽大小
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public GlobalConnectionBandwidthInfo withGcbType(String gcbType) {
        this.gcbType = gcbType;
        return this;
    }

    /**
     * 骨干带宽类型（城域、区域和大区）
     * @return gcbType
     */
    public String getGcbType() {
        return gcbType;
    }

    public void setGcbType(String gcbType) {
        this.gcbType = gcbType;
    }

    public GlobalConnectionBandwidthInfo withAdminState(String adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * 骨干带宽状态，取值：NORMAL 正常、FREEZED 冻结
     * @return adminState
     */
    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }

    public GlobalConnectionBandwidthInfo withSlaLevel(String slaLevel) {
        this.slaLevel = slaLevel;
        return this;
    }

    /**
     * 网络服务等级。Pt - 铂金，Au - 金牌，Ag - 银牌，Cu - 铜牌
     * @return slaLevel
     */
    public String getSlaLevel() {
        return slaLevel;
    }

    public void setSlaLevel(String slaLevel) {
        this.slaLevel = slaLevel;
    }

    public GlobalConnectionBandwidthInfo withDscp(Integer dscp) {
        this.dscp = dscp;
        return this;
    }

    /**
     * 线路质量金银铜对应的DSCP值
     * @return dscp
     */
    public Integer getDscp() {
        return dscp;
    }

    public void setDscp(Integer dscp) {
        this.dscp = dscp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalConnectionBandwidthInfo that = (GlobalConnectionBandwidthInfo) obj;
        return Objects.equals(this.gcbId, that.gcbId) && Objects.equals(this.size, that.size)
            && Objects.equals(this.gcbType, that.gcbType) && Objects.equals(this.adminState, that.adminState)
            && Objects.equals(this.slaLevel, that.slaLevel) && Objects.equals(this.dscp, that.dscp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gcbId, size, gcbType, adminState, slaLevel, dscp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalConnectionBandwidthInfo {\n");
        sb.append("    gcbId: ").append(toIndentedString(gcbId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    gcbType: ").append(toIndentedString(gcbType)).append("\n");
        sb.append("    adminState: ").append(toIndentedString(adminState)).append("\n");
        sb.append("    slaLevel: ").append(toIndentedString(slaLevel)).append("\n");
        sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
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
