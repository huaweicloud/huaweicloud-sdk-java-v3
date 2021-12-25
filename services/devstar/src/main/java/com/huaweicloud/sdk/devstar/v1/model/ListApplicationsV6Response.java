package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListApplicationsV6Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applications")

    private List<ApplicationV3> applications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListApplicationsV6Response withApplications(List<ApplicationV3> applications) {
        this.applications = applications;
        return this;
    }

    public ListApplicationsV6Response addApplicationsItem(ApplicationV3 applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public ListApplicationsV6Response withApplications(Consumer<List<ApplicationV3>> applicationsSetter) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /** 应用列表
     * 
     * @return applications */
    public List<ApplicationV3> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationV3> applications) {
        this.applications = applications;
    }

    public ListApplicationsV6Response withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 应用列表总条数 minimum: 0 maximum: 1000100
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApplicationsV6Response listApplicationsV6Response = (ListApplicationsV6Response) o;
        return Objects.equals(this.applications, listApplicationsV6Response.applications)
            && Objects.equals(this.count, listApplicationsV6Response.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applications, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationsV6Response {\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
