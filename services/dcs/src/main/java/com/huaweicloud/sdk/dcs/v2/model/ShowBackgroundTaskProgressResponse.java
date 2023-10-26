package com.huaweicloud.sdk.dcs.v2.model;

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
public class ShowBackgroundTaskProgressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_time")

    private Integer remainTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_details")

    private List<StepDetail> stepDetails = null;

    public ShowBackgroundTaskProgressResponse withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 总体进度,百分比
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ShowBackgroundTaskProgressResponse withRemainTime(Integer remainTime) {
        this.remainTime = remainTime;
        return this;
    }

    /**
     * 剩余时间(单位秒)
     * @return remainTime
     */
    public Integer getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(Integer remainTime) {
        this.remainTime = remainTime;
    }

    public ShowBackgroundTaskProgressResponse withStepDetails(List<StepDetail> stepDetails) {
        this.stepDetails = stepDetails;
        return this;
    }

    public ShowBackgroundTaskProgressResponse addStepDetailsItem(StepDetail stepDetailsItem) {
        if (this.stepDetails == null) {
            this.stepDetails = new ArrayList<>();
        }
        this.stepDetails.add(stepDetailsItem);
        return this;
    }

    public ShowBackgroundTaskProgressResponse withStepDetails(Consumer<List<StepDetail>> stepDetailsSetter) {
        if (this.stepDetails == null) {
            this.stepDetails = new ArrayList<>();
        }
        stepDetailsSetter.accept(this.stepDetails);
        return this;
    }

    /**
     * 任务详情列表
     * @return stepDetails
     */
    public List<StepDetail> getStepDetails() {
        return stepDetails;
    }

    public void setStepDetails(List<StepDetail> stepDetails) {
        this.stepDetails = stepDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackgroundTaskProgressResponse that = (ShowBackgroundTaskProgressResponse) obj;
        return Objects.equals(this.progress, that.progress) && Objects.equals(this.remainTime, that.remainTime)
            && Objects.equals(this.stepDetails, that.stepDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress, remainTime, stepDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackgroundTaskProgressResponse {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    remainTime: ").append(toIndentedString(remainTime)).append("\n");
        sb.append("    stepDetails: ").append(toIndentedString(stepDetails)).append("\n");
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
