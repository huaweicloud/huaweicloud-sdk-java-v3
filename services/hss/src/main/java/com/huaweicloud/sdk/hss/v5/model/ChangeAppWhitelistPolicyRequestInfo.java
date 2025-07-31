package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改策略
 */
public class ChangeAppWhitelistPolicyRequestInfo {

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
    @JsonProperty(value = "learning_days")

    private Integer learningDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specified_dir")

    private Boolean specifiedDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intercept")

    private Boolean intercept;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_confirm")

    private Boolean autoConfirm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_detect")

    private Boolean autoDetect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir_list")

    private List<String> dirList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_list")

    private List<String> extList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public ChangeAppWhitelistPolicyRequestInfo withPolicyId(String policyId) {
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

    public ChangeAppWhitelistPolicyRequestInfo withPolicyName(String policyName) {
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

    public ChangeAppWhitelistPolicyRequestInfo withPolicyType(String policyType) {
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

    public ChangeAppWhitelistPolicyRequestInfo withLearningDays(Integer learningDays) {
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

    public ChangeAppWhitelistPolicyRequestInfo withSpecifiedDir(Boolean specifiedDir) {
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

    public ChangeAppWhitelistPolicyRequestInfo withIntercept(Boolean intercept) {
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

    public ChangeAppWhitelistPolicyRequestInfo withAutoConfirm(Boolean autoConfirm) {
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

    public ChangeAppWhitelistPolicyRequestInfo withAutoDetect(Boolean autoDetect) {
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

    public ChangeAppWhitelistPolicyRequestInfo withDirList(List<String> dirList) {
        this.dirList = dirList;
        return this;
    }

    public ChangeAppWhitelistPolicyRequestInfo addDirListItem(String dirListItem) {
        if (this.dirList == null) {
            this.dirList = new ArrayList<>();
        }
        this.dirList.add(dirListItem);
        return this;
    }

    public ChangeAppWhitelistPolicyRequestInfo withDirList(Consumer<List<String>> dirListSetter) {
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

    public ChangeAppWhitelistPolicyRequestInfo withExtList(List<String> extList) {
        this.extList = extList;
        return this;
    }

    public ChangeAppWhitelistPolicyRequestInfo addExtListItem(String extListItem) {
        if (this.extList == null) {
            this.extList = new ArrayList<>();
        }
        this.extList.add(extListItem);
        return this;
    }

    public ChangeAppWhitelistPolicyRequestInfo withExtList(Consumer<List<String>> extListSetter) {
        if (this.extList == null) {
            this.extList = new ArrayList<>();
        }
        extListSetter.accept(this.extList);
        return this;
    }

    /**
     * 监控文件后缀名列表
     * @return extList
     */
    public List<String> getExtList() {
        return extList;
    }

    public void setExtList(List<String> extList) {
        this.extList = extList;
    }

    public ChangeAppWhitelistPolicyRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public ChangeAppWhitelistPolicyRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public ChangeAppWhitelistPolicyRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 主机id列表
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
        ChangeAppWhitelistPolicyRequestInfo that = (ChangeAppWhitelistPolicyRequestInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.policyType, that.policyType) && Objects.equals(this.learningDays, that.learningDays)
            && Objects.equals(this.specifiedDir, that.specifiedDir) && Objects.equals(this.intercept, that.intercept)
            && Objects.equals(this.autoConfirm, that.autoConfirm) && Objects.equals(this.autoDetect, that.autoDetect)
            && Objects.equals(this.dirList, that.dirList) && Objects.equals(this.extList, that.extList)
            && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            policyType,
            learningDays,
            specifiedDir,
            intercept,
            autoConfirm,
            autoDetect,
            dirList,
            extList,
            hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeAppWhitelistPolicyRequestInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    learningDays: ").append(toIndentedString(learningDays)).append("\n");
        sb.append("    specifiedDir: ").append(toIndentedString(specifiedDir)).append("\n");
        sb.append("    intercept: ").append(toIndentedString(intercept)).append("\n");
        sb.append("    autoConfirm: ").append(toIndentedString(autoConfirm)).append("\n");
        sb.append("    autoDetect: ").append(toIndentedString(autoDetect)).append("\n");
        sb.append("    dirList: ").append(toIndentedString(dirList)).append("\n");
        sb.append("    extList: ").append(toIndentedString(extList)).append("\n");
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
