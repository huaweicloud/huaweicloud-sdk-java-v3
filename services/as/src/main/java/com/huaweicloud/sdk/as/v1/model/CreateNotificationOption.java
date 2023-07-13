package com.huaweicloud.sdk.as.v1.model;

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
 * 配置伸缩组通知
 */
public class CreateNotificationOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    /**
     * Gets or Sets topicScene
     */
    public static final class TopicSceneEnum {

        /**
         * Enum SCALING_UP for value: "SCALING_UP"
         */
        public static final TopicSceneEnum SCALING_UP = new TopicSceneEnum("SCALING_UP");

        /**
         * Enum SCALING_UP_FAIL for value: "SCALING_UP_FAIL"
         */
        public static final TopicSceneEnum SCALING_UP_FAIL = new TopicSceneEnum("SCALING_UP_FAIL");

        /**
         * Enum SCALING_DOWN for value: "SCALING_DOWN"
         */
        public static final TopicSceneEnum SCALING_DOWN = new TopicSceneEnum("SCALING_DOWN");

        /**
         * Enum SCALING_DOWN_FAIL for value: "SCALING_DOWN_FAIL"
         */
        public static final TopicSceneEnum SCALING_DOWN_FAIL = new TopicSceneEnum("SCALING_DOWN_FAIL");

        /**
         * Enum SCALING_GROUP_ABNORMAL for value: "SCALING_GROUP_ABNORMAL"
         */
        public static final TopicSceneEnum SCALING_GROUP_ABNORMAL = new TopicSceneEnum("SCALING_GROUP_ABNORMAL");

        private static final Map<String, TopicSceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TopicSceneEnum> createStaticFields() {
            Map<String, TopicSceneEnum> map = new HashMap<>();
            map.put("SCALING_UP", SCALING_UP);
            map.put("SCALING_UP_FAIL", SCALING_UP_FAIL);
            map.put("SCALING_DOWN", SCALING_DOWN);
            map.put("SCALING_DOWN_FAIL", SCALING_DOWN_FAIL);
            map.put("SCALING_GROUP_ABNORMAL", SCALING_GROUP_ABNORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TopicSceneEnum(String value) {
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
        public static TopicSceneEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TopicSceneEnum(value));
        }

        public static TopicSceneEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TopicSceneEnum) {
                return this.value.equals(((TopicSceneEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_scene")

    private List<TopicSceneEnum> topicScene = null;

    public CreateNotificationOption withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * SMN服务中Topic的唯一的资源标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public CreateNotificationOption withTopicScene(List<TopicSceneEnum> topicScene) {
        this.topicScene = topicScene;
        return this;
    }

    public CreateNotificationOption addTopicSceneItem(TopicSceneEnum topicSceneItem) {
        if (this.topicScene == null) {
            this.topicScene = new ArrayList<>();
        }
        this.topicScene.add(topicSceneItem);
        return this;
    }

    public CreateNotificationOption withTopicScene(Consumer<List<TopicSceneEnum>> topicSceneSetter) {
        if (this.topicScene == null) {
            this.topicScene = new ArrayList<>();
        }
        topicSceneSetter.accept(this.topicScene);
        return this;
    }

    /**
     * 通知场景，有以下五种类型。SCALING_UP：扩容成功。SCALING_UP_FAIL：扩容失败。SCALING_DOWN：减容成功。SCALING_DOWN_FAIL：减容失败。SCALING_GROUP_ABNORMAL：伸缩组发生异常
     * @return topicScene
     */
    public List<TopicSceneEnum> getTopicScene() {
        return topicScene;
    }

    public void setTopicScene(List<TopicSceneEnum> topicScene) {
        this.topicScene = topicScene;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNotificationOption that = (CreateNotificationOption) obj;
        return Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.topicScene, that.topicScene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, topicScene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNotificationOption {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    topicScene: ").append(toIndentedString(topicScene)).append("\n");
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
