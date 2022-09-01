package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateResSceneRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_id")

    @JacksonXmlProperty(localName = "scene_id")

    private String sceneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    @JacksonXmlProperty(localName = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateResSceneRequestBody body;

    public UpdateResSceneRequest withSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /**
     * 场景id。
     * @return sceneId
     */
    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public UpdateResSceneRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdateResSceneRequest withBody(UpdateResSceneRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateResSceneRequest withBody(Consumer<UpdateResSceneRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateResSceneRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateResSceneRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateResSceneRequestBody body) {
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
        UpdateResSceneRequest updateResSceneRequest = (UpdateResSceneRequest) o;
        return Objects.equals(this.sceneId, updateResSceneRequest.sceneId)
            && Objects.equals(this.workspaceId, updateResSceneRequest.workspaceId)
            && Objects.equals(this.body, updateResSceneRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sceneId, workspaceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResSceneRequest {\n");
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
