package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessLogInfo
 */
public class AccessLogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_host")

    private String dstHost;

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
    @JsonProperty(value = "hit_time")

    private Long hitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private Integer ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_rule_id")

    private String qosRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_rule_name")

    private String qosRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_rule_type")

    private Integer qosRuleType;

    public AccessLogInfo withAction(String action) {
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

    public AccessLogInfo withApp(String app) {
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

    public AccessLogInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AccessLogInfo withDstHost(String dstHost) {
        this.dstHost = dstHost;
        return this;
    }

    /**
     * **参数解释**： 目的域名 **取值范围**： 不涉及
     * @return dstHost
     */
    public String getDstHost() {
        return dstHost;
    }

    public void setDstHost(String dstHost) {
        this.dstHost = dstHost;
    }

    public AccessLogInfo withDstIp(String dstIp) {
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

    public AccessLogInfo withDstPort(Integer dstPort) {
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

    public AccessLogInfo withDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
        return this;
    }

    /**
     * **参数解释**： 目的地区ID **取值范围**： 不涉及
     * @return dstRegionId
     */
    public String getDstRegionId() {
        return dstRegionId;
    }

    public void setDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
    }

    public AccessLogInfo withDstRegionName(String dstRegionName) {
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

    public AccessLogInfo withDstProvinceId(String dstProvinceId) {
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

    public AccessLogInfo withDstProvinceName(String dstProvinceName) {
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

    public AccessLogInfo withDstCityId(String dstCityId) {
        this.dstCityId = dstCityId;
        return this;
    }

    /**
     * **参数解释**： 目的城市ID **取值范围**： 不涉及
     * @return dstCityId
     */
    public String getDstCityId() {
        return dstCityId;
    }

    public void setDstCityId(String dstCityId) {
        this.dstCityId = dstCityId;
    }

    public AccessLogInfo withDstCityName(String dstCityName) {
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

    public AccessLogInfo withHitTime(Long hitTime) {
        this.hitTime = hitTime;
        return this;
    }

    /**
     * **参数解释**： 命中时间 **取值范围**： 不涉及
     * @return hitTime
     */
    public Long getHitTime() {
        return hitTime;
    }

    public void setHitTime(Long hitTime) {
        this.hitTime = hitTime;
    }

    public AccessLogInfo withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * Get logId
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public AccessLogInfo withProtocol(String protocol) {
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

    public AccessLogInfo withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释**： 规则ID **取值范围**： 不涉及
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public AccessLogInfo withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释**： 规则名称 **取值范围**： 不涉及
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public AccessLogInfo withRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get ruleType
     * @return ruleType
     */
    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public AccessLogInfo withSrcIp(String srcIp) {
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

    public AccessLogInfo withSrcPort(Integer srcPort) {
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

    public AccessLogInfo withSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
        return this;
    }

    /**
     * **参数解释**： 源地区ID **取值范围**： 不涉及
     * @return srcRegionId
     */
    public String getSrcRegionId() {
        return srcRegionId;
    }

    public void setSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
    }

    public AccessLogInfo withSrcRegionName(String srcRegionName) {
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

    public AccessLogInfo withSrcProvinceId(String srcProvinceId) {
        this.srcProvinceId = srcProvinceId;
        return this;
    }

    /**
     * **参数解释**： 源省份ID **取值范围**： 不涉及
     * @return srcProvinceId
     */
    public String getSrcProvinceId() {
        return srcProvinceId;
    }

    public void setSrcProvinceId(String srcProvinceId) {
        this.srcProvinceId = srcProvinceId;
    }

    public AccessLogInfo withSrcProvinceName(String srcProvinceName) {
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

    public AccessLogInfo withSrcCityId(String srcCityId) {
        this.srcCityId = srcCityId;
        return this;
    }

    /**
     * **参数解释**： 源城市ID **取值范围**： 不涉及
     * @return srcCityId
     */
    public String getSrcCityId() {
        return srcCityId;
    }

    public void setSrcCityId(String srcCityId) {
        this.srcCityId = srcCityId;
    }

    public AccessLogInfo withSrcCityName(String srcCityName) {
        this.srcCityName = srcCityName;
        return this;
    }

    /**
     * **参数解释**： 源城市名称 **取值范围**： 不涉及
     * @return srcCityName
     */
    public String getSrcCityName() {
        return srcCityName;
    }

    public void setSrcCityName(String srcCityName) {
        this.srcCityName = srcCityName;
    }

    public AccessLogInfo withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * **参数解释**： VGW　ID **取值范围**： 不涉及
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public AccessLogInfo withQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
        return this;
    }

    /**
     * Get qosRuleId
     * @return qosRuleId
     */
    public String getQosRuleId() {
        return qosRuleId;
    }

    public void setQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
    }

    public AccessLogInfo withQosRuleName(String qosRuleName) {
        this.qosRuleName = qosRuleName;
        return this;
    }

    /**
     * Get qosRuleName
     * @return qosRuleName
     */
    public String getQosRuleName() {
        return qosRuleName;
    }

    public void setQosRuleName(String qosRuleName) {
        this.qosRuleName = qosRuleName;
    }

    public AccessLogInfo withQosRuleType(Integer qosRuleType) {
        this.qosRuleType = qosRuleType;
        return this;
    }

    /**
     * Get qosRuleType
     * @return qosRuleType
     */
    public Integer getQosRuleType() {
        return qosRuleType;
    }

    public void setQosRuleType(Integer qosRuleType) {
        this.qosRuleType = qosRuleType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessLogInfo that = (AccessLogInfo) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.app, that.app)
            && Objects.equals(this.url, that.url) && Objects.equals(this.dstHost, that.dstHost)
            && Objects.equals(this.dstIp, that.dstIp) && Objects.equals(this.dstPort, that.dstPort)
            && Objects.equals(this.dstRegionId, that.dstRegionId)
            && Objects.equals(this.dstRegionName, that.dstRegionName)
            && Objects.equals(this.dstProvinceId, that.dstProvinceId)
            && Objects.equals(this.dstProvinceName, that.dstProvinceName)
            && Objects.equals(this.dstCityId, that.dstCityId) && Objects.equals(this.dstCityName, that.dstCityName)
            && Objects.equals(this.hitTime, that.hitTime) && Objects.equals(this.logId, that.logId)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.srcIp, that.srcIp) && Objects.equals(this.srcPort, that.srcPort)
            && Objects.equals(this.srcRegionId, that.srcRegionId)
            && Objects.equals(this.srcRegionName, that.srcRegionName)
            && Objects.equals(this.srcProvinceId, that.srcProvinceId)
            && Objects.equals(this.srcProvinceName, that.srcProvinceName)
            && Objects.equals(this.srcCityId, that.srcCityId) && Objects.equals(this.srcCityName, that.srcCityName)
            && Objects.equals(this.vgwId, that.vgwId) && Objects.equals(this.qosRuleId, that.qosRuleId)
            && Objects.equals(this.qosRuleName, that.qosRuleName) && Objects.equals(this.qosRuleType, that.qosRuleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            app,
            url,
            dstHost,
            dstIp,
            dstPort,
            dstRegionId,
            dstRegionName,
            dstProvinceId,
            dstProvinceName,
            dstCityId,
            dstCityName,
            hitTime,
            logId,
            protocol,
            ruleId,
            ruleName,
            ruleType,
            srcIp,
            srcPort,
            srcRegionId,
            srcRegionName,
            srcProvinceId,
            srcProvinceName,
            srcCityId,
            srcCityName,
            vgwId,
            qosRuleId,
            qosRuleName,
            qosRuleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessLogInfo {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    dstHost: ").append(toIndentedString(dstHost)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    dstRegionId: ").append(toIndentedString(dstRegionId)).append("\n");
        sb.append("    dstRegionName: ").append(toIndentedString(dstRegionName)).append("\n");
        sb.append("    dstProvinceId: ").append(toIndentedString(dstProvinceId)).append("\n");
        sb.append("    dstProvinceName: ").append(toIndentedString(dstProvinceName)).append("\n");
        sb.append("    dstCityId: ").append(toIndentedString(dstCityId)).append("\n");
        sb.append("    dstCityName: ").append(toIndentedString(dstCityName)).append("\n");
        sb.append("    hitTime: ").append(toIndentedString(hitTime)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    srcRegionId: ").append(toIndentedString(srcRegionId)).append("\n");
        sb.append("    srcRegionName: ").append(toIndentedString(srcRegionName)).append("\n");
        sb.append("    srcProvinceId: ").append(toIndentedString(srcProvinceId)).append("\n");
        sb.append("    srcProvinceName: ").append(toIndentedString(srcProvinceName)).append("\n");
        sb.append("    srcCityId: ").append(toIndentedString(srcCityId)).append("\n");
        sb.append("    srcCityName: ").append(toIndentedString(srcCityName)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    qosRuleId: ").append(toIndentedString(qosRuleId)).append("\n");
        sb.append("    qosRuleName: ").append(toIndentedString(qosRuleName)).append("\n");
        sb.append("    qosRuleType: ").append(toIndentedString(qosRuleType)).append("\n");
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
