package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 修改集群名称请求。 **约束限制**： guestAgent插件版本8.3.1及以上才支持。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class ClusterNameReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    public ClusterNameReq withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 修改集群名称请求。 **约束限制**： guestAgent插件版本8.3.1及以上才支持。 **取值范围**： 中文或英文字母开头，3~64位长度。 **默认取值**： 不涉及。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterNameReq that = (ClusterNameReq) obj;
        return Objects.equals(this.clusterName, that.clusterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterNameReq {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
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
