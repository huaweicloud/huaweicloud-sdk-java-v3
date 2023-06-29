package com.huaweicloud.sdk.dris.v1.model;

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
public class BatchShowEdgeAppVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<QueryEdgeAppVersionBriefResponseDTO> versions = null;

    public BatchShowEdgeAppVersionsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：总记录数。
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public BatchShowEdgeAppVersionsResponse withVersions(List<QueryEdgeAppVersionBriefResponseDTO> versions) {
        this.versions = versions;
        return this;
    }

    public BatchShowEdgeAppVersionsResponse addVersionsItem(QueryEdgeAppVersionBriefResponseDTO versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public BatchShowEdgeAppVersionsResponse withVersions(
        Consumer<List<QueryEdgeAppVersionBriefResponseDTO>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * **参数说明**：列举每条记录。
     * @return versions
     */
    public List<QueryEdgeAppVersionBriefResponseDTO> getVersions() {
        return versions;
    }

    public void setVersions(List<QueryEdgeAppVersionBriefResponseDTO> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchShowEdgeAppVersionsResponse that = (BatchShowEdgeAppVersionsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowEdgeAppVersionsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
