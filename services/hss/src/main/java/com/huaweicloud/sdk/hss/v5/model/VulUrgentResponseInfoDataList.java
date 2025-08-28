package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VulUrgentResponseInfoDataList
 */
public class VulUrgentResponseInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_list")

    private List<String> labelList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_priority")

    private String repairPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_success_num")

    private Integer repairSuccessNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_list")

    private List<VulUrgentResponseInfoCveList> cveList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_affected_business")

    private Boolean isAffectedBusiness;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_operate_types")

    private List<VulUrgentResponseInfoDisabledOperateTypes> disabledOperateTypes = null;

    public VulUrgentResponseInfoDataList withLabelList(List<String> labelList) {
        this.labelList = labelList;
        return this;
    }

    public VulUrgentResponseInfoDataList addLabelListItem(String labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public VulUrgentResponseInfoDataList withLabelList(Consumer<List<String>> labelListSetter) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /**
     * **参数解释**: 漏洞标签列表 **取值范围**: 最小值0，最大值2147483647 
     * @return labelList
     */
    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    public VulUrgentResponseInfoDataList withRepairPriority(String repairPriority) {
        this.repairPriority = repairPriority;
        return this;
    }

    /**
     * **参数解释**: 修复优先级 **取值范围**: - Critical：紧急。 - High：高。 - Medium：中。 - Low：低。 
     * @return repairPriority
     */
    public String getRepairPriority() {
        return repairPriority;
    }

    public void setRepairPriority(String repairPriority) {
        this.repairPriority = repairPriority;
    }

    public VulUrgentResponseInfoDataList withRepairSuccessNum(Integer repairSuccessNum) {
        this.repairSuccessNum = repairSuccessNum;
        return this;
    }

    /**
     * **参数解释**: 当前漏洞修复成功次数 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return repairSuccessNum
     */
    public Integer getRepairSuccessNum() {
        return repairSuccessNum;
    }

    public void setRepairSuccessNum(Integer repairSuccessNum) {
        this.repairSuccessNum = repairSuccessNum;
    }

    public VulUrgentResponseInfoDataList withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**: 漏洞ID **取值范围**: 字符范围0-64位 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public VulUrgentResponseInfoDataList withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**: 漏洞名称 **取值范围**: 字符范围0-256位 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public VulUrgentResponseInfoDataList withCveList(List<VulUrgentResponseInfoCveList> cveList) {
        this.cveList = cveList;
        return this;
    }

    public VulUrgentResponseInfoDataList addCveListItem(VulUrgentResponseInfoCveList cveListItem) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        this.cveList.add(cveListItem);
        return this;
    }

    public VulUrgentResponseInfoDataList withCveList(Consumer<List<VulUrgentResponseInfoCveList>> cveListSetter) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        cveListSetter.accept(this.cveList);
        return this;
    }

    /**
     * **参数解释**: CVE列表 **取值范围**: 最小值1，最大值10000 
     * @return cveList
     */
    public List<VulUrgentResponseInfoCveList> getCveList() {
        return cveList;
    }

    public void setCveList(List<VulUrgentResponseInfoCveList> cveList) {
        this.cveList = cveList;
    }

    public VulUrgentResponseInfoDataList withIsAffectedBusiness(Boolean isAffectedBusiness) {
        this.isAffectedBusiness = isAffectedBusiness;
        return this;
    }

    /**
     * **参数解释**: 是否影响业务 **取值范围**: - true：是。 - false：否。 
     * @return isAffectedBusiness
     */
    public Boolean getIsAffectedBusiness() {
        return isAffectedBusiness;
    }

    public void setIsAffectedBusiness(Boolean isAffectedBusiness) {
        this.isAffectedBusiness = isAffectedBusiness;
    }

    public VulUrgentResponseInfoDataList withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 主机ID **取值范围**: 字符长度1-64 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public VulUrgentResponseInfoDataList withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**: 服务器公网IP **取值范围**: 字符长度0-128 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public VulUrgentResponseInfoDataList withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**: 服务器私网IP **取值范围**: 字符长度0-128 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public VulUrgentResponseInfoDataList withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 主机名称 **取值范围**: 字符长度1-128位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public VulUrgentResponseInfoDataList withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释**: 修复优先级 **取值范围**: - Critical：紧急。 - High：高。 - Medium：中。 - Low：低。 
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public VulUrgentResponseInfoDataList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 漏洞状态 **取值范围**： 字符长度0-32位 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VulUrgentResponseInfoDataList withFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * **参数解释**: 首次扫描时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstScanTime
     */
    public Long getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    public VulUrgentResponseInfoDataList withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public VulUrgentResponseInfoDataList withDisabledOperateTypes(
        List<VulUrgentResponseInfoDisabledOperateTypes> disabledOperateTypes) {
        this.disabledOperateTypes = disabledOperateTypes;
        return this;
    }

    public VulUrgentResponseInfoDataList addDisabledOperateTypesItem(
        VulUrgentResponseInfoDisabledOperateTypes disabledOperateTypesItem) {
        if (this.disabledOperateTypes == null) {
            this.disabledOperateTypes = new ArrayList<>();
        }
        this.disabledOperateTypes.add(disabledOperateTypesItem);
        return this;
    }

    public VulUrgentResponseInfoDataList withDisabledOperateTypes(
        Consumer<List<VulUrgentResponseInfoDisabledOperateTypes>> disabledOperateTypesSetter) {
        if (this.disabledOperateTypes == null) {
            this.disabledOperateTypes = new ArrayList<>();
        }
        disabledOperateTypesSetter.accept(this.disabledOperateTypes);
        return this;
    }

    /**
     * **参数解释**: 该漏洞不可进行的操作类型列表 **取值范围**: 最小值1，最大值10000 
     * @return disabledOperateTypes
     */
    public List<VulUrgentResponseInfoDisabledOperateTypes> getDisabledOperateTypes() {
        return disabledOperateTypes;
    }

    public void setDisabledOperateTypes(List<VulUrgentResponseInfoDisabledOperateTypes> disabledOperateTypes) {
        this.disabledOperateTypes = disabledOperateTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulUrgentResponseInfoDataList that = (VulUrgentResponseInfoDataList) obj;
        return Objects.equals(this.labelList, that.labelList)
            && Objects.equals(this.repairPriority, that.repairPriority)
            && Objects.equals(this.repairSuccessNum, that.repairSuccessNum) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.vulName, that.vulName) && Objects.equals(this.cveList, that.cveList)
            && Objects.equals(this.isAffectedBusiness, that.isAffectedBusiness)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.status, that.status)
            && Objects.equals(this.firstScanTime, that.firstScanTime) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.disabledOperateTypes, that.disabledOperateTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelList,
            repairPriority,
            repairSuccessNum,
            vulId,
            vulName,
            cveList,
            isAffectedBusiness,
            hostId,
            publicIp,
            privateIp,
            hostName,
            assetValue,
            status,
            firstScanTime,
            scanTime,
            disabledOperateTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulUrgentResponseInfoDataList {\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    repairPriority: ").append(toIndentedString(repairPriority)).append("\n");
        sb.append("    repairSuccessNum: ").append(toIndentedString(repairSuccessNum)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    cveList: ").append(toIndentedString(cveList)).append("\n");
        sb.append("    isAffectedBusiness: ").append(toIndentedString(isAffectedBusiness)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    disabledOperateTypes: ").append(toIndentedString(disabledOperateTypes)).append("\n");
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
