package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户自定义告警白名单规则
 */
public class AntiVirusEventWhiteRuleListRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_key")

    private String fieldKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_value")

    private String fieldValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "judge_type")

    private String judgeType;

    public AntiVirusEventWhiteRuleListRequestInfo withEventType(Integer eventType) {
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

    public AntiVirusEventWhiteRuleListRequestInfo withFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }

    /**
     * 加白字段，包含如下: - file_path ：文件路径
     * @return fieldKey
     */
    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public AntiVirusEventWhiteRuleListRequestInfo withFieldValue(String fieldValue) {
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

    public AntiVirusEventWhiteRuleListRequestInfo withJudgeType(String judgeType) {
        this.judgeType = judgeType;
        return this;
    }

    /**
     * 通配符，包含如下: - equal ：相等 - contain ：包含
     * @return judgeType
     */
    public String getJudgeType() {
        return judgeType;
    }

    public void setJudgeType(String judgeType) {
        this.judgeType = judgeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AntiVirusEventWhiteRuleListRequestInfo that = (AntiVirusEventWhiteRuleListRequestInfo) obj;
        return Objects.equals(this.eventType, that.eventType) && Objects.equals(this.fieldKey, that.fieldKey)
            && Objects.equals(this.fieldValue, that.fieldValue) && Objects.equals(this.judgeType, that.judgeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, fieldKey, fieldValue, judgeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiVirusEventWhiteRuleListRequestInfo {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
        sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
        sb.append("    judgeType: ").append(toIndentedString(judgeType)).append("\n");
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
