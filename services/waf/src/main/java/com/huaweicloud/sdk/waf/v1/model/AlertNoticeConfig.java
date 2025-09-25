package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlertNoticeConfig
 */
public class AlertNoticeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sendfreq")

    private Integer sendfreq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private String locale;

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

    public AlertNoticeConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 告警id，用于唯一标识一条告警通知配置 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AlertNoticeConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释：** 是否开启告警，控制该告警通知配置的启用/禁用状态 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AlertNoticeConfig withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释：** 通知模板，关联用于发送告警通知的SMN主题URN **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public AlertNoticeConfig withSendfreq(Integer sendfreq) {
        this.sendfreq = sendfreq;
        return this;
    }

    /**
     * **参数解释：** 通知频率，控制告警通知的发送间隔 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sendfreq
     */
    public Integer getSendfreq() {
        return sendfreq;
    }

    public void setSendfreq(Integer sendfreq) {
        this.sendfreq = sendfreq;
    }

    public AlertNoticeConfig withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * **参数解释：** 地区，指定告警通知的语言或地域相关配置 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public AlertNoticeConfig withTimes(Integer times) {
        this.times = times;
        return this;
    }

    /**
     * **参数解释：** 通知频率（补充说明，与sendfreq协同控制告警发送频次） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return times
     */
    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public AlertNoticeConfig withName(String name) {
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

    public AlertNoticeConfig withNoticeClass(String noticeClass) {
        this.noticeClass = noticeClass;
        return this;
    }

    /**
     * **参数解释：** 告警类型，区分不同场景的告警（如防护规则触发、资源异常等） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return noticeClass
     */
    public String getNoticeClass() {
        return noticeClass;
    }

    public void setNoticeClass(String noticeClass) {
        this.noticeClass = noticeClass;
    }

    public AlertNoticeConfig withNearlyExpiredTime(Long nearlyExpiredTime) {
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

    public AlertNoticeConfig withIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
        return this;
    }

    /**
     * **参数解释：** 是否所有企业项目，标识该告警配置是否适用于所有企业项目 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return isAllEnterpriseProject
     */
    public Boolean getIsAllEnterpriseProject() {
        return isAllEnterpriseProject;
    }

    public void setIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
    }

    public AlertNoticeConfig withDescription(String description) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertNoticeConfig that = (AlertNoticeConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.sendfreq, that.sendfreq)
            && Objects.equals(this.locale, that.locale) && Objects.equals(this.times, that.times)
            && Objects.equals(this.name, that.name) && Objects.equals(this.noticeClass, that.noticeClass)
            && Objects.equals(this.nearlyExpiredTime, that.nearlyExpiredTime)
            && Objects.equals(this.isAllEnterpriseProject, that.isAllEnterpriseProject)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            enabled,
            topicUrn,
            sendfreq,
            locale,
            times,
            name,
            noticeClass,
            nearlyExpiredTime,
            isAllEnterpriseProject,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertNoticeConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    sendfreq: ").append(toIndentedString(sendfreq)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    times: ").append(toIndentedString(times)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    noticeClass: ").append(toIndentedString(noticeClass)).append("\n");
        sb.append("    nearlyExpiredTime: ").append(toIndentedString(nearlyExpiredTime)).append("\n");
        sb.append("    isAllEnterpriseProject: ").append(toIndentedString(isAllEnterpriseProject)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
