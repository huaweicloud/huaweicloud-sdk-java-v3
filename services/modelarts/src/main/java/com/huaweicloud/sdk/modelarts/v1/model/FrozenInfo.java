package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源的冻结信息，当资源被冻结时返回冻结的类型信息。
 */
public class FrozenInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private String scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private Integer effect;

    public FrozenInfo withScene(String scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 冻结场景。可选值如下： - ARREAR：欠费冻结 - POLICE：公安冻结 - ILLEGAL：违规冻结
     * @return scene
     */
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public FrozenInfo withEffect(Integer effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 冻结后的影响。可选值如下： - 1：冻结后可释放 - 2：冻结后不可释放
     * @return effect
     */
    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
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
        FrozenInfo that = (FrozenInfo) obj;
        return Objects.equals(this.scene, that.scene) && Objects.equals(this.effect, that.effect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene, effect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrozenInfo {\n");
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
