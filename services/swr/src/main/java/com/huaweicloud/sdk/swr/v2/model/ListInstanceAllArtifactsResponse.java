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
public class ListInstanceAllArtifactsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private List<Artifact> artifacts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private Integer nextMarker;

    public ListInstanceAllArtifactsResponse withArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public ListInstanceAllArtifactsResponse addArtifactsItem(Artifact artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    public ListInstanceAllArtifactsResponse withArtifacts(Consumer<List<Artifact>> artifactsSetter) {
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

    public ListInstanceAllArtifactsResponse withNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下一次分页查询的起始ID。如果未返回该值，则表示数据已查询完毕
     * @return nextMarker
     */
    public Integer getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(Integer nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceAllArtifactsResponse that = (ListInstanceAllArtifactsResponse) obj;
        return Objects.equals(this.artifacts, that.artifacts) && Objects.equals(this.nextMarker, that.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifacts, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceAllArtifactsResponse {\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
