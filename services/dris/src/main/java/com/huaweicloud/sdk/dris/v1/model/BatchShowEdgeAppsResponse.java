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
public class BatchShowEdgeAppsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_apps")

    private List<QueryApplicationBriefResponseDTO> edgeApps = null;

    public BatchShowEdgeAppsResponse withCount(Long count) {
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

    public BatchShowEdgeAppsResponse withEdgeApps(List<QueryApplicationBriefResponseDTO> edgeApps) {
        this.edgeApps = edgeApps;
        return this;
    }

    public BatchShowEdgeAppsResponse addEdgeAppsItem(QueryApplicationBriefResponseDTO edgeAppsItem) {
        if (this.edgeApps == null) {
            this.edgeApps = new ArrayList<>();
        }
        this.edgeApps.add(edgeAppsItem);
        return this;
    }

    public BatchShowEdgeAppsResponse withEdgeApps(Consumer<List<QueryApplicationBriefResponseDTO>> edgeAppsSetter) {
        if (this.edgeApps == null) {
            this.edgeApps = new ArrayList<>();
        }
        edgeAppsSetter.accept(this.edgeApps);
        return this;
    }

    /**
     * **参数说明**：列举每条记录。
     * @return edgeApps
     */
    public List<QueryApplicationBriefResponseDTO> getEdgeApps() {
        return edgeApps;
    }

    public void setEdgeApps(List<QueryApplicationBriefResponseDTO> edgeApps) {
        this.edgeApps = edgeApps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchShowEdgeAppsResponse that = (BatchShowEdgeAppsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.edgeApps, that.edgeApps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, edgeApps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowEdgeAppsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    edgeApps: ").append(toIndentedString(edgeApps)).append("\n");
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
