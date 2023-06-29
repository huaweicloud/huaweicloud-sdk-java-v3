package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新告警通知请求信息
 */
public class UpdateAlertNoticeConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "threat")

    private List<String> threat = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_class")

    private String noticeClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nearly_expired_time")

    private String nearlyExpiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_enterprise_project")

    private Boolean isAllEnterpriseProject;

    public UpdateAlertNoticeConfigRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 告警通知名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAlertNoticeConfigRequestBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启   - false: 不开启   - true: 开启
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UpdateAlertNoticeConfigRequestBody withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题URN，通过消息通知服务获取
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public UpdateAlertNoticeConfigRequestBody withSendfreq(Integer sendfreq) {
        this.sendfreq = sendfreq;
        return this;
    }

    /**
     * 时间间隔，单位为分钟。当通知类型为防护事件时，该参数表示在改时间间隔内，攻击次数等于或者大于设定阈值时，将发送告警通知，支持的值：5、15、30、60、120、360、720、1440；当通知类型为证书到期时，该参数表示每隔多长时间发送一次告警通知，支持的值为1440、10080（单位为分钟）。
     * @return sendfreq
     */
    public Integer getSendfreq() {
        return sendfreq;
    }

    public void setSendfreq(Integer sendfreq) {
        this.sendfreq = sendfreq;
    }

    public UpdateAlertNoticeConfigRequestBody withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * 语言   - zh-cn：中文   - en-us
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public UpdateAlertNoticeConfigRequestBody withTimes(Integer times) {
        this.times = times;
        return this;
    }

    /**
     * 当通知类型为防护事件时，需要填写该参数。在该时间间隔内，当攻击次数大于或等于您设置的阈值时才会发送告警通知
     * @return times
     */
    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public UpdateAlertNoticeConfigRequestBody withThreat(List<String> threat) {
        this.threat = threat;
        return this;
    }

    public UpdateAlertNoticeConfigRequestBody addThreatItem(String threatItem) {
        if (this.threat == null) {
            this.threat = new ArrayList<>();
        }
        this.threat.add(threatItem);
        return this;
    }

    public UpdateAlertNoticeConfigRequestBody withThreat(Consumer<List<String>> threatSetter) {
        if (this.threat == null) {
            this.threat = new ArrayList<>();
        }
        threatSetter.accept(this.threat);
        return this;
    }

    /**
     * 事件类型
     * @return threat
     */
    public List<String> getThreat() {
        return threat;
    }

    public void setThreat(List<String> threat) {
        this.threat = threat;
    }

    public UpdateAlertNoticeConfigRequestBody withNoticeClass(String noticeClass) {
        this.noticeClass = noticeClass;
        return this;
    }

    /**
     * 通知类型    - threat_alert_notice: 防护事件    - cert_alert_notice: 证书到期
     * @return noticeClass
     */
    public String getNoticeClass() {
        return noticeClass;
    }

    public void setNoticeClass(String noticeClass) {
        this.noticeClass = noticeClass;
    }

    public UpdateAlertNoticeConfigRequestBody withNearlyExpiredTime(String nearlyExpiredTime) {
        this.nearlyExpiredTime = nearlyExpiredTime;
        return this;
    }

    /**
     * 提前通知天数，通知类型为证书到期通知需要填写该参数
     * @return nearlyExpiredTime
     */
    public String getNearlyExpiredTime() {
        return nearlyExpiredTime;
    }

    public void setNearlyExpiredTime(String nearlyExpiredTime) {
        this.nearlyExpiredTime = nearlyExpiredTime;
    }

    public UpdateAlertNoticeConfigRequestBody withIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
        return this;
    }

    /**
     * 是否是所有企业项目
     * @return isAllEnterpriseProject
     */
    public Boolean getIsAllEnterpriseProject() {
        return isAllEnterpriseProject;
    }

    public void setIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAlertNoticeConfigRequestBody that = (UpdateAlertNoticeConfigRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.sendfreq, that.sendfreq)
            && Objects.equals(this.locale, that.locale) && Objects.equals(this.times, that.times)
            && Objects.equals(this.threat, that.threat) && Objects.equals(this.noticeClass, that.noticeClass)
            && Objects.equals(this.nearlyExpiredTime, that.nearlyExpiredTime)
            && Objects.equals(this.isAllEnterpriseProject, that.isAllEnterpriseProject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            enabled,
            topicUrn,
            sendfreq,
            locale,
            times,
            threat,
            noticeClass,
            nearlyExpiredTime,
            isAllEnterpriseProject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlertNoticeConfigRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    sendfreq: ").append(toIndentedString(sendfreq)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    times: ").append(toIndentedString(times)).append("\n");
        sb.append("    threat: ").append(toIndentedString(threat)).append("\n");
        sb.append("    noticeClass: ").append(toIndentedString(noticeClass)).append("\n");
        sb.append("    nearlyExpiredTime: ").append(toIndentedString(nearlyExpiredTime)).append("\n");
        sb.append("    isAllEnterpriseProject: ").append(toIndentedString(isAllEnterpriseProject)).append("\n");
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
