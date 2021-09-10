package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 维护窗口 */
public class CdmQueryClusterDetailsRepsonseMaintainWindow {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day")

    private String day;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    public CdmQueryClusterDetailsRepsonseMaintainWindow withDay(String day) {
        this.day = day;
        return this;
    }

    /** 周几
     * 
     * @return day */
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public CdmQueryClusterDetailsRepsonseMaintainWindow withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 开始时间。
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CdmQueryClusterDetailsRepsonseMaintainWindow withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 结束时间。
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CdmQueryClusterDetailsRepsonseMaintainWindow cdmQueryClusterDetailsRepsonseMaintainWindow =
            (CdmQueryClusterDetailsRepsonseMaintainWindow) o;
        return Objects.equals(this.day, cdmQueryClusterDetailsRepsonseMaintainWindow.day)
            && Objects.equals(this.startTime, cdmQueryClusterDetailsRepsonseMaintainWindow.startTime)
            && Objects.equals(this.endTime, cdmQueryClusterDetailsRepsonseMaintainWindow.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmQueryClusterDetailsRepsonseMaintainWindow {\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
