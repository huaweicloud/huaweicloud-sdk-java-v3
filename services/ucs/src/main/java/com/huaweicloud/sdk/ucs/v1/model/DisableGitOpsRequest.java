package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DisableGitOpsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterid")

    private String clusterid;

    public DisableGitOpsRequest withClusterid(String clusterid) {
        this.clusterid = clusterid;
        return this;
    }

    /**
     * 集群id
     * @return clusterid
     */
    public String getClusterid() {
        return clusterid;
    }

    public void setClusterid(String clusterid) {
        this.clusterid = clusterid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisableGitOpsRequest that = (DisableGitOpsRequest) obj;
        return Objects.equals(this.clusterid, that.clusterid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableGitOpsRequest {\n");
        sb.append("    clusterid: ").append(toIndentedString(clusterid)).append("\n");
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
