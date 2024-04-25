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
 * VideoStreamCreateRequest
 */
public class VideoStreamCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private VideoStreamCreateRequestData data;

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

    public VideoStreamCreateRequest withData(VideoStreamCreateRequestData data) {
        this.data = data;
        return this;
    }

    public VideoStreamCreateRequest withData(Consumer<VideoStreamCreateRequestData> dataSetter) {
        if (this.data == null) {
            this.data = new VideoStreamCreateRequestData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public VideoStreamCreateRequestData getData() {
        return data;
    }

    public void setData(VideoStreamCreateRequestData data) {
        this.data = data;
    }

    public VideoStreamCreateRequest withEventType(EventTypeEnum eventType) {
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

    public VideoStreamCreateRequest withImageCategories(List<ImageCategoriesEnum> imageCategories) {
        this.imageCategories = imageCategories;
        return this;
    }

    public VideoStreamCreateRequest addImageCategoriesItem(ImageCategoriesEnum imageCategoriesItem) {
        if (this.imageCategories == null) {
            this.imageCategories = new ArrayList<>();
        }
        this.imageCategories.add(imageCategoriesItem);
        return this;
    }

    public VideoStreamCreateRequest withImageCategories(Consumer<List<ImageCategoriesEnum>> imageCategoriesSetter) {
        if (this.imageCategories == null) {
            this.imageCategories = new ArrayList<>();
        }
        imageCategoriesSetter.accept(this.imageCategories);
        return this;
    }

    /**
     * 视频流中画面需要检测的风险类型，列表不能为空。 porn：鉴黄内容的检测 terrorism：涉政暴恐内容的检测 politics：政治敏感人物内容的检测 image_text：图文违规内容的检测（检测图片中出现的广告、色情、暴恐、涉政的文字违规内容以及二维码内容）
     * @return imageCategories
     */
    public List<ImageCategoriesEnum> getImageCategories() {
        return imageCategories;
    }

    public void setImageCategories(List<ImageCategoriesEnum> imageCategories) {
        this.imageCategories = imageCategories;
    }

    public VideoStreamCreateRequest withAudioCategories(List<AudioCategoriesEnum> audioCategories) {
        this.audioCategories = audioCategories;
        return this;
    }

    public VideoStreamCreateRequest addAudioCategoriesItem(AudioCategoriesEnum audioCategoriesItem) {
        if (this.audioCategories == null) {
            this.audioCategories = new ArrayList<>();
        }
        this.audioCategories.add(audioCategoriesItem);
        return this;
    }

    public VideoStreamCreateRequest withAudioCategories(Consumer<List<AudioCategoriesEnum>> audioCategoriesSetter) {
        if (this.audioCategories == null) {
            this.audioCategories = new ArrayList<>();
        }
        audioCategoriesSetter.accept(this.audioCategories);
        return this;
    }

    /**
     * 视频流中音频需要检测的风险类型，不传或为空时表示不审核音频维度。 porn：涉黄检测 politics: 涉政检测 abuse: 辱骂检测 ad: 广告检测 moan: 娇喘检测
     * @return audioCategories
     */
    public List<AudioCategoriesEnum> getAudioCategories() {
        return audioCategories;
    }

    public void setAudioCategories(List<AudioCategoriesEnum> audioCategories) {
        this.audioCategories = audioCategories;
    }

    public VideoStreamCreateRequest withCallback(String callback) {
        this.callback = callback;
        return this;
    }

    /**
     * 回调http接口，回调内容如下： ```{     \"job_id\":\"xxxxxx\",     \"status\":\"running\", //running - 审核中，succeeded - 审核完成，failed - 审核失败     \"request_id\":\"2419446b1fe14203f64e4018d12db3dd\",     \"craete_time\":\"2022-07-30T08:57:11.011Z\",     \"update_time\":\"2022-07-30T08:57:14.014Z\",     \"result\":{         \"suggestion\":\"block\",         \"audio_detail\":[             {                 \"suggestion\":\"block\",                 \"label\":\"politics\",                 \"audio_text\":\"xxxx\",                 \"detail\":[                     {                         \"confidence\":1,                         \"suggestion\":\"block\",                         \"label\":\"politics\",                         \"segments\":[                             {                                 \"segment\":\"xxx\"                             },                             {                                 \"segment\":\"xxx\"                             },                             {                                 \"segment\":\"xxx\"                             }                         ]                     }                 ]             }         ],         \"image_detail\":[             {                 \"suggestion\":\"block\",                 \"category\":\"xxx\",                 \"time\":\"xxx\", // 视频流截帧图片发生的绝对时间                 \"detail\":[                     {                         \"face_location\":{                             \"bottom_right_x\":247,                             \"bottom_right_y\":191,                             \"top_left_y\":79,                             \"top_left_x\":160                         },                         \"confidence\":1,                         \"suggestion\":\"block\",                         \"label\":\"xxx\",                         \"category\":\"xxx\"                     },                     {                         \"qr_content\":\"xxx\",                         \"confidence\":\"xxx\",                         \"suggestion\":\"xxx\",                         \"label\":\"xxx\",                         \"category\":\"xxx\",                         \"qr_location\":{                             \"bottom_right_x\":554,                             \"bottom_right_y\":842,                             \"top_left_y\":426,                             \"top_left_x\":140                         }                     },                     {                         \"confidence\":1,                         \"suggestion\":\"block\",                         \"label\":\"politics\",                         \"category\":\"image_text\",                         \"segments\":[                             {                                 \"segment\":\"x\"                             },                             {                                 \"segment\":\"xxx\"                             },                             {                                 \"segment\":\"xx\"                             },                             {                                 \"segment\":\"x\"                             },                             {                                 \"segment\":\"xxxx\"                             }                         ]                     }                 ]             }         ]     },     \"request_params\":{         \"data\":{             \"url\":\"rtmp://xxxx\",             \"frame_interval\":3         },         \"event_type\":\"default\",         \"image_categories\":[             \"politics\",             \"porn\",             \"image_text\",             \"terrorism\"         ],         \"audio_categories\":[             \"porn\",             \"ad\",             \"politics\",             \"moan\",             \"abuse\"         ],         \"callback\":\"http://xxx/callback\"     } }
     * @return callback
     */
    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public VideoStreamCreateRequest withSeed(String seed) {
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
        VideoStreamCreateRequest that = (VideoStreamCreateRequest) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.imageCategories, that.imageCategories)
            && Objects.equals(this.audioCategories, that.audioCategories)
            && Objects.equals(this.callback, that.callback) && Objects.equals(this.seed, that.seed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, eventType, imageCategories, audioCategories, callback, seed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoStreamCreateRequest {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
