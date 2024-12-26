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
    @JsonProperty(value = "group_id")

    private String groupId;

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

    public CustomerIpsListVO withAction(Integer action) {
        this.action = action;
        return this;
    }

    /**
     * 动作（0：只记录日志，1：重置/拦截）
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
     * 操作系统
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
     * 攻击类型
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
     * 规则状态（0：初始化，1：配置中，2：配置成功，3：配置失败）
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
     * 内容json存储
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
     * 目的端口类型
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
     * 目的端口
     * @return dstPorts
     */
    public String getDstPorts() {
        return dstPorts;
    }

    public void setDstPorts(String dstPorts) {
        this.dstPorts = dstPorts;
    }

    public CustomerIpsListVO withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 防火墙集群id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public CustomerIpsListVO withIpsCfwId(String ipsCfwId) {
        this.ipsCfwId = ipsCfwId;
        return this;
    }

    /**
     * cfw侧自定义ips规则id
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
     * 山石侧规则id
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
     * ips规则名称
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
     * 协议
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
     * 严重程度（critical：致命，high：高危，medium:中危，low:低危）
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
     * 影响软件
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
     * 源端口类型
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
     * 源端口
     * @return srcPorts
     */
    public String getSrcPorts() {
        return srcPorts;
    }

    public void setSrcPorts(String srcPorts) {
        this.srcPorts = srcPorts;
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
            && Objects.equals(this.dstPorts, that.dstPorts) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.ipsCfwId, that.ipsCfwId) && Objects.equals(this.ipsId, that.ipsId)
            && Objects.equals(this.ipsName, that.ipsName) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.software, that.software)
            && Objects.equals(this.srcPortType, that.srcPortType) && Objects.equals(this.srcPorts, that.srcPorts);
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
            groupId,
            ipsCfwId,
            ipsId,
            ipsName,
            protocol,
            severity,
            software,
            srcPortType,
            srcPorts);
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
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    ipsCfwId: ").append(toIndentedString(ipsCfwId)).append("\n");
        sb.append("    ipsId: ").append(toIndentedString(ipsId)).append("\n");
        sb.append("    ipsName: ").append(toIndentedString(ipsName)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    software: ").append(toIndentedString(software)).append("\n");
        sb.append("    srcPortType: ").append(toIndentedString(srcPortType)).append("\n");
        sb.append("    srcPorts: ").append(toIndentedString(srcPorts)).append("\n");
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
