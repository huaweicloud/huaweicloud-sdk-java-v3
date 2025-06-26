package com.huaweicloud.sdk.swr.v2.model;

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
public class ListInstanceArtifactsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private List<Artifact> artifacts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceArtifactsResponse withArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public ListInstanceArtifactsResponse addArtifactsItem(Artifact artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    public ListInstanceArtifactsResponse withArtifacts(Consumer<List<Artifact>> artifactsSetter) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        artifactsSetter.accept(this.artifacts);
        return this;
    }

    /**
     * 制品列表
     * @return artifacts
     */
    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public ListInstanceArtifactsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 制品总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceArtifactsResponse that = (ListInstanceArtifactsResponse) obj;
        return Objects.equals(this.artifacts, that.artifacts) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifacts, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceArtifactsResponse {\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
