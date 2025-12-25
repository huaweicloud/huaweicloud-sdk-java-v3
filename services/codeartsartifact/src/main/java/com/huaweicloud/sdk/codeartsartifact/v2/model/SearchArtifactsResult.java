package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SearchArtifactsResult
 */
public class SearchArtifactsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private List<ArtifactSearchResult> artifacts = null;

    public SearchArtifactsResult withArtifacts(List<ArtifactSearchResult> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public SearchArtifactsResult addArtifactsItem(ArtifactSearchResult artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    public SearchArtifactsResult withArtifacts(Consumer<List<ArtifactSearchResult>> artifactsSetter) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        artifactsSetter.accept(this.artifacts);
        return this;
    }

    /**
     * **参数解释**： 文件列表。 **取值范围**： 不涉及。 
     * @return artifacts
     */
    public List<ArtifactSearchResult> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<ArtifactSearchResult> artifacts) {
        this.artifacts = artifacts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchArtifactsResult that = (SearchArtifactsResult) obj;
        return Objects.equals(this.artifacts, that.artifacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchArtifactsResult {\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
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
