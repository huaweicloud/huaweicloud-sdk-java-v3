package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomerIpsListVO
 */
public class CustomerIpsListVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private Integer action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affected_os")

    private Integer affectedOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_type")

    private Integer attackType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private Integer configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port_type")

    private Integer dstPortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ports")

    private String dstPorts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_cfw_id")

    private String ipsCfwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_id")

    private String ipsId;

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
    @JsonProperty(value = "src_port_type")

    private Integer srcPortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ports")

    private String srcPorts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public CustomerIpsListVO withAction(Integer action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 自定义IPS规则执行动作,仅更新自定义IPS规则场景下需要设置，其他场景无需设置 **约束限制**：   不涉及 **取值范围**： 0：只记录日志 1：重置/拦截 **默认取值**：   不涉及
     * @return action
     */
    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public CustomerIpsListVO withAffectedOs(Integer affectedOs) {
        this.affectedOs = affectedOs;
        return this;
    }

    /**
     * **参数解释**： 影响操作系统 **约束限制**：   不涉及 **取值范围**：   0：ANY   1：Windows   2：Linux   3：FreeBSD   4：Solaris   5：Other Unix   6：网络设备   7：Mac OS   8：IOS   9：Android   10：Others   **默认取值**：   不涉及
     * @return affectedOs
     */
    public Integer getAffectedOs() {
        return affectedOs;
    }

    public void setAffectedOs(Integer affectedOs) {
        this.affectedOs = affectedOs;
    }

    public CustomerIpsListVO withAttackType(Integer attackType) {
        this.attackType = attackType;
        return this;
    }

    /**
     * **参数解释**： 攻击类型 **约束限制**： 不涉及 **取值范围**： 1：访问控制 2：漏洞扫描 3：邮件攻击 4：漏洞攻击 5：Web攻击 6：密码攻击 7：劫持攻击 8：协议异常 9：特洛伊木马 10：蠕虫 11：缓冲区溢出 12：黑客工具 13：间谍软件 14：DDos泛洪 15：应用层DDos攻击 16：其他可疑行为 17：可疑DNS活动 18：网络钓鱼 19：垃圾邮件 20：其他攻击 **默认取值**： 不涉及
     * @return attackType
     */
    public Integer getAttackType() {
        return attackType;
    }

    public void setAttackType(Integer attackType) {
        this.attackType = attackType;
    }

    public CustomerIpsListVO withConfigStatus(Integer configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * **参数解释**： 规则配置状态 **约束限制**：   不涉及 **取值范围**： 0：初始化 1：配置中 2：配置成功 3：配置失败 **默认取值**：   不涉及
     * @return configStatus
     */
    public Integer getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(Integer configStatus) {
        this.configStatus = configStatus;
    }

    public CustomerIpsListVO withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**： 匹配IPS攻击的内容 **约束限制**：   不涉及 **取值范围**： 不涉及 **默认取值**：   不涉及
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CustomerIpsListVO withDstPortType(Integer dstPortType) {
        this.dstPortType = dstPortType;
        return this;
    }

    /**
     * **参数解释**： 端口操作类型 **约束限制**：   不涉及 **取值范围**： -1：Any 0：包含 1：排除 **默认取值**：   不涉及
     * @return dstPortType
     */
    public Integer getDstPortType() {
        return dstPortType;
    }

    public void setDstPortType(Integer dstPortType) {
        this.dstPortType = dstPortType;
    }

    public CustomerIpsListVO withDstPorts(String dstPorts) {
        this.dstPorts = dstPorts;
        return this;
    }

    /**
     * **参数解释**： 端口 **约束限制**：   不涉及 **取值范围**： 1 - 65535 **默认取值**：   不涉及
     * @return dstPorts
     */
    public String getDstPorts() {
        return dstPorts;
    }

    public void setDstPorts(String dstPorts) {
        this.dstPorts = dstPorts;
    }

    public CustomerIpsListVO withIpsCfwId(String ipsCfwId) {
        this.ipsCfwId = ipsCfwId;
        return this;
    }

    /**
     * **参数解释**： cfw侧自定义IPS规则id **约束限制**： 不涉及 **取值范围**： 32位UUID **默认取值**： 不涉及
     * @return ipsCfwId
     */
    public String getIpsCfwId() {
        return ipsCfwId;
    }

    public void setIpsCfwId(String ipsCfwId) {
        this.ipsCfwId = ipsCfwId;
    }

    public CustomerIpsListVO withIpsId(String ipsId) {
        this.ipsId = ipsId;
        return this;
    }

    /**
     * **参数解释**： ips规则ID， 可通过调用获取ips规则列表获取，通过data.records.ips_id获取。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return ipsId
     */
    public String getIpsId() {
        return ipsId;
    }

    public void setIpsId(String ipsId) {
        this.ipsId = ipsId;
    }

    public CustomerIpsListVO withIpsName(String ipsName) {
        this.ipsName = ipsName;
        return this;
    }

    /**
     * **参数解释**： ips规则名称 **约束限制**：   不涉及 **取值范围**： 不涉及 **默认取值**：   不涉及
     * @return ipsName
     */
    public String getIpsName() {
        return ipsName;
    }

    public void setIpsName(String ipsName) {
        this.ipsName = ipsName;
    }

    public CustomerIpsListVO withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**： 协议类型 **约束限制**：   不涉及 **取值范围**：   1：FTP   2：TELNET   3：SMTP   4：DNS_TCP   5：DNS_UDP   6：DHCP   7：TFTP   8：FINGER   9：HTTP   10：POP3   11：SUNRPC_TCP   12：SUNRPC_UDP   13：NNTP   14：MSRPC_TCP   15：MSRPC_UDP   16：NETBIOS_NAME_TCP   17：NETBIOS_NAME_UDP   18：NETBIOS_SMB   19：NETBIOS_DATAGRAM   20：IMAP4   21：SNMP   22：LDAP   23：MSSQL   24：ORACLE   **默认取值**：   不涉及
     * @return protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public CustomerIpsListVO withSeverity(Integer severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 严重程度 **约束限制**： 不涉及 **取值范围**： 0：致命 1：高危 2：中危 3：低危 **默认取值**： 不涉及
     * @return severity
     */
    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public CustomerIpsListVO withSoftware(Integer software) {
        this.software = software;
        return this;
    }

    /**
     * **参数解释**： 影响软件 **约束限制**：   不涉及 **取值范围**： 0：ANY 1：ADOBE 2：APACHE 3：APPLE 4：CA 5：CISCO 6：GOOGLE_CHROME 7：HP 8：IBM 9：IE 10：IIS 11：MC_AFEE 12：MEDIA_PLAYER 13：MICROSOFT_NET 14：MICROSOFT_EDGE 15：MICROSOFT_EXCHANGE 16：MICROSOFT_OFFICE 17：MICROSOFT_OUTLOOK 18：MICROSOFT_SHARE_POINT 19：MICROSOFT_WINDOWS 20：MOZILLA 21：MSSQL 22：MYSQL 23：NOVELL 24：ORACLE 25：SAMBA 26：SAMSUNG 27：SAP 28：SCADA 29：SQUID 30：SUN 31：SYMANTEC 32：TREND_MICRO 33：VMWARE 34：WORD_PRESS 35：Others **默认取值**：   不涉及
     * @return software
     */
    public Integer getSoftware() {
        return software;
    }

    public void setSoftware(Integer software) {
        this.software = software;
    }

    public CustomerIpsListVO withSrcPortType(Integer srcPortType) {
        this.srcPortType = srcPortType;
        return this;
    }

    /**
     * **参数解释**： 端口操作类型 **约束限制**：   不涉及 **取值范围**： -1：Any 0：包含 1：排除 **默认取值**：   不涉及
     * @return srcPortType
     */
    public Integer getSrcPortType() {
        return srcPortType;
    }

    public void setSrcPortType(Integer srcPortType) {
        this.srcPortType = srcPortType;
    }

    public CustomerIpsListVO withSrcPorts(String srcPorts) {
        this.srcPorts = srcPorts;
        return this;
    }

    /**
     * **参数解释**： 端口 **约束限制**：   不涉及 **取值范围**： 不涉及 **默认取值**：   不涉及
     * @return srcPorts
     */
    public String getSrcPorts() {
        return srcPorts;
    }

    public void setSrcPorts(String srcPorts) {
        this.srcPorts = srcPorts;
    }

    public CustomerIpsListVO withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 集群ID **约束限制**：   不涉及 **取值范围**： 不涉及 **默认取值**：   不涉及
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomerIpsListVO that = (CustomerIpsListVO) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.affectedOs, that.affectedOs)
            && Objects.equals(this.attackType, that.attackType) && Objects.equals(this.configStatus, that.configStatus)
            && Objects.equals(this.content, that.content) && Objects.equals(this.dstPortType, that.dstPortType)
            && Objects.equals(this.dstPorts, that.dstPorts) && Objects.equals(this.ipsCfwId, that.ipsCfwId)
            && Objects.equals(this.ipsId, that.ipsId) && Objects.equals(this.ipsName, that.ipsName)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.software, that.software) && Objects.equals(this.srcPortType, that.srcPortType)
            && Objects.equals(this.srcPorts, that.srcPorts) && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            affectedOs,
            attackType,
            configStatus,
            content,
            dstPortType,
            dstPorts,
            ipsCfwId,
            ipsId,
            ipsName,
            protocol,
            severity,
            software,
            srcPortType,
            srcPorts,
            groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerIpsListVO {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    affectedOs: ").append(toIndentedString(affectedOs)).append("\n");
        sb.append("    attackType: ").append(toIndentedString(attackType)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    dstPortType: ").append(toIndentedString(dstPortType)).append("\n");
        sb.append("    dstPorts: ").append(toIndentedString(dstPorts)).append("\n");
        sb.append("    ipsCfwId: ").append(toIndentedString(ipsCfwId)).append("\n");
        sb.append("    ipsId: ").append(toIndentedString(ipsId)).append("\n");
        sb.append("    ipsName: ").append(toIndentedString(ipsName)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    software: ").append(toIndentedString(software)).append("\n");
        sb.append("    srcPortType: ").append(toIndentedString(srcPortType)).append("\n");
        sb.append("    srcPorts: ").append(toIndentedString(srcPorts)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
