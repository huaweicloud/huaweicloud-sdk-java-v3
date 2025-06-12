package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowJobTotalRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_project_id")

    private String buildProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_date")

    private String fromDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_date")

    private String toDate;

    public ShowJobTotalRequest withBuildProjectId(String buildProjectId) {
        this.buildProjectId = buildProjectId;
        return this;
    }

    /**
     * 构建工程项目ID，36位数字、小写字母组合。
     * @return buildProjectId
     */
    public String getBuildProjectId() {
        return buildProjectId;
    }

    public void setBuildProjectId(String buildProjectId) {
        this.buildProjectId = buildProjectId;
    }

    public ShowJobTotalRequest withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * 区间开始时间，格式yyyy-MM-dd HH:mm:ss。
     * @return fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public ShowJobTotalRequest withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * 区间结束时间，格式yyyy-MM-dd HH:mm:ss。
     * @return toDate
     */
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobTotalRequest that = (ShowJobTotalRequest) obj;
        return Objects.equals(this.buildProjectId, that.buildProjectId) && Objects.equals(this.fromDate, that.fromDate)
            && Objects.equals(this.toDate, that.toDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildProjectId, fromDate, toDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobTotalRequest {\n");
        sb.append("    buildProjectId: ").append(toIndentedString(buildProjectId)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
