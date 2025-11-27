package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RaspProtectHistoryResponseInfo
 */
public class RaspProtectHistoryResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_time")

    private Long alarmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_src_ip")

    private String reqSrcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_stack")

    private String appStack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_input_name")

    private String attackInputName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_input_value")

    private String attackInputValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_string")

    private String queryString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_headers")

    private String reqHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_method")

    private String reqMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_params")

    private String reqParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_path")

    private String reqPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_protocol")

    private String reqProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_url")

    private String reqUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attack_tag")

    private String attackTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_probe")

    private String chkProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_rule")

    private String chkRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_rule_desc")

    private String chkRuleDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_bug")

    private String existBug;

    public RaspProtectHistoryResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public RaspProtectHistoryResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 主机私有IP
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public RaspProtectHistoryResponseInfo withAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }

    /**
     * 告警时间(ms)
     * minimum: 0
     * maximum: 9223372036854775807
     * @return alarmTime
     */
    public Long getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
    }

    public RaspProtectHistoryResponseInfo withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 告警名称
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public RaspProtectHistoryResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 告警级别
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public RaspProtectHistoryResponseInfo withReqSrcIp(String reqSrcIp) {
        this.reqSrcIp = reqSrcIp;
        return this;
    }

    /**
     * 源IP
     * @return reqSrcIp
     */
    public String getReqSrcIp() {
        return reqSrcIp;
    }

    public void setReqSrcIp(String reqSrcIp) {
        this.reqSrcIp = reqSrcIp;
    }

    public RaspProtectHistoryResponseInfo withAppStack(String appStack) {
        this.appStack = appStack;
        return this;
    }

    /**
     * 应用程序调用堆栈信息
     * @return appStack
     */
    public String getAppStack() {
        return appStack;
    }

    public void setAppStack(String appStack) {
        this.appStack = appStack;
    }

    public RaspProtectHistoryResponseInfo withAttackInputName(String attackInputName) {
        this.attackInputName = attackInputName;
        return this;
    }

    /**
     * 攻击附属字段
     * @return attackInputName
     */
    public String getAttackInputName() {
        return attackInputName;
    }

    public void setAttackInputName(String attackInputName) {
        this.attackInputName = attackInputName;
    }

    public RaspProtectHistoryResponseInfo withAttackInputValue(String attackInputValue) {
        this.attackInputValue = attackInputValue;
        return this;
    }

    /**
     * 攻击负载内容
     * @return attackInputValue
     */
    public String getAttackInputValue() {
        return attackInputValue;
    }

    public void setAttackInputValue(String attackInputValue) {
        this.attackInputValue = attackInputValue;
    }

    public RaspProtectHistoryResponseInfo withQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * 查询字符串
     * @return queryString
     */
    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public RaspProtectHistoryResponseInfo withReqHeaders(String reqHeaders) {
        this.reqHeaders = reqHeaders;
        return this;
    }

    /**
     * web请求头信息
     * @return reqHeaders
     */
    public String getReqHeaders() {
        return reqHeaders;
    }

    public void setReqHeaders(String reqHeaders) {
        this.reqHeaders = reqHeaders;
    }

    public RaspProtectHistoryResponseInfo withReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
        return this;
    }

    /**
     * WEB请求方法
     * @return reqMethod
     */
    public String getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }

    public RaspProtectHistoryResponseInfo withReqParams(String reqParams) {
        this.reqParams = reqParams;
        return this;
    }

    /**
     * WEB请求参数
     * @return reqParams
     */
    public String getReqParams() {
        return reqParams;
    }

    public void setReqParams(String reqParams) {
        this.reqParams = reqParams;
    }

    public RaspProtectHistoryResponseInfo withReqPath(String reqPath) {
        this.reqPath = reqPath;
        return this;
    }

    /**
     * WEB请求路径
     * @return reqPath
     */
    public String getReqPath() {
        return reqPath;
    }

    public void setReqPath(String reqPath) {
        this.reqPath = reqPath;
    }

    public RaspProtectHistoryResponseInfo withReqProtocol(String reqProtocol) {
        this.reqProtocol = reqProtocol;
        return this;
    }

    /**
     * WEB请求协议
     * @return reqProtocol
     */
    public String getReqProtocol() {
        return reqProtocol;
    }

    public void setReqProtocol(String reqProtocol) {
        this.reqProtocol = reqProtocol;
    }

    public RaspProtectHistoryResponseInfo withReqUrl(String reqUrl) {
        this.reqUrl = reqUrl;
        return this;
    }

    /**
     * WEB请求URL地址
     * @return reqUrl
     */
    public String getReqUrl() {
        return reqUrl;
    }

    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl;
    }

    public RaspProtectHistoryResponseInfo withAttackTag(String attackTag) {
        this.attackTag = attackTag;
        return this;
    }

    /**
     * 攻击标识
     * @return attackTag
     */
    public String getAttackTag() {
        return attackTag;
    }

    public void setAttackTag(String attackTag) {
        this.attackTag = attackTag;
    }

    public RaspProtectHistoryResponseInfo withChkProbe(String chkProbe) {
        this.chkProbe = chkProbe;
        return this;
    }

    /**
     * 探针标识
     * @return chkProbe
     */
    public String getChkProbe() {
        return chkProbe;
    }

    public void setChkProbe(String chkProbe) {
        this.chkProbe = chkProbe;
    }

    public RaspProtectHistoryResponseInfo withChkRule(String chkRule) {
        this.chkRule = chkRule;
        return this;
    }

    /**
     * 检测规则标识
     * @return chkRule
     */
    public String getChkRule() {
        return chkRule;
    }

    public void setChkRule(String chkRule) {
        this.chkRule = chkRule;
    }

    public RaspProtectHistoryResponseInfo withChkRuleDesc(String chkRuleDesc) {
        this.chkRuleDesc = chkRuleDesc;
        return this;
    }

    /**
     * 规则描述
     * @return chkRuleDesc
     */
    public String getChkRuleDesc() {
        return chkRuleDesc;
    }

    public void setChkRuleDesc(String chkRuleDesc) {
        this.chkRuleDesc = chkRuleDesc;
    }

    public RaspProtectHistoryResponseInfo withExistBug(String existBug) {
        this.existBug = existBug;
        return this;
    }

    /**
     * 应用是否存在bug
     * @return existBug
     */
    public String getExistBug() {
        return existBug;
    }

    public void setExistBug(String existBug) {
        this.existBug = existBug;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RaspProtectHistoryResponseInfo that = (RaspProtectHistoryResponseInfo) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.alarmTime, that.alarmTime) && Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.reqSrcIp, that.reqSrcIp)
            && Objects.equals(this.appStack, that.appStack)
            && Objects.equals(this.attackInputName, that.attackInputName)
            && Objects.equals(this.attackInputValue, that.attackInputValue)
            && Objects.equals(this.queryString, that.queryString) && Objects.equals(this.reqHeaders, that.reqHeaders)
            && Objects.equals(this.reqMethod, that.reqMethod) && Objects.equals(this.reqParams, that.reqParams)
            && Objects.equals(this.reqPath, that.reqPath) && Objects.equals(this.reqProtocol, that.reqProtocol)
            && Objects.equals(this.reqUrl, that.reqUrl) && Objects.equals(this.attackTag, that.attackTag)
            && Objects.equals(this.chkProbe, that.chkProbe) && Objects.equals(this.chkRule, that.chkRule)
            && Objects.equals(this.chkRuleDesc, that.chkRuleDesc) && Objects.equals(this.existBug, that.existBug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName,
            privateIp,
            alarmTime,
            eventName,
            severity,
            reqSrcIp,
            appStack,
            attackInputName,
            attackInputValue,
            queryString,
            reqHeaders,
            reqMethod,
            reqParams,
            reqPath,
            reqProtocol,
            reqUrl,
            attackTag,
            chkProbe,
            chkRule,
            chkRuleDesc,
            existBug);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RaspProtectHistoryResponseInfo {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    alarmTime: ").append(toIndentedString(alarmTime)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    reqSrcIp: ").append(toIndentedString(reqSrcIp)).append("\n");
        sb.append("    appStack: ").append(toIndentedString(appStack)).append("\n");
        sb.append("    attackInputName: ").append(toIndentedString(attackInputName)).append("\n");
        sb.append("    attackInputValue: ").append(toIndentedString(attackInputValue)).append("\n");
        sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
        sb.append("    reqHeaders: ").append(toIndentedString(reqHeaders)).append("\n");
        sb.append("    reqMethod: ").append(toIndentedString(reqMethod)).append("\n");
        sb.append("    reqParams: ").append(toIndentedString(reqParams)).append("\n");
        sb.append("    reqPath: ").append(toIndentedString(reqPath)).append("\n");
        sb.append("    reqProtocol: ").append(toIndentedString(reqProtocol)).append("\n");
        sb.append("    reqUrl: ").append(toIndentedString(reqUrl)).append("\n");
        sb.append("    attackTag: ").append(toIndentedString(attackTag)).append("\n");
        sb.append("    chkProbe: ").append(toIndentedString(chkProbe)).append("\n");
        sb.append("    chkRule: ").append(toIndentedString(chkRule)).append("\n");
        sb.append("    chkRuleDesc: ").append(toIndentedString(chkRuleDesc)).append("\n");
        sb.append("    existBug: ").append(toIndentedString(existBug)).append("\n");
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
