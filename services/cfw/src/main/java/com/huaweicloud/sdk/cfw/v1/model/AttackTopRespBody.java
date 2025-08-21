package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AttackTopRespBody
 */
public class AttackTopRespBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_rule")

    private List<TopInfo> attackRule = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private List<TopInfo> attackType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private List<TopInfo> dstIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private List<TopInfo> dstPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_src_ip")

    private List<TopInfo> inSrcIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private List<TopInfo> level = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out_src_ip")

    private List<TopInfo> outSrcIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private List<TopInfo> srcIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_id")

    private List<TopInfo> srcRegionId = null;

    public AttackTopRespBody withAttackRule(List<TopInfo> attackRule) {
        this.attackRule = attackRule;
        return this;
    }

    public AttackTopRespBody addAttackRuleItem(TopInfo attackRuleItem) {
        if (this.attackRule == null) {
            this.attackRule = new ArrayList<>();
        }
        this.attackRule.add(attackRuleItem);
        return this;
    }

    public AttackTopRespBody withAttackRule(Consumer<List<TopInfo>> attackRuleSetter) {
        if (this.attackRule == null) {
            this.attackRule = new ArrayList<>();
        }
        attackRuleSetter.accept(this.attackRule);
        return this;
    }

    /**
     * **参数解释**： TOP攻击规则 **取值范围**： 不涉及
     * @return attackRule
     */
    public List<TopInfo> getAttackRule() {
        return attackRule;
    }

    public void setAttackRule(List<TopInfo> attackRule) {
        this.attackRule = attackRule;
    }

    public AttackTopRespBody withAttackType(List<TopInfo> attackType) {
        this.attackType = attackType;
        return this;
    }

    public AttackTopRespBody addAttackTypeItem(TopInfo attackTypeItem) {
        if (this.attackType == null) {
            this.attackType = new ArrayList<>();
        }
        this.attackType.add(attackTypeItem);
        return this;
    }

    public AttackTopRespBody withAttackType(Consumer<List<TopInfo>> attackTypeSetter) {
        if (this.attackType == null) {
            this.attackType = new ArrayList<>();
        }
        attackTypeSetter.accept(this.attackType);
        return this;
    }

    /**
     * **参数解释**： TOP攻击类型 **取值范围**： 不涉及
     * @return attackType
     */
    public List<TopInfo> getAttackType() {
        return attackType;
    }

    public void setAttackType(List<TopInfo> attackType) {
        this.attackType = attackType;
    }

    public AttackTopRespBody withDstIp(List<TopInfo> dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    public AttackTopRespBody addDstIpItem(TopInfo dstIpItem) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        this.dstIp.add(dstIpItem);
        return this;
    }

    public AttackTopRespBody withDstIp(Consumer<List<TopInfo>> dstIpSetter) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        dstIpSetter.accept(this.dstIp);
        return this;
    }

    /**
     * **参数解释**： TOP攻击目的IP **取值范围**： 不涉及
     * @return dstIp
     */
    public List<TopInfo> getDstIp() {
        return dstIp;
    }

    public void setDstIp(List<TopInfo> dstIp) {
        this.dstIp = dstIp;
    }

    public AttackTopRespBody withDstPort(List<TopInfo> dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    public AttackTopRespBody addDstPortItem(TopInfo dstPortItem) {
        if (this.dstPort == null) {
            this.dstPort = new ArrayList<>();
        }
        this.dstPort.add(dstPortItem);
        return this;
    }

    public AttackTopRespBody withDstPort(Consumer<List<TopInfo>> dstPortSetter) {
        if (this.dstPort == null) {
            this.dstPort = new ArrayList<>();
        }
        dstPortSetter.accept(this.dstPort);
        return this;
    }

    /**
     * **参数解释**： TOP被攻击端口 **取值范围**： 不涉及
     * @return dstPort
     */
    public List<TopInfo> getDstPort() {
        return dstPort;
    }

    public void setDstPort(List<TopInfo> dstPort) {
        this.dstPort = dstPort;
    }

    public AttackTopRespBody withInSrcIp(List<TopInfo> inSrcIp) {
        this.inSrcIp = inSrcIp;
        return this;
    }

    public AttackTopRespBody addInSrcIpItem(TopInfo inSrcIpItem) {
        if (this.inSrcIp == null) {
            this.inSrcIp = new ArrayList<>();
        }
        this.inSrcIp.add(inSrcIpItem);
        return this;
    }

    public AttackTopRespBody withInSrcIp(Consumer<List<TopInfo>> inSrcIpSetter) {
        if (this.inSrcIp == null) {
            this.inSrcIp = new ArrayList<>();
        }
        inSrcIpSetter.accept(this.inSrcIp);
        return this;
    }

    /**
     * **参数解释**： TOP内部攻击来源IP **取值范围**： 不涉及
     * @return inSrcIp
     */
    public List<TopInfo> getInSrcIp() {
        return inSrcIp;
    }

    public void setInSrcIp(List<TopInfo> inSrcIp) {
        this.inSrcIp = inSrcIp;
    }

    public AttackTopRespBody withLevel(List<TopInfo> level) {
        this.level = level;
        return this;
    }

    public AttackTopRespBody addLevelItem(TopInfo levelItem) {
        if (this.level == null) {
            this.level = new ArrayList<>();
        }
        this.level.add(levelItem);
        return this;
    }

    public AttackTopRespBody withLevel(Consumer<List<TopInfo>> levelSetter) {
        if (this.level == null) {
            this.level = new ArrayList<>();
        }
        levelSetter.accept(this.level);
        return this;
    }

    /**
     * **参数解释**： TOP威胁等级 **取值范围**： 不涉及
     * @return level
     */
    public List<TopInfo> getLevel() {
        return level;
    }

    public void setLevel(List<TopInfo> level) {
        this.level = level;
    }

    public AttackTopRespBody withOutSrcIp(List<TopInfo> outSrcIp) {
        this.outSrcIp = outSrcIp;
        return this;
    }

    public AttackTopRespBody addOutSrcIpItem(TopInfo outSrcIpItem) {
        if (this.outSrcIp == null) {
            this.outSrcIp = new ArrayList<>();
        }
        this.outSrcIp.add(outSrcIpItem);
        return this;
    }

    public AttackTopRespBody withOutSrcIp(Consumer<List<TopInfo>> outSrcIpSetter) {
        if (this.outSrcIp == null) {
            this.outSrcIp = new ArrayList<>();
        }
        outSrcIpSetter.accept(this.outSrcIp);
        return this;
    }

    /**
     * **参数解释**： TOP外部攻击来源IP **取值范围**： 不涉及
     * @return outSrcIp
     */
    public List<TopInfo> getOutSrcIp() {
        return outSrcIp;
    }

    public void setOutSrcIp(List<TopInfo> outSrcIp) {
        this.outSrcIp = outSrcIp;
    }

    public AttackTopRespBody withSrcIp(List<TopInfo> srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    public AttackTopRespBody addSrcIpItem(TopInfo srcIpItem) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        this.srcIp.add(srcIpItem);
        return this;
    }

    public AttackTopRespBody withSrcIp(Consumer<List<TopInfo>> srcIpSetter) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        srcIpSetter.accept(this.srcIp);
        return this;
    }

    /**
     * **参数解释**： TOP攻击来源IP **取值范围**： 不涉及
     * @return srcIp
     */
    public List<TopInfo> getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(List<TopInfo> srcIp) {
        this.srcIp = srcIp;
    }

    public AttackTopRespBody withSrcRegionId(List<TopInfo> srcRegionId) {
        this.srcRegionId = srcRegionId;
        return this;
    }

    public AttackTopRespBody addSrcRegionIdItem(TopInfo srcRegionIdItem) {
        if (this.srcRegionId == null) {
            this.srcRegionId = new ArrayList<>();
        }
        this.srcRegionId.add(srcRegionIdItem);
        return this;
    }

    public AttackTopRespBody withSrcRegionId(Consumer<List<TopInfo>> srcRegionIdSetter) {
        if (this.srcRegionId == null) {
            this.srcRegionId = new ArrayList<>();
        }
        srcRegionIdSetter.accept(this.srcRegionId);
        return this;
    }

    /**
     * **参数解释**： 源地区ID **取值范围**： 不涉及
     * @return srcRegionId
     */
    public List<TopInfo> getSrcRegionId() {
        return srcRegionId;
    }

    public void setSrcRegionId(List<TopInfo> srcRegionId) {
        this.srcRegionId = srcRegionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttackTopRespBody that = (AttackTopRespBody) obj;
        return Objects.equals(this.attackRule, that.attackRule) && Objects.equals(this.attackType, that.attackType)
            && Objects.equals(this.dstIp, that.dstIp) && Objects.equals(this.dstPort, that.dstPort)
            && Objects.equals(this.inSrcIp, that.inSrcIp) && Objects.equals(this.level, that.level)
            && Objects.equals(this.outSrcIp, that.outSrcIp) && Objects.equals(this.srcIp, that.srcIp)
            && Objects.equals(this.srcRegionId, that.srcRegionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackRule, attackType, dstIp, dstPort, inSrcIp, level, outSrcIp, srcIp, srcRegionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackTopRespBody {\n");
        sb.append("    attackRule: ").append(toIndentedString(attackRule)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    inSrcIp: ").append(toIndentedString(inSrcIp)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    outSrcIp: ").append(toIndentedString(outSrcIp)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcRegionId: ").append(toIndentedString(srcRegionId)).append("\n");
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
