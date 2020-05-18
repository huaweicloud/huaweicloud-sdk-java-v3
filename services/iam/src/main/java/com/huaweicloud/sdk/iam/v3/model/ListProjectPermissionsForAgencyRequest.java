package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListProjectPermissionsForAgencyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency_id")
    
    private String agencyId;

    public ListProjectPermissionsForAgencyRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * Get projectId
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListProjectPermissionsForAgencyRequest withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    


    /**
     * Get agencyId
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectPermissionsForAgencyRequest listProjectPermissionsForAgencyRequest = (ListProjectPermissionsForAgencyRequest) o;
        return Objects.equals(this.projectId, listProjectPermissionsForAgencyRequest.projectId) &&
            Objects.equals(this.agencyId, listProjectPermissionsForAgencyRequest.agencyId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(projectId, agencyId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectPermissionsForAgencyRequest {\n");
            sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
            sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
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

