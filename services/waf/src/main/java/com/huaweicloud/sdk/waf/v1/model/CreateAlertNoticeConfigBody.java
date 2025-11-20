package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAlertNoticeConfigBody
 */
public class CreateAlertNoticeConfigBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefer_html")

    private Boolean preferHtml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sendfreq")

    private Integer sendfreq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local")

    private String local;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "times")

    private Integer times;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_class")

    private String noticeClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nearly_expired_time")

    private Long nearlyExpiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_enterprise_project")

    private Boolean isAllEnterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threat")

    private List<String> threat = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private List<String> ruleType = null;

    public CreateAlertNoticeConfigBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释：** 功能启用状态：true表示启用当前配置，false表示禁用。 **约束限制：** 不涉及 **取值范围：** - true - false  **默认取值：** true
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateAlertNoticeConfigBody withPreferHtml(Boolean preferHtml) {
        this.preferHtml = preferHtml;
        return this;
    }

    /**
     * **参数解释：** 预留参数，默认为false **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** false
     * @return preferHtml
     */
    public Boolean getPreferHtml() {
        return preferHtml;
    }

    public void setPreferHtml(Boolean preferHtml) {
        this.preferHtml = preferHtml;
    }

    public CreateAlertNoticeConfigBody withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释：** 通知模板，关联用于发送告警通知的SMN主题URN,通过“消息通知服务”获取 查询可使用的主题，通过 云日志服务的“查询SMN主题”接口，返回体中的\"topic_urn\"字段 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public CreateAlertNoticeConfigBody withSendfreq(Integer sendfreq) {
        this.sendfreq = sendfreq;
        return this;
    }

    /**
     * **参数解释：** 通间间隔,单位为分钟。当通知类型为防护事件时,该参数表示在该时间间隔内,攻击次数等于或者大于设定阈值时,将发送告警通知,支持的值:5、15、30、60、120、360、720、1440;当通知类型为证书到期时,该参数表示每隔多长时间发送一次告警通知,支持的值为1440、10080(单位为分钟)。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sendfreq
     */
    public Integer getSendfreq() {
        return sendfreq;
    }

    public void setSendfreq(Integer sendfreq) {
        this.sendfreq = sendfreq;
    }

    public CreateAlertNoticeConfigBody withLocal(String local) {
        this.local = local;
        return this;
    }

    /**
     * **参数解释：** 地区，指定告警通知的语言或地域相关配置 **约束限制：** 不涉及 **取值范围：** - zh-cn - en-us  **默认取值：** 不涉及
     * @return local
     */
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public CreateAlertNoticeConfigBody withTimes(Integer times) {
        this.times = times;
        return this;
    }

    /**
     * **参数解释：** 当通知类型为防护事件时,需要填写该参数。在该时间间隔内,当攻击次数大于或等于您设置的阈值时才会发送告警通知 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return times
     */
    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public CreateAlertNoticeConfigBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 告警名称，用于标识告警通知配置的名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAlertNoticeConfigBody withNoticeClass(String noticeClass) {
        this.noticeClass = noticeClass;
        return this;
    }

    /**
     * **参数解释：** 告警类型，区分不同场景的告警（如防护规则触发、资源异常等） **约束限制：** 不涉及 **取值范围：** - threat_alert_notice：威胁告警通知  - cert_alert_notice：证书告警通知, - rule_alert_notice：规则告警通知, - cname_ip_alert_notice：域名 / IP 告警通知  **默认取值：** 不涉及
     * @return noticeClass
     */
    public String getNoticeClass() {
        return noticeClass;
    }

    public void setNoticeClass(String noticeClass) {
        this.noticeClass = noticeClass;
    }

    public CreateAlertNoticeConfigBody withNearlyExpiredTime(Long nearlyExpiredTime) {
        this.nearlyExpiredTime = nearlyExpiredTime;
        return this;
    }

    /**
     * **参数解释：** 提前通知天数，针对过期类告警提前发送通知的天数 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return nearlyExpiredTime
     */
    public Long getNearlyExpiredTime() {
        return nearlyExpiredTime;
    }

    public void setNearlyExpiredTime(Long nearlyExpiredTime) {
        this.nearlyExpiredTime = nearlyExpiredTime;
    }

    public CreateAlertNoticeConfigBody withIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
        return this;
    }

    /**
     * **参数解释：** 是否所有企业项目，标识该告警配置是否适用于所有企业项目 **约束限制：** 不涉及 **取值范围：** - true - false  **默认取值：** true
     * @return isAllEnterpriseProject
     */
    public Boolean getIsAllEnterpriseProject() {
        return isAllEnterpriseProject;
    }

    public void setIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
    }

    public CreateAlertNoticeConfigBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述，对告警通知配置的补充说明 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAlertNoticeConfigBody withThreat(List<String> threat) {
        this.threat = threat;
        return this;
    }

    public CreateAlertNoticeConfigBody addThreatItem(String threatItem) {
        if (this.threat == null) {
            this.threat = new ArrayList<>();
        }
        this.threat.add(threatItem);
        return this;
    }

    public CreateAlertNoticeConfigBody withThreat(Consumer<List<String>> threatSetter) {
        if (this.threat == null) {
            this.threat = new ArrayList<>();
        }
        threatSetter.accept(this.threat);
        return this;
    }

    /**
     * **参数解释：** 威胁类型范围：指定需要告警的威胁类型，如[\"all\"]表示所有威胁 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** all
     * @return threat
     */
    public List<String> getThreat() {
        return threat;
    }

    public void setThreat(List<String> threat) {
        this.threat = threat;
    }

    public CreateAlertNoticeConfigBody withRuleType(List<String> ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    public CreateAlertNoticeConfigBody addRuleTypeItem(String ruleTypeItem) {
        if (this.ruleType == null) {
            this.ruleType = new ArrayList<>();
        }
        this.ruleType.add(ruleTypeItem);
        return this;
    }

    public CreateAlertNoticeConfigBody withRuleType(Consumer<List<String>> ruleTypeSetter) {
        if (this.ruleType == null) {
            this.ruleType = new ArrayList<>();
        }
        ruleTypeSetter.accept(this.ruleType);
        return this;
    }

    /**
     * **参数解释：** 指定需要告警的规则类型，[\"all\"]表示所有规则类型。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** all
     * @return ruleType
     */
    public List<String> getRuleType() {
        return ruleType;
    }

    public void setRuleType(List<String> ruleType) {
        this.ruleType = ruleType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAlertNoticeConfigBody that = (CreateAlertNoticeConfigBody) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.preferHtml, that.preferHtml)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.sendfreq, that.sendfreq)
            && Objects.equals(this.local, that.local) && Objects.equals(this.times, that.times)
            && Objects.equals(this.name, that.name) && Objects.equals(this.noticeClass, that.noticeClass)
            && Objects.equals(this.nearlyExpiredTime, that.nearlyExpiredTime)
            && Objects.equals(this.isAllEnterpriseProject, that.isAllEnterpriseProject)
            && Objects.equals(this.description, that.description) && Objects.equals(this.threat, that.threat)
            && Objects.equals(this.ruleType, that.ruleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled,
            preferHtml,
            topicUrn,
            sendfreq,
            local,
            times,
            name,
            noticeClass,
            nearlyExpiredTime,
            isAllEnterpriseProject,
            description,
            threat,
            ruleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlertNoticeConfigBody {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    preferHtml: ").append(toIndentedString(preferHtml)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    sendfreq: ").append(toIndentedString(sendfreq)).append("\n");
        sb.append("    local: ").append(toIndentedString(local)).append("\n");
        sb.append("    times: ").append(toIndentedString(times)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    noticeClass: ").append(toIndentedString(noticeClass)).append("\n");
        sb.append("    nearlyExpiredTime: ").append(toIndentedString(nearlyExpiredTime)).append("\n");
        sb.append("    isAllEnterpriseProject: ").append(toIndentedString(isAllEnterpriseProject)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    threat: ").append(toIndentedString(threat)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
