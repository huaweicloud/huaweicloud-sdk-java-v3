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
     * **参数解释** 应用防护事件所属云服务器的名称，用于标识事件来源主机 **取值范围** 字符长度1-64位，支持中文、英文、数字、短横线、下划线，符合华为云ECS命名规范 
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
     * **参数解释** 应用防护事件所属云服务器的私有IP地址，用于定位事件来源主机的网络位置 **取值范围** 符合IPv4格式的字符串（如192.168.0.97），支持多个私有IP用逗号分隔 
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
     * **参数解释** 应用防护事件的发生时间，以Unix时间戳（毫秒级）表示 **时间格式** 可转换为YYYY-MM-DD HH:MM:SS格式（如1736414463000对应2024-12-10 10:41:03） **取值范围** Unix时间戳（毫秒级），取值0-为当前系统时间戳 
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
     * **参数解释** 应用防护事件的具体名称，标识事件对应的攻击类型（如ExpressionInject表示表达式注入攻击） **取值范围** 字符长度1-128位，支持英文、数字、下划线，为系统预定义的攻击类型标识 
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
     * **参数解释** 应用防护事件的告警级别，用于筛选指定严重程度的事件 **约束限制** 取值必须在指定范围内，否则返回空结果 **取值范围** - Security：信息级 - Low：低危 - Medium：中危 - High：高危 - Critical：紧急 **默认取值** 无 
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
     * **参数解释** 发起攻击的源IP地址，可能是公网IP或内网IP，用于定位攻击来源 **取值范围** 符合IPv4或IPv6格式的字符串，支持单个IP或IP段（如127.0.0.1、2001:db8::1） 
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
     * **参数解释** 应用防护事件发生时的应用程序调用堆栈信息，用于定位漏洞触发点 **取值范围** 字符长度0-4096位，支持英文、数字、符号等堆栈信息常见字符，为空表示无堆栈数据 
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
     * **参数解释** 攻击请求中的附属字段名称（如请求头字段、表单字段等），用于标识攻击载荷的传入字段 **取值范围** 字符长度0-256位，支持英文、数字、符号等HTTP请求字段常见字符，为空表示无相关字段 
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
     * **参数解释** 攻击请求中包含的恶意载荷数据（如注入脚本、恶意命令等），用于分析攻击手段 **取值范围** 字符长度0-2048位，支持各类字符（含特殊字符），为空表示无恶意载荷 
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
     * **参数解释** 攻击请求的URL查询字符串部分（即?后的参数），用于分析攻击请求的参数传递方式 **取值范围** 字符长度0-1024位，支持URL编码后的字符，为空表示无查询字符串 
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
     * **参数解释** 攻击请求的HTTP请求头信息，以JSON格式存储，包含User-Agent、Host等字段 **取值范围** 字符长度0-4096位，为JSON格式字符串，字段名和值支持常见HTTP头字符，为空表示无请求头信息 
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
     * **参数解释** 攻击请求使用的HTTP方法（如GET、POST），用于分析攻击的请求类型 **取值范围** 字符长度3-10位，支持标准HTTP方法（GET、POST、PUT、DELETE等），区分大小写 
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
     * **参数解释** 攻击请求的请求体参数（如POST请求的表单数据），用于分析攻击的参数传递内容 **取值范围** 字符长度0-2048位，支持表单编码或JSON格式字符，为空表示无请求体参数 
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
     * **参数解释** 攻击请求的URL路径部分（不含查询字符串），用于定位攻击的目标接口 **取值范围** 字符长度0-512位，支持URL路径字符（如/、字母、数字、短横线、下划线），为空表示根路径 
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
     * **参数解释** 攻击请求使用的HTTP协议版本（如HTTP/1.1），用于分析攻击的协议环境 **取值范围** 字符长度5-10位，支持HTTP/1.0、HTTP/1.1、HTTP/2等标准协议版本 
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
     * **参数解释** 攻击请求的完整URL地址（含协议、主机、路径、查询字符串），用于完整还原攻击请求 **取值范围** 字符长度0-1024位，符合URL格式规范，为空表示无完整URL信息 
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
     * **参数解释** 应用防护事件的攻击类型标识，与请求参数的攻击标识对应（格式为小写下划线） **取值范围** - Attack Success：攻击成功 - Attack Attempt：攻击尝试 - Attack Blocked：攻击被阻断 - Abnormal Behavior：异常行为 - Collapsible Host：主机失陷 - System Vulnerability：系统脆弱性 
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
     * **参数解释**: 检测到该攻击事件的RASP探针标识，用于定位探针类型和检测模块 **取值范围**: 字符长度1-128位，支持英文、数字、点号、短横线、下划线，为系统预定义的探针标识 
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
     * **参数解释** 触发该防护事件的检测规则唯一标识，用于关联具体的防护规则配置 **取值范围** 字符长度1-64位，支持英文、数字、下划线，为系统预定义的规则标识（如ExpressionInject） 
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
     * **参数解释** 触发该防护事件的检测规则详细描述，说明规则的检测逻辑和目的 **取值范围** 字符长度0-512位，支持中文、英文、数字、常用标点符号，为空表示无规则描述 
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
     * **参数解释** 标识该防护事件是否因应用存在漏洞导致（yes表示存在漏洞，no表示不存在） **取值范围** - yes：存在漏洞 - no：不存在漏洞 - unknown：未知 
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
