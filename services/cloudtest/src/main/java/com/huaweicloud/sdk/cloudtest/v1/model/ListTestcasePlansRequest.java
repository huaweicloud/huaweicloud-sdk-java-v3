package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTestcasePlansRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_uri")

    private String branchUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TestcasePlanQueryParam body;

    public ListTestcasePlansRequest withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public ListTestcasePlansRequest withBranchUri(String branchUri) {
        this.branchUri = branchUri;
        return this;
    }

    /**
     * 版本URI
     * @return branchUri
     */
    public String getBranchUri() {
        return branchUri;
    }

    public void setBranchUri(String branchUri) {
        this.branchUri = branchUri;
    }

    public ListTestcasePlansRequest withBody(TestcasePlanQueryParam body) {
        this.body = body;
        return this;
    }

    public ListTestcasePlansRequest withBody(Consumer<TestcasePlanQueryParam> bodySetter) {
        if (this.body == null) {
            this.body = new TestcasePlanQueryParam();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TestcasePlanQueryParam getBody() {
        return body;
    }

    public void setBody(TestcasePlanQueryParam body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTestcasePlansRequest that = (ListTestcasePlansRequest) obj;
        return Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.branchUri, that.branchUri)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUuid, branchUri, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTestcasePlansRequest {\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    branchUri: ").append(toIndentedString(branchUri)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
