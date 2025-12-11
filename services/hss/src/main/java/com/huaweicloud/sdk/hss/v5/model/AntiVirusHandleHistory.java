package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 病毒查杀历史处置记录
 */
public class AntiVirusHandleHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_id")

    private String resultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware_type")

    private String malwareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malware_name")

    private String malwareName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occur_time")

    private Long occurTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_method")

    private String handleMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private String notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_time")

    private Long handleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public AntiVirusHandleHistory withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * **参数解释**： 病毒查杀结果ID **取值范围**： 字符长度1-64位 
     * @return resultId
     */
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public AntiVirusHandleHistory withMalwareType(String malwareType) {
        this.malwareType = malwareType;
        return this;
    }

    /**
     * **参数解释**： 病毒类型 **取值范围**： Trojan（木马）、Virus（病毒）、Worm（蠕虫）等 
     * @return malwareType
     */
    public String getMalwareType() {
        return malwareType;
    }

    public void setMalwareType(String malwareType) {
        this.malwareType = malwareType;
    }

    public AntiVirusHandleHistory withMalwareName(String malwareName) {
        this.malwareName = malwareName;
        return this;
    }

    /**
     * **参数解释**： 病毒名称 **取值范围**： 字符长度1-128位 
     * @return malwareName
     */
    public String getMalwareName() {
        return malwareName;
    }

    public void setMalwareName(String malwareName) {
        this.malwareName = malwareName;
    }

    public AntiVirusHandleHistory withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 威胁等级 **取值范围**： Security（安全）、Low（低危）、Medium（中危）、High（高危）、Critical（致命） 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public AntiVirusHandleHistory withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**： 文件路径 **取值范围**： 字符长度1-256位 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public AntiVirusHandleHistory withHostName(String hostName) {
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

    public AntiVirusHandleHistory withPrivateIp(String privateIp) {
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

    public AntiVirusHandleHistory withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 弹性公网IP地址 **取值范围**： 字符长度1-256位，支持IPv4或IPv6格式（IPv4长度7-15位，IPv6长度15-39位） 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public AntiVirusHandleHistory withAssetValue(String assetValue) {
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

    public AntiVirusHandleHistory withOccurTime(Long occurTime) {
        this.occurTime = occurTime;
        return this;
    }

    /**
     * **参数解释**： 发生时间，毫秒 **取值范围**： 最小值0，最大值9223372036854775807，时间格式：毫秒级时间戳（UTC时区，从1970-01-01 00:00:00开始计算），单位：ms 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return occurTime
     */
    public Long getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Long occurTime) {
        this.occurTime = occurTime;
    }

    public AntiVirusHandleHistory withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释**： 处理状态 **取值范围**： - unhandled：未处理 - handled：已处理 
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public AntiVirusHandleHistory withHandleMethod(String handleMethod) {
        this.handleMethod = handleMethod;
        return this;
    }

    /**
     * **参数解释**: 处理方式 **取值范围**: 包含如下:   - mark_as_handled：手动处理   - ignore：忽略   - add_to_alarm_whitelist：加入告警白名单   - isolate_and_kill：隔离文件   - unhandle：取消手动处理   - do_not_ignore：取消忽略   - remove_from_alarm_whitelist：删除告警白名单   - do_not_isolate_or_kill：取消隔离文件 
     * @return handleMethod
     */
    public String getHandleMethod() {
        return handleMethod;
    }

    public void setHandleMethod(String handleMethod) {
        this.handleMethod = handleMethod;
    }

    public AntiVirusHandleHistory withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * **参数解释** 备注信息 **取值范围** 字符长度0-512位 
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public AntiVirusHandleHistory withHandleTime(Long handleTime) {
        this.handleTime = handleTime;
        return this;
    }

    /**
     * **参数解释**: 处置时间 **取值范围**: 非负长整数，时间格式：毫秒级时间戳（UTC时区，从1970-01-01 00:00:00开始计算）；单位：ms 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return handleTime
     */
    public Long getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Long handleTime) {
        this.handleTime = handleTime;
    }

    public AntiVirusHandleHistory withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名 **取值范围**: 字符长度1-64位 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntiVirusHandleHistory that = (AntiVirusHandleHistory) obj;
        return Objects.equals(this.resultId, that.resultId) && Objects.equals(this.malwareType, that.malwareType)
            && Objects.equals(this.malwareName, that.malwareName) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.occurTime, that.occurTime)
            && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.handleMethod, that.handleMethod) && Objects.equals(this.notes, that.notes)
            && Objects.equals(this.handleTime, that.handleTime) && Objects.equals(this.userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId,
            malwareType,
            malwareName,
            severity,
            filePath,
            hostName,
            privateIp,
            publicIp,
            assetValue,
            occurTime,
            handleStatus,
            handleMethod,
            notes,
            handleTime,
            userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusHandleHistory {\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
        sb.append("    malwareType: ").append(toIndentedString(malwareType)).append("\n");
        sb.append("    malwareName: ").append(toIndentedString(malwareName)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    occurTime: ").append(toIndentedString(occurTime)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    handleMethod: ").append(toIndentedString(handleMethod)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    handleTime: ").append(toIndentedString(handleTime)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
