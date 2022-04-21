package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群行为进度，显示创建和扩容进度的百分比。
 */
public class ClusterDetailActionProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CREATING")

    private String creating;

    public ClusterDetailActionProgress withCreating(String creating) {
        this.creating = creating;
        return this;
    }

    /**
     * 进度百分比。
     * @return creating
     */
    public String getCreating() {
        return creating;
    }

    public void setCreating(String creating) {
        this.creating = creating;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterDetailActionProgress clusterDetailActionProgress = (ClusterDetailActionProgress) o;
        return Objects.equals(this.creating, clusterDetailActionProgress.creating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creating);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDetailActionProgress {\n");
        sb.append("    creating: ").append(toIndentedString(creating)).append("\n");
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
