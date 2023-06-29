package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddIssueWorkHoursRequestBody
 */
public class AddIssueWorkHoursRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "due_date")

    private String dueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_hours")

    private Double workHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_hours_type_id")

    private Integer workHoursTypeId;

    public AddIssueWorkHoursRequestBody withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 工时开始日期，年-月-日
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public AddIssueWorkHoursRequestBody withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * 工时结束日期，年-月-日
     * @return dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public AddIssueWorkHoursRequestBody withWorkHours(Double workHours) {
        this.workHours = workHours;
        return this;
    }

    /**
     * 工时总数（若工时日期范围包含多天，单日工时将设为“工时总数/天数”）
     * @return workHours
     */
    public Double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Double workHours) {
        this.workHours = workHours;
    }

    public AddIssueWorkHoursRequestBody withWorkHoursTypeId(Integer workHoursTypeId) {
        this.workHoursTypeId = workHoursTypeId;
        return this;
    }

    /**
     * 工时类型id（项目预设工时类型id及名称对照：21:研发设计，22:后端开发，23:前端开发(Web)，24:前端开发(小程序)，25:前端开发(App)， 26:测试验证，27:缺陷修复，28:UI设计，29:会议，30:公共事务，31:培训，32:研究，33:其它，34:调休请假）
     * @return workHoursTypeId
     */
    public Integer getWorkHoursTypeId() {
        return workHoursTypeId;
    }

    public void setWorkHoursTypeId(Integer workHoursTypeId) {
        this.workHoursTypeId = workHoursTypeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddIssueWorkHoursRequestBody that = (AddIssueWorkHoursRequestBody) obj;
        return Objects.equals(this.startDate, that.startDate) && Objects.equals(this.dueDate, that.dueDate)
            && Objects.equals(this.workHours, that.workHours)
            && Objects.equals(this.workHoursTypeId, that.workHoursTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, dueDate, workHours, workHoursTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddIssueWorkHoursRequestBody {\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    workHours: ").append(toIndentedString(workHours)).append("\n");
        sb.append("    workHoursTypeId: ").append(toIndentedString(workHoursTypeId)).append("\n");
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
