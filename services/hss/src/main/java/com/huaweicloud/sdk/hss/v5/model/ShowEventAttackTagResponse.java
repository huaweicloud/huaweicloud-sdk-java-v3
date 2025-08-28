package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowEventAttackTagResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_success_num")

    private Integer attackSuccessNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_attempt_num")

    private Integer attackAttemptNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_blocked_num")

    private Integer attackBlockedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_behavior_num")

    private Integer abnormalBehaviorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collapsible_host_num")

    private Integer collapsibleHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_vulnerability_num")

    private Integer systemVulnerabilityNum;

    public ShowEventAttackTagResponse withAttackSuccessNum(Integer attackSuccessNum) {
        this.attackSuccessNum = attackSuccessNum;
        return this;
    }

    /**
     * **参数解释**: 攻击成功阶段的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return attackSuccessNum
     */
    public Integer getAttackSuccessNum() {
        return attackSuccessNum;
    }

    public void setAttackSuccessNum(Integer attackSuccessNum) {
        this.attackSuccessNum = attackSuccessNum;
    }

    public ShowEventAttackTagResponse withAttackAttemptNum(Integer attackAttemptNum) {
        this.attackAttemptNum = attackAttemptNum;
        return this;
    }

    /**
     * **参数解释**: 攻击尝试阶段的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return attackAttemptNum
     */
    public Integer getAttackAttemptNum() {
        return attackAttemptNum;
    }

    public void setAttackAttemptNum(Integer attackAttemptNum) {
        this.attackAttemptNum = attackAttemptNum;
    }

    public ShowEventAttackTagResponse withAttackBlockedNum(Integer attackBlockedNum) {
        this.attackBlockedNum = attackBlockedNum;
        return this;
    }

    /**
     * **参数解释**: 攻击被阻断阶段的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return attackBlockedNum
     */
    public Integer getAttackBlockedNum() {
        return attackBlockedNum;
    }

    public void setAttackBlockedNum(Integer attackBlockedNum) {
        this.attackBlockedNum = attackBlockedNum;
    }

    public ShowEventAttackTagResponse withAbnormalBehaviorNum(Integer abnormalBehaviorNum) {
        this.abnormalBehaviorNum = abnormalBehaviorNum;
        return this;
    }

    /**
     * **参数解释**: 异常行为阶段的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return abnormalBehaviorNum
     */
    public Integer getAbnormalBehaviorNum() {
        return abnormalBehaviorNum;
    }

    public void setAbnormalBehaviorNum(Integer abnormalBehaviorNum) {
        this.abnormalBehaviorNum = abnormalBehaviorNum;
    }

    public ShowEventAttackTagResponse withCollapsibleHostNum(Integer collapsibleHostNum) {
        this.collapsibleHostNum = collapsibleHostNum;
        return this;
    }

    /**
     * **参数解释**: 主机失陷阶段的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return collapsibleHostNum
     */
    public Integer getCollapsibleHostNum() {
        return collapsibleHostNum;
    }

    public void setCollapsibleHostNum(Integer collapsibleHostNum) {
        this.collapsibleHostNum = collapsibleHostNum;
    }

    public ShowEventAttackTagResponse withSystemVulnerabilityNum(Integer systemVulnerabilityNum) {
        this.systemVulnerabilityNum = systemVulnerabilityNum;
        return this;
    }

    /**
     * **参数解释**: 系统脆弱性阶段的数量 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return systemVulnerabilityNum
     */
    public Integer getSystemVulnerabilityNum() {
        return systemVulnerabilityNum;
    }

    public void setSystemVulnerabilityNum(Integer systemVulnerabilityNum) {
        this.systemVulnerabilityNum = systemVulnerabilityNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEventAttackTagResponse that = (ShowEventAttackTagResponse) obj;
        return Objects.equals(this.attackSuccessNum, that.attackSuccessNum)
            && Objects.equals(this.attackAttemptNum, that.attackAttemptNum)
            && Objects.equals(this.attackBlockedNum, that.attackBlockedNum)
            && Objects.equals(this.abnormalBehaviorNum, that.abnormalBehaviorNum)
            && Objects.equals(this.collapsibleHostNum, that.collapsibleHostNum)
            && Objects.equals(this.systemVulnerabilityNum, that.systemVulnerabilityNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackSuccessNum,
            attackAttemptNum,
            attackBlockedNum,
            abnormalBehaviorNum,
            collapsibleHostNum,
            systemVulnerabilityNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventAttackTagResponse {\n");
        sb.append("    attackSuccessNum: ").append(toIndentedString(attackSuccessNum)).append("\n");
        sb.append("    attackAttemptNum: ").append(toIndentedString(attackAttemptNum)).append("\n");
        sb.append("    attackBlockedNum: ").append(toIndentedString(attackBlockedNum)).append("\n");
        sb.append("    abnormalBehaviorNum: ").append(toIndentedString(abnormalBehaviorNum)).append("\n");
        sb.append("    collapsibleHostNum: ").append(toIndentedString(collapsibleHostNum)).append("\n");
        sb.append("    systemVulnerabilityNum: ").append(toIndentedString(systemVulnerabilityNum)).append("\n");
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
