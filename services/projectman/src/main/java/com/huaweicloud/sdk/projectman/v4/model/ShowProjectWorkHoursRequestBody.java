package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowProjectWorkHoursRequestBody
 */
public class ShowProjectWorkHoursRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_ids")
    
    private List<String> userIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="work_hours_types")
    
    private String workHoursTypes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="work_hours_dates")
    
    private String workHoursDates;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    
    private String beginTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private String offset = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit = "10";

    public ShowProjectWorkHoursRequestBody withUserIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    
    public ShowProjectWorkHoursRequestBody addUserIdsItem(String userIdsItem) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        this.userIds.add(userIdsItem);
        return this;
    }

    public ShowProjectWorkHoursRequestBody withUserIds(Consumer<List<String>> userIdsSetter) {
        if(this.userIds == null ){
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

    public ShowProjectWorkHoursRequestBody withWorkHoursTypes(String workHoursTypes) {
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

    public ShowProjectWorkHoursRequestBody withWorkHoursDates(String workHoursDates) {
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

    public ShowProjectWorkHoursRequestBody withBeginTime(String beginTime) {
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

    public ShowProjectWorkHoursRequestBody withEndTime(String endTime) {
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

    public ShowProjectWorkHoursRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ShowProjectWorkHoursRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页显示数量，每页最多显示100条
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProjectWorkHoursRequestBody showProjectWorkHoursRequestBody = (ShowProjectWorkHoursRequestBody) o;
        return Objects.equals(this.userIds, showProjectWorkHoursRequestBody.userIds) &&
            Objects.equals(this.workHoursTypes, showProjectWorkHoursRequestBody.workHoursTypes) &&
            Objects.equals(this.workHoursDates, showProjectWorkHoursRequestBody.workHoursDates) &&
            Objects.equals(this.beginTime, showProjectWorkHoursRequestBody.beginTime) &&
            Objects.equals(this.endTime, showProjectWorkHoursRequestBody.endTime) &&
            Objects.equals(this.offset, showProjectWorkHoursRequestBody.offset) &&
            Objects.equals(this.limit, showProjectWorkHoursRequestBody.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userIds, workHoursTypes, workHoursDates, beginTime, endTime, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectWorkHoursRequestBody {\n");
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

