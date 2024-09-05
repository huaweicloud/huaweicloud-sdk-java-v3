package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源记录器冻结状态
 */
public class FrozenStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private Boolean isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_scene")

    private List<String> frozenScene = null;

    public FrozenStatus withIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 是否冻结
     * @return isFrozen
     */
    public Boolean getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public FrozenStatus withFrozenScene(List<String> frozenScene) {
        this.frozenScene = frozenScene;
        return this;
    }

    public FrozenStatus addFrozenSceneItem(String frozenSceneItem) {
        if (this.frozenScene == null) {
            this.frozenScene = new ArrayList<>();
        }
        this.frozenScene.add(frozenSceneItem);
        return this;
    }

    public FrozenStatus withFrozenScene(Consumer<List<String>> frozenSceneSetter) {
        if (this.frozenScene == null) {
            this.frozenScene = new ArrayList<>();
        }
        frozenSceneSetter.accept(this.frozenScene);
        return this;
    }

    /**
     * 冻结场景
     * @return frozenScene
     */
    public List<String> getFrozenScene() {
        return frozenScene;
    }

    public void setFrozenScene(List<String> frozenScene) {
        this.frozenScene = frozenScene;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrozenStatus that = (FrozenStatus) obj;
        return Objects.equals(this.isFrozen, that.isFrozen) && Objects.equals(this.frozenScene, that.frozenScene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFrozen, frozenScene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrozenStatus {\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    frozenScene: ").append(toIndentedString(frozenScene)).append("\n");
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
