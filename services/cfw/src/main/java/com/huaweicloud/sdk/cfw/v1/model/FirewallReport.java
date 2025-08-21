package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * FirewallReport
 */
public class FirewallReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_info")

    private AttackReport attackInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_firewall")

    private InternetReport internetFirewall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_time")

    private Long sendTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_period")

    private StatisticPeriod statisticPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_firewall")

    private VpcReport vpcFirewall;

    public FirewallReport withAttackInfo(AttackReport attackInfo) {
        this.attackInfo = attackInfo;
        return this;
    }

    public FirewallReport withAttackInfo(Consumer<AttackReport> attackInfoSetter) {
        if (this.attackInfo == null) {
            this.attackInfo = new AttackReport();
            attackInfoSetter.accept(this.attackInfo);
        }

        return this;
    }

    /**
     * Get attackInfo
     * @return attackInfo
     */
    public AttackReport getAttackInfo() {
        return attackInfo;
    }

    public void setAttackInfo(AttackReport attackInfo) {
        this.attackInfo = attackInfo;
    }

    public FirewallReport withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 报告类型 **取值范围**： 不涉及
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FirewallReport withInternetFirewall(InternetReport internetFirewall) {
        this.internetFirewall = internetFirewall;
        return this;
    }

    public FirewallReport withInternetFirewall(Consumer<InternetReport> internetFirewallSetter) {
        if (this.internetFirewall == null) {
            this.internetFirewall = new InternetReport();
            internetFirewallSetter.accept(this.internetFirewall);
        }

        return this;
    }

    /**
     * Get internetFirewall
     * @return internetFirewall
     */
    public InternetReport getInternetFirewall() {
        return internetFirewall;
    }

    public void setInternetFirewall(InternetReport internetFirewall) {
        this.internetFirewall = internetFirewall;
    }

    public FirewallReport withSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    /**
     * **参数解释**： 发送时间 **取值范围**： 不涉及
     * @return sendTime
     */
    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    public FirewallReport withStatisticPeriod(StatisticPeriod statisticPeriod) {
        this.statisticPeriod = statisticPeriod;
        return this;
    }

    public FirewallReport withStatisticPeriod(Consumer<StatisticPeriod> statisticPeriodSetter) {
        if (this.statisticPeriod == null) {
            this.statisticPeriod = new StatisticPeriod();
            statisticPeriodSetter.accept(this.statisticPeriod);
        }

        return this;
    }

    /**
     * Get statisticPeriod
     * @return statisticPeriod
     */
    public StatisticPeriod getStatisticPeriod() {
        return statisticPeriod;
    }

    public void setStatisticPeriod(StatisticPeriod statisticPeriod) {
        this.statisticPeriod = statisticPeriod;
    }

    public FirewallReport withVpcFirewall(VpcReport vpcFirewall) {
        this.vpcFirewall = vpcFirewall;
        return this;
    }

    public FirewallReport withVpcFirewall(Consumer<VpcReport> vpcFirewallSetter) {
        if (this.vpcFirewall == null) {
            this.vpcFirewall = new VpcReport();
            vpcFirewallSetter.accept(this.vpcFirewall);
        }

        return this;
    }

    /**
     * Get vpcFirewall
     * @return vpcFirewall
     */
    public VpcReport getVpcFirewall() {
        return vpcFirewall;
    }

    public void setVpcFirewall(VpcReport vpcFirewall) {
        this.vpcFirewall = vpcFirewall;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallReport that = (FirewallReport) obj;
        return Objects.equals(this.attackInfo, that.attackInfo) && Objects.equals(this.category, that.category)
            && Objects.equals(this.internetFirewall, that.internetFirewall)
            && Objects.equals(this.sendTime, that.sendTime)
            && Objects.equals(this.statisticPeriod, that.statisticPeriod)
            && Objects.equals(this.vpcFirewall, that.vpcFirewall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attackInfo, category, internetFirewall, sendTime, statisticPeriod, vpcFirewall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallReport {\n");
        sb.append("    attackInfo: ").append(toIndentedString(attackInfo)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    internetFirewall: ").append(toIndentedString(internetFirewall)).append("\n");
        sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
        sb.append("    statisticPeriod: ").append(toIndentedString(statisticPeriod)).append("\n");
        sb.append("    vpcFirewall: ").append(toIndentedString(vpcFirewall)).append("\n");
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
