package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 创建防护策略。若开启勒索防护，新建防护策略，则protection_policy_id为空，create_protection_policy必选 **约束限制**: 不涉及 **取值范围**: 字符长度0-64位 **默认取值**: 不涉及 
 */
public class ProtectionProxyInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_mode")

    private String protectionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bait_protection_status")

    private String baitProtectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_directory")

    private String protectionDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_type")

    private String protectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_directory")

    private String excludeDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_detection_status")

    private String runtimeDetectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_system")

    private String operatingSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_whitelist")

    private List<TrustProcessInfo> processWhitelist = null;

    public ProtectionProxyInfoRequestInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**: 策略ID，新建策略可不填。 **约束限制**: 不涉及 **取值范围**: 字符长度0-64 **默认取值**: 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ProtectionProxyInfoRequestInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数解释**: 策略名称，新建防护策略则必填 **约束限制**: 不涉及 **取值范围**: 字符长度0-64 **默认取值**: 不涉及
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ProtectionProxyInfoRequestInfo withProtectionMode(String protectionMode) {
        this.protectionMode = protectionMode;
        return this;
    }

    /**
     * **参数解释**: 防护动作，新建防护策略则必填 **约束限制**: 不涉及 **取值范围**: 包含如下：   - alarm_and_isolation ：告警并自动隔离。   - alarm_only ：仅告警。 **默认取值**: 不涉及
     * @return protectionMode
     */
    public String getProtectionMode() {
        return protectionMode;
    }

    public void setProtectionMode(String protectionMode) {
        this.protectionMode = protectionMode;
    }

    public ProtectionProxyInfoRequestInfo withBaitProtectionStatus(String baitProtectionStatus) {
        this.baitProtectionStatus = baitProtectionStatus;
        return this;
    }

    /**
     * **参数解释**: 是否开启诱饵防护，新建防护策略则必填。 **约束限制**: 不涉及 **取值范围**: 包含如下1种：   - opened ：开启。 **默认取值**: 不涉及
     * @return baitProtectionStatus
     */
    public String getBaitProtectionStatus() {
        return baitProtectionStatus;
    }

    public void setBaitProtectionStatus(String baitProtectionStatus) {
        this.baitProtectionStatus = baitProtectionStatus;
    }

    public ProtectionProxyInfoRequestInfo withProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
        return this;
    }

    /**
     * **参数解释**: 防护目录，新建防护策略则必填。 **约束限制**: 多个目录请用英文分号隔开，最多支持填写20个防护目录 **取值范围**: 字符长度0-128位，特殊符号只允许使用._-+，不能以空格开头，防护目录长度不得超过256个字符。 **默认取值**: 不涉及 
     * @return protectionDirectory
     */
    public String getProtectionDirectory() {
        return protectionDirectory;
    }

    public void setProtectionDirectory(String protectionDirectory) {
        this.protectionDirectory = protectionDirectory;
    }

    public ProtectionProxyInfoRequestInfo withProtectionType(String protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * **参数解释**: 需要防护的文件类型，新建防护策略则必填 **约束限制**: 不涉及 **取值范围**: txt、csv、rtf、doc、docx、xls、xlsx、ppt、pptx、pdf、xml、json、sql、mdf、dbf、ldf、db、myd、wdb、si、cfs、cfe、fnm、fdx、fdt、tvx、tvf、tvd、tim、nvd、nvm、dvd、dvm、jpeg、bmp、gif、png、tiff、eps、mp3、mp4、avi、mpg、wmv、RMVB、mov、3pg、swf、flv、rar、gz、tgz、zip、7z、cpp、c、java、asp、php、python、html、js、vdi、vmdk、vdx、ovf、qcow2、vmem、vswp、img、bak、back、cer、crt、pem、key、csr **默认取值**: 不涉及 
     * @return protectionType
     */
    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

    public ProtectionProxyInfoRequestInfo withExcludeDirectory(String excludeDirectory) {
        this.excludeDirectory = excludeDirectory;
        return this;
    }

    /**
     * **参数解释**: 排除目录(选填) **约束限制**: 多个目录请用英文分号隔开，最多支持填写20个排除目录 **取值范围**: 字符长度0-128位，特殊符号只允许使用._-+，不能以空格开头，防护目录长度不得超过256个字符。 **默认取值**: 不涉及 
     * @return excludeDirectory
     */
    public String getExcludeDirectory() {
        return excludeDirectory;
    }

    public void setExcludeDirectory(String excludeDirectory) {
        this.excludeDirectory = excludeDirectory;
    }

    public ProtectionProxyInfoRequestInfo withRuntimeDetectionStatus(String runtimeDetectionStatus) {
        this.runtimeDetectionStatus = runtimeDetectionStatus;
        return this;
    }

    /**
     * **参数解释**: 是否运行时检测 **约束限制**: 不涉及 **取值范围**: 暂时只有关闭一种状态，为预留字段。   - closed ：关闭。 **默认取值**: 不涉及
     * @return runtimeDetectionStatus
     */
    public String getRuntimeDetectionStatus() {
        return runtimeDetectionStatus;
    }

    public void setRuntimeDetectionStatus(String runtimeDetectionStatus) {
        this.runtimeDetectionStatus = runtimeDetectionStatus;
    }

    public ProtectionProxyInfoRequestInfo withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * **参数解释**: 支持该策略的操作系统，新建防护策略则必填 **约束限制**: 不涉及 **取值范围**: 包含两种：   - Windows : Windows系统   - Linux : Linux系统 **默认取值**: 不涉及
     * @return operatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ProtectionProxyInfoRequestInfo withProcessWhitelist(List<TrustProcessInfo> processWhitelist) {
        this.processWhitelist = processWhitelist;
        return this;
    }

    public ProtectionProxyInfoRequestInfo addProcessWhitelistItem(TrustProcessInfo processWhitelistItem) {
        if (this.processWhitelist == null) {
            this.processWhitelist = new ArrayList<>();
        }
        this.processWhitelist.add(processWhitelistItem);
        return this;
    }

    public ProtectionProxyInfoRequestInfo withProcessWhitelist(
        Consumer<List<TrustProcessInfo>> processWhitelistSetter) {
        if (this.processWhitelist == null) {
            this.processWhitelist = new ArrayList<>();
        }
        processWhitelistSetter.accept(this.processWhitelist);
        return this;
    }

    /**
     * 进程白名单
     * @return processWhitelist
     */
    public List<TrustProcessInfo> getProcessWhitelist() {
        return processWhitelist;
    }

    public void setProcessWhitelist(List<TrustProcessInfo> processWhitelist) {
        this.processWhitelist = processWhitelist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectionProxyInfoRequestInfo that = (ProtectionProxyInfoRequestInfo) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.protectionMode, that.protectionMode)
            && Objects.equals(this.baitProtectionStatus, that.baitProtectionStatus)
            && Objects.equals(this.protectionDirectory, that.protectionDirectory)
            && Objects.equals(this.protectionType, that.protectionType)
            && Objects.equals(this.excludeDirectory, that.excludeDirectory)
            && Objects.equals(this.runtimeDetectionStatus, that.runtimeDetectionStatus)
            && Objects.equals(this.operatingSystem, that.operatingSystem)
            && Objects.equals(this.processWhitelist, that.processWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId,
            policyName,
            protectionMode,
            baitProtectionStatus,
            protectionDirectory,
            protectionType,
            excludeDirectory,
            runtimeDetectionStatus,
            operatingSystem,
            processWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectionProxyInfoRequestInfo {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    protectionMode: ").append(toIndentedString(protectionMode)).append("\n");
        sb.append("    baitProtectionStatus: ").append(toIndentedString(baitProtectionStatus)).append("\n");
        sb.append("    protectionDirectory: ").append(toIndentedString(protectionDirectory)).append("\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    excludeDirectory: ").append(toIndentedString(excludeDirectory)).append("\n");
        sb.append("    runtimeDetectionStatus: ").append(toIndentedString(runtimeDetectionStatus)).append("\n");
        sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
        sb.append("    processWhitelist: ").append(toIndentedString(processWhitelist)).append("\n");
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
