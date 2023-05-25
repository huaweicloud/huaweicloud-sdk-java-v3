package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentStatusView
 */
public class ComponentStatusView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_status")

    private ComponentStatusType componentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_replica")

    private Integer availableReplica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_detail")

    private ComponentFailDetail failDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_id")

    private String lastJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact")

    private ComponentArtifact artifact;

    public ComponentStatusView withComponentStatus(ComponentStatusType componentStatus) {
        this.componentStatus = componentStatus;
        return this;
    }

    /**
     * Get componentStatus
     * @return componentStatus
     */
    public ComponentStatusType getComponentStatus() {
        return componentStatus;
    }

    public void setComponentStatus(ComponentStatusType componentStatus) {
        this.componentStatus = componentStatus;
    }

    public ComponentStatusView withAvailableReplica(Integer availableReplica) {
        this.availableReplica = availableReplica;
        return this;
    }

    /**
     * Get availableReplica
     * @return availableReplica
     */
    public Integer getAvailableReplica() {
        return availableReplica;
    }

    public void setAvailableReplica(Integer availableReplica) {
        this.availableReplica = availableReplica;
    }

    public ComponentStatusView withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * Get replica
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public ComponentStatusView withFailDetail(ComponentFailDetail failDetail) {
        this.failDetail = failDetail;
        return this;
    }

    /**
     * Get failDetail
     * @return failDetail
     */
    public ComponentFailDetail getFailDetail() {
        return failDetail;
    }

    public void setFailDetail(ComponentFailDetail failDetail) {
        this.failDetail = failDetail;
    }

    public ComponentStatusView withLastJobId(String lastJobId) {
        this.lastJobId = lastJobId;
        return this;
    }

    /**
     * Get lastJobId
     * @return lastJobId
     */
    public String getLastJobId() {
        return lastJobId;
    }

    public void setLastJobId(String lastJobId) {
        this.lastJobId = lastJobId;
    }

    public ComponentStatusView withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ComponentStatusView withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ComponentStatusView withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ComponentStatusView withArtifact(ComponentArtifact artifact) {
        this.artifact = artifact;
        return this;
    }

    public ComponentStatusView withArtifact(Consumer<ComponentArtifact> artifactSetter) {
        if (this.artifact == null) {
            this.artifact = new ComponentArtifact();
            artifactSetter.accept(this.artifact);
        }

        return this;
    }

    /**
     * Get artifact
     * @return artifact
     */
    public ComponentArtifact getArtifact() {
        return artifact;
    }

    public void setArtifact(ComponentArtifact artifact) {
        this.artifact = artifact;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentStatusView componentStatusView = (ComponentStatusView) o;
        return Objects.equals(this.componentStatus, componentStatusView.componentStatus)
            && Objects.equals(this.availableReplica, componentStatusView.availableReplica)
            && Objects.equals(this.replica, componentStatusView.replica)
            && Objects.equals(this.failDetail, componentStatusView.failDetail)
            && Objects.equals(this.lastJobId, componentStatusView.lastJobId)
            && Objects.equals(this.creator, componentStatusView.creator)
            && Objects.equals(this.createTime, componentStatusView.createTime)
            && Objects.equals(this.updateTime, componentStatusView.updateTime)
            && Objects.equals(this.artifact, componentStatusView.artifact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentStatus,
            availableReplica,
            replica,
            failDetail,
            lastJobId,
            creator,
            createTime,
            updateTime,
            artifact);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentStatusView {\n");
        sb.append("    componentStatus: ").append(toIndentedString(componentStatus)).append("\n");
        sb.append("    availableReplica: ").append(toIndentedString(availableReplica)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    failDetail: ").append(toIndentedString(failDetail)).append("\n");
        sb.append("    lastJobId: ").append(toIndentedString(lastJobId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
