package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 音频内容审核请求体
 */
public class AudioCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    @JacksonXmlProperty(localName = "data")

    private AudioInputBody data;

    /**
     * 事件类型，可选值如下： default：默认事件 audiobook：有声书 education：教育音频 game：游戏语音房 live：秀场直播 ecommerce：电商直播 voiceroom：交友语音房 private：私密语音聊天
     */
    public static final class EventTypeEnum {

        /**
         * Enum DEFAULT for value: "default"
         */
        public static final EventTypeEnum DEFAULT = new EventTypeEnum("default");

        /**
         * Enum AUDIOBOOK for value: "audiobook"
         */
        public static final EventTypeEnum AUDIOBOOK = new EventTypeEnum("audiobook");

        /**
         * Enum EDUCATION for value: "education"
         */
        public static final EventTypeEnum EDUCATION = new EventTypeEnum("education");

        /**
         * Enum GAME for value: "game"
         */
        public static final EventTypeEnum GAME = new EventTypeEnum("game");

        /**
         * Enum LIVE for value: "live"
         */
        public static final EventTypeEnum LIVE = new EventTypeEnum("live");

        /**
         * Enum ECOMMERCE for value: "ecommerce"
         */
        public static final EventTypeEnum ECOMMERCE = new EventTypeEnum("ecommerce");

        /**
         * Enum VOICEROOM for value: "voiceroom"
         */
        public static final EventTypeEnum VOICEROOM = new EventTypeEnum("voiceroom");

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final EventTypeEnum PRIVATE = new EventTypeEnum("private");

        private static final Map<String, EventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypeEnum> createStaticFields() {
            Map<String, EventTypeEnum> map = new HashMap<>();
            map.put("default", DEFAULT);
            map.put("audiobook", AUDIOBOOK);
            map.put("education", EDUCATION);
            map.put("game", GAME);
            map.put("live", LIVE);
            map.put("ecommerce", ECOMMERCE);
            map.put("voiceroom", VOICEROOM);
            map.put("private", PRIVATE);
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
            EventTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EventTypeEnum(value);
            }
            return result;
        }

        public static EventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EventTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "event_type")

    private EventTypeEnum eventType;

    /**
     * Gets or Sets categories
     */
    public static final class CategoriesEnum {

        /**
         * Enum POLITICS for value: "politics"
         */
        public static final CategoriesEnum POLITICS = new CategoriesEnum("politics");

        /**
         * Enum PORN for value: "porn"
         */
        public static final CategoriesEnum PORN = new CategoriesEnum("porn");

        /**
         * Enum AD for value: "ad"
         */
        public static final CategoriesEnum AD = new CategoriesEnum("ad");

        /**
         * Enum MOAN for value: "moan"
         */
        public static final CategoriesEnum MOAN = new CategoriesEnum("moan");

        /**
         * Enum ABUSE for value: "abuse"
         */
        public static final CategoriesEnum ABUSE = new CategoriesEnum("abuse");

        private static final Map<String, CategoriesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoriesEnum> createStaticFields() {
            Map<String, CategoriesEnum> map = new HashMap<>();
            map.put("politics", POLITICS);
            map.put("porn", PORN);
            map.put("ad", AD);
            map.put("moan", MOAN);
            map.put("abuse", ABUSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoriesEnum(String value) {
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
        public static CategoriesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CategoriesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CategoriesEnum(value);
            }
            return result;
        }

        public static CategoriesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CategoriesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoriesEnum) {
                return this.value.equals(((CategoriesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "categories")

    @JacksonXmlProperty(localName = "categories")

    private List<CategoriesEnum> categories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback")

    @JacksonXmlProperty(localName = "callback")

    private String callback;

    public AudioCreateRequest withData(AudioInputBody data) {
        this.data = data;
        return this;
    }

    public AudioCreateRequest withData(Consumer<AudioInputBody> dataSetter) {
        if (this.data == null) {
            this.data = new AudioInputBody();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public AudioInputBody getData() {
        return data;
    }

    public void setData(AudioInputBody data) {
        this.data = data;
    }

    public AudioCreateRequest withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型，可选值如下： default：默认事件 audiobook：有声书 education：教育音频 game：游戏语音房 live：秀场直播 ecommerce：电商直播 voiceroom：交友语音房 private：私密语音聊天
     * @return eventType
     */
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public AudioCreateRequest withCategories(List<CategoriesEnum> categories) {
        this.categories = categories;
        return this;
    }

    public AudioCreateRequest addCategoriesItem(CategoriesEnum categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public AudioCreateRequest withCategories(Consumer<List<CategoriesEnum>> categoriesSetter) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 需要检测的风险类型，若未传或者传参为空，则表示全场景审核。
     * @return categories
     */
    public List<CategoriesEnum> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesEnum> categories) {
        this.categories = categories;
    }

    public AudioCreateRequest withCallback(String callback) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioCreateRequest audioCreateRequest = (AudioCreateRequest) o;
        return Objects.equals(this.data, audioCreateRequest.data)
            && Objects.equals(this.eventType, audioCreateRequest.eventType)
            && Objects.equals(this.categories, audioCreateRequest.categories)
            && Objects.equals(this.callback, audioCreateRequest.callback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, eventType, categories, callback);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioCreateRequest {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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
