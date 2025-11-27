package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导出数据的表头字段列表
 */
public class ExportWebTamperHostRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_protect_status")

    private String raspProtectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wtp_status")

    private String wtpStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_headers")

    private List<List<String>> exportHeaders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_size")

    private Integer exportSize;

    public ExportWebTamperHostRequestInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ExportWebTamperHostRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public ExportWebTamperHostRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public ExportWebTamperHostRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * **参数解释**: 服务器ID列表 **取值范围**: 不涉及 
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public ExportWebTamperHostRequestInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ExportWebTamperHostRequestInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP地址 **取值范围**： 字符长度1-256位 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ExportWebTamperHostRequestInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**： 服务器私有IP **取值范围**： 字符长度1-128位 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ExportWebTamperHostRequestInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: Agent ID。（已废弃，请使用host_id） **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ExportWebTamperHostRequestInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**： 操作系统类型 **取值范围**： - Linux：Linux。 - Windows：Windows。 
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ExportWebTamperHostRequestInfo withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释**： 资产重要性。 **取值范围**： - important ：重要资产。 - common ：一般资产。 - test ：测试资产。
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public ExportWebTamperHostRequestInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**: 服务器组名称 **取值范围**: 字符长度0-256位 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ExportWebTamperHostRequestInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态。（已废弃，请使用wtp_status）
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ExportWebTamperHostRequestInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**: Agent状态。 **约束限制**: 不涉及 **取值范围**: - not_installed：未安装。 - online：在线。 - offline：离线。  **默认取值**: 不涉及。 
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ExportWebTamperHostRequestInfo withRaspProtectStatus(String raspProtectStatus) {
        this.raspProtectStatus = raspProtectStatus;
        return this;
    }

    /**
     * 动态网页防篡改防护状态   - opened : 防护中   - closed : 未防护
     * @return raspProtectStatus
     */
    public String getRaspProtectStatus() {
        return raspProtectStatus;
    }

    public void setRaspProtectStatus(String raspProtectStatus) {
        this.raspProtectStatus = raspProtectStatus;
    }

    public ExportWebTamperHostRequestInfo withWtpStatus(String wtpStatus) {
        this.wtpStatus = wtpStatus;
        return this;
    }

    /**
     * **参数解释**: 网页防篡改防护状态 **取值范围**: - opening : 开启中。 - opened : 防护中。 - open_failed : 防护失败。 - partial_protection : 部分防护。 - protection_interruption : 防护中断。 
     * @return wtpStatus
     */
    public String getWtpStatus() {
        return wtpStatus;
    }

    public void setWtpStatus(String wtpStatus) {
        this.wtpStatus = wtpStatus;
    }

    public ExportWebTamperHostRequestInfo withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。（已废弃，请使用export_size）
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ExportWebTamperHostRequestInfo withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数。（已废弃，请使用export_size）
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ExportWebTamperHostRequestInfo withExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
        return this;
    }

    public ExportWebTamperHostRequestInfo addExportHeadersItem(List<String> exportHeadersItem) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        this.exportHeaders.add(exportHeadersItem);
        return this;
    }

    public ExportWebTamperHostRequestInfo withExportHeaders(Consumer<List<List<String>>> exportHeadersSetter) {
        if (this.exportHeaders == null) {
            this.exportHeaders = new ArrayList<>();
        }
        exportHeadersSetter.accept(this.exportHeaders);
        return this;
    }

    /**
     * **参数解释**: 导出数据表头信息详情 **约束限制**: 表头信息应为如下格式[[字段1,表头1显示名称],[字段2,表头2显示名称],[字段3,表头3显示名称]] **取值范围**: 可从如下取值中选取部分或全部组成表头信息 - host_name：服务器名称。 - host_id：服务器ID。 - public_ip：弹性公网IP地址。 - private_ip：私有IP地址。 - charging_mode：计费模式。 - agent_status：Agent状态。 - protect_status：防护状态。 - protect_dir_num：防护目录数。 - rasp_protect_status：动态防篡改状态。 - anti_tampering_times：静态防篡改攻击（近七天）。 - detect_tampering_times：动态防篡改攻击（近七天）。 - protect_dir：防护目录。 - exclude_child_dir：排除子目录。 - exclude_file_list：排除文件路径列表。 - local_backup_dir：本地备份路径。 - exclude_file_type：排除文件类型。 - dir_protect_status：防护目录状态。 - error：错误信息。  **默认取值**: 不涉及 
     * @return exportHeaders
     */
    public List<List<String>> getExportHeaders() {
        return exportHeaders;
    }

    public void setExportHeaders(List<List<String>> exportHeaders) {
        this.exportHeaders = exportHeaders;
    }

    public ExportWebTamperHostRequestInfo withExportSize(Integer exportSize) {
        this.exportSize = exportSize;
        return this;
    }

    /**
     * **参数解释**: 导出数据条数上限 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值200000 **默认取值**: 不涉及 
     * minimum: 1
     * maximum: 200000
     * @return exportSize
     */
    public Integer getExportSize() {
        return exportSize;
    }

    public void setExportSize(Integer exportSize) {
        this.exportSize = exportSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportWebTamperHostRequestInfo that = (ExportWebTamperHostRequestInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostIdList, that.hostIdList)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.assetValue, that.assetValue)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.raspProtectStatus, that.raspProtectStatus)
            && Objects.equals(this.wtpStatus, that.wtpStatus) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.exportHeaders, that.exportHeaders)
            && Objects.equals(this.exportSize, that.exportSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            hostIdList,
            hostName,
            publicIp,
            privateIp,
            agentId,
            osType,
            assetValue,
            groupName,
            protectStatus,
            agentStatus,
            raspProtectStatus,
            wtpStatus,
            offset,
            limit,
            exportHeaders,
            exportSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportWebTamperHostRequestInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    raspProtectStatus: ").append(toIndentedString(raspProtectStatus)).append("\n");
        sb.append("    wtpStatus: ").append(toIndentedString(wtpStatus)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    exportHeaders: ").append(toIndentedString(exportHeaders)).append("\n");
        sb.append("    exportSize: ").append(toIndentedString(exportSize)).append("\n");
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
