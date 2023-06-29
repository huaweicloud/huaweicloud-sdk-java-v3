package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Archive
 */
public class Archive {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_namespace")

    private String artifactNamespace;

    public Archive withArtifactNamespace(String artifactNamespace) {
        this.artifactNamespace = artifactNamespace;
        return this;
    }

    /**
     * 镜像命名空间。
     * @return artifactNamespace
     */
    public String getArtifactNamespace() {
        return artifactNamespace;
    }

    public void setArtifactNamespace(String artifactNamespace) {
        this.artifactNamespace = artifactNamespace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Archive that = (Archive) obj;
        return Objects.equals(this.artifactNamespace, that.artifactNamespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactNamespace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Archive {\n");
        sb.append("    artifactNamespace: ").append(toIndentedString(artifactNamespace)).append("\n");
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
