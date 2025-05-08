package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EditMediaTaskInput
 */
public class EditMediaTaskInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_start")

    private String timelineStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_end")

    private String timelineEnd;

    public EditMediaTaskInput withInput(ObsInfo input) {
        this.input = input;
        return this;
    }

    public EditMediaTaskInput withInput(Consumer<ObsInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ObsInfo getInput() {
        return input;
    }

    public void setInput(ObsInfo input) {
        this.input = input;
    }

    public EditMediaTaskInput withTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
        return this;
    }

    /**
     * 剪切开始时间
     * @return timelineStart
     */
    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public EditMediaTaskInput withTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
        return this;
    }

    /**
     * 剪切结束时间
     * @return timelineEnd
     */
    public String getTimelineEnd() {
        return timelineEnd;
    }

    public void setTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EditMediaTaskInput that = (EditMediaTaskInput) obj;
        return Objects.equals(this.input, that.input) && Objects.equals(this.timelineStart, that.timelineStart)
            && Objects.equals(this.timelineEnd, that.timelineEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, timelineStart, timelineEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditMediaTaskInput {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    timelineStart: ").append(toIndentedString(timelineStart)).append("\n");
        sb.append("    timelineEnd: ").append(toIndentedString(timelineEnd)).append("\n");
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
