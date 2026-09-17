package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PostcheckSpec
 */
public class PostcheckSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterVersion")

    private String clusterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersion")

    private String targetVersion;

    public PostcheckSpec withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * **参数解释：** 集群ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public PostcheckSpec withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * **参数解释：** 升级前的集群版本 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public PostcheckSpec withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * **参数解释：** 当前集群版本 **约束限制：** 不涉及 **取值范围：** CCE支持的集群版本 **默认取值：** 不涉及
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostcheckSpec that = (PostcheckSpec) obj;
        return Objects.equals(this.clusterID, that.clusterID)
            && Objects.equals(this.clusterVersion, that.clusterVersion)
            && Objects.equals(this.targetVersion, that.targetVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID, clusterVersion, targetVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostcheckSpec {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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
