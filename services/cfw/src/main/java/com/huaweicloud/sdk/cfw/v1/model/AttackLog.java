package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AttackLog
 */
public class AttackLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_rule")

    private String attackRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_rule_id")

    private String attackRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private String attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private String dstIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private Integer dstPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_region_id")

    private String dstRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_region_name")

    private String dstRegionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_province_id")

    private String dstProvinceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_province_name")

    private String dstProvinceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_city_id")

    private String dstCityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_city_name")

    private String dstCityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_time")

    private Long eventTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_ip")

    private String realIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private Integer tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private Integer srcPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_id")

    private String srcRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_name")

    private String srcRegionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_province_id")

    private String srcProvinceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_province_name")

    private String srcProvinceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_city_id")

    private String srcCityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_city_name")

    private String srcCityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    public AttackLog withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 动作 **取值范围**： 不涉及
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public AttackLog withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * **参数解释**： 应用 **取值范围**： 不涉及
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public AttackLog withAttackRule(String attackRule) {
        this.attackRule = attackRule;
        return this;
    }

    /**
     * **参数解释**： 攻击规则 **取值范围**： 不涉及
     * @return attackRule
     */
    public String getAttackRule() {
        return attackRule;
    }

    public void setAttackRule(String attackRule) {
        this.attackRule = attackRule;
    }

    public AttackLog withAttackRuleId(String attackRuleId) {
        this.attackRuleId = attackRuleId;
        return this;
    }

    /**
     * **参数解释**： 攻击规则ID **取值范围**： 不涉及
     * @return attackRuleId
     */
    public String getAttackRuleId() {
        return attackRuleId;
    }

    public void setAttackRuleId(String attackRuleId) {
        this.attackRuleId = attackRuleId;
    }

    public AttackLog withAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }

    /**
     * **参数解释**： 攻击类型 **取值范围**： 不涉及
     * @return attackType
     */
    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public AttackLog withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * **参数解释**： 攻击方向 **取值范围**： 不涉及
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public AttackLog withDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    /**
     * **参数解释**： 目的IP **取值范围**： 不涉及
     * @return dstIp
     */
    public String getDstIp() {
        return dstIp;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }

    public AttackLog withDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    /**
     * **参数解释**： 目的端口 **取值范围**： 不涉及
     * @return dstPort
     */
    public Integer getDstPort() {
        return dstPort;
    }

    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }

    public AttackLog withDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
        return this;
    }

    /**
     * **参数解释**： 目的地区Id **取值范围**： 不涉及
     * @return dstRegionId
     */
    public String getDstRegionId() {
        return dstRegionId;
    }

    public void setDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
    }

    public AttackLog withDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
        return this;
    }

    /**
     * **参数解释**： 目的地区名称 **取值范围**： 不涉及
     * @return dstRegionName
     */
    public String getDstRegionName() {
        return dstRegionName;
    }

    public void setDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
    }

    public AttackLog withDstProvinceId(String dstProvinceId) {
        this.dstProvinceId = dstProvinceId;
        return this;
    }

    /**
     * **参数解释**： 目的省份ID **取值范围**： 不涉及
     * @return dstProvinceId
     */
    public String getDstProvinceId() {
        return dstProvinceId;
    }

    public void setDstProvinceId(String dstProvinceId) {
        this.dstProvinceId = dstProvinceId;
    }

    public AttackLog withDstProvinceName(String dstProvinceName) {
        this.dstProvinceName = dstProvinceName;
        return this;
    }

    /**
     * **参数解释**： 目的省份名称 **取值范围**： 不涉及
     * @return dstProvinceName
     */
    public String getDstProvinceName() {
        return dstProvinceName;
    }

    public void setDstProvinceName(String dstProvinceName) {
        this.dstProvinceName = dstProvinceName;
    }

    public AttackLog withDstCityId(String dstCityId) {
        this.dstCityId = dstCityId;
        return this;
    }

    /**
     * **参数解释**： 目的城市Id **取值范围**： 不涉及
     * @return dstCityId
     */
    public String getDstCityId() {
        return dstCityId;
    }

    public void setDstCityId(String dstCityId) {
        this.dstCityId = dstCityId;
    }

    public AttackLog withDstCityName(String dstCityName) {
        this.dstCityName = dstCityName;
        return this;
    }

    /**
     * **参数解释**： 目的城市名称 **取值范围**： 不涉及
     * @return dstCityName
     */
    public String getDstCityName() {
        return dstCityName;
    }

    public void setDstCityName(String dstCityName) {
        this.dstCityName = dstCityName;
    }

    public AttackLog withEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * **参数解释**： 发生时间 **取值范围**： 不涉及
     * @return eventTime
     */
    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public AttackLog withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**： 危险等级 **取值范围**： 不涉及
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public AttackLog withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 协议 **取值范围**： 不涉及
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public AttackLog withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**： 来源 **取值范围**： 不涉及
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public AttackLog withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * **参数解释**： 源IP **取值范围**： 不涉及
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public AttackLog withRealIp(String realIp) {
        this.realIp = realIp;
        return this;
    }

    /**
     * **参数解释**： 真实IP **取值范围**： 不涉及
     * @return realIp
     */
    public String getRealIp() {
        return realIp;
    }

    public void setRealIp(String realIp) {
        this.realIp = realIp;
    }

    public AttackLog withTag(Integer tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释**： 标签 **取值范围**： 不涉及
     * @return tag
     */
    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public AttackLog withSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * **参数解释**： 源端口 **取值范围**： 不涉及
     * @return srcPort
     */
    public Integer getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    public AttackLog withSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
        return this;
    }

    /**
     * **参数解释**： 源地区Id **取值范围**： 不涉及
     * @return srcRegionId
     */
    public String getSrcRegionId() {
        return srcRegionId;
    }

    public void setSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
    }

    public AttackLog withSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
        return this;
    }

    /**
     * **参数解释**： 源地区名称 **取值范围**： 不涉及
     * @return srcRegionName
     */
    public String getSrcRegionName() {
        return srcRegionName;
    }

    public void setSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
    }

    public AttackLog withSrcProvinceId(String srcProvinceId) {
        this.srcProvinceId = srcProvinceId;
        return this;
    }

    /**
     * **参数解释**： 源省份Id **取值范围**： 不涉及
     * @return srcProvinceId
     */
    public String getSrcProvinceId() {
        return srcProvinceId;
    }

    public void setSrcProvinceId(String srcProvinceId) {
        this.srcProvinceId = srcProvinceId;
    }

    public AttackLog withSrcProvinceName(String srcProvinceName) {
        this.srcProvinceName = srcProvinceName;
        return this;
    }

    /**
     * **参数解释**： 源省份名称 **取值范围**： 不涉及
     * @return srcProvinceName
     */
    public String getSrcProvinceName() {
        return srcProvinceName;
    }

    public void setSrcProvinceName(String srcProvinceName) {
        this.srcProvinceName = srcProvinceName;
    }

    public AttackLog withSrcCityId(String srcCityId) {
        this.srcCityId = srcCityId;
        return this;
    }

    /**
     * **参数解释**： 源城市Id **取值范围**： 不涉及
     * @return srcCityId
     */
    public String getSrcCityId() {
        return srcCityId;
    }

    public void setSrcCityId(String srcCityId) {
        this.srcCityId = srcCityId;
    }

    public AttackLog withSrcCityName(String srcCityName) {
        this.srcCityName = srcCityName;
        return this;
    }

    /**
     * **参数解释**： 源城市 **取值范围**： 不涉及
     * @return srcCityName
     */
    public String getSrcCityName() {
        return srcCityName;
    }

    public void setSrcCityName(String srcCityName) {
        this.srcCityName = srcCityName;
    }

    public AttackLog withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * **参数解释**： VGW Id **取值范围**： 不涉及
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttackLog that = (AttackLog) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.app, that.app)
            && Objects.equals(this.attackRule, that.attackRule) && Objects.equals(this.attackRuleId, that.attackRuleId)
            && Objects.equals(this.attackType, that.attackType) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.dstIp, that.dstIp) && Objects.equals(this.dstPort, that.dstPort)
            && Objects.equals(this.dstRegionId, that.dstRegionId)
            && Objects.equals(this.dstRegionName, that.dstRegionName)
            && Objects.equals(this.dstProvinceId, that.dstProvinceId)
            && Objects.equals(this.dstProvinceName, that.dstProvinceName)
            && Objects.equals(this.dstCityId, that.dstCityId) && Objects.equals(this.dstCityName, that.dstCityName)
            && Objects.equals(this.eventTime, that.eventTime) && Objects.equals(this.level, that.level)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.source, that.source)
            && Objects.equals(this.srcIp, that.srcIp) && Objects.equals(this.realIp, that.realIp)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.srcPort, that.srcPort)
            && Objects.equals(this.srcRegionId, that.srcRegionId)
            && Objects.equals(this.srcRegionName, that.srcRegionName)
            && Objects.equals(this.srcProvinceId, that.srcProvinceId)
            && Objects.equals(this.srcProvinceName, that.srcProvinceName)
            && Objects.equals(this.srcCityId, that.srcCityId) && Objects.equals(this.srcCityName, that.srcCityName)
            && Objects.equals(this.vgwId, that.vgwId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            app,
            attackRule,
            attackRuleId,
            attackType,
            direction,
            dstIp,
            dstPort,
            dstRegionId,
            dstRegionName,
            dstProvinceId,
            dstProvinceName,
            dstCityId,
            dstCityName,
            eventTime,
            level,
            protocol,
            source,
            srcIp,
            realIp,
            tag,
            srcPort,
            srcRegionId,
            srcRegionName,
            srcProvinceId,
            srcProvinceName,
            srcCityId,
            srcCityName,
            vgwId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackLog {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    attackRule: ").append(toIndentedString(attackRule)).append("\n");
        sb.append("    attackRuleId: ").append(toIndentedString(attackRuleId)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    dstRegionId: ").append(toIndentedString(dstRegionId)).append("\n");
        sb.append("    dstRegionName: ").append(toIndentedString(dstRegionName)).append("\n");
        sb.append("    dstProvinceId: ").append(toIndentedString(dstProvinceId)).append("\n");
        sb.append("    dstProvinceName: ").append(toIndentedString(dstProvinceName)).append("\n");
        sb.append("    dstCityId: ").append(toIndentedString(dstCityId)).append("\n");
        sb.append("    dstCityName: ").append(toIndentedString(dstCityName)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    realIp: ").append(toIndentedString(realIp)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    srcRegionId: ").append(toIndentedString(srcRegionId)).append("\n");
        sb.append("    srcRegionName: ").append(toIndentedString(srcRegionName)).append("\n");
        sb.append("    srcProvinceId: ").append(toIndentedString(srcProvinceId)).append("\n");
        sb.append("    srcProvinceName: ").append(toIndentedString(srcProvinceName)).append("\n");
        sb.append("    srcCityId: ").append(toIndentedString(srcCityId)).append("\n");
        sb.append("    srcCityName: ").append(toIndentedString(srcCityName)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
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
