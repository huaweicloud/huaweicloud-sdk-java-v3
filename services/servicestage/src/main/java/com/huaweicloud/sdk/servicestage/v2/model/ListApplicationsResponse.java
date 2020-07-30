package com.huaweicloud.sdk.servicestage.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.ApplicationView;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListApplicationsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="applications")
    
    private List<ApplicationView> applications = null;
    
    public ListApplicationsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 应用总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListApplicationsResponse withApplications(List<ApplicationView> applications) {
        this.applications = applications;
        return this;
    }

    
    public ListApplicationsResponse addApplicationsItem(ApplicationView applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public ListApplicationsResponse withApplications(Consumer<List<ApplicationView>> applicationsSetter) {
        if(this.applications == null ){
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /**
     * 应用列表。
     * @return applications
     */
    public List<ApplicationView> getApplications() {
        return applications;
    }

    public void setApplications(List<ApplicationView> applications) {
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
        return Objects.equals(this.count, listApplicationsResponse.count) &&
            Objects.equals(this.applications, listApplicationsResponse.applications);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, applications);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationsResponse {\n");
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

