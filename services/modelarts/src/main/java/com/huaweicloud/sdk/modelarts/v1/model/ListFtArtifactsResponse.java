package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListFtArtifactsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_info")

    private List<ArtifactInfo> artifactInfo = null;

    public ListFtArtifactsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 本次查询到的数据条目数。
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListFtArtifactsResponse withArtifactInfo(List<ArtifactInfo> artifactInfo) {
        this.artifactInfo = artifactInfo;
        return this;
    }

    public ListFtArtifactsResponse addArtifactInfoItem(ArtifactInfo artifactInfoItem) {
        if (this.artifactInfo == null) {
            this.artifactInfo = new ArrayList<>();
        }
        this.artifactInfo.add(artifactInfoItem);
        return this;
    }

    public ListFtArtifactsResponse withArtifactInfo(Consumer<List<ArtifactInfo>> artifactInfoSetter) {
        if (this.artifactInfo == null) {
            this.artifactInfo = new ArrayList<>();
        }
        artifactInfoSetter.accept(this.artifactInfo);
        return this;
    }

    /**
     * 产物信息。
     * @return artifactInfo
     */
    public List<ArtifactInfo> getArtifactInfo() {
        return artifactInfo;
    }

    public void setArtifactInfo(List<ArtifactInfo> artifactInfo) {
        this.artifactInfo = artifactInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFtArtifactsResponse that = (ListFtArtifactsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.artifactInfo, that.artifactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, artifactInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFtArtifactsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    artifactInfo: ").append(toIndentedString(artifactInfo)).append("\n");
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
