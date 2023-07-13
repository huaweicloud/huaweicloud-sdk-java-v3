package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云服务或资源实例冻结信息。
 */
public class FrozenInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private Integer effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private List<String> scene = null;

    public FrozenInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 云服务或资源实例状态，取值： - 0：解冻/正常（云服务恢复正常）。 - 1：冻结（资源和数据会保留，但租户无法再正常使用云服务）。 - 2：删除/终止（资源和数据将清除）。
     * minimum: 0
     * maximum: 2
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public FrozenInfo withEffect(Integer effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 在冻结/解冻操作下，取值： - 1（默认值）：冻结可释放。 - 2：冻结不可释放。 - 3：冻结后不可续费。
     * minimum: 1
     * maximum: 3
     * @return effect
     */
    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
        this.effect = effect;
    }

    public FrozenInfo withScene(List<String> scene) {
        this.scene = scene;
        return this;
    }

    public FrozenInfo addSceneItem(String sceneItem) {
        if (this.scene == null) {
            this.scene = new ArrayList<>();
        }
        this.scene.add(sceneItem);
        return this;
    }

    public FrozenInfo withScene(Consumer<List<String>> sceneSetter) {
        if (this.scene == null) {
            this.scene = new ArrayList<>();
        }
        sceneSetter.accept(this.scene);
        return this;
    }

    /**
     * 更新云服务状态的业务场景列表，取值： - ARREAR（默认值）：欠费场景。为正常的运营业务场景，包括包周期资源到期、按需资源扣费失败。 - POLICE：公安冻结场景。 - ILLEGAL：违规冻结场景。 - VERIFY：客户未实名认证冻结场景。 - PARTNER：合作伙伴冻结（合作伙伴冻结子客户资源）。
     * @return scene
     */
    public List<String> getScene() {
        return scene;
    }

    public void setScene(List<String> scene) {
        this.scene = scene;
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
        return Objects.equals(this.status, that.status) && Objects.equals(this.effect, that.effect)
            && Objects.equals(this.scene, that.scene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, effect, scene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrozenInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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
