package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateArtifactoryResult
 */
public class CreateArtifactoryResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifactory")

    private RepositoryDO artifactory;

    public CreateArtifactoryResult withArtifactory(RepositoryDO artifactory) {
        this.artifactory = artifactory;
        return this;
    }

    public CreateArtifactoryResult withArtifactory(Consumer<RepositoryDO> artifactorySetter) {
        if (this.artifactory == null) {
            this.artifactory = new RepositoryDO();
            artifactorySetter.accept(this.artifactory);
        }

        return this;
    }

    /**
     * Get artifactory
     * @return artifactory
     */
    public RepositoryDO getArtifactory() {
        return artifactory;
    }

    public void setArtifactory(RepositoryDO artifactory) {
        this.artifactory = artifactory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateArtifactoryResult that = (CreateArtifactoryResult) obj;
        return Objects.equals(this.artifactory, that.artifactory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifactory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateArtifactoryResult {\n");
        sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
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
