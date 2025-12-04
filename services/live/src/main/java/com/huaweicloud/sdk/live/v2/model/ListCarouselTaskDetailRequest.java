package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCarouselTaskDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "carousel_task_id")

    private String carouselTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ListCarouselTaskDetailRequest withCarouselTaskId(String carouselTaskId) {
        this.carouselTaskId = carouselTaskId;
        return this;
    }

    /**
     * 轮播任务id。 
     * @return carouselTaskId
     */
    public String getCarouselTaskId() {
        return carouselTaskId;
    }

    public void setCarouselTaskId(String carouselTaskId) {
        this.carouselTaskId = carouselTaskId;
    }

    public ListCarouselTaskDetailRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度3小时，最大查询周期7天。  若参数为空，默认查询最近1小时数据。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListCarouselTaskDetailRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度3小时，最大查询周期7天。  若参数为空，默认为当前时间。结束时间需大于起始时间。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCarouselTaskDetailRequest that = (ListCarouselTaskDetailRequest) obj;
        return Objects.equals(this.carouselTaskId, that.carouselTaskId)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carouselTaskId, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCarouselTaskDetailRequest {\n");
        sb.append("    carouselTaskId: ").append(toIndentedString(carouselTaskId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
