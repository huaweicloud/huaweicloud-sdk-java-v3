package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GitRepositoryStatus
 */
public class GitRepositoryStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observedGeneration")

    private Integer observedGeneration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<Object> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact")

    private Artifact artifact;

    public GitRepositoryStatus withObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    /**
     * 控制器上次处理的GitRepository版本号
     * @return observedGeneration
     */
    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    public GitRepositoryStatus withConditions(List<Object> conditions) {
        this.conditions = conditions;
        return this;
    }

    public GitRepositoryStatus addConditionsItem(Object conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public GitRepositoryStatus withConditions(Consumer<List<Object>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * GitRepository当前的条件集合，用于表示对象的不同状态
     * @return conditions
     */
    public List<Object> getConditions() {
        return conditions;
    }

    public void setConditions(List<Object> conditions) {
        this.conditions = conditions;
    }

    public GitRepositoryStatus withArtifact(Artifact artifact) {
        this.artifact = artifact;
        return this;
    }

    public GitRepositoryStatus withArtifact(Consumer<Artifact> artifactSetter) {
        if (this.artifact == null) {
            this.artifact = new Artifact();
            artifactSetter.accept(this.artifact);
        }

        return this;
    }

    /**
     * Get artifact
     * @return artifact
     */
    public Artifact getArtifact() {
        return artifact;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GitRepositoryStatus that = (GitRepositoryStatus) obj;
        return Objects.equals(this.observedGeneration, that.observedGeneration)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.artifact, that.artifact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(observedGeneration, conditions, artifact);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitRepositoryStatus {\n");
        sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
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
