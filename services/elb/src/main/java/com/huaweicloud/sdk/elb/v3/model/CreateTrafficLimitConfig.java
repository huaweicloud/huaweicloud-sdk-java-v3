package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 转发策略限速的配置。
 */
public class CreateTrafficLimitConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private Integer qps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_source_ip_qps")

    private Integer perSourceIpQps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "burst")

    private Integer burst;

    public CreateTrafficLimitConfig withQps(Integer qps) {
        this.qps = qps;
        return this;
    }

    /**
     * 转发策略整体限速。取值： 0-100000s。0表示不限速
     * minimum: 0
     * maximum: 100000
     * @return qps
     */
    public Integer getQps() {
        return qps;
    }

    public void setQps(Integer qps) {
        this.qps = qps;
    }

    public CreateTrafficLimitConfig withPerSourceIpQps(Integer perSourceIpQps) {
        this.perSourceIpQps = perSourceIpQps;
        return this;
    }

    /**
     * 对转发策略单源进行限速。 quic监听器下转发策略不支持配置单源限速。指定该字段时，赋值可以为0或者为null。 取值： 0-100000s。0表示不限速，如果qps不为0，per_source_ip_qps需要小于qps。
     * minimum: 0
     * maximum: 100000
     * @return perSourceIpQps
     */
    public Integer getPerSourceIpQps() {
        return perSourceIpQps;
    }

    public void setPerSourceIpQps(Integer perSourceIpQps) {
        this.perSourceIpQps = perSourceIpQps;
    }

    public CreateTrafficLimitConfig withBurst(Integer burst) {
        this.burst = burst;
        return this;
    }

    /**
     * 对转发策略单源进行限速。取值： 0-100000s。当qps超限的时候，不返回503，支持允许局部突增burst大小的请求。
     * minimum: 0
     * maximum: 100000
     * @return burst
     */
    public Integer getBurst() {
        return burst;
    }

    public void setBurst(Integer burst) {
        this.burst = burst;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrafficLimitConfig that = (CreateTrafficLimitConfig) obj;
        return Objects.equals(this.qps, that.qps) && Objects.equals(this.perSourceIpQps, that.perSourceIpQps)
            && Objects.equals(this.burst, that.burst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qps, perSourceIpQps, burst);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrafficLimitConfig {\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
        sb.append("    perSourceIpQps: ").append(toIndentedString(perSourceIpQps)).append("\n");
        sb.append("    burst: ").append(toIndentedString(burst)).append("\n");
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
