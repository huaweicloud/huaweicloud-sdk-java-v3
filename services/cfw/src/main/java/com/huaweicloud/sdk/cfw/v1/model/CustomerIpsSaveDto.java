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
 * CustomerIpsSaveDto
 */
public class CustomerIpsSaveDto {

    /**
     * **参数解释**： 动作 **取值范围**： 0：只记录日志，1：重置/拦截
     */
    public static final class ActionTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ActionTypeEnum NUMBER_0 = new ActionTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ActionTypeEnum NUMBER_1 = new ActionTypeEnum(1);

        private static final Map<Integer, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ActionTypeEnum> createStaticFields() {
            Map<Integer, ActionTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ActionTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionTypeEnum(value));
        }

        public static ActionTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    /**
     * **参数解释**： 影响操作系统 **取值范围**： 0 any、1 Windows、2 Linux、3 FreeBSD、4 Solaris、5 other Unix、6 网络设备、7 Mac OS、8 ios、9 android、10 others
     */
    public static final class AffectedOsEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AffectedOsEnum NUMBER_0 = new AffectedOsEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AffectedOsEnum NUMBER_1 = new AffectedOsEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final AffectedOsEnum NUMBER_2 = new AffectedOsEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final AffectedOsEnum NUMBER_3 = new AffectedOsEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final AffectedOsEnum NUMBER_4 = new AffectedOsEnum(4);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final AffectedOsEnum NUMBER_5 = new AffectedOsEnum(5);

        /**
         * Enum NUMBER_6 for value: 6
         */
        public static final AffectedOsEnum NUMBER_6 = new AffectedOsEnum(6);

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final AffectedOsEnum NUMBER_7 = new AffectedOsEnum(7);

        /**
         * Enum NUMBER_8 for value: 8
         */
        public static final AffectedOsEnum NUMBER_8 = new AffectedOsEnum(8);

        /**
         * Enum NUMBER_9 for value: 9
         */
        public static final AffectedOsEnum NUMBER_9 = new AffectedOsEnum(9);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final AffectedOsEnum NUMBER_10 = new AffectedOsEnum(10);

        private static final Map<Integer, AffectedOsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AffectedOsEnum> createStaticFields() {
            Map<Integer, AffectedOsEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            map.put(5, NUMBER_5);
            map.put(6, NUMBER_6);
            map.put(7, NUMBER_7);
            map.put(8, NUMBER_8);
            map.put(9, NUMBER_9);
            map.put(10, NUMBER_10);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AffectedOsEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AffectedOsEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AffectedOsEnum(value));
        }

        public static AffectedOsEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AffectedOsEnum) {
                return this.value.equals(((AffectedOsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_os")

    private AffectedOsEnum affectedOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private Integer attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents")

    private List<IpsContent> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private Integer direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private Port dstPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_name")

    private String ipsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private Integer protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private Integer severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "software")

    private Integer software;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_port")

    private Port srcPort;

    public CustomerIpsSaveDto withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释**： 动作 **取值范围**： 0：只记录日志，1：重置/拦截
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public CustomerIpsSaveDto withAffectedOs(AffectedOsEnum affectedOs) {
        this.affectedOs = affectedOs;
        return this;
    }

    /**
     * **参数解释**： 影响操作系统 **取值范围**： 0 any、1 Windows、2 Linux、3 FreeBSD、4 Solaris、5 other Unix、6 网络设备、7 Mac OS、8 ios、9 android、10 others
     * @return affectedOs
     */
    public AffectedOsEnum getAffectedOs() {
        return affectedOs;
    }

    public void setAffectedOs(AffectedOsEnum affectedOs) {
        this.affectedOs = affectedOs;
    }

    public CustomerIpsSaveDto withAttackType(Integer attackType) {
        this.attackType = attackType;
        return this;
    }

    /**
     * **参数解释**： 攻击类型 **约束限制**： 不涉及 **取值范围**： 1：访问控制、2：漏洞扫描、3：邮件攻击、4：漏洞攻击、5：Web攻击、6：密码攻击、7：劫持攻击、8：协议异常、9：特洛伊木马、10：蠕虫、11：缓冲区溢出、12：黑客工具、13：间谍软件、14：DDos泛洪、15：应用层DDos攻击、16：其他可疑行为、17：可疑DNS活动、18：网络钓鱼、19：垃圾邮件、20：其他攻击 **默认取值**： 不涉及
     * minimum: 1
     * maximum: 20
     * @return attackType
     */
    public Integer getAttackType() {
        return attackType;
    }

    public void setAttackType(Integer attackType) {
        this.attackType = attackType;
    }

    public CustomerIpsSaveDto withContents(List<IpsContent> contents) {
        this.contents = contents;
        return this;
    }

    public CustomerIpsSaveDto addContentsItem(IpsContent contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public CustomerIpsSaveDto withContents(Consumer<List<IpsContent>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * **参数解释**： 匹配IPS攻击的内容 **取值范围**：
     * @return contents
     */
    public List<IpsContent> getContents() {
        return contents;
    }

    public void setContents(List<IpsContent> contents) {
        this.contents = contents;
    }

    public CustomerIpsSaveDto withDirection(Integer direction) {
        this.direction = direction;
        return this;
    }

    /**
     * **参数解释**： 默认：null，0：客户端到服务端，1：服务端到客户端 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 1
     * @return direction
     */
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public CustomerIpsSaveDto withDstPort(Port dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    public CustomerIpsSaveDto withDstPort(Consumer<Port> dstPortSetter) {
        if (this.dstPort == null) {
            this.dstPort = new Port();
            dstPortSetter.accept(this.dstPort);
        }

        return this;
    }

    /**
     * Get dstPort
     * @return dstPort
     */
    public Port getDstPort() {
        return dstPort;
    }

    public void setDstPort(Port dstPort) {
        this.dstPort = dstPort;
    }

    public CustomerIpsSaveDto withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * **参数解释**： 防火墙ID，用户创建防火墙实例后产生的唯一ID，配置后可区分不同防火墙，可通过[防火墙ID获取方式](cfw_02_0028.xml)获取 **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public CustomerIpsSaveDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释**： 防护对象ID，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志ID，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得 **约束限制**： type为0时，object_id为互联网边界防护对象ID，type为1时，object_id为VPC边界防护对象ID，type可通过data.records.protect_objects.type（.表示各对象之间层级的区分）获得 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public CustomerIpsSaveDto withIpsName(String ipsName) {
        this.ipsName = ipsName;
        return this;
    }

    /**
     * **参数解释**： ips规则名称 **取值范围**： 不涉及
     * @return ipsName
     */
    public String getIpsName() {
        return ipsName;
    }

    public void setIpsName(String ipsName) {
        this.ipsName = ipsName;
    }

    public CustomerIpsSaveDto withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 协议类型 **取值范围**： 1 FTP、2 TELNET、3 SMTP、4 DNS_TCP、5 DNS_UDP、6 DHCP、7 TFTP、8 FINGER、9 HTTP、10 POP3、11 SUNRPC_TCP、12 SUNRPC_UDP、13 NNTP、14 MSRPC_TCP、15 MSRPC_UDP、16 NETBIOS_NAME_TCP、17 NETBIOS_NAME_UDP、18 NETBIOS_SMB、19 NETBIOS_DATAGRAM、20 IMAP4、21 SNMP、22 LDAP、23 MSSQL、24 ORACLE
     * minimum: 1
     * maximum: 24
     * @return protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public CustomerIpsSaveDto withSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 严重程度 **取值范围**： critical：致命，high：高危，medium:中危，low:低危
     * minimum: 0
     * maximum: 3
     * @return severity
     */
    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public CustomerIpsSaveDto withSoftware(Integer software) {
        this.software = software;
        return this;
    }

    /**
     * **参数解释**： 影响软件 **取值范围**： 0 ANY、1 ADOBE、2 APACHE、3 APPLE、4 CA、5 CISCO、6 GOOGLE_CHROME、7 HP、8 IBM、9 IE、10 IIS、11 MC_AFEE、12 MEDIA_PLAYER、13 MICROSOFT_NET、14 MICROSOFT_EDGE、15 MICROSOFT_EXCHANGE、16 MICROSOFT_OFFICE、17 MICROSOFT_OUTLOOK、18 MICROSOFT_SHARE_POINT、19 MICROSOFT_WINDOWS、20 MOZILLA、21 MSSQL、22 MYSQL、23 NOVELL、24 ORACLE、25 SAMBA、26 SAMSUNG、27 SAP、28 SCADA、29 SQUID、30 SUN、31 SYMANTEC、32 TREND_MICRO、33 VMWARE、34 WORD_PRESS、35 Others
     * minimum: 0
     * maximum: 35
     * @return software
     */
    public Integer getSoftware() {
        return software;
    }

    public void setSoftware(Integer software) {
        this.software = software;
    }

    public CustomerIpsSaveDto withSrcPort(Port srcPort) {
        this.srcPort = srcPort;
        return this;
    }

    public CustomerIpsSaveDto withSrcPort(Consumer<Port> srcPortSetter) {
        if (this.srcPort == null) {
            this.srcPort = new Port();
            srcPortSetter.accept(this.srcPort);
        }

        return this;
    }

    /**
     * Get srcPort
     * @return srcPort
     */
    public Port getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Port srcPort) {
        this.srcPort = srcPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomerIpsSaveDto that = (CustomerIpsSaveDto) obj;
        return Objects.equals(this.actionType, that.actionType) && Objects.equals(this.affectedOs, that.affectedOs)
            && Objects.equals(this.attackType, that.attackType) && Objects.equals(this.contents, that.contents)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.dstPort, that.dstPort)
            && Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.ipsName, that.ipsName) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.software, that.software)
            && Objects.equals(this.srcPort, that.srcPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionType,
            affectedOs,
            attackType,
            contents,
            direction,
            dstPort,
            fwInstanceId,
            objectId,
            ipsName,
            protocol,
            severity,
            software,
            srcPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerIpsSaveDto {\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    affectedOs: ").append(toIndentedString(affectedOs)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    ipsName: ").append(toIndentedString(ipsName)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    software: ").append(toIndentedString(software)).append("\n");
        sb.append("    srcPort: ").append(toIndentedString(srcPort)).append("\n");
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
