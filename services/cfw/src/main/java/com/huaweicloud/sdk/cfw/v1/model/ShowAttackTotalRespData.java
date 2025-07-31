package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 攻击统计信息 **取值范围**： 不涉及
 */
public class ShowAttackTotalRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_count")

    private Long attackCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deny_count")

    private Long denyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit_count")

    private Long permitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_ports")

    private Long riskPorts;

    public ShowAttackTotalRespData withAttackCount(Long attackCount) {
        this.attackCount = attackCount;
        return this;
    }

    /**
     * **参数解释**： 攻击次数 **取值范围**： 不涉及
     * @return attackCount
     */
    public Long getAttackCount() {
        return attackCount;
    }

    public void setAttackCount(Long attackCount) {
        this.attackCount = attackCount;
    }

    public ShowAttackTotalRespData withDenyCount(Long denyCount) {
        this.denyCount = denyCount;
        return this;
    }

    /**
     * **参数解释**： 阻断次数 **取值范围**： 不涉及
     * @return denyCount
     */
    public Long getDenyCount() {
        return denyCount;
    }

    public void setDenyCount(Long denyCount) {
        this.denyCount = denyCount;
    }

    public ShowAttackTotalRespData withPermitCount(Long permitCount) {
        this.permitCount = permitCount;
        return this;
    }

    /**
     * **参数解释**： 放行次数 **取值范围**： 不涉及
     * @return permitCount
     */
    public Long getPermitCount() {
        return permitCount;
    }

    public void setPermitCount(Long permitCount) {
        this.permitCount = permitCount;
    }

    public ShowAttackTotalRespData withRiskPorts(Long riskPorts) {
        this.riskPorts = riskPorts;
        return this;
    }

    /**
     * **参数解释**： 风险端口 **取值范围**： 不涉及
     * @return riskPorts
     */
    public Long getRiskPorts() {
        return riskPorts;
    }

    public void setRiskPorts(Long riskPorts) {
        this.riskPorts = riskPorts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAttackTotalRespData that = (ShowAttackTotalRespData) obj;
        return Objects.equals(this.attackCount, that.attackCount) && Objects.equals(this.denyCount, that.denyCount)
            && Objects.equals(this.permitCount, that.permitCount) && Objects.equals(this.riskPorts, that.riskPorts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackCount, denyCount, permitCount, riskPorts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAttackTotalRespData {\n");
        sb.append("    attackCount: ").append(toIndentedString(attackCount)).append("\n");
        sb.append("    denyCount: ").append(toIndentedString(denyCount)).append("\n");
        sb.append("    permitCount: ").append(toIndentedString(permitCount)).append("\n");
        sb.append("    riskPorts: ").append(toIndentedString(riskPorts)).append("\n");
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
