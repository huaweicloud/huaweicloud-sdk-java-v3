package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：转发策略限速的配置。  **约束限制**：不涉及
 */
public class UpdateTrafficLimitConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private Integer qps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_source_ip_qps")

    private Integer perSourceIpQps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "burst")

    private Integer burst;

    public UpdateTrafficLimitConfig withQps(Integer qps) {
        this.qps = qps;
        return this;
    }

    /**
     * **参数解释**：转发策略qps限速。  **约束限制**：不涉及  **取值范围**：0-100000，单位：个/秒。0表示不限速。  **默认取值**：不涉及
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

    public UpdateTrafficLimitConfig withPerSourceIpQps(Integer perSourceIpQps) {
        this.perSourceIpQps = perSourceIpQps;
        return this;
    }

    /**
     * **参数解释**：对转发策略单源(单个客户端IP)进行限速。  **约束限制**： - quic监听器下转发策略不支持配置单源限速。 - 指定该字段时，赋值可以为0或者为null。 - 如果qps不为0，per_source_ip_qps需要小于qps。  **取值范围**：0-100000，单位：个/秒。0表示不限速。  **默认取值**：不涉及
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

    public UpdateTrafficLimitConfig withBurst(Integer burst) {
        this.burst = burst;
        return this;
    }

    /**
     * **参数解释**：设置当单源qps超限时，允许的局部突增请求数量。超出该限制的请求将返回503。  **约束限制**：不涉及  **取值范围**：0-100000，单位：个/秒。  **默认取值**：不涉及
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
        UpdateTrafficLimitConfig that = (UpdateTrafficLimitConfig) obj;
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
        sb.append("class UpdateTrafficLimitConfig {\n");
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
