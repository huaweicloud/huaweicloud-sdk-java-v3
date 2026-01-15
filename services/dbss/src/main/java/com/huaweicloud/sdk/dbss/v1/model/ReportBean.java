package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReportBean
 */
public class ReportBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ids")

    private String dbIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_names")

    private String dbNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentum")

    private Integer percentum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private String templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public ReportBean withDbIds(String dbIds) {
        this.dbIds = dbIds;
        return this;
    }

    /**
     * 数据库ID
     * @return dbIds
     */
    public String getDbIds() {
        return dbIds;
    }

    public void setDbIds(String dbIds) {
        this.dbIds = dbIds;
    }

    public ReportBean withDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }

    /**
     * 数据库名称
     * @return dbNames
     */
    public String getDbNames() {
        return dbNames;
    }

    public void setDbNames(String dbNames) {
        this.dbNames = dbNames;
    }

    public ReportBean withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ReportBean withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 完成时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public ReportBean withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 格式  - pdf：PDF文件  - zip：zip文件
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ReportBean withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 报表ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReportBean withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 报表名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReportBean withPercentum(Integer percentum) {
        this.percentum = percentum;
        return this;
    }

    /**
     * 进度
     * @return percentum
     */
    public Integer getPercentum() {
        return percentum;
    }

    public void setPercentum(Integer percentum) {
        this.percentum = percentum;
    }

    public ReportBean withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ReportBean withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 报表类型 - PDF：pdf - ZIP：zip
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public ReportBean withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 周期 - AUDIT_REPORT_DAY：按天 - AUDIT_REPORT_WEEK：按周 - AUDIT_REPORT_MONTH：按月 - AUDIT_REPORT_YEAR：按年 - AUDIT_REPORT_REAL_TIME：立即
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ReportBean withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 地址URL
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportBean that = (ReportBean) obj;
        return Objects.equals(this.dbIds, that.dbIds) && Objects.equals(this.dbNames, that.dbNames)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.format, that.format) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.percentum, that.percentum)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.templateType, that.templateType)
            && Objects.equals(this.type, that.type) && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(dbIds, dbNames, endTime, finishTime, format, id, name, percentum, startTime, templateType, type, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportBean {\n");
        sb.append("    dbIds: ").append(toIndentedString(dbIds)).append("\n");
        sb.append("    dbNames: ").append(toIndentedString(dbNames)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    percentum: ").append(toIndentedString(percentum)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
