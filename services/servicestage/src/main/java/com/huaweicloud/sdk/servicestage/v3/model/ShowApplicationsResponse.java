package com.huaweicloud.sdk.servicestage.v3.model;

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
public class ShowApplicationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applications")

    private List<Application> applications = null;

    public ShowApplicationsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 应用数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowApplicationsResponse withApplications(List<Application> applications) {
        this.applications = applications;
        return this;
    }

    public ShowApplicationsResponse addApplicationsItem(Application applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public ShowApplicationsResponse withApplications(Consumer<List<Application>> applicationsSetter) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /**
     * 应用列表。
     * @return applications
     */
    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApplicationsResponse showApplicationsResponse = (ShowApplicationsResponse) o;
        return Objects.equals(this.count, showApplicationsResponse.count)
            && Objects.equals(this.applications, showApplicationsResponse.applications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, applications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApplicationsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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
