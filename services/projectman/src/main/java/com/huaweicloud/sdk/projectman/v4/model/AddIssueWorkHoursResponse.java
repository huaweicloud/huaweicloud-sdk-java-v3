package com.huaweicloud.sdk.projectman.v4.model;

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
public class AddIssueWorkHoursResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_work_hours")

    private List<AddIssueWorkHoursResponseBodyAddedWorkHours> addedWorkHours = null;

    public AddIssueWorkHoursResponse withAddedWorkHours(
        List<AddIssueWorkHoursResponseBodyAddedWorkHours> addedWorkHours) {
        this.addedWorkHours = addedWorkHours;
        return this;
    }

    public AddIssueWorkHoursResponse addAddedWorkHoursItem(
        AddIssueWorkHoursResponseBodyAddedWorkHours addedWorkHoursItem) {
        if (this.addedWorkHours == null) {
            this.addedWorkHours = new ArrayList<>();
        }
        this.addedWorkHours.add(addedWorkHoursItem);
        return this;
    }

    public AddIssueWorkHoursResponse withAddedWorkHours(
        Consumer<List<AddIssueWorkHoursResponseBodyAddedWorkHours>> addedWorkHoursSetter) {
        if (this.addedWorkHours == null) {
            this.addedWorkHours = new ArrayList<>();
        }
        addedWorkHoursSetter.accept(this.addedWorkHours);
        return this;
    }

    /**
     * 已添加的工时列表
     * @return addedWorkHours
     */
    public List<AddIssueWorkHoursResponseBodyAddedWorkHours> getAddedWorkHours() {
        return addedWorkHours;
    }

    public void setAddedWorkHours(List<AddIssueWorkHoursResponseBodyAddedWorkHours> addedWorkHours) {
        this.addedWorkHours = addedWorkHours;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddIssueWorkHoursResponse addIssueWorkHoursResponse = (AddIssueWorkHoursResponse) o;
        return Objects.equals(this.addedWorkHours, addIssueWorkHoursResponse.addedWorkHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addedWorkHours);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddIssueWorkHoursResponse {\n");
        sb.append("    addedWorkHours: ").append(toIndentedString(addedWorkHours)).append("\n");
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
