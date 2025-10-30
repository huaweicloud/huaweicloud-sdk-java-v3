package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Strategy
 */
public class Strategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private OperationStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private Scene scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private Effect effect;

    public Strategy withStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public OperationStatus getStatus() {
        return status;
    }

    public void setStatus(OperationStatus status) {
        this.status = status;
    }

    public Strategy withScene(Scene scene) {
        this.scene = scene;
        return this;
    }

    /**
     * Get scene
     * @return scene
     */
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Strategy withEffect(Effect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Get effect
     * @return effect
     */
    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Strategy that = (Strategy) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.scene, that.scene)
            && Objects.equals(this.effect, that.effect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, scene, effect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Strategy {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
