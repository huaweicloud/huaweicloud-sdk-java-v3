package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作流策略。
 */
public class WorkflowPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_scene")

    private String useScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_id")

    private String sceneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scenes")

    private List<Scene> scenes = null;

    public WorkflowPolicy withUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }

    /**
     * 使用场景。
     * @return useScene
     */
    public String getUseScene() {
        return useScene;
    }

    public void setUseScene(String useScene) {
        this.useScene = useScene;
    }

    public WorkflowPolicy withSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /**
     * 场景ID。
     * @return sceneId
     */
    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public WorkflowPolicy withScenes(List<Scene> scenes) {
        this.scenes = scenes;
        return this;
    }

    public WorkflowPolicy addScenesItem(Scene scenesItem) {
        if (this.scenes == null) {
            this.scenes = new ArrayList<>();
        }
        this.scenes.add(scenesItem);
        return this;
    }

    public WorkflowPolicy withScenes(Consumer<List<Scene>> scenesSetter) {
        if (this.scenes == null) {
            this.scenes = new ArrayList<>();
        }
        scenesSetter.accept(this.scenes);
        return this;
    }

    /**
     * 场景。
     * @return scenes
     */
    public List<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(List<Scene> scenes) {
        this.scenes = scenes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowPolicy that = (WorkflowPolicy) obj;
        return Objects.equals(this.useScene, that.useScene) && Objects.equals(this.sceneId, that.sceneId)
            && Objects.equals(this.scenes, that.scenes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useScene, sceneId, scenes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowPolicy {\n");
        sb.append("    useScene: ").append(toIndentedString(useScene)).append("\n");
        sb.append("    sceneId: ").append(toIndentedString(sceneId)).append("\n");
        sb.append("    scenes: ").append(toIndentedString(scenes)).append("\n");
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
