package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListProjectWorkHoursRequestBody
 */
public class ListProjectWorkHoursRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_ids")

    private List<String> projectIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_ids")

    private List<String> userIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_hours_types")

    private String workHoursTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_hours_dates")

    private String workHoursDates;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListProjectWorkHoursRequestBody withProjectIds(List<String> projectIds) {
        this.projectIds = projectIds;
        return this;
    }

    public ListProjectWorkHoursRequestBody addProjectIdsItem(String projectIdsItem) {
        if (this.projectIds == null) {
            this.projectIds = new ArrayList<>();
        }
        this.projectIds.add(projectIdsItem);
        return this;
    }

    public ListProjectWorkHoursRequestBody withProjectIds(Consumer<List<String>> projectIdsSetter) {
        if (this.projectIds == null) {
            this.projectIds = new ArrayList<>();
        }
        projectIdsSetter.accept(this.projectIds);
        return this;
    }

    /**
     * 查询的项目id列表
     * @return projectIds
     */
    public List<String> getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(List<String> projectIds) {
        this.projectIds = projectIds;
    }

    public ListProjectWorkHoursRequestBody withUserIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    public ListProjectWorkHoursRequestBody addUserIdsItem(String userIdsItem) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        this.userIds.add(userIdsItem);
        return this;
    }

    public ListProjectWorkHoursRequestBody withUserIds(Consumer<List<String>> userIdsSetter) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        userIdsSetter.accept(this.userIds);
        return this;
    }

    /**
     * 查询的用户id列表
     * @return userIds
     */
    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public ListProjectWorkHoursRequestBody withWorkHoursTypes(String workHoursTypes) {
        this.workHoursTypes = workHoursTypes;
        return this;
    }

    /**
     * 工时类型，以逗号分隔,21:研发设计,22:后端开发,23:前端开发(Web),24:前端开发(小程序),25:前端开发(App),26:测试验证,27:缺陷修复,28:UI设计,29:会议,30:公共事务,31:培训,32:研究,33:其它,34:调休请假
     * @return workHoursTypes
     */
    public String getWorkHoursTypes() {
        return workHoursTypes;
    }

    public void setWorkHoursTypes(String workHoursTypes) {
        this.workHoursTypes = workHoursTypes;
    }

    public ListProjectWorkHoursRequestBody withWorkHoursDates(String workHoursDates) {
        this.workHoursDates = workHoursDates;
        return this;
    }

    /**
     * 工时日期，以逗号分隔，年-月-日
     * @return workHoursDates
     */
    public String getWorkHoursDates() {
        return workHoursDates;
    }

    public void setWorkHoursDates(String workHoursDates) {
        this.workHoursDates = workHoursDates;
    }

    public ListProjectWorkHoursRequestBody withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 工时开始日期，年-月-日
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListProjectWorkHoursRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 工时结束日期，年-月-日
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListProjectWorkHoursRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量,offset是limit的整数倍，limit=10,offset=0,10,20...
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectWorkHoursRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示数量，每页最多显示100条
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectWorkHoursRequestBody that = (ListProjectWorkHoursRequestBody) obj;
        return Objects.equals(this.projectIds, that.projectIds) && Objects.equals(this.userIds, that.userIds)
            && Objects.equals(this.workHoursTypes, that.workHoursTypes)
            && Objects.equals(this.workHoursDates, that.workHoursDates)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectIds, userIds, workHoursTypes, workHoursDates, beginTime, endTime, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectWorkHoursRequestBody {\n");
        sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
        sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
        sb.append("    workHoursTypes: ").append(toIndentedString(workHoursTypes)).append("\n");
        sb.append("    workHoursDates: ").append(toIndentedString(workHoursDates)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
