package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略文档结构。
 */
public class Statement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect")

    private String effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<String> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<String> resources = null;

    public Statement withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 指定是允许还是拒绝该操作。既有允许（ALLOW）又有拒绝（DENY）的授权语句时，遵循拒绝（DENY）优先的原则。 - ALLOW：允许。 - DENY：拒绝。 
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public Statement withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    public Statement addActionsItem(String actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public Statement withActions(Consumer<List<String>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 用于指定策略允许或拒绝的操作。格式为：服务名:资源:操作。当前支持的操作类型如下： - iotda:devices:publish：设备使用MQTT协议发布消息。 - iotda:devices:subscribe：设备使用MQTT协议订阅消息。 
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public Statement withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    public Statement addResourcesItem(String resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public Statement withResources(Consumer<List<String>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 用于指定允许或拒绝对其执行操作的资源。格式为：资源类型:资源名称。如设备订阅的资源为：topic:/v1/${devices.deviceId}/test/hello。  **取值范围**：资源列表长度最小为1，最大为10，列表中的资源取值范围：仅支持字母，数字，以及/{}$=+#?*:._-组合。 
     * @return resources
     */
    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Statement that = (Statement) obj;
        return Objects.equals(this.effect, that.effect) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effect, actions, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Statement {\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
