package com.huaweicloud.sdk.nlp.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class TextTranslationReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text")
    
    @JacksonXmlProperty(localName = "text")
    
    private String text;
    /**
     * 翻译原语言，具体取值见支持的语言列表: zh    中文 en    英文 ru    俄语 ja    日文 de    德文 fr    法文 es    西班牙文 ko    韩语 auto  自动检测输入语种并翻译成目标语种，您需要指定目标语种。
     */
    public static final class FromEnum {

        
        /**
         * Enum ZH for value: "zh"
         */
        public static final FromEnum ZH = new FromEnum("zh");
        
        /**
         * Enum EN for value: "en"
         */
        public static final FromEnum EN = new FromEnum("en");
        
        /**
         * Enum JA for value: "ja"
         */
        public static final FromEnum JA = new FromEnum("ja");
        
        /**
         * Enum RU for value: "ru"
         */
        public static final FromEnum RU = new FromEnum("ru");
        
        /**
         * Enum KO for value: "ko"
         */
        public static final FromEnum KO = new FromEnum("ko");
        
        /**
         * Enum FR for value: "fr"
         */
        public static final FromEnum FR = new FromEnum("fr");
        
        /**
         * Enum ES for value: "es"
         */
        public static final FromEnum ES = new FromEnum("es");
        
        /**
         * Enum DE for value: "de"
         */
        public static final FromEnum DE = new FromEnum("de");
        
        /**
         * Enum AUTO for value: "auto"
         */
        public static final FromEnum AUTO = new FromEnum("auto");
        

        private static final Map<String, FromEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FromEnum> createStaticFields() {
            Map<String, FromEnum> map = new HashMap<>();
            map.put("zh", ZH);
            map.put("en", EN);
            map.put("ja", JA);
            map.put("ru", RU);
            map.put("ko", KO);
            map.put("fr", FR);
            map.put("es", ES);
            map.put("de", DE);
            map.put("auto", AUTO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FromEnum(String value) {
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
        public static FromEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FromEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FromEnum(value);
            }
            return result;
        }

        public static FromEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FromEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FromEnum) {
                return this.value.equals(((FromEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="from")
    
    @JacksonXmlProperty(localName = "from")
    
    private FromEnum from;
    /**
     * 翻译原语言，具体取值见支持的语言列表: zh    中文 en    英文 ru    俄语 ja    日文 de    德文 fr    法文 es    西班牙文 ko    韩语
     */
    public static final class ToEnum {

        
        /**
         * Enum ZH for value: "zh"
         */
        public static final ToEnum ZH = new ToEnum("zh");
        
        /**
         * Enum EN for value: "en"
         */
        public static final ToEnum EN = new ToEnum("en");
        
        /**
         * Enum JA for value: "ja"
         */
        public static final ToEnum JA = new ToEnum("ja");
        
        /**
         * Enum RU for value: "ru"
         */
        public static final ToEnum RU = new ToEnum("ru");
        
        /**
         * Enum KO for value: "ko"
         */
        public static final ToEnum KO = new ToEnum("ko");
        
        /**
         * Enum FR for value: "fr"
         */
        public static final ToEnum FR = new ToEnum("fr");
        
        /**
         * Enum ES for value: "es"
         */
        public static final ToEnum ES = new ToEnum("es");
        
        /**
         * Enum DE for value: "de"
         */
        public static final ToEnum DE = new ToEnum("de");
        

        private static final Map<String, ToEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ToEnum> createStaticFields() {
            Map<String, ToEnum> map = new HashMap<>();
            map.put("zh", ZH);
            map.put("en", EN);
            map.put("ja", JA);
            map.put("ru", RU);
            map.put("ko", KO);
            map.put("fr", FR);
            map.put("es", ES);
            map.put("de", DE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ToEnum(String value) {
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
        public static ToEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ToEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ToEnum(value);
            }
            return result;
        }

        public static ToEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ToEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ToEnum) {
                return this.value.equals(((ToEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to")
    
    @JacksonXmlProperty(localName = "to")
    
    private ToEnum to;
    /**
     * 默认为“common”，当前只有通用场景
     */
    public static final class SceneEnum {

        
        /**
         * Enum COMMON for value: "common"
         */
        public static final SceneEnum COMMON = new SceneEnum("common");
        

        private static final Map<String, SceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SceneEnum> createStaticFields() {
            Map<String, SceneEnum> map = new HashMap<>();
            map.put("common", COMMON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SceneEnum(String value) {
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
        public static SceneEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SceneEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SceneEnum(value);
            }
            return result;
        }

        public static SceneEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SceneEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SceneEnum) {
                return this.value.equals(((SceneEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scene")
    
    @JacksonXmlProperty(localName = "scene")
    
    private SceneEnum scene;

    public TextTranslationReq withText(String text) {
        this.text = text;
        return this;
    }

    


    /**
     * 待翻译文本，仅支持utf-8编码，长度不超过5000字符。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    

    public TextTranslationReq withFrom(FromEnum from) {
        this.from = from;
        return this;
    }

    


    /**
     * 翻译原语言，具体取值见支持的语言列表: zh    中文 en    英文 ru    俄语 ja    日文 de    德文 fr    法文 es    西班牙文 ko    韩语 auto  自动检测输入语种并翻译成目标语种，您需要指定目标语种。
     * @return from
     */
    public FromEnum getFrom() {
        return from;
    }

    public void setFrom(FromEnum from) {
        this.from = from;
    }

    

    public TextTranslationReq withTo(ToEnum to) {
        this.to = to;
        return this;
    }

    


    /**
     * 翻译原语言，具体取值见支持的语言列表: zh    中文 en    英文 ru    俄语 ja    日文 de    德文 fr    法文 es    西班牙文 ko    韩语
     * @return to
     */
    public ToEnum getTo() {
        return to;
    }

    public void setTo(ToEnum to) {
        this.to = to;
    }

    

    public TextTranslationReq withScene(SceneEnum scene) {
        this.scene = scene;
        return this;
    }

    


    /**
     * 默认为“common”，当前只有通用场景
     * @return scene
     */
    public SceneEnum getScene() {
        return scene;
    }

    public void setScene(SceneEnum scene) {
        this.scene = scene;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextTranslationReq textTranslationReq = (TextTranslationReq) o;
        return Objects.equals(this.text, textTranslationReq.text) &&
            Objects.equals(this.from, textTranslationReq.from) &&
            Objects.equals(this.to, textTranslationReq.to) &&
            Objects.equals(this.scene, textTranslationReq.scene);
    }
    @Override
    public int hashCode() {
        return Objects.hash(text, from, to, scene);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextTranslationReq {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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

