package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略信息
 */
public class AppWhitelistPolicyResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private String policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "learning_status")

    private String learningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "learning_days")

    private Integer learningDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specified_dir")

    private Boolean specifiedDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir_list")

    private List<String> dirList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_extension_list")

    private List<String> fileExtensionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intercept")

    private Boolean intercept;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_detect")

    private Boolean autoDetect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_effect_host_num")

    private Integer notEffectHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_host_num")

    private Integer effectHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_num")

    private Integer trustNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suspicious_num")

    private Integer suspiciousNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_num")

    private Integer maliciousNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknown_num")

    private Integer unknownNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_info_list")

    private List<AppWhitelistAbnormalInfo> abnormalInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_confirm")

    private Boolean autoConfirm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_policy")

    private Boolean defaultPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public AppWhitelistPolicyResponseInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public AppWhitelistPolicyResponseInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public AppWhitelistPolicyResponseInfo withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * **参数解释**： 进程白名单策略类型进程白名单策略类型 **取值范围**: - allow：允许指定/授权进程运行 - block：阻止潜在恶意软件运行 
     * @return policyType
     */
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public AppWhitelistPolicyResponseInfo withLearningStatus(String learningStatus) {
        this.learningStatus = learningStatus;
        return this;
    }

    /**
     * **参数解释**： 服务器名称 **约束限制**: 不涉及 **取值范围**: - effecting：学习完成，策略生效 - learned：学习完成，待确认 - learning：学习中 - pause：暂停 - abnormal：学习异常  **默认取值**: 不涉及 
     * @return learningStatus
     */
    public String getLearningStatus() {
        return learningStatus;
    }

    public void setLearningStatus(String learningStatus) {
        this.learningStatus = learningStatus;
    }

    public AppWhitelistPolicyResponseInfo withLearningDays(Integer learningDays) {
        this.learningDays = learningDays;
        return this;
    }

    /**
     * **参数解释**: 策略学习天数 **取值范围**: 最小值1，最大值1000 
     * minimum: 1
     * maximum: 1000
     * @return learningDays
     */
    public Integer getLearningDays() {
        return learningDays;
    }

    public void setLearningDays(Integer learningDays) {
        this.learningDays = learningDays;
    }

    public AppWhitelistPolicyResponseInfo withSpecifiedDir(Boolean specifiedDir) {
        this.specifiedDir = specifiedDir;
        return this;
    }

    /**
     * **参数解释**： 是否指定学习目录 **约束限制**： 不涉及 **取值范围**: - true：是 - false：否 **默认取值**： 不涉及 
     * @return specifiedDir
     */
    public Boolean getSpecifiedDir() {
        return specifiedDir;
    }

    public void setSpecifiedDir(Boolean specifiedDir) {
        this.specifiedDir = specifiedDir;
    }

    public AppWhitelistPolicyResponseInfo withDirList(List<String> dirList) {
        this.dirList = dirList;
        return this;
    }

    public AppWhitelistPolicyResponseInfo addDirListItem(String dirListItem) {
        if (this.dirList == null) {
            this.dirList = new ArrayList<>();
        }
        this.dirList.add(dirListItem);
        return this;
    }

    public AppWhitelistPolicyResponseInfo withDirList(Consumer<List<String>> dirListSetter) {
        if (this.dirList == null) {
            this.dirList = new ArrayList<>();
        }
        dirListSetter.accept(this.dirList);
        return this;
    }

    /**
     * 监控目录列表
     * @return dirList
     */
    public List<String> getDirList() {
        return dirList;
    }

    public void setDirList(List<String> dirList) {
        this.dirList = dirList;
    }

    public AppWhitelistPolicyResponseInfo withFileExtensionList(List<String> fileExtensionList) {
        this.fileExtensionList = fileExtensionList;
        return this;
    }

    public AppWhitelistPolicyResponseInfo addFileExtensionListItem(String fileExtensionListItem) {
        if (this.fileExtensionList == null) {
            this.fileExtensionList = new ArrayList<>();
        }
        this.fileExtensionList.add(fileExtensionListItem);
        return this;
    }

    public AppWhitelistPolicyResponseInfo withFileExtensionList(Consumer<List<String>> fileExtensionListSetter) {
        if (this.fileExtensionList == null) {
            this.fileExtensionList = new ArrayList<>();
        }
        fileExtensionListSetter.accept(this.fileExtensionList);
        return this;
    }

    /**
     * 监控文件后缀名列表
     * @return fileExtensionList
     */
    public List<String> getFileExtensionList() {
        return fileExtensionList;
    }

    public void setFileExtensionList(List<String> fileExtensionList) {
        this.fileExtensionList = fileExtensionList;
    }

    public AppWhitelistPolicyResponseInfo withIntercept(Boolean intercept) {
        this.intercept = intercept;
        return this;
    }

    /**
     * **参数解释**： 是否开启阻断 **取值范围**: - true：是 - false：否 
     * @return intercept
     */
    public Boolean getIntercept() {
        return intercept;
    }

    public void setIntercept(Boolean intercept) {
        this.intercept = intercept;
    }

    public AppWhitelistPolicyResponseInfo withAutoDetect(Boolean autoDetect) {
        this.autoDetect = autoDetect;
        return this;
    }

    /**
     * **参数解释**： 是否自动开启检测 **取值范围**: - true：是 - false：否 
     * @return autoDetect
     */
    public Boolean getAutoDetect() {
        return autoDetect;
    }

    public void setAutoDetect(Boolean autoDetect) {
        this.autoDetect = autoDetect;
    }

    public AppWhitelistPolicyResponseInfo withNotEffectHostNum(Integer notEffectHostNum) {
        this.notEffectHostNum = notEffectHostNum;
        return this;
    }

    /**
     * **参数解释**: 学习完成策略未生效主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return notEffectHostNum
     */
    public Integer getNotEffectHostNum() {
        return notEffectHostNum;
    }

    public void setNotEffectHostNum(Integer notEffectHostNum) {
        this.notEffectHostNum = notEffectHostNum;
    }

    public AppWhitelistPolicyResponseInfo withEffectHostNum(Integer effectHostNum) {
        this.effectHostNum = effectHostNum;
        return this;
    }

    /**
     * **参数解释**: 学习完成策略已生效主机数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return effectHostNum
     */
    public Integer getEffectHostNum() {
        return effectHostNum;
    }

    public void setEffectHostNum(Integer effectHostNum) {
        this.effectHostNum = effectHostNum;
    }

    public AppWhitelistPolicyResponseInfo withTrustNum(Integer trustNum) {
        this.trustNum = trustNum;
        return this;
    }

    /**
     * **参数解释**: 识别可信进程数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return trustNum
     */
    public Integer getTrustNum() {
        return trustNum;
    }

    public void setTrustNum(Integer trustNum) {
        this.trustNum = trustNum;
    }

    public AppWhitelistPolicyResponseInfo withSuspiciousNum(Integer suspiciousNum) {
        this.suspiciousNum = suspiciousNum;
        return this;
    }

    /**
     * **参数解释**: 识别可疑进程数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return suspiciousNum
     */
    public Integer getSuspiciousNum() {
        return suspiciousNum;
    }

    public void setSuspiciousNum(Integer suspiciousNum) {
        this.suspiciousNum = suspiciousNum;
    }

    public AppWhitelistPolicyResponseInfo withMaliciousNum(Integer maliciousNum) {
        this.maliciousNum = maliciousNum;
        return this;
    }

    /**
     * **参数解释**: 识别恶意进程数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return maliciousNum
     */
    public Integer getMaliciousNum() {
        return maliciousNum;
    }

    public void setMaliciousNum(Integer maliciousNum) {
        this.maliciousNum = maliciousNum;
    }

    public AppWhitelistPolicyResponseInfo withUnknownNum(Integer unknownNum) {
        this.unknownNum = unknownNum;
        return this;
    }

    /**
     * **参数解释**: 识别未知进程数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unknownNum
     */
    public Integer getUnknownNum() {
        return unknownNum;
    }

    public void setUnknownNum(Integer unknownNum) {
        this.unknownNum = unknownNum;
    }

    public AppWhitelistPolicyResponseInfo withAbnormalInfoList(List<AppWhitelistAbnormalInfo> abnormalInfoList) {
        this.abnormalInfoList = abnormalInfoList;
        return this;
    }

    public AppWhitelistPolicyResponseInfo addAbnormalInfoListItem(AppWhitelistAbnormalInfo abnormalInfoListItem) {
        if (this.abnormalInfoList == null) {
            this.abnormalInfoList = new ArrayList<>();
        }
        this.abnormalInfoList.add(abnormalInfoListItem);
        return this;
    }

    public AppWhitelistPolicyResponseInfo withAbnormalInfoList(
        Consumer<List<AppWhitelistAbnormalInfo>> abnormalInfoListSetter) {
        if (this.abnormalInfoList == null) {
            this.abnormalInfoList = new ArrayList<>();
        }
        abnormalInfoListSetter.accept(this.abnormalInfoList);
        return this;
    }

    /**
     * 学习异常原因列表
     * @return abnormalInfoList
     */
    public List<AppWhitelistAbnormalInfo> getAbnormalInfoList() {
        return abnormalInfoList;
    }

    public void setAbnormalInfoList(List<AppWhitelistAbnormalInfo> abnormalInfoList) {
        this.abnormalInfoList = abnormalInfoList;
    }

    public AppWhitelistPolicyResponseInfo withAutoConfirm(Boolean autoConfirm) {
        this.autoConfirm = autoConfirm;
        return this;
    }

    /**
     * **参数解释**： 是否自动确认学习结果 **取值范围**: - true：是 - false：否 
     * @return autoConfirm
     */
    public Boolean getAutoConfirm() {
        return autoConfirm;
    }

    public void setAutoConfirm(Boolean autoConfirm) {
        this.autoConfirm = autoConfirm;
    }

    public AppWhitelistPolicyResponseInfo withDefaultPolicy(Boolean defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
        return this;
    }

    /**
     * **参数解释**： 默认进程白名单策略 **取值范围**: - true：是 - false：否 
     * @return defaultPolicy
     */
    public Boolean getDefaultPolicy() {
        return defaultPolicy;
    }

    public void setDefaultPolicy(Boolean defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }

    public AppWhitelistPolicyResponseInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public AppWhitelistPolicyResponseInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public AppWhitelistPolicyResponseInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 主机id集合
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppWhitelistPolicyResponseInfo that = (AppWhitelistPolicyResponseInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.policyType, that.policyType)
            && Objects.equals(this.learningStatus, that.learningStatus)
            && Objects.equals(this.learningDays, that.learningDays)
            && Objects.equals(this.specifiedDir, that.specifiedDir) && Objects.equals(this.dirList, that.dirList)
            && Objects.equals(this.fileExtensionList, that.fileExtensionList)
            && Objects.equals(this.intercept, that.intercept) && Objects.equals(this.autoDetect, that.autoDetect)
            && Objects.equals(this.notEffectHostNum, that.notEffectHostNum)
            && Objects.equals(this.effectHostNum, that.effectHostNum) && Objects.equals(this.trustNum, that.trustNum)
            && Objects.equals(this.suspiciousNum, that.suspiciousNum)
            && Objects.equals(this.maliciousNum, that.maliciousNum) && Objects.equals(this.unknownNum, that.unknownNum)
            && Objects.equals(this.abnormalInfoList, that.abnormalInfoList)
            && Objects.equals(this.autoConfirm, that.autoConfirm)
            && Objects.equals(this.defaultPolicy, that.defaultPolicy)
            && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            policyType,
            learningStatus,
            learningDays,
            specifiedDir,
            dirList,
            fileExtensionList,
            intercept,
            autoDetect,
            notEffectHostNum,
            effectHostNum,
            trustNum,
            suspiciousNum,
            maliciousNum,
            unknownNum,
            abnormalInfoList,
            autoConfirm,
            defaultPolicy,
            hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppWhitelistPolicyResponseInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    learningStatus: ").append(toIndentedString(learningStatus)).append("\n");
        sb.append("    learningDays: ").append(toIndentedString(learningDays)).append("\n");
        sb.append("    specifiedDir: ").append(toIndentedString(specifiedDir)).append("\n");
        sb.append("    dirList: ").append(toIndentedString(dirList)).append("\n");
        sb.append("    fileExtensionList: ").append(toIndentedString(fileExtensionList)).append("\n");
        sb.append("    intercept: ").append(toIndentedString(intercept)).append("\n");
        sb.append("    autoDetect: ").append(toIndentedString(autoDetect)).append("\n");
        sb.append("    notEffectHostNum: ").append(toIndentedString(notEffectHostNum)).append("\n");
        sb.append("    effectHostNum: ").append(toIndentedString(effectHostNum)).append("\n");
        sb.append("    trustNum: ").append(toIndentedString(trustNum)).append("\n");
        sb.append("    suspiciousNum: ").append(toIndentedString(suspiciousNum)).append("\n");
        sb.append("    maliciousNum: ").append(toIndentedString(maliciousNum)).append("\n");
        sb.append("    unknownNum: ").append(toIndentedString(unknownNum)).append("\n");
        sb.append("    abnormalInfoList: ").append(toIndentedString(abnormalInfoList)).append("\n");
        sb.append("    autoConfirm: ").append(toIndentedString(autoConfirm)).append("\n");
        sb.append("    defaultPolicy: ").append(toIndentedString(defaultPolicy)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
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
