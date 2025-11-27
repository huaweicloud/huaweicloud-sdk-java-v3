package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClusterInfo
 */
public class ClusterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterName")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterPath")

    private String clusterPath;

    public ClusterInfo withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * 集群ID
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public ClusterInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ClusterInfo withClusterPath(String clusterPath) {
        this.clusterPath = clusterPath;
        return this;
    }

    /**
     * 集群路径
     * @return clusterPath
     */
    public String getClusterPath() {
        return clusterPath;
    }

    public void setClusterPath(String clusterPath) {
        this.clusterPath = clusterPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterInfo that = (ClusterInfo) obj;
        return Objects.equals(this.clusterID, that.clusterID) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.clusterPath, that.clusterPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID, clusterName, clusterPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInfo {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterPath: ").append(toIndentedString(clusterPath)).append("\n");
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
