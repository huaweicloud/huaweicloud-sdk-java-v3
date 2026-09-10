package com.huaweicloud.sdk.optverse.v1.model;

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
public class ListArtifactsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private List<ArtifactsRsp> artifacts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListArtifactsResponse withArtifacts(List<ArtifactsRsp> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public ListArtifactsResponse addArtifactsItem(ArtifactsRsp artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    public ListArtifactsResponse withArtifacts(Consumer<List<ArtifactsRsp>> artifactsSetter) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        artifactsSetter.accept(this.artifacts);
        return this;
    }

    /**
     * **参数解释**： 对话列表。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return artifacts
     */
    public List<ArtifactsRsp> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<ArtifactsRsp> artifacts) {
        this.artifacts = artifacts;
    }

    public ListArtifactsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 产物个数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListArtifactsResponse that = (ListArtifactsResponse) obj;
        return Objects.equals(this.artifacts, that.artifacts) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artifacts, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListArtifactsResponse {\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
