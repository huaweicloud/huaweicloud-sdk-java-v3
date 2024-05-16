package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSecurityAssignedQueuesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_sources")

    private List<QueueSrcAssignEntity> queueSources = null;

    public ListSecurityAssignedQueuesResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListSecurityAssignedQueuesResponse withQueueSources(List<QueueSrcAssignEntity> queueSources) {
        this.queueSources = queueSources;
        return this;
    }

    public ListSecurityAssignedQueuesResponse addQueueSourcesItem(QueueSrcAssignEntity queueSourcesItem) {
        if (this.queueSources == null) {
            this.queueSources = new ArrayList<>();
        }
        this.queueSources.add(queueSourcesItem);
        return this;
    }

    public ListSecurityAssignedQueuesResponse withQueueSources(
        Consumer<List<QueueSrcAssignEntity>> queueSourcesSetter) {
        if (this.queueSources == null) {
            this.queueSources = new ArrayList<>();
        }
        queueSourcesSetter.accept(this.queueSources);
        return this;
    }

    /**
     * 队列资源信息。
     * @return queueSources
     */
    public List<QueueSrcAssignEntity> getQueueSources() {
        return queueSources;
    }

    public void setQueueSources(List<QueueSrcAssignEntity> queueSources) {
        this.queueSources = queueSources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityAssignedQueuesResponse that = (ListSecurityAssignedQueuesResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.queueSources, that.queueSources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, queueSources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityAssignedQueuesResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    queueSources: ").append(toIndentedString(queueSources)).append("\n");
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
