package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HttpQueryCfwAttackLogsResponseDTODataRecords
 */
public class HttpQueryCfwAttackLogsResponseDTODataRecords {

    /**
     * 方向，有内到外和外到内两种
     */
    public static final class DirectionEnum {

        /**
         * Enum OUT2IN for value: "out2in"
         */
        public static final DirectionEnum OUT2IN = new DirectionEnum("out2in");

        /**
         * Enum IN2OUT for value: "in2out"
         */
        public static final DirectionEnum IN2OUT = new DirectionEnum("in2out");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("out2in", OUT2IN);
            map.put("in2out", IN2OUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DirectionEnum(value));
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_time")

    private Long eventTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private String attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_rule")

    private String attackRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet_length")

    private Long packetLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_rule_id")

    private String attackRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_time")

    private Long hitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private String srcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private Integer srcPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private String dstIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private Integer dstPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packet")

    private String packet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packetMessages")

    private List<PacketMessage> packetMessages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_id")

    private String srcRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region_name")

    private String srcRegionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_region_id")

    private String dstRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_region_name")

    private String dstRegionName;

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

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 方向，有内到外和外到内两种
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 动作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * 事件时间，以毫秒为单位的时间戳，如1718936272648
     * @return eventTime
     */
    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }

    /**
     * 攻击类型
     * @return attackType
     */
    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withAttackRule(String attackRule) {
        this.attackRule = attackRule;
        return this;
    }

    /**
     * 攻击规则
     * @return attackRule
     */
    public String getAttackRule() {
        return attackRule;
    }

    public void setAttackRule(String attackRule) {
        this.attackRule = attackRule;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 威胁等级
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withPacketLength(Long packetLength) {
        this.packetLength = packetLength;
        return this;
    }

    /**
     * 报文长度
     * @return packetLength
     */
    public Long getPacketLength() {
        return packetLength;
    }

    public void setPacketLength(Long packetLength) {
        this.packetLength = packetLength;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withAttackRuleId(String attackRuleId) {
        this.attackRuleId = attackRuleId;
        return this;
    }

    /**
     * 攻击规则id
     * @return attackRuleId
     */
    public String getAttackRuleId() {
        return attackRuleId;
    }

    public void setAttackRuleId(String attackRuleId) {
        this.attackRuleId = attackRuleId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withHitTime(Long hitTime) {
        this.hitTime = hitTime;
        return this;
    }

    /**
     * 命中时间，以毫秒为单位的时间戳，如1718936272648
     * @return hitTime
     */
    public Long getHitTime() {
        return hitTime;
    }

    public void setHitTime(Long hitTime) {
        this.hitTime = hitTime;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 日志ID
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    /**
     * 源IP
     * @return srcIp
     */
    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    /**
     * 源端口
     * minimum: 0
     * maximum: 65535
     * @return srcPort
     */
    public Integer getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstIp(String dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    /**
     * 目的IP
     * @return dstIp
     */
    public String getDstIp() {
        return dstIp;
    }

    public void setDstIp(String dstIp) {
        this.dstIp = dstIp;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    /**
     * 目的端口
     * minimum: 0
     * maximum: 65535
     * @return dstPort
     */
    public Integer getDstPort() {
        return dstPort;
    }

    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withPacket(String packet) {
        this.packet = packet;
        return this;
    }

    /**
     * 攻击日志报文
     * @return packet
     */
    public String getPacket() {
        return packet;
    }

    public void setPacket(String packet) {
        this.packet = packet;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用协议
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withPacketMessages(List<PacketMessage> packetMessages) {
        this.packetMessages = packetMessages;
        return this;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords addPacketMessagesItem(PacketMessage packetMessagesItem) {
        if (this.packetMessages == null) {
            this.packetMessages = new ArrayList<>();
        }
        this.packetMessages.add(packetMessagesItem);
        return this;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withPacketMessages(
        Consumer<List<PacketMessage>> packetMessagesSetter) {
        if (this.packetMessages == null) {
            this.packetMessages = new ArrayList<>();
        }
        packetMessagesSetter.accept(this.packetMessages);
        return this;
    }

    /**
     * 攻击报文信息
     * @return packetMessages
     */
    public List<PacketMessage> getPacketMessages() {
        return packetMessages;
    }

    public void setPacketMessages(List<PacketMessage> packetMessages) {
        this.packetMessages = packetMessages;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
        return this;
    }

    /**
     * 源区域id
     * @return srcRegionId
     */
    public String getSrcRegionId() {
        return srcRegionId;
    }

    public void setSrcRegionId(String srcRegionId) {
        this.srcRegionId = srcRegionId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
        return this;
    }

    /**
     * 源区域名称
     * @return srcRegionName
     */
    public String getSrcRegionName() {
        return srcRegionName;
    }

    public void setSrcRegionName(String srcRegionName) {
        this.srcRegionName = srcRegionName;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
        return this;
    }

    /**
     * 目的区域id
     * @return dstRegionId
     */
    public String getDstRegionId() {
        return dstRegionId;
    }

    public void setDstRegionId(String dstRegionId) {
        this.dstRegionId = dstRegionId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
        return this;
    }

    /**
     * 目的区域名称
     * @return dstRegionName
     */
    public String getDstRegionName() {
        return dstRegionName;
    }

    public void setDstRegionName(String dstRegionName) {
        this.dstRegionName = dstRegionName;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcProvinceId(String srcProvinceId) {
        this.srcProvinceId = srcProvinceId;
        return this;
    }

    /**
     * 源省份id
     * @return srcProvinceId
     */
    public String getSrcProvinceId() {
        return srcProvinceId;
    }

    public void setSrcProvinceId(String srcProvinceId) {
        this.srcProvinceId = srcProvinceId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcProvinceName(String srcProvinceName) {
        this.srcProvinceName = srcProvinceName;
        return this;
    }

    /**
     * 源省份名称
     * @return srcProvinceName
     */
    public String getSrcProvinceName() {
        return srcProvinceName;
    }

    public void setSrcProvinceName(String srcProvinceName) {
        this.srcProvinceName = srcProvinceName;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcCityId(String srcCityId) {
        this.srcCityId = srcCityId;
        return this;
    }

    /**
     * 源城市id
     * @return srcCityId
     */
    public String getSrcCityId() {
        return srcCityId;
    }

    public void setSrcCityId(String srcCityId) {
        this.srcCityId = srcCityId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withSrcCityName(String srcCityName) {
        this.srcCityName = srcCityName;
        return this;
    }

    /**
     * 源城市名称
     * @return srcCityName
     */
    public String getSrcCityName() {
        return srcCityName;
    }

    public void setSrcCityName(String srcCityName) {
        this.srcCityName = srcCityName;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstProvinceId(String dstProvinceId) {
        this.dstProvinceId = dstProvinceId;
        return this;
    }

    /**
     * 目的省份id
     * @return dstProvinceId
     */
    public String getDstProvinceId() {
        return dstProvinceId;
    }

    public void setDstProvinceId(String dstProvinceId) {
        this.dstProvinceId = dstProvinceId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstProvinceName(String dstProvinceName) {
        this.dstProvinceName = dstProvinceName;
        return this;
    }

    /**
     * 目的省份名称
     * @return dstProvinceName
     */
    public String getDstProvinceName() {
        return dstProvinceName;
    }

    public void setDstProvinceName(String dstProvinceName) {
        this.dstProvinceName = dstProvinceName;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstCityId(String dstCityId) {
        this.dstCityId = dstCityId;
        return this;
    }

    /**
     * 目的城市id
     * @return dstCityId
     */
    public String getDstCityId() {
        return dstCityId;
    }

    public void setDstCityId(String dstCityId) {
        this.dstCityId = dstCityId;
    }

    public HttpQueryCfwAttackLogsResponseDTODataRecords withDstCityName(String dstCityName) {
        this.dstCityName = dstCityName;
        return this;
    }

    /**
     * 目的城市名称
     * @return dstCityName
     */
    public String getDstCityName() {
        return dstCityName;
    }

    public void setDstCityName(String dstCityName) {
        this.dstCityName = dstCityName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpQueryCfwAttackLogsResponseDTODataRecords that = (HttpQueryCfwAttackLogsResponseDTODataRecords) obj;
        return Objects.equals(this.direction, that.direction) && Objects.equals(this.action, that.action)
            && Objects.equals(this.eventTime, that.eventTime) && Objects.equals(this.attackType, that.attackType)
            && Objects.equals(this.attackRule, that.attackRule) && Objects.equals(this.level, that.level)
            && Objects.equals(this.source, that.source) && Objects.equals(this.packetLength, that.packetLength)
            && Objects.equals(this.attackRuleId, that.attackRuleId) && Objects.equals(this.hitTime, that.hitTime)
            && Objects.equals(this.logId, that.logId) && Objects.equals(this.srcIp, that.srcIp)
            && Objects.equals(this.srcPort, that.srcPort) && Objects.equals(this.dstIp, that.dstIp)
            && Objects.equals(this.dstPort, that.dstPort) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.packet, that.packet) && Objects.equals(this.app, that.app)
            && Objects.equals(this.packetMessages, that.packetMessages)
            && Objects.equals(this.srcRegionId, that.srcRegionId)
            && Objects.equals(this.srcRegionName, that.srcRegionName)
            && Objects.equals(this.dstRegionId, that.dstRegionId)
            && Objects.equals(this.dstRegionName, that.dstRegionName)
            && Objects.equals(this.srcProvinceId, that.srcProvinceId)
            && Objects.equals(this.srcProvinceName, that.srcProvinceName)
            && Objects.equals(this.srcCityId, that.srcCityId) && Objects.equals(this.srcCityName, that.srcCityName)
            && Objects.equals(this.dstProvinceId, that.dstProvinceId)
            && Objects.equals(this.dstProvinceName, that.dstProvinceName)
            && Objects.equals(this.dstCityId, that.dstCityId) && Objects.equals(this.dstCityName, that.dstCityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction,
            action,
            eventTime,
            attackType,
            attackRule,
            level,
            source,
            packetLength,
            attackRuleId,
            hitTime,
            logId,
            srcIp,
            srcPort,
            dstIp,
            dstPort,
            protocol,
            packet,
            app,
            packetMessages,
            srcRegionId,
            srcRegionName,
            dstRegionId,
            dstRegionName,
            srcProvinceId,
            srcProvinceName,
            srcCityId,
            srcCityName,
            dstProvinceId,
            dstProvinceName,
            dstCityId,
            dstCityName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpQueryCfwAttackLogsResponseDTODataRecords {\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    attackRule: ").append(toIndentedString(attackRule)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    packetLength: ").append(toIndentedString(packetLength)).append("\n");
        sb.append("    attackRuleId: ").append(toIndentedString(attackRuleId)).append("\n");
        sb.append("    hitTime: ").append(toIndentedString(hitTime)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    packet: ").append(toIndentedString(packet)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    packetMessages: ").append(toIndentedString(packetMessages)).append("\n");
        sb.append("    srcRegionId: ").append(toIndentedString(srcRegionId)).append("\n");
        sb.append("    srcRegionName: ").append(toIndentedString(srcRegionName)).append("\n");
        sb.append("    dstRegionId: ").append(toIndentedString(dstRegionId)).append("\n");
        sb.append("    dstRegionName: ").append(toIndentedString(dstRegionName)).append("\n");
        sb.append("    srcProvinceId: ").append(toIndentedString(srcProvinceId)).append("\n");
        sb.append("    srcProvinceName: ").append(toIndentedString(srcProvinceName)).append("\n");
        sb.append("    srcCityId: ").append(toIndentedString(srcCityId)).append("\n");
        sb.append("    srcCityName: ").append(toIndentedString(srcCityName)).append("\n");
        sb.append("    dstProvinceId: ").append(toIndentedString(dstProvinceId)).append("\n");
        sb.append("    dstProvinceName: ").append(toIndentedString(dstProvinceName)).append("\n");
        sb.append("    dstCityId: ").append(toIndentedString(dstCityId)).append("\n");
        sb.append("    dstCityName: ").append(toIndentedString(dstCityName)).append("\n");
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
