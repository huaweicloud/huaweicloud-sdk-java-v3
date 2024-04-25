package com.huaweicloud.sdk.moderation.v3.model;

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
 * VideoCreateRequest
 */
public class VideoCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private VideoCreateRequestData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "biz_type")

    private String bizType;

    /**
     * 事件类型，可选值如下： default：默认事件
     */
    public static final class EventTypeEnum {

        /**
         * Enum DEFAULT for value: "default"
         */
        public static final EventTypeEnum DEFAULT = new EventTypeEnum("default");

        private static final Map<String, EventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypeEnum> createStaticFields() {
            Map<String, EventTypeEnum> map = new HashMap<>();
            map.put("default", DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventTypeEnum(String value) {
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
        public static EventTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventTypeEnum(value));
        }

        public static EventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventTypeEnum) {
                return this.value.equals(((EventTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private EventTypeEnum eventType;

    /**
     * Gets or Sets imageCategories
     */
    public static final class ImageCategoriesEnum {

        /**
         * Enum PORN for value: "porn"
         */
        public static final ImageCategoriesEnum PORN = new ImageCategoriesEnum("porn");

        /**
         * Enum POLITICS for value: "politics"
         */
        public static final ImageCategoriesEnum POLITICS = new ImageCategoriesEnum("politics");

        /**
         * Enum TERRORISM for value: "terrorism"
         */
        public static final ImageCategoriesEnum TERRORISM = new ImageCategoriesEnum("terrorism");

        /**
         * Enum IMAGE_TEXT for value: "image_text"
         */
        public static final ImageCategoriesEnum IMAGE_TEXT = new ImageCategoriesEnum("image_text");

        private static final Map<String, ImageCategoriesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageCategoriesEnum> createStaticFields() {
            Map<String, ImageCategoriesEnum> map = new HashMap<>();
            map.put("porn", PORN);
            map.put("politics", POLITICS);
            map.put("terrorism", TERRORISM);
            map.put("image_text", IMAGE_TEXT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImageCategoriesEnum(String value) {
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
        public static ImageCategoriesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageCategoriesEnum(value));
        }

        public static ImageCategoriesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImageCategoriesEnum) {
                return this.value.equals(((ImageCategoriesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_categories")

    private List<ImageCategoriesEnum> imageCategories = null;

    /**
     * Gets or Sets audioCategories
     */
    public static final class AudioCategoriesEnum {

        /**
         * Enum PORN for value: "porn"
         */
        public static final AudioCategoriesEnum PORN = new AudioCategoriesEnum("porn");

        /**
         * Enum AD for value: "ad"
         */
        public static final AudioCategoriesEnum AD = new AudioCategoriesEnum("ad");

        /**
         * Enum POLITICS for value: "politics"
         */
        public static final AudioCategoriesEnum POLITICS = new AudioCategoriesEnum("politics");

        /**
         * Enum MOAN for value: "moan"
         */
        public static final AudioCategoriesEnum MOAN = new AudioCategoriesEnum("moan");

        /**
         * Enum ABUSE for value: "abuse"
         */
        public static final AudioCategoriesEnum ABUSE = new AudioCategoriesEnum("abuse");

        private static final Map<String, AudioCategoriesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioCategoriesEnum> createStaticFields() {
            Map<String, AudioCategoriesEnum> map = new HashMap<>();
            map.put("porn", PORN);
            map.put("ad", AD);
            map.put("politics", POLITICS);
            map.put("moan", MOAN);
            map.put("abuse", ABUSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioCategoriesEnum(String value) {
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
        public static AudioCategoriesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AudioCategoriesEnum(value));
        }

        public static AudioCategoriesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioCategoriesEnum) {
                return this.value.equals(((AudioCategoriesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_categories")

    private List<AudioCategoriesEnum> audioCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    private String callback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seed")

    private String seed;

    public VideoCreateRequest withData(VideoCreateRequestData data) {
        this.data = data;
        return this;
    }

    public VideoCreateRequest withData(Consumer<VideoCreateRequestData> dataSetter) {
        if (this.data == null) {
            this.data = new VideoCreateRequestData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public VideoCreateRequestData getData() {
        return data;
    }

    public void setData(VideoCreateRequestData data) {
        this.data = data;
    }

    public VideoCreateRequest withBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }

    /**
     * 用户在控制台界面创建的biz_type名称，如果请求参数中传了biz_type则优先使用biz_type；如果用户没传biz_type则event_type和image_categories必须传。
     * @return bizType
     */
    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public VideoCreateRequest withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，可选值如下： default：默认事件
     * @return eventType
     */
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public VideoCreateRequest withImageCategories(List<ImageCategoriesEnum> imageCategories) {
        this.imageCategories = imageCategories;
        return this;
    }

    public VideoCreateRequest addImageCategoriesItem(ImageCategoriesEnum imageCategoriesItem) {
        if (this.imageCategories == null) {
            this.imageCategories = new ArrayList<>();
        }
        this.imageCategories.add(imageCategoriesItem);
        return this;
    }

    public VideoCreateRequest withImageCategories(Consumer<List<ImageCategoriesEnum>> imageCategoriesSetter) {
        if (this.imageCategories == null) {
            this.imageCategories = new ArrayList<>();
        }
        imageCategoriesSetter.accept(this.imageCategories);
        return this;
    }

    /**
     * 视频中画面需要检测的风险类型，列表不能为空。 terrorism：涉政暴恐内容的检测 porn：鉴黄内容的检测 politics：政治敏感人物内容的检测 image_text：图文违规内容的检测（检测图片中出现的广告、色情、暴恐、涉政的文字违规内容以及二维码内容）
     * @return imageCategories
     */
    public List<ImageCategoriesEnum> getImageCategories() {
        return imageCategories;
    }

    public void setImageCategories(List<ImageCategoriesEnum> imageCategories) {
        this.imageCategories = imageCategories;
    }

    public VideoCreateRequest withAudioCategories(List<AudioCategoriesEnum> audioCategories) {
        this.audioCategories = audioCategories;
        return this;
    }

    public VideoCreateRequest addAudioCategoriesItem(AudioCategoriesEnum audioCategoriesItem) {
        if (this.audioCategories == null) {
            this.audioCategories = new ArrayList<>();
        }
        this.audioCategories.add(audioCategoriesItem);
        return this;
    }

    public VideoCreateRequest withAudioCategories(Consumer<List<AudioCategoriesEnum>> audioCategoriesSetter) {
        if (this.audioCategories == null) {
            this.audioCategories = new ArrayList<>();
        }
        audioCategoriesSetter.accept(this.audioCategories);
        return this;
    }

    /**
     * 视频中音频需要检测的风险类型，不传或为空时表示不审核音频维度。 politics: 涉政检测 porn：涉黄检测 ad: 广告检测 moan: 娇喘检测 abuse: 辱骂检测
     * @return audioCategories
     */
    public List<AudioCategoriesEnum> getAudioCategories() {
        return audioCategories;
    }

    public void setAudioCategories(List<AudioCategoriesEnum> audioCategories) {
        this.audioCategories = audioCategories;
    }

    public VideoCreateRequest withCallback(String callback) {
        this.callback = callback;
        return this;
    }

    /**
     * 回调http接口：当该字段非空时，服务将根据该字段回调通知用户审核结果。
     * @return callback
     */
    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public VideoCreateRequest withSeed(String seed) {
        this.seed = seed;
        return this;
    }

    /**
     * 用于回调通知时校验请求由华为云内容安全服务发起，由您自定义。随机字符串，由英文字母、数字、下划线组成，不超过64个字符。 说明：当seed非空时，headers中将包含X-Auth-Signature字段，字段的值使用HmacSHA256算法生成，待加密字符串由create_time、job_id、request_id、seed按照顺序拼接而成，密钥为seed。
     * @return seed
     */
    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoCreateRequest that = (VideoCreateRequest) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.bizType, that.bizType)
            && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.imageCategories, that.imageCategories)
            && Objects.equals(this.audioCategories, that.audioCategories)
            && Objects.equals(this.callback, that.callback) && Objects.equals(this.seed, that.seed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, bizType, eventType, imageCategories, audioCategories, callback, seed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCreateRequest {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    imageCategories: ").append(toIndentedString(imageCategories)).append("\n");
        sb.append("    audioCategories: ").append(toIndentedString(audioCategories)).append("\n");
        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
        sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
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
