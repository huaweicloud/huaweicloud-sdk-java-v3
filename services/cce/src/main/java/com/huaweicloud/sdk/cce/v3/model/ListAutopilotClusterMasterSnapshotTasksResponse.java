package com.huaweicloud.sdk.cce.v3.model;

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
public class ListAutopilotClusterMasterSnapshotTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private SnapshotTaskMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<SnapshotTask> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private SnapshotTaskStatus status;

    public ListAutopilotClusterMasterSnapshotTasksResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * api版本，默认为v3.1
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ListAutopilotClusterMasterSnapshotTasksResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 任务类型
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ListAutopilotClusterMasterSnapshotTasksResponse withMetadata(SnapshotTaskMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListAutopilotClusterMasterSnapshotTasksResponse withMetadata(Consumer<SnapshotTaskMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new SnapshotTaskMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public SnapshotTaskMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(SnapshotTaskMetadata metadata) {
        this.metadata = metadata;
    }

    public ListAutopilotClusterMasterSnapshotTasksResponse withItems(List<SnapshotTask> items) {
        this.items = items;
        return this;
    }

    public ListAutopilotClusterMasterSnapshotTasksResponse addItemsItem(SnapshotTask itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListAutopilotClusterMasterSnapshotTasksResponse withItems(Consumer<List<SnapshotTask>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 备份任务列表
     * @return items
     */
    public List<SnapshotTask> getItems() {
        return items;
    }

    public void setItems(List<SnapshotTask> items) {
        this.items = items;
    }

    public ListAutopilotClusterMasterSnapshotTasksResponse withStatus(SnapshotTaskStatus status) {
        this.status = status;
        return this;
    }

    public ListAutopilotClusterMasterSnapshotTasksResponse withStatus(Consumer<SnapshotTaskStatus> statusSetter) {
        if (this.status == null) {
            this.status = new SnapshotTaskStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public SnapshotTaskStatus getStatus() {
        return status;
    }

    public void setStatus(SnapshotTaskStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAutopilotClusterMasterSnapshotTasksResponse that = (ListAutopilotClusterMasterSnapshotTasksResponse) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.items, that.items)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, items, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutopilotClusterMasterSnapshotTasksResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
