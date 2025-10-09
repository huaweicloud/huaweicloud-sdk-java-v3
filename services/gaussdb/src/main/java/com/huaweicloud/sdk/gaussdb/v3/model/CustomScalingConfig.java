package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数描述**:  自定义扩容策略。  **约束限制**：  不涉及。
 */
public class CustomScalingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enlarge_scene")

    private ScalingScene enlargeScene;

    public CustomScalingConfig withEnlargeScene(ScalingScene enlargeScene) {
        this.enlargeScene = enlargeScene;
        return this;
    }

    public CustomScalingConfig withEnlargeScene(Consumer<ScalingScene> enlargeSceneSetter) {
        if (this.enlargeScene == null) {
            this.enlargeScene = new ScalingScene();
            enlargeSceneSetter.accept(this.enlargeScene);
        }

        return this;
    }

    /**
     * Get enlargeScene
     * @return enlargeScene
     */
    public ScalingScene getEnlargeScene() {
        return enlargeScene;
    }

    public void setEnlargeScene(ScalingScene enlargeScene) {
        this.enlargeScene = enlargeScene;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomScalingConfig that = (CustomScalingConfig) obj;
        return Objects.equals(this.enlargeScene, that.enlargeScene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enlargeScene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomScalingConfig {\n");
        sb.append("    enlargeScene: ").append(toIndentedString(enlargeScene)).append("\n");
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
