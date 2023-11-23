package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ListFunctionApplicationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applications")

    private List<ListFunctionApplicationResult> applications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private Long nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListFunctionApplicationsResponse withApplications(List<ListFunctionApplicationResult> applications) {
        this.applications = applications;
        return this;
    }

    public ListFunctionApplicationsResponse addApplicationsItem(ListFunctionApplicationResult applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public ListFunctionApplicationsResponse withApplications(
        Consumer<List<ListFunctionApplicationResult>> applicationsSetter) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /**
     * 函数应用列表
     * @return applications
     */
    public List<ListFunctionApplicationResult> getApplications() {
        return applications;
    }

    public void setApplications(List<ListFunctionApplicationResult> applications) {
        this.applications = applications;
    }

    public ListFunctionApplicationsResponse withNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下次读取位置
     * @return nextMarker
     */
    public Long getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(Long nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListFunctionApplicationsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 应用程序总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFunctionApplicationsResponse that = (ListFunctionApplicationsResponse) obj;
        return Objects.equals(this.applications, that.applications) && Objects.equals(this.nextMarker, that.nextMarker)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applications, nextMarker, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionApplicationsResponse {\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
