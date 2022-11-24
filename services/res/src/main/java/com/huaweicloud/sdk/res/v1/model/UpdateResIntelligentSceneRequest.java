package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateResIntelligentSceneRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_id")

    private String sceneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateResIntelligentSceneRequestBody body;

    public UpdateResIntelligentSceneRequest withSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /**
     * 场景id
     * @return sceneId
     */
    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public UpdateResIntelligentSceneRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdateResIntelligentSceneRequest withBody(UpdateResIntelligentSceneRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateResIntelligentSceneRequest withBody(Consumer<UpdateResIntelligentSceneRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateResIntelligentSceneRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateResIntelligentSceneRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateResIntelligentSceneRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateResIntelligentSceneRequest updateResIntelligentSceneRequest = (UpdateResIntelligentSceneRequest) o;
        return Objects.equals(this.sceneId, updateResIntelligentSceneRequest.sceneId)
            && Objects.equals(this.workspaceId, updateResIntelligentSceneRequest.workspaceId)
            && Objects.equals(this.body, updateResIntelligentSceneRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sceneId, workspaceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResIntelligentSceneRequest {\n");
        sb.append("    sceneId: ").append(toIndentedString(sceneId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
