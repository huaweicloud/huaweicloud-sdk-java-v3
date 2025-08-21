package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AttackReport
 */
public class AttackReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private List<ItemVO> dstIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_mode")

    private Integer ipsMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private List<ItemVO> level = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private List<ItemVO> rule = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private List<ItemVO> srcIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trend")

    private List<TrendVO> trend = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<ItemVO> type = null;

    public AttackReport withDstIp(List<ItemVO> dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    public AttackReport addDstIpItem(ItemVO dstIpItem) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        this.dstIp.add(dstIpItem);
        return this;
    }

    public AttackReport withDstIp(Consumer<List<ItemVO>> dstIpSetter) {
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
    public List<ItemVO> getDstIp() {
        return dstIp;
    }

    public void setDstIp(List<ItemVO> dstIp) {
        this.dstIp = dstIp;
    }

    public AttackReport withIpsMode(Integer ipsMode) {
        this.ipsMode = ipsMode;
        return this;
    }

    /**
     * **参数解释**： 入侵防御状态 **取值范围**： 不涉及
     * @return ipsMode
     */
    public Integer getIpsMode() {
        return ipsMode;
    }

    public void setIpsMode(Integer ipsMode) {
        this.ipsMode = ipsMode;
    }

    public AttackReport withLevel(List<ItemVO> level) {
        this.level = level;
        return this;
    }

    public AttackReport addLevelItem(ItemVO levelItem) {
        if (this.level == null) {
            this.level = new ArrayList<>();
        }
        this.level.add(levelItem);
        return this;
    }

    public AttackReport withLevel(Consumer<List<ItemVO>> levelSetter) {
        if (this.level == null) {
            this.level = new ArrayList<>();
        }
        levelSetter.accept(this.level);
        return this;
    }

    /**
     * **参数解释**： 攻击等级分布 **取值范围**： 不涉及
     * @return level
     */
    public List<ItemVO> getLevel() {
        return level;
    }

    public void setLevel(List<ItemVO> level) {
        this.level = level;
    }

    public AttackReport withRule(List<ItemVO> rule) {
        this.rule = rule;
        return this;
    }

    public AttackReport addRuleItem(ItemVO ruleItem) {
        if (this.rule == null) {
            this.rule = new ArrayList<>();
        }
        this.rule.add(ruleItem);
        return this;
    }

    public AttackReport withRule(Consumer<List<ItemVO>> ruleSetter) {
        if (this.rule == null) {
            this.rule = new ArrayList<>();
        }
        ruleSetter.accept(this.rule);
        return this;
    }

    /**
     * **参数解释**： TOP攻击规则 **取值范围**： 不涉及
     * @return rule
     */
    public List<ItemVO> getRule() {
        return rule;
    }

    public void setRule(List<ItemVO> rule) {
        this.rule = rule;
    }

    public AttackReport withSrcIp(List<ItemVO> srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    public AttackReport addSrcIpItem(ItemVO srcIpItem) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        this.srcIp.add(srcIpItem);
        return this;
    }

    public AttackReport withSrcIp(Consumer<List<ItemVO>> srcIpSetter) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        srcIpSetter.accept(this.srcIp);
        return this;
    }

    /**
     * **参数解释**： TOP来源IP **取值范围**： 不涉及
     * @return srcIp
     */
    public List<ItemVO> getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(List<ItemVO> srcIp) {
        this.srcIp = srcIp;
    }

    public AttackReport withTrend(List<TrendVO> trend) {
        this.trend = trend;
        return this;
    }

    public AttackReport addTrendItem(TrendVO trendItem) {
        if (this.trend == null) {
            this.trend = new ArrayList<>();
        }
        this.trend.add(trendItem);
        return this;
    }

    public AttackReport withTrend(Consumer<List<TrendVO>> trendSetter) {
        if (this.trend == null) {
            this.trend = new ArrayList<>();
        }
        trendSetter.accept(this.trend);
        return this;
    }

    /**
     * **参数解释**： 攻击趋势 **取值范围**： 不涉及
     * @return trend
     */
    public List<TrendVO> getTrend() {
        return trend;
    }

    public void setTrend(List<TrendVO> trend) {
        this.trend = trend;
    }

    public AttackReport withType(List<ItemVO> type) {
        this.type = type;
        return this;
    }

    public AttackReport addTypeItem(ItemVO typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public AttackReport withType(Consumer<List<ItemVO>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * **参数解释**： TOP攻击分布 **取值范围**： 不涉及
     * @return type
     */
    public List<ItemVO> getType() {
        return type;
    }

    public void setType(List<ItemVO> type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttackReport that = (AttackReport) obj;
        return Objects.equals(this.dstIp, that.dstIp) && Objects.equals(this.ipsMode, that.ipsMode)
            && Objects.equals(this.level, that.level) && Objects.equals(this.rule, that.rule)
            && Objects.equals(this.srcIp, that.srcIp) && Objects.equals(this.trend, that.trend)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dstIp, ipsMode, level, rule, srcIp, trend, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackReport {\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    ipsMode: ").append(toIndentedString(ipsMode)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
