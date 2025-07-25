package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警白名单
 */
public class AlarmWhiteListRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_white_rule")

    private Boolean deleteWhiteRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_field")

    private String whiteField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "judge_type")

    private String judgeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_value")

    private String fieldValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_hash")

    private String fileHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    public AlarmWhiteListRequestInfo withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，包含如下:   - 1001 : 通用恶意软件   - 1002 : 病毒   - 1003 : 蠕虫   - 1004 : 木马   - 1005 : 僵尸网络   - 1006 : 后门   - 1010 : Rootkit   - 1011 : 勒索软件   - 1012 ：黑客工具   - 1015 : Webshell   - 1016 : 挖矿   - 1017 : 反弹Shell   - 2001 : 一般漏洞利用   - 2012 : 远程代码执行   - 2047 : Redis漏洞利用   - 2048 : Hadoop漏洞利用   - 2049 : MySQL漏洞利用   - 3002 : 文件提权   - 3003 : 进程提权   - 3004 : 关键文件变更   - 3005 : 文件/目录变更   - 3007 : 进程异常行为   - 3015 : 高危命令执行   - 3018 : 异常Shell   - 3027 : Crontab可疑任务   - 3029 ：系统安全防护被禁用   - 3030 ：备份删除   - 3031 ：异常注册表操作   - 3036 : 容器镜像阻断   - 4002 : 暴力破解   - 4004 : 异常登录   - 4006 : 非法系统账号   - 4014 : 用户账号添加   - 4020 : 用户密码窃取   - 6002 : 端口扫描   - 6003 : 主机扫描   - 13001 : Kubernetes事件删除   - 13002 : Pod异常行为   - 13003 : 枚举用户信息   - 13004 : 绑定集群用户角色
     * minimum: 1000
     * maximum: 30000
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public AlarmWhiteListRequestInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * 事件白名单SHA256
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public AlarmWhiteListRequestInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AlarmWhiteListRequestInfo withDeleteWhiteRule(Boolean deleteWhiteRule) {
        this.deleteWhiteRule = deleteWhiteRule;
        return this;
    }

    /**
     * 是否删除告警白名单规则(仅删除的白名单是规则类型时使用)
     * @return deleteWhiteRule
     */
    public Boolean getDeleteWhiteRule() {
        return deleteWhiteRule;
    }

    public void setDeleteWhiteRule(Boolean deleteWhiteRule) {
        this.deleteWhiteRule = deleteWhiteRule;
    }

    public AlarmWhiteListRequestInfo withWhiteField(String whiteField) {
        this.whiteField = whiteField;
        return this;
    }

    /**
     * 加白字段，包含如下: - \"file_path\" # 文件路径 - \"process_path\" # 进程路径 - \"login_ip\" # 登录ip - \"reg_key\" #注册表key - \"process_cmdline\" # 进程命令行 - \"username\" # 用户名
     * @return whiteField
     */
    public String getWhiteField() {
        return whiteField;
    }

    public void setWhiteField(String whiteField) {
        this.whiteField = whiteField;
    }

    public AlarmWhiteListRequestInfo withJudgeType(String judgeType) {
        this.judgeType = judgeType;
        return this;
    }

    /**
     * 通配符，包含如下: - \"equal\" # 相等 - \"not_equal\" #不相等 - \"contain\" # 包含 - \"not_contain\" # 不包含
     * @return judgeType
     */
    public String getJudgeType() {
        return judgeType;
    }

    public void setJudgeType(String judgeType) {
        this.judgeType = judgeType;
    }

    public AlarmWhiteListRequestInfo withFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }

    /**
     * 加白字段值
     * @return fieldValue
     */
    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public AlarmWhiteListRequestInfo withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * 文件哈希
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public AlarmWhiteListRequestInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmWhiteListRequestInfo that = (AlarmWhiteListRequestInfo) obj;
        return Objects.equals(this.eventType, that.eventType) && Objects.equals(this.hash, that.hash)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.deleteWhiteRule, that.deleteWhiteRule)
            && Objects.equals(this.whiteField, that.whiteField) && Objects.equals(this.judgeType, that.judgeType)
            && Objects.equals(this.fieldValue, that.fieldValue) && Objects.equals(this.fileHash, that.fileHash)
            && Objects.equals(this.filePath, that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(eventType, hash, description, deleteWhiteRule, whiteField, judgeType, fieldValue, fileHash, filePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmWhiteListRequestInfo {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deleteWhiteRule: ").append(toIndentedString(deleteWhiteRule)).append("\n");
        sb.append("    whiteField: ").append(toIndentedString(whiteField)).append("\n");
        sb.append("    judgeType: ").append(toIndentedString(judgeType)).append("\n");
        sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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
