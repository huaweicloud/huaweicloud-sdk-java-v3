package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LogVO
 */
public class LogVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bytes")

    private Double bytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

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
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packets")

    private Double packets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private Integer srcPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

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
    @JsonProperty(value = "sctp_verification_tag")

    private Long sctpVerificationTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sctp_is_handshake_flow")

    private String sctpIsHandshakeFlow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_rule_id")

    private String qosRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_rule_name")

    private String qosRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_channel_id")

    private String qosChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_channel_name")

    private String qosChannelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_drop_packets")

    private Double qosDropPackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_drop_bytes")

    private Double qosDropBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_rule_type")

    private Integer qosRuleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos_channel_type")

    private Integer qosChannelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_time")

    private Long hitTime;

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
    @JsonProperty(value = "attack_rule")

    private String attackRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_rule_id")

    private String attackRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private String attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_time")

    private Long eventTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet")

    private String packet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_ip")

    private String realIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private Integer tag;

    public LogVO withApp(String app) {
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

    public LogVO withBytes(Double bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * **参数解释**： 流字节数，流量日志字段 **取值范围**： 不涉及
     * @return bytes
     */
    public Double getBytes() {
        return bytes;
    }

    public void setBytes(Double bytes) {
        this.bytes = bytes;
    }

    public LogVO withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * **参数解释**： 会话方向 **取值范围**： out2in 外到内访问 in2out 内到外访问
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public LogVO withDstHost(String dstHost) {
        this.dstHost = dstHost;
        return this;
    }

    /**
     * **参数解释**： 流字节数，访问控制日志和流量日志中存在 **取值范围**： 目的网址
     * @return dstHost
     */
    public String getDstHost() {
        return dstHost;
    }

    public void setDstHost(String dstHost) {
        this.dstHost = dstHost;
    }

    public LogVO withDstIp(String dstIp) {
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

    public LogVO withDstPort(Integer dstPort) {
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

    public LogVO withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 会话结束时间，流量日志字段 **取值范围**： 不涉及
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public LogVO withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * **参数解释**： 日志ID，用于分页查询 **取值范围**： 不涉及
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public LogVO withPackets(Double packets) {
        this.packets = packets;
        return this;
    }

    /**
     * **参数解释**： 流包数，流量日志字段 **取值范围**： 不涉及
     * @return packets
     */
    public Double getPackets() {
        return packets;
    }

    public void setPackets(Double packets) {
        this.packets = packets;
    }

    public LogVO withProtocol(String protocol) {
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

    public LogVO withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * **参数解释**： 源Ip **取值范围**： 不涉及
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public LogVO withSrcPort(Integer srcPort) {
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

    public LogVO withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 会话开始时间，流量日志字段 **取值范围**： 不涉及
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public LogVO withDstRegionId(String dstRegionId) {
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

    public LogVO withDstRegionName(String dstRegionName) {
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

    public LogVO withDstProvinceId(String dstProvinceId) {
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

    public LogVO withDstProvinceName(String dstProvinceName) {
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

    public LogVO withDstCityId(String dstCityId) {
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

    public LogVO withDstCityName(String dstCityName) {
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

    public LogVO withSrcRegionId(String srcRegionId) {
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

    public LogVO withSrcRegionName(String srcRegionName) {
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

    public LogVO withSrcProvinceId(String srcProvinceId) {
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

    public LogVO withSrcProvinceName(String srcProvinceName) {
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

    public LogVO withSrcCityId(String srcCityId) {
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

    public LogVO withSrcCityName(String srcCityName) {
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

    public LogVO withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * **参数解释**： 虚拟网关ID **取值范围**： 不涉及
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public LogVO withSctpVerificationTag(Long sctpVerificationTag) {
        this.sctpVerificationTag = sctpVerificationTag;
        return this;
    }

    /**
     * **参数解释**： sctp验证标签，流量日志字段 **取值范围**： 不涉及
     * @return sctpVerificationTag
     */
    public Long getSctpVerificationTag() {
        return sctpVerificationTag;
    }

    public void setSctpVerificationTag(Long sctpVerificationTag) {
        this.sctpVerificationTag = sctpVerificationTag;
    }

    public LogVO withSctpIsHandshakeFlow(String sctpIsHandshakeFlow) {
        this.sctpIsHandshakeFlow = sctpIsHandshakeFlow;
        return this;
    }

    /**
     * **参数解释**： sctp握手流，流量日志字段 **取值范围**： 不涉及
     * @return sctpIsHandshakeFlow
     */
    public String getSctpIsHandshakeFlow() {
        return sctpIsHandshakeFlow;
    }

    public void setSctpIsHandshakeFlow(String sctpIsHandshakeFlow) {
        this.sctpIsHandshakeFlow = sctpIsHandshakeFlow;
    }

    public LogVO withQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
        return this;
    }

    /**
     * **参数解释**： qos规则ID，流量日志、访问控制日志存在 **取值范围**： 不涉及
     * @return qosRuleId
     */
    public String getQosRuleId() {
        return qosRuleId;
    }

    public void setQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
    }

    public LogVO withQosRuleName(String qosRuleName) {
        this.qosRuleName = qosRuleName;
        return this;
    }

    /**
     * **参数解释**： qos规则名称，流量日志、访问控制日志存在 **取值范围**： 不涉及
     * @return qosRuleName
     */
    public String getQosRuleName() {
        return qosRuleName;
    }

    public void setQosRuleName(String qosRuleName) {
        this.qosRuleName = qosRuleName;
    }

    public LogVO withQosChannelId(String qosChannelId) {
        this.qosChannelId = qosChannelId;
        return this;
    }

    /**
     * **参数解释**： qos通道ID，流量日志字段 **取值范围**： 不涉及
     * @return qosChannelId
     */
    public String getQosChannelId() {
        return qosChannelId;
    }

    public void setQosChannelId(String qosChannelId) {
        this.qosChannelId = qosChannelId;
    }

    public LogVO withQosChannelName(String qosChannelName) {
        this.qosChannelName = qosChannelName;
        return this;
    }

    /**
     * **参数解释**： qos通道名称，流量日志字段 **取值范围**： 不涉及
     * @return qosChannelName
     */
    public String getQosChannelName() {
        return qosChannelName;
    }

    public void setQosChannelName(String qosChannelName) {
        this.qosChannelName = qosChannelName;
    }

    public LogVO withQosDropPackets(Double qosDropPackets) {
        this.qosDropPackets = qosDropPackets;
        return this;
    }

    /**
     * **参数解释**： qos丢包数，流量日志字段 **取值范围**： 不涉及
     * @return qosDropPackets
     */
    public Double getQosDropPackets() {
        return qosDropPackets;
    }

    public void setQosDropPackets(Double qosDropPackets) {
        this.qosDropPackets = qosDropPackets;
    }

    public LogVO withQosDropBytes(Double qosDropBytes) {
        this.qosDropBytes = qosDropBytes;
        return this;
    }

    /**
     * **参数解释**： qos丢弃字节，流量日志字段 **取值范围**： 不涉及
     * @return qosDropBytes
     */
    public Double getQosDropBytes() {
        return qosDropBytes;
    }

    public void setQosDropBytes(Double qosDropBytes) {
        this.qosDropBytes = qosDropBytes;
    }

    public LogVO withQosRuleType(Integer qosRuleType) {
        this.qosRuleType = qosRuleType;
        return this;
    }

    /**
     * **参数解释**： qos规则类型，流量日志、访问控制日志存在 **取值范围**： 不涉及
     * @return qosRuleType
     */
    public Integer getQosRuleType() {
        return qosRuleType;
    }

    public void setQosRuleType(Integer qosRuleType) {
        this.qosRuleType = qosRuleType;
    }

    public LogVO withQosChannelType(Integer qosChannelType) {
        this.qosChannelType = qosChannelType;
        return this;
    }

    /**
     * **参数解释**： qos通道类型，流量日志字段 **取值范围**： 不涉及
     * @return qosChannelType
     */
    public Integer getQosChannelType() {
        return qosChannelType;
    }

    public void setQosChannelType(Integer qosChannelType) {
        this.qosChannelType = qosChannelType;
    }

    public LogVO withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 动作，攻击日志、访问控制日志、URL日志存在 **取值范围**： 不涉及
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LogVO withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**： url，URL日志字段 **取值范围**： 不涉及
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LogVO withHitTime(Long hitTime) {
        this.hitTime = hitTime;
        return this;
    }

    /**
     * **参数解释**： 命中时间，访问控制日志、URL日志存在 **取值范围**： 不涉及
     * @return hitTime
     */
    public Long getHitTime() {
        return hitTime;
    }

    public void setHitTime(Long hitTime) {
        this.hitTime = hitTime;
    }

    public LogVO withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释**： 规则ID，访问控制日志、URL日志存在 **取值范围**： 不涉及
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public LogVO withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释**： 规则名称，访问控制日志、URL日志存在 **取值范围**： 不涉及
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public LogVO withRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释**： 规则类型，访问控制日志和URL日志字段 **取值范围**： 不涉及
     * @return ruleType
     */
    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public LogVO withAttackRule(String attackRule) {
        this.attackRule = attackRule;
        return this;
    }

    /**
     * **参数解释**： 规则类型，攻击日志字段 **取值范围**： 不涉及
     * @return attackRule
     */
    public String getAttackRule() {
        return attackRule;
    }

    public void setAttackRule(String attackRule) {
        this.attackRule = attackRule;
    }

    public LogVO withAttackRuleId(String attackRuleId) {
        this.attackRuleId = attackRuleId;
        return this;
    }

    /**
     * **参数解释**： 攻击规则ID，攻击日志字段 **取值范围**： 不涉及
     * @return attackRuleId
     */
    public String getAttackRuleId() {
        return attackRuleId;
    }

    public void setAttackRuleId(String attackRuleId) {
        this.attackRuleId = attackRuleId;
    }

    public LogVO withAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }

    /**
     * **参数解释**： 攻击类型，攻击日志字段 **取值范围**： 不涉及
     * @return attackType
     */
    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public LogVO withEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * **参数解释**： 事件时间，攻击日志字段 **取值范围**： 不涉及
     * @return eventTime
     */
    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public LogVO withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**： 攻击等级，攻击日志字段 **取值范围**： 不涉及
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public LogVO withPacket(String packet) {
        this.packet = packet;
        return this;
    }

    /**
     * **参数解释**： 规则载荷，攻击日志字段 **取值范围**： 不涉及
     * @return packet
     */
    public String getPacket() {
        return packet;
    }

    public void setPacket(String packet) {
        this.packet = packet;
    }

    public LogVO withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释**： 攻击来源，攻击日志字段 **取值范围**： 不涉及
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LogVO withRealIp(String realIp) {
        this.realIp = realIp;
        return this;
    }

    /**
     * **参数解释**： 真实IP，攻击日志字段 **取值范围**： 不涉及
     * @return realIp
     */
    public String getRealIp() {
        return realIp;
    }

    public void setRealIp(String realIp) {
        this.realIp = realIp;
    }

    public LogVO withTag(Integer tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释**： 标签类型，攻击日志字段 **取值范围**： 1 WAF回源IP
     * @return tag
     */
    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogVO that = (LogVO) obj;
        return Objects.equals(this.app, that.app) && Objects.equals(this.bytes, that.bytes)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.dstHost, that.dstHost)
            && Objects.equals(this.dstIp, that.dstIp) && Objects.equals(this.dstPort, that.dstPort)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.logId, that.logId)
            && Objects.equals(this.packets, that.packets) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.srcIp, that.srcIp) && Objects.equals(this.srcPort, that.srcPort)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.dstRegionId, that.dstRegionId)
            && Objects.equals(this.dstRegionName, that.dstRegionName)
            && Objects.equals(this.dstProvinceId, that.dstProvinceId)
            && Objects.equals(this.dstProvinceName, that.dstProvinceName)
            && Objects.equals(this.dstCityId, that.dstCityId) && Objects.equals(this.dstCityName, that.dstCityName)
            && Objects.equals(this.srcRegionId, that.srcRegionId)
            && Objects.equals(this.srcRegionName, that.srcRegionName)
            && Objects.equals(this.srcProvinceId, that.srcProvinceId)
            && Objects.equals(this.srcProvinceName, that.srcProvinceName)
            && Objects.equals(this.srcCityId, that.srcCityId) && Objects.equals(this.srcCityName, that.srcCityName)
            && Objects.equals(this.vgwId, that.vgwId)
            && Objects.equals(this.sctpVerificationTag, that.sctpVerificationTag)
            && Objects.equals(this.sctpIsHandshakeFlow, that.sctpIsHandshakeFlow)
            && Objects.equals(this.qosRuleId, that.qosRuleId) && Objects.equals(this.qosRuleName, that.qosRuleName)
            && Objects.equals(this.qosChannelId, that.qosChannelId)
            && Objects.equals(this.qosChannelName, that.qosChannelName)
            && Objects.equals(this.qosDropPackets, that.qosDropPackets)
            && Objects.equals(this.qosDropBytes, that.qosDropBytes)
            && Objects.equals(this.qosRuleType, that.qosRuleType)
            && Objects.equals(this.qosChannelType, that.qosChannelType) && Objects.equals(this.action, that.action)
            && Objects.equals(this.url, that.url) && Objects.equals(this.hitTime, that.hitTime)
            && Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.attackRule, that.attackRule)
            && Objects.equals(this.attackRuleId, that.attackRuleId) && Objects.equals(this.attackType, that.attackType)
            && Objects.equals(this.eventTime, that.eventTime) && Objects.equals(this.level, that.level)
            && Objects.equals(this.packet, that.packet) && Objects.equals(this.source, that.source)
            && Objects.equals(this.realIp, that.realIp) && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app,
            bytes,
            direction,
            dstHost,
            dstIp,
            dstPort,
            endTime,
            logId,
            packets,
            protocol,
            srcIp,
            srcPort,
            startTime,
            dstRegionId,
            dstRegionName,
            dstProvinceId,
            dstProvinceName,
            dstCityId,
            dstCityName,
            srcRegionId,
            srcRegionName,
            srcProvinceId,
            srcProvinceName,
            srcCityId,
            srcCityName,
            vgwId,
            sctpVerificationTag,
            sctpIsHandshakeFlow,
            qosRuleId,
            qosRuleName,
            qosChannelId,
            qosChannelName,
            qosDropPackets,
            qosDropBytes,
            qosRuleType,
            qosChannelType,
            action,
            url,
            hitTime,
            ruleId,
            ruleName,
            ruleType,
            attackRule,
            attackRuleId,
            attackType,
            eventTime,
            level,
            packet,
            source,
            realIp,
            tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogVO {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    dstHost: ").append(toIndentedString(dstHost)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    packets: ").append(toIndentedString(packets)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    dstRegionId: ").append(toIndentedString(dstRegionId)).append("\n");
        sb.append("    dstRegionName: ").append(toIndentedString(dstRegionName)).append("\n");
        sb.append("    dstProvinceId: ").append(toIndentedString(dstProvinceId)).append("\n");
        sb.append("    dstProvinceName: ").append(toIndentedString(dstProvinceName)).append("\n");
        sb.append("    dstCityId: ").append(toIndentedString(dstCityId)).append("\n");
        sb.append("    dstCityName: ").append(toIndentedString(dstCityName)).append("\n");
        sb.append("    srcRegionId: ").append(toIndentedString(srcRegionId)).append("\n");
        sb.append("    srcRegionName: ").append(toIndentedString(srcRegionName)).append("\n");
        sb.append("    srcProvinceId: ").append(toIndentedString(srcProvinceId)).append("\n");
        sb.append("    srcProvinceName: ").append(toIndentedString(srcProvinceName)).append("\n");
        sb.append("    srcCityId: ").append(toIndentedString(srcCityId)).append("\n");
        sb.append("    srcCityName: ").append(toIndentedString(srcCityName)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    sctpVerificationTag: ").append(toIndentedString(sctpVerificationTag)).append("\n");
        sb.append("    sctpIsHandshakeFlow: ").append(toIndentedString(sctpIsHandshakeFlow)).append("\n");
        sb.append("    qosRuleId: ").append(toIndentedString(qosRuleId)).append("\n");
        sb.append("    qosRuleName: ").append(toIndentedString(qosRuleName)).append("\n");
        sb.append("    qosChannelId: ").append(toIndentedString(qosChannelId)).append("\n");
        sb.append("    qosChannelName: ").append(toIndentedString(qosChannelName)).append("\n");
        sb.append("    qosDropPackets: ").append(toIndentedString(qosDropPackets)).append("\n");
        sb.append("    qosDropBytes: ").append(toIndentedString(qosDropBytes)).append("\n");
        sb.append("    qosRuleType: ").append(toIndentedString(qosRuleType)).append("\n");
        sb.append("    qosChannelType: ").append(toIndentedString(qosChannelType)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    hitTime: ").append(toIndentedString(hitTime)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    attackRule: ").append(toIndentedString(attackRule)).append("\n");
        sb.append("    attackRuleId: ").append(toIndentedString(attackRuleId)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    packet: ").append(toIndentedString(packet)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    realIp: ").append(toIndentedString(realIp)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
