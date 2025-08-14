package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListApplicationAssignmentsForPrincipalResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_assignments")

    private List<ApplicationAssignmentDto> applicationAssignments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListApplicationAssignmentsForPrincipalResponse withApplicationAssignments(
        List<ApplicationAssignmentDto> applicationAssignments) {
        this.applicationAssignments = applicationAssignments;
        return this;
    }

    public ListApplicationAssignmentsForPrincipalResponse addApplicationAssignmentsItem(
        ApplicationAssignmentDto applicationAssignmentsItem) {
        if (this.applicationAssignments == null) {
            this.applicationAssignments = new ArrayList<>();
        }
        this.applicationAssignments.add(applicationAssignmentsItem);
        return this;
    }

    public ListApplicationAssignmentsForPrincipalResponse withApplicationAssignments(
        Consumer<List<ApplicationAssignmentDto>> applicationAssignmentsSetter) {
        if (this.applicationAssignments == null) {
            this.applicationAssignments = new ArrayList<>();
        }
        applicationAssignmentsSetter.accept(this.applicationAssignments);
        return this;
    }

    /**
     * Get applicationAssignments
     * @return applicationAssignments
     */
    public List<ApplicationAssignmentDto> getApplicationAssignments() {
        return applicationAssignments;
    }

    public void setApplicationAssignments(List<ApplicationAssignmentDto> applicationAssignments) {
        this.applicationAssignments = applicationAssignments;
    }

    public ListApplicationAssignmentsForPrincipalResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListApplicationAssignmentsForPrincipalResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApplicationAssignmentsForPrincipalResponse that = (ListApplicationAssignmentsForPrincipalResponse) obj;
        return Objects.equals(this.applicationAssignments, that.applicationAssignments)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationAssignments, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationAssignmentsForPrincipalResponse {\n");
        sb.append("    applicationAssignments: ").append(toIndentedString(applicationAssignments)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
