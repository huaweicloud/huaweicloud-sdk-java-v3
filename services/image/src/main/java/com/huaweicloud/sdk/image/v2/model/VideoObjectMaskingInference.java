package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VideoObjectMaskingInference
 */
public class VideoObjectMaskingInference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pass_through")

    private String passThrough;

    /**
     * 擦除场景，可选车内或车外场景【inside,outside】
     */
    public static final class SceneTypeEnum {

        /**
         * Enum INSIDE for value: "inside"
         */
        public static final SceneTypeEnum INSIDE = new SceneTypeEnum("inside");

        /**
         * Enum OUTSIDE for value: "outside"
         */
        public static final SceneTypeEnum OUTSIDE = new SceneTypeEnum("outside");

        private static final Map<String, SceneTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SceneTypeEnum> createStaticFields() {
            Map<String, SceneTypeEnum> map = new HashMap<>();
            map.put("inside", INSIDE);
            map.put("outside", OUTSIDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SceneTypeEnum(String value) {
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
        public static SceneTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SceneTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SceneTypeEnum(value);
            }
            return result;
        }

        public static SceneTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SceneTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SceneTypeEnum) {
                return this.value.equals(((SceneTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_type")

    private SceneTypeEnum sceneType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outcome_name")

    private String outcomeName;

    public VideoObjectMaskingInference withPassThrough(String passThrough) {
        this.passThrough = passThrough;
        return this;
    }

    /**
     * 透传客户信息
     * @return passThrough
     */
    public String getPassThrough() {
        return passThrough;
    }

    public void setPassThrough(String passThrough) {
        this.passThrough = passThrough;
    }

    public VideoObjectMaskingInference withSceneType(SceneTypeEnum sceneType) {
        this.sceneType = sceneType;
        return this;
    }

    /**
     * 擦除场景，可选车内或车外场景【inside,outside】
     * @return sceneType
     */
    public SceneTypeEnum getSceneType() {
        return sceneType;
    }

    public void setSceneType(SceneTypeEnum sceneType) {
        this.sceneType = sceneType;
    }

    public VideoObjectMaskingInference withOutcomeName(String outcomeName) {
        this.outcomeName = outcomeName;
        return this;
    }

    /**
     * 用户自定义产物名，无此项输入时，输出路径为{output结构体中指定输出path}/{task_id}/{task_id}.mp4；有此项输入时，输出路径为{output结构体中指定输出path}/{outcome_name}.mp4，自定义产物路径最多可定义5层文件夹目录。
     * @return outcomeName
     */
    public String getOutcomeName() {
        return outcomeName;
    }

    public void setOutcomeName(String outcomeName) {
        this.outcomeName = outcomeName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoObjectMaskingInference videoObjectMaskingInference = (VideoObjectMaskingInference) o;
        return Objects.equals(this.passThrough, videoObjectMaskingInference.passThrough)
            && Objects.equals(this.sceneType, videoObjectMaskingInference.sceneType)
            && Objects.equals(this.outcomeName, videoObjectMaskingInference.outcomeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passThrough, sceneType, outcomeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoObjectMaskingInference {\n");
        sb.append("    passThrough: ").append(toIndentedString(passThrough)).append("\n");
        sb.append("    sceneType: ").append(toIndentedString(sceneType)).append("\n");
        sb.append("    outcomeName: ").append(toIndentedString(outcomeName)).append("\n");
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
