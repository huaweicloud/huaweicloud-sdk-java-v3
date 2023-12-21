package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 租户需求
 */
public class DemandResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demand_count")

    private Integer demandCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id_v6")

    private String poolIdV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_bandwidth_enable")

    private Boolean ipv6BandwidthEnable;

    public DemandResp withDemandCount(Integer demandCount) {
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

    public DemandResp withPoolIdV6(String poolIdV6) {
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

    public DemandResp withIpv6BandwidthEnable(Boolean ipv6BandwidthEnable) {
        this.ipv6BandwidthEnable = ipv6BandwidthEnable;
        return this;
    }

    /**
     * 使用IPv6带宽。 边缘实例是否开启IPv6公网访问能力。如果该IPv6线路下没有带宽，则创建新的带宽。  
     * @return ipv6BandwidthEnable
     */
    public Boolean getIpv6BandwidthEnable() {
        return ipv6BandwidthEnable;
    }

    public void setIpv6BandwidthEnable(Boolean ipv6BandwidthEnable) {
        this.ipv6BandwidthEnable = ipv6BandwidthEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DemandResp that = (DemandResp) obj;
        return Objects.equals(this.demandCount, that.demandCount) && Objects.equals(this.poolIdV6, that.poolIdV6)
            && Objects.equals(this.ipv6BandwidthEnable, that.ipv6BandwidthEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(demandCount, poolIdV6, ipv6BandwidthEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemandResp {\n");
        sb.append("    demandCount: ").append(toIndentedString(demandCount)).append("\n");
        sb.append("    poolIdV6: ").append(toIndentedString(poolIdV6)).append("\n");
        sb.append("    ipv6BandwidthEnable: ").append(toIndentedString(ipv6BandwidthEnable)).append("\n");
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
