package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 漏洞操作列表
 */
public class ChangeVulStatusRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "select_type")

    private String selectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<VulOperateInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_data_list")

    private List<HostVulOperateInfo> hostDataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_info_id")

    private String backupInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_backup_hosts")

    private List<ChangeVulStatusRequestInfoCustomBackupHosts> customBackupHosts = null;

    public ChangeVulStatusRequestInfo withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型 - ignore : 忽略 - not_ignore : 取消忽略 - immediate_repair : 修复 - manual_repair: 人工修复 - verify : 验证 - add_to_whitelist : 加入白名单
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public ChangeVulStatusRequestInfo withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ChangeVulStatusRequestInfo withSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }

    /**
     * 选择全部漏洞类型 - all_vul : 选择全部漏洞 - all_host : 选择全部主机漏洞
     * @return selectType
     */
    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public ChangeVulStatusRequestInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 漏洞类型，默认为linux_vul，包括如下：   - linux_vul : 漏洞类型-linux漏洞   - windows_vul : 漏洞类型-windows漏洞   - web_cms : Web-CMS漏洞   - app_vul : 应用漏洞   - urgent_vul : 应急漏洞
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ChangeVulStatusRequestInfo withDataList(List<VulOperateInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ChangeVulStatusRequestInfo addDataListItem(VulOperateInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ChangeVulStatusRequestInfo withDataList(Consumer<List<VulOperateInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 漏洞列表
     * @return dataList
     */
    public List<VulOperateInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<VulOperateInfo> dataList) {
        this.dataList = dataList;
    }

    public ChangeVulStatusRequestInfo withHostDataList(List<HostVulOperateInfo> hostDataList) {
        this.hostDataList = hostDataList;
        return this;
    }

    public ChangeVulStatusRequestInfo addHostDataListItem(HostVulOperateInfo hostDataListItem) {
        if (this.hostDataList == null) {
            this.hostDataList = new ArrayList<>();
        }
        this.hostDataList.add(hostDataListItem);
        return this;
    }

    public ChangeVulStatusRequestInfo withHostDataList(Consumer<List<HostVulOperateInfo>> hostDataListSetter) {
        if (this.hostDataList == null) {
            this.hostDataList = new ArrayList<>();
        }
        hostDataListSetter.accept(this.hostDataList);
        return this;
    }

    /**
     * 主机维度漏洞列表
     * @return hostDataList
     */
    public List<HostVulOperateInfo> getHostDataList() {
        return hostDataList;
    }

    public void setHostDataList(List<HostVulOperateInfo> hostDataList) {
        this.hostDataList = hostDataList;
    }

    public ChangeVulStatusRequestInfo withBackupInfoId(String backupInfoId) {
        this.backupInfoId = backupInfoId;
        return this;
    }

    /**
     * 本次漏洞处理的备份信息id，若不传该参数，则不进行备份
     * @return backupInfoId
     */
    public String getBackupInfoId() {
        return backupInfoId;
    }

    public void setBackupInfoId(String backupInfoId) {
        this.backupInfoId = backupInfoId;
    }

    public ChangeVulStatusRequestInfo withCustomBackupHosts(
        List<ChangeVulStatusRequestInfoCustomBackupHosts> customBackupHosts) {
        this.customBackupHosts = customBackupHosts;
        return this;
    }

    public ChangeVulStatusRequestInfo addCustomBackupHostsItem(
        ChangeVulStatusRequestInfoCustomBackupHosts customBackupHostsItem) {
        if (this.customBackupHosts == null) {
            this.customBackupHosts = new ArrayList<>();
        }
        this.customBackupHosts.add(customBackupHostsItem);
        return this;
    }

    public ChangeVulStatusRequestInfo withCustomBackupHosts(
        Consumer<List<ChangeVulStatusRequestInfoCustomBackupHosts>> customBackupHostsSetter) {
        if (this.customBackupHosts == null) {
            this.customBackupHosts = new ArrayList<>();
        }
        customBackupHostsSetter.accept(this.customBackupHosts);
        return this;
    }

    /**
     * 自定义备份主机使用的存储库及备份名称；不在该列表中的主机备份时系统会自动选取剩余空间最大的存储库，并自动生成备份名称
     * @return customBackupHosts
     */
    public List<ChangeVulStatusRequestInfoCustomBackupHosts> getCustomBackupHosts() {
        return customBackupHosts;
    }

    public void setCustomBackupHosts(List<ChangeVulStatusRequestInfoCustomBackupHosts> customBackupHosts) {
        this.customBackupHosts = customBackupHosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeVulStatusRequestInfo that = (ChangeVulStatusRequestInfo) obj;
        return Objects.equals(this.operateType, that.operateType) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.selectType, that.selectType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.dataList, that.dataList) && Objects.equals(this.hostDataList, that.hostDataList)
            && Objects.equals(this.backupInfoId, that.backupInfoId)
            && Objects.equals(this.customBackupHosts, that.customBackupHosts);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(operateType, remark, selectType, type, dataList, hostDataList, backupInfoId, customBackupHosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeVulStatusRequestInfo {\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    selectType: ").append(toIndentedString(selectType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    hostDataList: ").append(toIndentedString(hostDataList)).append("\n");
        sb.append("    backupInfoId: ").append(toIndentedString(backupInfoId)).append("\n");
        sb.append("    customBackupHosts: ").append(toIndentedString(customBackupHosts)).append("\n");
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
