package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ScheduleTask;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListScheduleJobsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schedules")
    
    
    private List<ScheduleTask> schedules = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListScheduleJobsResponse withSchedules(List<ScheduleTask> schedules) {
        this.schedules = schedules;
        return this;
    }

    
    public ListScheduleJobsResponse addSchedulesItem(ScheduleTask schedulesItem) {
        if(this.schedules == null) {
            this.schedules = new ArrayList<>();
        }
        this.schedules.add(schedulesItem);
        return this;
    }

    public ListScheduleJobsResponse withSchedules(Consumer<List<ScheduleTask>> schedulesSetter) {
        if(this.schedules == null) {
            this.schedules = new ArrayList<>();
        }
        schedulesSetter.accept(this.schedules);
        return this;
    }

    /**
     * 任务详情
     * @return schedules
     */
    public List<ScheduleTask> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<ScheduleTask> schedules) {
        this.schedules = schedules;
    }

    

    public ListScheduleJobsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 记录总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScheduleJobsResponse listScheduleJobsResponse = (ListScheduleJobsResponse) o;
        return Objects.equals(this.schedules, listScheduleJobsResponse.schedules) &&
            Objects.equals(this.totalCount, listScheduleJobsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(schedules, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduleJobsResponse {\n");
        sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

