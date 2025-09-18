package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPipelineArtifactsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private List<Artifact> artifacts = null;

    public ShowPipelineArtifactsResponse withArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public ShowPipelineArtifactsResponse addArtifactsItem(Artifact artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    public ShowPipelineArtifactsResponse withArtifacts(Consumer<List<Artifact>> artifactsSetter) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        artifactsSetter.accept(this.artifacts);
        return this;
    }

    /**
     * **参数解释**： 流水线任务产物列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return artifacts
     */
    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
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
        ShowPipelineArtifactsResponse that = (ShowPipelineArtifactsResponse) obj;
        return Objects.equals(this.artifacts, that.artifacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipelineArtifactsResponse {\n");
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
