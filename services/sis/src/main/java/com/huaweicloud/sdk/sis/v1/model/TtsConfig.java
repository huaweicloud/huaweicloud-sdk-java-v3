package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 语音合成配置数据结构。
 */
public class TtsConfig {

    /**
     * 语音格式头：wav、mp3、pcm。 默认：wav
     */
    public static final class AudioFormatEnum {

        /**
         * Enum WAV for value: "wav"
         */
        public static final AudioFormatEnum WAV = new AudioFormatEnum("wav");

        /**
         * Enum MP3 for value: "mp3"
         */
        public static final AudioFormatEnum MP3 = new AudioFormatEnum("mp3");

        /**
         * Enum PCM for value: "pcm"
         */
        public static final AudioFormatEnum PCM = new AudioFormatEnum("pcm");

        private static final Map<String, AudioFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioFormatEnum> createStaticFields() {
            Map<String, AudioFormatEnum> map = new HashMap<>();
            map.put("wav", WAV);
            map.put("mp3", MP3);
            map.put("pcm", PCM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioFormatEnum(String value) {
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
        public static AudioFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AudioFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AudioFormatEnum(value);
            }
            return result;
        }

        public static AudioFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AudioFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioFormatEnum) {
                return this.value.equals(((AudioFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_format")

    @JacksonXmlProperty(localName = "audio_format")

    private AudioFormatEnum audioFormat;

    /**
     * 采样率：16000、8000 默认：8000
     */
    public static final class SampleRateEnum {

        /**
         * Enum _16000 for value: "16000"
         */
        public static final SampleRateEnum _16000 = new SampleRateEnum("16000");

        /**
         * Enum _8000 for value: "8000"
         */
        public static final SampleRateEnum _8000 = new SampleRateEnum("8000");

        private static final Map<String, SampleRateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SampleRateEnum> createStaticFields() {
            Map<String, SampleRateEnum> map = new HashMap<>();
            map.put("16000", _16000);
            map.put("8000", _8000);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SampleRateEnum(String value) {
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
        public static SampleRateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SampleRateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SampleRateEnum(value);
            }
            return result;
        }

        public static SampleRateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SampleRateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SampleRateEnum) {
                return this.value.equals(((SampleRateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_rate")

    @JacksonXmlProperty(localName = "sample_rate")

    private SampleRateEnum sampleRate;

    /**
     * 语音合成特征字符串，组成形式为{language}_{speaker}_{domain}，即“语种_人员标识_领域”。发音人分为普通发音人和精品发音人。  普通发音人每100字计一次调用，取值范围如下：   chinese_xiaoqi_common  小琪，标准女声发音人。  chinese_xiaoyu_common  小宇，标准男声发音人。  chinese_xiaoyan_common  小燕，温柔女声发音人。  chinese_xiaowang_common  小王，童声发音人。  chinese_xiaowen_common   小雯，柔美女声发音人。  chinese_xiaojing_common 小婧，俏皮女声发音人。  chinese_xiaosong_common  小宋，激昂男声发音人。  chinese_xiaoxia_common   小夏，热情女声发音人。  chinese_xiaodai_common   小呆，呆萌童声发音人。  chinese_xiaoqian_common  小倩，成熟女声发音人。  english_cameal_common    cameal，柔美女声英文发音人。   精品发音人每50字计一次调用，区域仅支持cn-north-4，cn-east-3，暂时不支持音高调节，取值范围如下：  chinese_huaxiaoxia_common  华小夏，热情女声发音人。  chinese_huaxiaogang_common  华晓刚，利落男声发音人。  chinese_huaxiaolu_common  华小璐，知性女声发音人。  chinese_huaxiaoshu_common  华小舒，舒缓女声发音人。  chinese_huaxiaowei_common  华小唯，嗲柔女声发音人。  chinese_huaxiaoliang_common  华小靓，嘹亮女声发音人。  chinese_huaxiaodong_common  华晓东，成熟男声发音人。  chinese_huaxiaoyan_common  华小颜，严厉女声发音人。  chinese_huaxiaoxuan_common  华小萱，台湾女声发音人。  chinese_huaxiaowen_common  华小雯，柔美女声发音人。  chinese_huaxiaoyang_common  华晓阳，朝气男声发音人。  chinese_huaxiaomin_common  华小闽，闽南女声发音人。  chinese_huanvxia_literature 华女侠，武侠女生发音人，只支持16k的采样率。  chinese_huaxiaoxuan_literature 华晓悬，悬疑男声发音人，只支持16k的采样率。  默认：chinese_xiaoyan_common
     */
    public static final class PropertyEnum {

        /**
         * Enum CHINESE_XIAOQI_COMMON for value: "chinese_xiaoqi_common"
         */
        public static final PropertyEnum CHINESE_XIAOQI_COMMON = new PropertyEnum("chinese_xiaoqi_common");

        /**
         * Enum CHINESE_XIAOYU_COMMON for value: "chinese_xiaoyu_common"
         */
        public static final PropertyEnum CHINESE_XIAOYU_COMMON = new PropertyEnum("chinese_xiaoyu_common");

        /**
         * Enum CHINESE_XIAOYAN_COMMON for value: "chinese_xiaoyan_common"
         */
        public static final PropertyEnum CHINESE_XIAOYAN_COMMON = new PropertyEnum("chinese_xiaoyan_common");

        /**
         * Enum CHINESE_XIAOXIA_COMMON for value: "chinese_xiaoxia_common"
         */
        public static final PropertyEnum CHINESE_XIAOXIA_COMMON = new PropertyEnum("chinese_xiaoxia_common");

        /**
         * Enum CHINESE_XIAODAI_COMMON for value: "chinese_xiaodai_common"
         */
        public static final PropertyEnum CHINESE_XIAODAI_COMMON = new PropertyEnum("chinese_xiaodai_common");

        /**
         * Enum CHINESE_XIAOQIAN_COMMON for value: "chinese_xiaoqian_common"
         */
        public static final PropertyEnum CHINESE_XIAOQIAN_COMMON = new PropertyEnum("chinese_xiaoqian_common");

        /**
         * Enum CHINESE_XIAOWANG_COMMON for value: "chinese_xiaowang_common"
         */
        public static final PropertyEnum CHINESE_XIAOWANG_COMMON = new PropertyEnum("chinese_xiaowang_common");

        /**
         * Enum CHINESE_XIAOWEN_COMMON for value: "chinese_xiaowen_common"
         */
        public static final PropertyEnum CHINESE_XIAOWEN_COMMON = new PropertyEnum("chinese_xiaowen_common");

        /**
         * Enum CHINESE_XIAOJING_COMMON for value: "chinese_xiaojing_common"
         */
        public static final PropertyEnum CHINESE_XIAOJING_COMMON = new PropertyEnum("chinese_xiaojing_common");

        /**
         * Enum CHINESE_XIAOSONG_COMMON for value: "chinese_xiaosong_common"
         */
        public static final PropertyEnum CHINESE_XIAOSONG_COMMON = new PropertyEnum("chinese_xiaosong_common");

        /**
         * Enum ENGLISH_CAMEAL_COMMON for value: "english_cameal_common"
         */
        public static final PropertyEnum ENGLISH_CAMEAL_COMMON = new PropertyEnum("english_cameal_common");

        /**
         * Enum CHINESE_HUAXIAOXIA_COMMON for value: "chinese_huaxiaoxia_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOXIA_COMMON = new PropertyEnum("chinese_huaxiaoxia_common");

        /**
         * Enum CHINESE_HUAXIAOGANG_COMMON for value: "chinese_huaxiaogang_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOGANG_COMMON = new PropertyEnum("chinese_huaxiaogang_common");

        /**
         * Enum CHINESE_HUAXIAOLU_COMMON for value: "chinese_huaxiaolu_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOLU_COMMON = new PropertyEnum("chinese_huaxiaolu_common");

        /**
         * Enum CHINESE_HUAXIAOSHU_COMMON for value: "chinese_huaxiaoshu_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOSHU_COMMON = new PropertyEnum("chinese_huaxiaoshu_common");

        /**
         * Enum CHINESE_HUAXIAOWEI_COMMON for value: "chinese_huaxiaowei_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOWEI_COMMON = new PropertyEnum("chinese_huaxiaowei_common");

        /**
         * Enum CHINESE_HUAXIAOLIANG_COMMON for value: "chinese_huaxiaoliang_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOLIANG_COMMON = new PropertyEnum("chinese_huaxiaoliang_common");

        /**
         * Enum CHINESE_HUAXIAODONG_COMMON for value: "chinese_huaxiaodong_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAODONG_COMMON = new PropertyEnum("chinese_huaxiaodong_common");

        /**
         * Enum CHINESE_HUAXIAOYAN_COMMON for value: "chinese_huaxiaoyan_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOYAN_COMMON = new PropertyEnum("chinese_huaxiaoyan_common");

        /**
         * Enum CHINESE_HUAXIAOXUAN_COMMON for value: "chinese_huaxiaoxuan_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOXUAN_COMMON = new PropertyEnum("chinese_huaxiaoxuan_common");

        /**
         * Enum CHINESE_HUAXIAOWEN_COMMON for value: "chinese_huaxiaowen_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOWEN_COMMON = new PropertyEnum("chinese_huaxiaowen_common");

        /**
         * Enum CHINESE_HUAXIAOYANG_COMMON for value: "chinese_huaxiaoyang_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOYANG_COMMON = new PropertyEnum("chinese_huaxiaoyang_common");

        /**
         * Enum CHINESE_HUAXIAOMIN_COMMON for value: "chinese_huaxiaomin_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOMIN_COMMON = new PropertyEnum("chinese_huaxiaomin_common");

        /**
         * Enum CHINESE_HUANVXIA_LITERATURE for value: "chinese_huanvxia_literature"
         */
        public static final PropertyEnum CHINESE_HUANVXIA_LITERATURE = new PropertyEnum("chinese_huanvxia_literature");

        /**
         * Enum CHINESE_HUAXIAOXUAN_LITERATURE for value: "chinese_huaxiaoxuan_literature"
         */
        public static final PropertyEnum CHINESE_HUAXIAOXUAN_LITERATURE =
            new PropertyEnum("chinese_huaxiaoxuan_literature");

        /**
         * Enum CHINESE_HUAXIAOMEI_COMMON for value: "chinese_huaxiaomei_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOMEI_COMMON = new PropertyEnum("chinese_huaxiaomei_common");

        /**
         * Enum CHINESE_HUAXIAOFEI_COMMON for value: "chinese_huaxiaofei_common"
         */
        public static final PropertyEnum CHINESE_HUAXIAOFEI_COMMON = new PropertyEnum("chinese_huaxiaofei_common");

        private static final Map<String, PropertyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PropertyEnum> createStaticFields() {
            Map<String, PropertyEnum> map = new HashMap<>();
            map.put("chinese_xiaoqi_common", CHINESE_XIAOQI_COMMON);
            map.put("chinese_xiaoyu_common", CHINESE_XIAOYU_COMMON);
            map.put("chinese_xiaoyan_common", CHINESE_XIAOYAN_COMMON);
            map.put("chinese_xiaoxia_common", CHINESE_XIAOXIA_COMMON);
            map.put("chinese_xiaodai_common", CHINESE_XIAODAI_COMMON);
            map.put("chinese_xiaoqian_common", CHINESE_XIAOQIAN_COMMON);
            map.put("chinese_xiaowang_common", CHINESE_XIAOWANG_COMMON);
            map.put("chinese_xiaowen_common", CHINESE_XIAOWEN_COMMON);
            map.put("chinese_xiaojing_common", CHINESE_XIAOJING_COMMON);
            map.put("chinese_xiaosong_common", CHINESE_XIAOSONG_COMMON);
            map.put("english_cameal_common", ENGLISH_CAMEAL_COMMON);
            map.put("chinese_huaxiaoxia_common", CHINESE_HUAXIAOXIA_COMMON);
            map.put("chinese_huaxiaogang_common", CHINESE_HUAXIAOGANG_COMMON);
            map.put("chinese_huaxiaolu_common", CHINESE_HUAXIAOLU_COMMON);
            map.put("chinese_huaxiaoshu_common", CHINESE_HUAXIAOSHU_COMMON);
            map.put("chinese_huaxiaowei_common", CHINESE_HUAXIAOWEI_COMMON);
            map.put("chinese_huaxiaoliang_common", CHINESE_HUAXIAOLIANG_COMMON);
            map.put("chinese_huaxiaodong_common", CHINESE_HUAXIAODONG_COMMON);
            map.put("chinese_huaxiaoyan_common", CHINESE_HUAXIAOYAN_COMMON);
            map.put("chinese_huaxiaoxuan_common", CHINESE_HUAXIAOXUAN_COMMON);
            map.put("chinese_huaxiaowen_common", CHINESE_HUAXIAOWEN_COMMON);
            map.put("chinese_huaxiaoyang_common", CHINESE_HUAXIAOYANG_COMMON);
            map.put("chinese_huaxiaomin_common", CHINESE_HUAXIAOMIN_COMMON);
            map.put("chinese_huanvxia_literature", CHINESE_HUANVXIA_LITERATURE);
            map.put("chinese_huaxiaoxuan_literature", CHINESE_HUAXIAOXUAN_LITERATURE);
            map.put("chinese_huaxiaomei_common", CHINESE_HUAXIAOMEI_COMMON);
            map.put("chinese_huaxiaofei_common", CHINESE_HUAXIAOFEI_COMMON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PropertyEnum(String value) {
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
        public static PropertyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PropertyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PropertyEnum(value);
            }
            return result;
        }

        public static PropertyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PropertyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PropertyEnum) {
                return this.value.equals(((PropertyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    @JacksonXmlProperty(localName = "property")

    private PropertyEnum property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    @JacksonXmlProperty(localName = "speed")

    private Integer speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pitch")

    @JacksonXmlProperty(localName = "pitch")

    private Integer pitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    @JacksonXmlProperty(localName = "volume")

    private Integer volume;

    public TtsConfig withAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * 语音格式头：wav、mp3、pcm。 默认：wav
     * @return audioFormat
     */
    public AudioFormatEnum getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
    }

    public TtsConfig withSampleRate(SampleRateEnum sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }

    /**
     * 采样率：16000、8000 默认：8000
     * @return sampleRate
     */
    public SampleRateEnum getSampleRate() {
        return sampleRate;
    }

    public void setSampleRate(SampleRateEnum sampleRate) {
        this.sampleRate = sampleRate;
    }

    public TtsConfig withProperty(PropertyEnum property) {
        this.property = property;
        return this;
    }

    /**
     * 语音合成特征字符串，组成形式为{language}_{speaker}_{domain}，即“语种_人员标识_领域”。发音人分为普通发音人和精品发音人。  普通发音人每100字计一次调用，取值范围如下：   chinese_xiaoqi_common  小琪，标准女声发音人。  chinese_xiaoyu_common  小宇，标准男声发音人。  chinese_xiaoyan_common  小燕，温柔女声发音人。  chinese_xiaowang_common  小王，童声发音人。  chinese_xiaowen_common   小雯，柔美女声发音人。  chinese_xiaojing_common 小婧，俏皮女声发音人。  chinese_xiaosong_common  小宋，激昂男声发音人。  chinese_xiaoxia_common   小夏，热情女声发音人。  chinese_xiaodai_common   小呆，呆萌童声发音人。  chinese_xiaoqian_common  小倩，成熟女声发音人。  english_cameal_common    cameal，柔美女声英文发音人。   精品发音人每50字计一次调用，区域仅支持cn-north-4，cn-east-3，暂时不支持音高调节，取值范围如下：  chinese_huaxiaoxia_common  华小夏，热情女声发音人。  chinese_huaxiaogang_common  华晓刚，利落男声发音人。  chinese_huaxiaolu_common  华小璐，知性女声发音人。  chinese_huaxiaoshu_common  华小舒，舒缓女声发音人。  chinese_huaxiaowei_common  华小唯，嗲柔女声发音人。  chinese_huaxiaoliang_common  华小靓，嘹亮女声发音人。  chinese_huaxiaodong_common  华晓东，成熟男声发音人。  chinese_huaxiaoyan_common  华小颜，严厉女声发音人。  chinese_huaxiaoxuan_common  华小萱，台湾女声发音人。  chinese_huaxiaowen_common  华小雯，柔美女声发音人。  chinese_huaxiaoyang_common  华晓阳，朝气男声发音人。  chinese_huaxiaomin_common  华小闽，闽南女声发音人。  chinese_huanvxia_literature 华女侠，武侠女生发音人，只支持16k的采样率。  chinese_huaxiaoxuan_literature 华晓悬，悬疑男声发音人，只支持16k的采样率。  默认：chinese_xiaoyan_common
     * @return property
     */
    public PropertyEnum getProperty() {
        return property;
    }

    public void setProperty(PropertyEnum property) {
        this.property = property;
    }

    public TtsConfig withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 语速。 取值范围：[-500,500]  默认值：0
     * minimum: -500
     * maximum: 500
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public TtsConfig withPitch(Integer pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * 音高。 取值范围： [-500,500]  默认值：0
     * minimum: -500
     * maximum: 500
     * @return pitch
     */
    public Integer getPitch() {
        return pitch;
    }

    public void setPitch(Integer pitch) {
        this.pitch = pitch;
    }

    public TtsConfig withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    /**
     * 音量。 取值范围：[0, 100]  默认值：50
     * minimum: 0
     * maximum: 100
     * @return volume
     */
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TtsConfig ttsConfig = (TtsConfig) o;
        return Objects.equals(this.audioFormat, ttsConfig.audioFormat)
            && Objects.equals(this.sampleRate, ttsConfig.sampleRate)
            && Objects.equals(this.property, ttsConfig.property) && Objects.equals(this.speed, ttsConfig.speed)
            && Objects.equals(this.pitch, ttsConfig.pitch) && Objects.equals(this.volume, ttsConfig.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioFormat, sampleRate, property, speed, pitch, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtsConfig {\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
        sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
