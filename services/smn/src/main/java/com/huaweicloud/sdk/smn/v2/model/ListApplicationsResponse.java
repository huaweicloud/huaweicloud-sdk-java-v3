package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListApplicationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_count")

    private Integer applicationCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applications")

    private List<ApplicationItem> applications = null;

    public ListApplicationsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 请求的唯一标识ID。
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListApplicationsResponse withApplicationCount(Integer applicationCount) {
        this.applicationCount = applicationCount;
        return this;
    }

    /** 返回的Application个数。该参数不受offset和limit影响，即返回的是您账户下所有的Application个数。
     * 
     * @return applicationCount */
    public Integer getApplicationCount() {
        return applicationCount;
    }

    public void setApplicationCount(Integer applicationCount) {
        this.applicationCount = applicationCount;
    }

    public ListApplicationsResponse withApplications(List<ApplicationItem> applications) {
        this.applications = applications;
        return this;
    }

    public ListApplicationsResponse addApplicationsItem(ApplicationItem applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public ListApplicationsResponse withApplications(Consumer<List<ApplicationItem>> applicationsSetter) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /** Get applications
     * 
     * @return applications */
    public List<ApplicationItem> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationItem> applications) {
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
        ListApplicationsResponse listApplicationsResponse = (ListApplicationsResponse) o;
        return Objects.equals(this.requestId, listApplicationsResponse.requestId)
            && Objects.equals(this.applicationCount, listApplicationsResponse.applicationCount)
            && Objects.equals(this.applications, listApplicationsResponse.applications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, applicationCount, applications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    applicationCount: ").append(toIndentedString(applicationCount)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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
