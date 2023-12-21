package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 租户需求
 */
public class Demand {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demand_count")

    private Integer demandCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_type")

    private String bandwidthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id_v6")

    private String poolIdV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth_enable")

    private Boolean ipv6BandwidthEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth_type")

    private String ipv6BandwidthType;

    public Demand withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 所属运营商。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Demand withDemandCount(Integer demandCount) {
        this.demandCount = demandCount;
        return this;
    }

    /**
     * 站点需要发放的资源(组)总数。  > 实际发放实例数量为count*demand_count。
     * minimum: 1
     * maximum: 10
     * @return demandCount
     */
    public Integer getDemandCount() {
        return demandCount;
    }

    public void setDemandCount(Integer demandCount) {
        this.demandCount = demandCount;
    }

    public Demand withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 线路ID。 多线路场景下，将在该线路下创建弹性公网IP。 > 覆盖规则为省级/大区时不支持指定线路ID创建边缘业务。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public Demand withBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }

    /**
     * 带宽类型。 如果当前带宽类型下没有带宽，自动在该带宽类型下创建带宽
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return bandwidthType;
    }

    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    public Demand withPoolIdV6(String poolIdV6) {
        this.poolIdV6 = poolIdV6;
        return this;
    }

    /**
     * 指定IPv6线路，使用该线路下的子网分配IPv6端口。 如果该线路下没有关联启用IPv6的子网，则创建新的子网。
     * @return poolIdV6
     */
    public String getPoolIdV6() {
        return poolIdV6;
    }

    public void setPoolIdV6(String poolIdV6) {
        this.poolIdV6 = poolIdV6;
    }

    public Demand withIpv6BandwidthEnable(Boolean ipv6BandwidthEnable) {
        this.ipv6BandwidthEnable = ipv6BandwidthEnable;
        return this;
    }

    /**
     * 使用IPv6带宽。 边缘实例是否开启IPv6公网访问能力。如果该IPv6线路没有可用的带宽，则创建新的带宽。
     * @return ipv6BandwidthEnable
     */
    public Boolean getIpv6BandwidthEnable() {
        return ipv6BandwidthEnable;
    }

    public void setIpv6BandwidthEnable(Boolean ipv6BandwidthEnable) {
        this.ipv6BandwidthEnable = ipv6BandwidthEnable;
    }

    public Demand withIpv6BandwidthType(String ipv6BandwidthType) {
        this.ipv6BandwidthType = ipv6BandwidthType;
        return this;
    }

    /**
     * 带宽类型。  边缘实例开启IPv6访问公网能力后，如果当前带宽类型下没有带宽，自动在该带宽类型下创建带宽    
     * @return ipv6BandwidthType
     */
    public String getIpv6BandwidthType() {
        return ipv6BandwidthType;
    }

    public void setIpv6BandwidthType(String ipv6BandwidthType) {
        this.ipv6BandwidthType = ipv6BandwidthType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Demand that = (Demand) obj;
        return Objects.equals(this.operator, that.operator) && Objects.equals(this.demandCount, that.demandCount)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.bandwidthType, that.bandwidthType)
            && Objects.equals(this.poolIdV6, that.poolIdV6)
            && Objects.equals(this.ipv6BandwidthEnable, that.ipv6BandwidthEnable)
            && Objects.equals(this.ipv6BandwidthType, that.ipv6BandwidthType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(operator, demandCount, poolId, bandwidthType, poolIdV6, ipv6BandwidthEnable, ipv6BandwidthType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Demand {\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    demandCount: ").append(toIndentedString(demandCount)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    bandwidthType: ").append(toIndentedString(bandwidthType)).append("\n");
        sb.append("    poolIdV6: ").append(toIndentedString(poolIdV6)).append("\n");
        sb.append("    ipv6BandwidthEnable: ").append(toIndentedString(ipv6BandwidthEnable)).append("\n");
        sb.append("    ipv6BandwidthType: ").append(toIndentedString(ipv6BandwidthType)).append("\n");
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
