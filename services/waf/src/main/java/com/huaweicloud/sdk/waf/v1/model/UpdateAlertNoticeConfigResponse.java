package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAlertNoticeConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "prefer_html")

    private Boolean preferHtml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notice_class")

    private String noticeClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nearly_expired_time")

    private String nearlyExpiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_enterprise_project")

    private Boolean isAllEnterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public UpdateAlertNoticeConfigResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateAlertNoticeConfigResponse withName(String name) {
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

    public UpdateAlertNoticeConfigResponse withEnabled(Boolean enabled) {
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

    public UpdateAlertNoticeConfigResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public UpdateAlertNoticeConfigResponse withSendfreq(Integer sendfreq) {
        this.sendfreq = sendfreq;
        return this;
    }

    /**
     * 时间间隔，单位为分钟。当通知类型为防护事件时，该参数表示在该时间间隔内，攻击次数等于或者大于设定阈值时，将发送告警通知，支持的值：5、15、30、60、120、360、720、1440；当通知类型为证书到期时，该参数表示每隔多长时间发送一次告警通知，支持的值为1440、10080（单位为分钟）。
     * @return sendfreq
     */
    public Integer getSendfreq() {
        return sendfreq;
    }

    public void setSendfreq(Integer sendfreq) {
        this.sendfreq = sendfreq;
    }

    public UpdateAlertNoticeConfigResponse withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * 语言
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public UpdateAlertNoticeConfigResponse withTimes(Integer times) {
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

    public UpdateAlertNoticeConfigResponse withThreat(List<String> threat) {
        this.threat = threat;
        return this;
    }

    public UpdateAlertNoticeConfigResponse addThreatItem(String threatItem) {
        if (this.threat == null) {
            this.threat = new ArrayList<>();
        }
        this.threat.add(threatItem);
        return this;
    }

    public UpdateAlertNoticeConfigResponse withThreat(Consumer<List<String>> threatSetter) {
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

    public UpdateAlertNoticeConfigResponse withPreferHtml(Boolean preferHtml) {
        this.preferHtml = preferHtml;
        return this;
    }

    /**
     * 预留参数，可忽略
     * @return preferHtml
     */
    public Boolean getPreferHtml() {
        return preferHtml;
    }

    public void setPreferHtml(Boolean preferHtml) {
        this.preferHtml = preferHtml;
    }

    public UpdateAlertNoticeConfigResponse withNoticeClass(String noticeClass) {
        this.noticeClass = noticeClass;
        return this;
    }

    /**
     * 通知类型
     * @return noticeClass
     */
    public String getNoticeClass() {
        return noticeClass;
    }

    public void setNoticeClass(String noticeClass) {
        this.noticeClass = noticeClass;
    }

    public UpdateAlertNoticeConfigResponse withNearlyExpiredTime(String nearlyExpiredTime) {
        this.nearlyExpiredTime = nearlyExpiredTime;
        return this;
    }

    /**
     * 提前通知天数
     * @return nearlyExpiredTime
     */
    public String getNearlyExpiredTime() {
        return nearlyExpiredTime;
    }

    public void setNearlyExpiredTime(String nearlyExpiredTime) {
        this.nearlyExpiredTime = nearlyExpiredTime;
    }

    public UpdateAlertNoticeConfigResponse withIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
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

    public UpdateAlertNoticeConfigResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdateAlertNoticeConfigResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAlertNoticeConfigResponse that = (UpdateAlertNoticeConfigResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.sendfreq, that.sendfreq) && Objects.equals(this.locale, that.locale)
            && Objects.equals(this.times, that.times) && Objects.equals(this.threat, that.threat)
            && Objects.equals(this.preferHtml, that.preferHtml) && Objects.equals(this.noticeClass, that.noticeClass)
            && Objects.equals(this.nearlyExpiredTime, that.nearlyExpiredTime)
            && Objects.equals(this.isAllEnterpriseProject, that.isAllEnterpriseProject)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            enabled,
            topicUrn,
            sendfreq,
            locale,
            times,
            threat,
            preferHtml,
            noticeClass,
            nearlyExpiredTime,
            isAllEnterpriseProject,
            enterpriseProjectId,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlertNoticeConfigResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    sendfreq: ").append(toIndentedString(sendfreq)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    times: ").append(toIndentedString(times)).append("\n");
        sb.append("    threat: ").append(toIndentedString(threat)).append("\n");
        sb.append("    preferHtml: ").append(toIndentedString(preferHtml)).append("\n");
        sb.append("    noticeClass: ").append(toIndentedString(noticeClass)).append("\n");
        sb.append("    nearlyExpiredTime: ").append(toIndentedString(nearlyExpiredTime)).append("\n");
        sb.append("    isAllEnterpriseProject: ").append(toIndentedString(isAllEnterpriseProject)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
