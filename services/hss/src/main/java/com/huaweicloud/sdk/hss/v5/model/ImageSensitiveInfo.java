package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageSensitiveInfo
 */
public class ImageSensitiveInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive_info_id")

    private String sensitiveInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private String position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_accept")

    private String operateAccept;

    public ImageSensitiveInfo withSensitiveInfoId(String sensitiveInfoId) {
        this.sensitiveInfoId = sensitiveInfoId;
        return this;
    }

    /**
     * **参数解释**: 敏感事件编号 **取值范围**: 字符长度0-128位 
     * @return sensitiveInfoId
     */
    public String getSensitiveInfoId() {
        return sensitiveInfoId;
    }

    public void setSensitiveInfoId(String sensitiveInfoId) {
        this.sensitiveInfoId = sensitiveInfoId;
    }

    public ImageSensitiveInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**: 威胁等级 **取值范围**: - critical：致命。 - high：高危。 - medium：中危。 - low : 低危。 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ImageSensitiveInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 规则名称 **取值范围**: 字符长度0-128位 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageSensitiveInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 规则描述 **取值范围**: 字符长度0-128位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageSensitiveInfo withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * **参数解释**: 漏洞所在镜像层 **取值范围**: 字符长度0-128位 
     * @return position
     */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ImageSensitiveInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**: 文件路径 **取值范围**: 字符长度0-128位 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ImageSensitiveInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释**: 敏感信息内容 **取值范围**: 字符长度0-128位 
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ImageSensitiveInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**: 最后一次检测时间，时间单位 毫秒（ms） **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public ImageSensitiveInfo withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释**: 是否已处理 **取值范围**: - unhandled：未处理。 - handled：已处理。 
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public ImageSensitiveInfo withOperateAccept(String operateAccept) {
        this.operateAccept = operateAccept;
        return this;
    }

    /**
     * **参数解释**: 操作 **取值范围**: - ignore ：忽略。 - do_not_ignore ：取消忽略。 
     * @return operateAccept
     */
    public String getOperateAccept() {
        return operateAccept;
    }

    public void setOperateAccept(String operateAccept) {
        this.operateAccept = operateAccept;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageSensitiveInfo that = (ImageSensitiveInfo) obj;
        return Objects.equals(this.sensitiveInfoId, that.sensitiveInfoId)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.position, that.position)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.content, that.content)
            && Objects.equals(this.latestScanTime, that.latestScanTime)
            && Objects.equals(this.handleStatus, that.handleStatus)
            && Objects.equals(this.operateAccept, that.operateAccept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensitiveInfoId,
            severity,
            name,
            description,
            position,
            filePath,
            content,
            latestScanTime,
            handleStatus,
            operateAccept);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageSensitiveInfo {\n");
        sb.append("    sensitiveInfoId: ").append(toIndentedString(sensitiveInfoId)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    operateAccept: ").append(toIndentedString(operateAccept)).append("\n");
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
