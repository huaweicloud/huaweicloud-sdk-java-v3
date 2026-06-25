package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdatePoolNodesRequestBody
 */
public class BatchUpdatePoolNodesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeNames")

    private List<String> nodeNames = null;

    /**
     * **参数解释**：节点更新的类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - openHaRedundant：开启节点的高可用冗余标签 - closeHaRedundant：关闭节点的高可用冗余标签 - createTags：批量添加节点资源标签 - deleteTags：批量删除节点资源标签 **默认取值**：不涉及。
     */
    public static final class ActionEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final ActionEnum TRUE = new ActionEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final ActionEnum FALSE = new ActionEnum("false");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "haRedundantEffect")

    private String haRedundantEffect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver")

    private NodeDriver driver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<NodeTag> tags = null;

    public BatchUpdatePoolNodesRequestBody withNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }

    public BatchUpdatePoolNodesRequestBody addNodeNamesItem(String nodeNamesItem) {
        if (this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        this.nodeNames.add(nodeNamesItem);
        return this;
    }

    public BatchUpdatePoolNodesRequestBody withNodeNames(Consumer<List<String>> nodeNamesSetter) {
        if (this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        nodeNamesSetter.accept(this.nodeNames);
        return this;
    }

    /**
     * **参数解释**：需要更新的节点名称列表。 **约束限制**：不涉及。
     * @return nodeNames
     */
    public List<String> getNodeNames() {
        return nodeNames;
    }

    public void setNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
    }

    public BatchUpdatePoolNodesRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**：节点更新的类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - openHaRedundant：开启节点的高可用冗余标签 - closeHaRedundant：关闭节点的高可用冗余标签 - createTags：批量添加节点资源标签 - deleteTags：批量删除节点资源标签 **默认取值**：不涉及。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public BatchUpdatePoolNodesRequestBody withHaRedundantEffect(String haRedundantEffect) {
        this.haRedundantEffect = haRedundantEffect;
        return this;
    }

    /**
     * **参数解释**：高可用冗余标签效果。 **约束限制**：不涉及。 **取值范围**：可选值如下： - NoSchedule：禁止调度 - NoExecute：禁止执行。 **默认取值**：NoSchedule。
     * @return haRedundantEffect
     */
    public String getHaRedundantEffect() {
        return haRedundantEffect;
    }

    public void setHaRedundantEffect(String haRedundantEffect) {
        this.haRedundantEffect = haRedundantEffect;
    }

    public BatchUpdatePoolNodesRequestBody withDriver(NodeDriver driver) {
        this.driver = driver;
        return this;
    }

    public BatchUpdatePoolNodesRequestBody withDriver(Consumer<NodeDriver> driverSetter) {
        if (this.driver == null) {
            this.driver = new NodeDriver();
            driverSetter.accept(this.driver);
        }

        return this;
    }

    /**
     * Get driver
     * @return driver
     */
    public NodeDriver getDriver() {
        return driver;
    }

    public void setDriver(NodeDriver driver) {
        this.driver = driver;
    }

    public BatchUpdatePoolNodesRequestBody withTags(List<NodeTag> tags) {
        this.tags = tags;
        return this;
    }

    public BatchUpdatePoolNodesRequestBody addTagsItem(NodeTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchUpdatePoolNodesRequestBody withTags(Consumer<List<NodeTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：需要批量操作的资源标签列表。 **约束限制**：不涉及。
     * @return tags
     */
    public List<NodeTag> getTags() {
        return tags;
    }

    public void setTags(List<NodeTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdatePoolNodesRequestBody that = (BatchUpdatePoolNodesRequestBody) obj;
        return Objects.equals(this.nodeNames, that.nodeNames) && Objects.equals(this.action, that.action)
            && Objects.equals(this.haRedundantEffect, that.haRedundantEffect)
            && Objects.equals(this.driver, that.driver) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeNames, action, haRedundantEffect, driver, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePoolNodesRequestBody {\n");
        sb.append("    nodeNames: ").append(toIndentedString(nodeNames)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    haRedundantEffect: ").append(toIndentedString(haRedundantEffect)).append("\n");
        sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
