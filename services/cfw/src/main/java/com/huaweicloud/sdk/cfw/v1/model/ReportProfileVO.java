package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReportProfileVO
 */
public class ReportProfileVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_id")

    private String profileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_time")

    private Long lastTime;

    public ReportProfileVO withProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }

    /**
     * **参数解释**： 模板ID **取值范围**： 不涉及
     * @return profileId
     */
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public ReportProfileVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 模板名称 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReportProfileVO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 模板类型 **取值范围**： daily 日报 weekly 周报 custom 自定义报告
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ReportProfileVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 启用状态 **取值范围**： 不涉及
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ReportProfileVO withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**： 最新的报告的ID **取值范围**： 不涉及
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public ReportProfileVO withLastTime(Long lastTime) {
        this.lastTime = lastTime;
        return this;
    }

    /**
     * **参数解释**： 最新的报告的生成时间 **取值范围**： 不涉及
     * @return lastTime
     */
    public Long getLastTime() {
        return lastTime;
    }

    public void setLastTime(Long lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportProfileVO that = (ReportProfileVO) obj;
        return Objects.equals(this.profileId, that.profileId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.category, that.category) && Objects.equals(this.status, that.status)
            && Objects.equals(this.reportId, that.reportId) && Objects.equals(this.lastTime, that.lastTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId, name, category, status, reportId, lastTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportProfileVO {\n");
        sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    lastTime: ").append(toIndentedString(lastTime)).append("\n");
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
