package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EditingInput
 */
public class EditingInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_start")

    private String timelineStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeline_end")

    private String timelineEnd;

    public EditingInput withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public EditingInput withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public EditingInput withTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
        return this;
    }

    /**
     * 剪切开始时间，单位：秒。 
     * @return timelineStart
     */
    public String getTimelineStart() {
        return timelineStart;
    }

    public void setTimelineStart(String timelineStart) {
        this.timelineStart = timelineStart;
    }

    public EditingInput withTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
        return this;
    }

    /**
     * 剪切结束时间，单位：秒。 
     * @return timelineEnd
     */
    public String getTimelineEnd() {
        return timelineEnd;
    }

    public void setTimelineEnd(String timelineEnd) {
        this.timelineEnd = timelineEnd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EditingInput editingInput = (EditingInput) o;
        return Objects.equals(this.input, editingInput.input)
            && Objects.equals(this.timelineStart, editingInput.timelineStart)
            && Objects.equals(this.timelineEnd, editingInput.timelineEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, timelineStart, timelineEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditingInput {\n");
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
