package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 动作动画资产元数据。
 */
public class AnimationAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style_id")

    private String styleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Float duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_analysis")

    private Boolean autoAnalysis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_delay")

    private Float voiceDelay;

    /**
     * 动画插入位置限制。 * ONLY_BEGINNING：视频制作时，动画只允许出现在起始位置。 * ONLY_END：视频制作时，动画只允许出现在结束位置。
     */
    public static final class AnimationInsertRestrictionEnum {

        /**
         * Enum ONLY_BEGINNING for value: "ONLY_BEGINNING"
         */
        public static final AnimationInsertRestrictionEnum ONLY_BEGINNING =
            new AnimationInsertRestrictionEnum("ONLY_BEGINNING");

        /**
         * Enum ONLY_END for value: "ONLY_END"
         */
        public static final AnimationInsertRestrictionEnum ONLY_END = new AnimationInsertRestrictionEnum("ONLY_END");

        private static final Map<String, AnimationInsertRestrictionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AnimationInsertRestrictionEnum> createStaticFields() {
            Map<String, AnimationInsertRestrictionEnum> map = new HashMap<>();
            map.put("ONLY_BEGINNING", ONLY_BEGINNING);
            map.put("ONLY_END", ONLY_END);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AnimationInsertRestrictionEnum(String value) {
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
        public static AnimationInsertRestrictionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new AnimationInsertRestrictionEnum(value));
        }

        public static AnimationInsertRestrictionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AnimationInsertRestrictionEnum) {
                return this.value.equals(((AnimationInsertRestrictionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "animation_insert_restriction")

    private AnimationInsertRestrictionEnum animationInsertRestriction;

    public AnimationAssetMeta withStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }

    /**
     * 数字人模型风格ID。
     * @return styleId
     */
    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public AnimationAssetMeta withDuration(Float duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 动作动画时长。
     * minimum: 0
     * maximum: 32767
     * @return duration
     */
    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public AnimationAssetMeta withAutoAnalysis(Boolean autoAnalysis) {
        this.autoAnalysis = autoAnalysis;
        return this;
    }

    /**
     * 动作是否需要自动解析。
     * @return autoAnalysis
     */
    public Boolean getAutoAnalysis() {
        return autoAnalysis;
    }

    public void setAutoAnalysis(Boolean autoAnalysis) {
        this.autoAnalysis = autoAnalysis;
    }

    public AnimationAssetMeta withVoiceDelay(Float voiceDelay) {
        this.voiceDelay = voiceDelay;
        return this;
    }

    /**
     * 语音延迟播放时长。  单位秒。  使用场景举例：入场动画3秒，voice_delay设置成4秒，则语音从入场动画开始后第4秒开始播放。
     * minimum: 0
     * maximum: 1E+2
     * @return voiceDelay
     */
    public Float getVoiceDelay() {
        return voiceDelay;
    }

    public void setVoiceDelay(Float voiceDelay) {
        this.voiceDelay = voiceDelay;
    }

    public AnimationAssetMeta withAnimationInsertRestriction(
        AnimationInsertRestrictionEnum animationInsertRestriction) {
        this.animationInsertRestriction = animationInsertRestriction;
        return this;
    }

    /**
     * 动画插入位置限制。 * ONLY_BEGINNING：视频制作时，动画只允许出现在起始位置。 * ONLY_END：视频制作时，动画只允许出现在结束位置。
     * @return animationInsertRestriction
     */
    public AnimationInsertRestrictionEnum getAnimationInsertRestriction() {
        return animationInsertRestriction;
    }

    public void setAnimationInsertRestriction(AnimationInsertRestrictionEnum animationInsertRestriction) {
        this.animationInsertRestriction = animationInsertRestriction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnimationAssetMeta that = (AnimationAssetMeta) obj;
        return Objects.equals(this.styleId, that.styleId) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.autoAnalysis, that.autoAnalysis) && Objects.equals(this.voiceDelay, that.voiceDelay)
            && Objects.equals(this.animationInsertRestriction, that.animationInsertRestriction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(styleId, duration, autoAnalysis, voiceDelay, animationInsertRestriction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimationAssetMeta {\n");
        sb.append("    styleId: ").append(toIndentedString(styleId)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    autoAnalysis: ").append(toIndentedString(autoAnalysis)).append("\n");
        sb.append("    voiceDelay: ").append(toIndentedString(voiceDelay)).append("\n");
        sb.append("    animationInsertRestriction: ").append(toIndentedString(animationInsertRestriction)).append("\n");
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
