package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：各配置项的执行状态。 **约束限制**：仅在请求体/插件中存在对应配置项时返回。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class NodeconfigStatusConfigsStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_warm_up")

    private NodeconfigStatusConfigsStatusImageWarmUp imageWarmUp;

    public NodeconfigStatusConfigsStatus withImageWarmUp(NodeconfigStatusConfigsStatusImageWarmUp imageWarmUp) {
        this.imageWarmUp = imageWarmUp;
        return this;
    }

    public NodeconfigStatusConfigsStatus withImageWarmUp(
        Consumer<NodeconfigStatusConfigsStatusImageWarmUp> imageWarmUpSetter) {
        if (this.imageWarmUp == null) {
            this.imageWarmUp = new NodeconfigStatusConfigsStatusImageWarmUp();
            imageWarmUpSetter.accept(this.imageWarmUp);
        }

        return this;
    }

    /**
     * Get imageWarmUp
     * @return imageWarmUp
     */
    public NodeconfigStatusConfigsStatusImageWarmUp getImageWarmUp() {
        return imageWarmUp;
    }

    public void setImageWarmUp(NodeconfigStatusConfigsStatusImageWarmUp imageWarmUp) {
        this.imageWarmUp = imageWarmUp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeconfigStatusConfigsStatus that = (NodeconfigStatusConfigsStatus) obj;
        return Objects.equals(this.imageWarmUp, that.imageWarmUp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageWarmUp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigStatusConfigsStatus {\n");
        sb.append("    imageWarmUp: ").append(toIndentedString(imageWarmUp)).append("\n");
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
