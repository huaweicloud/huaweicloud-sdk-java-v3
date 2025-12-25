package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ClusterJoinGroupRequestBody
 */
public class ClusterJoinGroupRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterGroupID")

    private String clusterGroupID;

    public ClusterJoinGroupRequestBody withClusterGroupID(String clusterGroupID) {
        this.clusterGroupID = clusterGroupID;
        return this;
    }

    /**
     * 集群加入目标容器舰队的id
     * @return clusterGroupID
     */
    public String getClusterGroupID() {
        return clusterGroupID;
    }

    public void setClusterGroupID(String clusterGroupID) {
        this.clusterGroupID = clusterGroupID;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("clusterGroupID", new FormDataPart<>(clusterGroupID));
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterJoinGroupRequestBody that = (ClusterJoinGroupRequestBody) obj;
        return Objects.equals(this.clusterGroupID, that.clusterGroupID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterGroupID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterJoinGroupRequestBody {\n");
        sb.append("    clusterGroupID: ").append(toIndentedString(clusterGroupID)).append("\n");
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
