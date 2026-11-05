package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**：镜像预热任务的执行状态。 **约束限制**：仅在请求体/插件中存在镜像预热配置（image_warm_up）时返回。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class NodeconfigStatusConfigsStatusImageWarmUp {

    /**
     * **参数解释**：镜像预热任务的整体状态。 **约束限制**：不涉及。 **取值范围**：可选值如下： - Success：全部成功，所有镜像在所有节点上均预热成功。 - Failed：全部失败，所有镜像在所有节点上均预热失败。 - Pulling：预热中，镜像正在被拉取。 - PartialCompletion：部分完成，部分镜像成功、部分失败或部分节点成功。 - Unknown：未知状态，解析节点上报数据异常。 **默认取值**：不涉及。
     */
    public static final class StateEnum {

        /**
         * Enum SUCCESS for value: "Success"
         */
        public static final StateEnum SUCCESS = new StateEnum("Success");

        /**
         * Enum FAILED for value: "Failed"
         */
        public static final StateEnum FAILED = new StateEnum("Failed");

        /**
         * Enum PULLING for value: "Pulling"
         */
        public static final StateEnum PULLING = new StateEnum("Pulling");

        /**
         * Enum PARTIALCOMPLETION for value: "PartialCompletion"
         */
        public static final StateEnum PARTIALCOMPLETION = new StateEnum("PartialCompletion");

        /**
         * Enum UNKNOWN for value: "Unknown"
         */
        public static final StateEnum UNKNOWN = new StateEnum("Unknown");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("Success", SUCCESS);
            map.put("Failed", FAILED);
            map.put("Pulling", PULLING);
            map.put("PartialCompletion", PARTIALCOMPLETION);
            map.put("Unknown", UNKNOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public NodeconfigStatusConfigsStatusImageWarmUp withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：镜像预热任务的整体状态。 **约束限制**：不涉及。 **取值范围**：可选值如下： - Success：全部成功，所有镜像在所有节点上均预热成功。 - Failed：全部失败，所有镜像在所有节点上均预热失败。 - Pulling：预热中，镜像正在被拉取。 - PartialCompletion：部分完成，部分镜像成功、部分失败或部分节点成功。 - Unknown：未知状态，解析节点上报数据异常。 **默认取值**：不涉及。
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public NodeconfigStatusConfigsStatusImageWarmUp withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：镜像预热任务的详细结果信息（JSON格式字符串），包含以下字段： - successfulImages：预热成功的镜像列表 - failedImages：预热失败的镜像列表 - partialSuccess：部分节点成功的镜像列表 - pendingImages：尚未完成预热的镜像列表 - additionalInfos：失败原因等附加信息（如镜像不存在、拉取超时、拉取失败、镜像仓库中manifest不存在） - successfulImagesConfig：成功镜像的配置详情（id、name、creationTimestamp、type、image） - failedImagesConfig：失败镜像的配置详情 - partialSuccessConfig：部分成功镜像的配置详情 - pendingImagesConfig：待预热镜像的配置详情 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeconfigStatusConfigsStatusImageWarmUp that = (NodeconfigStatusConfigsStatusImageWarmUp) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigStatusConfigsStatusImageWarmUp {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
