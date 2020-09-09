package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RepoHook
 */
public class RepoHook  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="build_events")
    
    private Boolean buildEvents;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private OffsetDateTime createdAt = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_ssl_verification")
    
    private Boolean enableSslVerification;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issues_events")
    
    private Boolean issuesEvents;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="merge_requests_events")
    
    private Boolean mergeRequestsEvents;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="note_events")
    
    private Boolean noteEvents;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_events")
    
    private Boolean pipelineEvents;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private Integer projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="push_events")
    
    private Boolean pushEvents;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repository_update_events")
    
    private Boolean repositoryUpdateEvents;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag_push_events")
    
    private Boolean tagPushEvents;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="wiki_page_events")
    
    private Boolean wikiPageEvents;

    public RepoHook withBuildEvents(Boolean buildEvents) {
        this.buildEvents = buildEvents;
        return this;
    }

    


    /**
     * Get buildEvents
     * @return buildEvents
     */
    public Boolean getBuildEvents() {
        return buildEvents;
    }

    public void setBuildEvents(Boolean buildEvents) {
        this.buildEvents = buildEvents;
    }

    public RepoHook withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 仓库统计创建的时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public RepoHook withEnableSslVerification(Boolean enableSslVerification) {
        this.enableSslVerification = enableSslVerification;
        return this;
    }

    


    /**
     * Get enableSslVerification
     * @return enableSslVerification
     */
    public Boolean getEnableSslVerification() {
        return enableSslVerification;
    }

    public void setEnableSslVerification(Boolean enableSslVerification) {
        this.enableSslVerification = enableSslVerification;
    }

    public RepoHook withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * hook id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RepoHook withIssuesEvents(Boolean issuesEvents) {
        this.issuesEvents = issuesEvents;
        return this;
    }

    


    /**
     * Get issuesEvents
     * @return issuesEvents
     */
    public Boolean getIssuesEvents() {
        return issuesEvents;
    }

    public void setIssuesEvents(Boolean issuesEvents) {
        this.issuesEvents = issuesEvents;
    }

    public RepoHook withMergeRequestsEvents(Boolean mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
        return this;
    }

    


    /**
     * Get mergeRequestsEvents
     * @return mergeRequestsEvents
     */
    public Boolean getMergeRequestsEvents() {
        return mergeRequestsEvents;
    }

    public void setMergeRequestsEvents(Boolean mergeRequestsEvents) {
        this.mergeRequestsEvents = mergeRequestsEvents;
    }

    public RepoHook withNoteEvents(Boolean noteEvents) {
        this.noteEvents = noteEvents;
        return this;
    }

    


    /**
     * Get noteEvents
     * @return noteEvents
     */
    public Boolean getNoteEvents() {
        return noteEvents;
    }

    public void setNoteEvents(Boolean noteEvents) {
        this.noteEvents = noteEvents;
    }

    public RepoHook withPipelineEvents(Boolean pipelineEvents) {
        this.pipelineEvents = pipelineEvents;
        return this;
    }

    


    /**
     * Get pipelineEvents
     * @return pipelineEvents
     */
    public Boolean getPipelineEvents() {
        return pipelineEvents;
    }

    public void setPipelineEvents(Boolean pipelineEvents) {
        this.pipelineEvents = pipelineEvents;
    }

    public RepoHook withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 仓库id
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public RepoHook withPushEvents(Boolean pushEvents) {
        this.pushEvents = pushEvents;
        return this;
    }

    


    /**
     * Get pushEvents
     * @return pushEvents
     */
    public Boolean getPushEvents() {
        return pushEvents;
    }

    public void setPushEvents(Boolean pushEvents) {
        this.pushEvents = pushEvents;
    }

    public RepoHook withRepositoryUpdateEvents(Boolean repositoryUpdateEvents) {
        this.repositoryUpdateEvents = repositoryUpdateEvents;
        return this;
    }

    


    /**
     * Get repositoryUpdateEvents
     * @return repositoryUpdateEvents
     */
    public Boolean getRepositoryUpdateEvents() {
        return repositoryUpdateEvents;
    }

    public void setRepositoryUpdateEvents(Boolean repositoryUpdateEvents) {
        this.repositoryUpdateEvents = repositoryUpdateEvents;
    }

    public RepoHook withTagPushEvents(Boolean tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
        return this;
    }

    


    /**
     * Get tagPushEvents
     * @return tagPushEvents
     */
    public Boolean getTagPushEvents() {
        return tagPushEvents;
    }

    public void setTagPushEvents(Boolean tagPushEvents) {
        this.tagPushEvents = tagPushEvents;
    }

    public RepoHook withWikiPageEvents(Boolean wikiPageEvents) {
        this.wikiPageEvents = wikiPageEvents;
        return this;
    }

    


    /**
     * Get wikiPageEvents
     * @return wikiPageEvents
     */
    public Boolean getWikiPageEvents() {
        return wikiPageEvents;
    }

    public void setWikiPageEvents(Boolean wikiPageEvents) {
        this.wikiPageEvents = wikiPageEvents;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepoHook repoHook = (RepoHook) o;
        return Objects.equals(this.buildEvents, repoHook.buildEvents) &&
            Objects.equals(this.createdAt, repoHook.createdAt) &&
            Objects.equals(this.enableSslVerification, repoHook.enableSslVerification) &&
            Objects.equals(this.id, repoHook.id) &&
            Objects.equals(this.issuesEvents, repoHook.issuesEvents) &&
            Objects.equals(this.mergeRequestsEvents, repoHook.mergeRequestsEvents) &&
            Objects.equals(this.noteEvents, repoHook.noteEvents) &&
            Objects.equals(this.pipelineEvents, repoHook.pipelineEvents) &&
            Objects.equals(this.projectId, repoHook.projectId) &&
            Objects.equals(this.pushEvents, repoHook.pushEvents) &&
            Objects.equals(this.repositoryUpdateEvents, repoHook.repositoryUpdateEvents) &&
            Objects.equals(this.tagPushEvents, repoHook.tagPushEvents) &&
            Objects.equals(this.wikiPageEvents, repoHook.wikiPageEvents);
    }
    @Override
    public int hashCode() {
        return Objects.hash(buildEvents, createdAt, enableSslVerification, id, issuesEvents, mergeRequestsEvents, noteEvents, pipelineEvents, projectId, pushEvents, repositoryUpdateEvents, tagPushEvents, wikiPageEvents);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoHook {\n");
        sb.append("    buildEvents: ").append(toIndentedString(buildEvents)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    enableSslVerification: ").append(toIndentedString(enableSslVerification)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issuesEvents: ").append(toIndentedString(issuesEvents)).append("\n");
        sb.append("    mergeRequestsEvents: ").append(toIndentedString(mergeRequestsEvents)).append("\n");
        sb.append("    noteEvents: ").append(toIndentedString(noteEvents)).append("\n");
        sb.append("    pipelineEvents: ").append(toIndentedString(pipelineEvents)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    pushEvents: ").append(toIndentedString(pushEvents)).append("\n");
        sb.append("    repositoryUpdateEvents: ").append(toIndentedString(repositoryUpdateEvents)).append("\n");
        sb.append("    tagPushEvents: ").append(toIndentedString(tagPushEvents)).append("\n");
        sb.append("    wikiPageEvents: ").append(toIndentedString(wikiPageEvents)).append("\n");
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

