package com.huaweicloud.sdk.kafka.v2.model;

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
    @JsonProperty(value = "progress_percentage")

    private Integer progressPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_time")

    private Integer remainTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_list")

    private List<StepDetail> stepList = null;

    public ShowBackgroundTaskProgressResponse withProgressPercentage(Integer progressPercentage) {
        this.progressPercentage = progressPercentage;
        return this;
    }

    /**
     * **参数解释**： 进度。 **取值范围**： 不涉及。
     * @return progressPercentage
     */
    public Integer getProgressPercentage() {
        return progressPercentage;
    }

    public void setProgressPercentage(Integer progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    public ShowBackgroundTaskProgressResponse withRemainTime(Integer remainTime) {
        this.remainTime = remainTime;
        return this;
    }

    /**
     * **参数解释**： 剩余时间。 **取值范围**： 不涉及。
     * @return remainTime
     */
    public Integer getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(Integer remainTime) {
        this.remainTime = remainTime;
    }

    public ShowBackgroundTaskProgressResponse withStepList(List<StepDetail> stepList) {
        this.stepList = stepList;
        return this;
    }

    public ShowBackgroundTaskProgressResponse addStepListItem(StepDetail stepListItem) {
        if (this.stepList == null) {
            this.stepList = new ArrayList<>();
        }
        this.stepList.add(stepListItem);
        return this;
    }

    public ShowBackgroundTaskProgressResponse withStepList(Consumer<List<StepDetail>> stepListSetter) {
        if (this.stepList == null) {
            this.stepList = new ArrayList<>();
        }
        stepListSetter.accept(this.stepList);
        return this;
    }

    /**
     * **参数解释**： 步骤列表。
     * @return stepList
     */
    public List<StepDetail> getStepList() {
        return stepList;
    }

    public void setStepList(List<StepDetail> stepList) {
        this.stepList = stepList;
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
        return Objects.equals(this.progressPercentage, that.progressPercentage)
            && Objects.equals(this.remainTime, that.remainTime) && Objects.equals(this.stepList, that.stepList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progressPercentage, remainTime, stepList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackgroundTaskProgressResponse {\n");
        sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
        sb.append("    remainTime: ").append(toIndentedString(remainTime)).append("\n");
        sb.append("    stepList: ").append(toIndentedString(stepList)).append("\n");
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
