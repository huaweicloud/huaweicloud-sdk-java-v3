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
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class TextTranslationReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text")
    
    
    private String text;
    /**
     * 翻译原语言，具体取值见支持的语言列表: 阿拉伯语 ar 德语 de 俄语 ru 法语 fr 韩语 ko 葡萄牙语 pt 日语 ja 泰语 th 土耳其语 tr 西班牙语 es 英语 en 越南语 vi 中文（简体） zh 中文（繁体） zh-tw 自动检测输入语种并翻译成目标语种，您需要指定目标语种。 auto
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
         * Enum ES for value: "es"
         */
        public static final FromEnum ES = new FromEnum("es");
        
        /**
         * Enum DE for value: "de"
         */
        public static final FromEnum DE = new FromEnum("de");
        
        /**
         * Enum AR for value: "ar"
         */
        public static final FromEnum AR = new FromEnum("ar");
        
        /**
         * Enum PT for value: "pt"
         */
        public static final FromEnum PT = new FromEnum("pt");
        
        /**
         * Enum TH for value: "th"
         */
        public static final FromEnum TH = new FromEnum("th");
        
        /**
         * Enum TR for value: "tr"
         */
        public static final FromEnum TR = new FromEnum("tr");
        
        /**
         * Enum KO for value: "ko"
         */
        public static final FromEnum KO = new FromEnum("ko");
        
        /**
         * Enum FR for value: "fr"
         */
        public static final FromEnum FR = new FromEnum("fr");
        
        /**
         * Enum VI for value: "vi"
         */
        public static final FromEnum VI = new FromEnum("vi");
        
        /**
         * Enum HI for value: "hi"
         */
        public static final FromEnum HI = new FromEnum("hi");
        
        /**
         * Enum KM for value: "km"
         */
        public static final FromEnum KM = new FromEnum("km");
        
        /**
         * Enum MY for value: "my"
         */
        public static final FromEnum MY = new FromEnum("my");
        
        /**
         * Enum TA for value: "ta"
         */
        public static final FromEnum TA = new FromEnum("ta");
        
        /**
         * Enum FA for value: "fa"
         */
        public static final FromEnum FA = new FromEnum("fa");
        
        /**
         * Enum UR for value: "ur"
         */
        public static final FromEnum UR = new FromEnum("ur");
        
        /**
         * Enum BN for value: "bn"
         */
        public static final FromEnum BN = new FromEnum("bn");
        
        /**
         * Enum MR for value: "mr"
         */
        public static final FromEnum MR = new FromEnum("mr");
        
        /**
         * Enum GU for value: "gu"
         */
        public static final FromEnum GU = new FromEnum("gu");
        
        /**
         * Enum PA for value: "pa"
         */
        public static final FromEnum PA = new FromEnum("pa");
        
        /**
         * Enum TE for value: "te"
         */
        public static final FromEnum TE = new FromEnum("te");
        
        /**
         * Enum HE for value: "he"
         */
        public static final FromEnum HE = new FromEnum("he");
        
        /**
         * Enum CS for value: "cs"
         */
        public static final FromEnum CS = new FromEnum("cs");
        
        /**
         * Enum SK for value: "sk"
         */
        public static final FromEnum SK = new FromEnum("sk");
        
        /**
         * Enum RO for value: "ro"
         */
        public static final FromEnum RO = new FromEnum("ro");
        
        /**
         * Enum SQ for value: "sq"
         */
        public static final FromEnum SQ = new FromEnum("sq");
        
        /**
         * Enum LV for value: "lv"
         */
        public static final FromEnum LV = new FromEnum("lv");
        
        /**
         * Enum ET for value: "et"
         */
        public static final FromEnum ET = new FromEnum("et");
        
        /**
         * Enum LT for value: "lt"
         */
        public static final FromEnum LT = new FromEnum("lt");
        
        /**
         * Enum HR for value: "hr"
         */
        public static final FromEnum HR = new FromEnum("hr");
        
        /**
         * Enum BS for value: "bs"
         */
        public static final FromEnum BS = new FromEnum("bs");
        
        /**
         * Enum KA for value: "ka"
         */
        public static final FromEnum KA = new FromEnum("ka");
        
        /**
         * Enum SL for value: "sl"
         */
        public static final FromEnum SL = new FromEnum("sl");
        
        /**
         * Enum CA for value: "ca"
         */
        public static final FromEnum CA = new FromEnum("ca");
        
        /**
         * Enum AF for value: "af"
         */
        public static final FromEnum AF = new FromEnum("af");
        
        /**
         * Enum MG for value: "mg"
         */
        public static final FromEnum MG = new FromEnum("mg");
        
        /**
         * Enum ID for value: "id"
         */
        public static final FromEnum ID = new FromEnum("id");
        
        /**
         * Enum FIL for value: "fil"
         */
        public static final FromEnum FIL = new FromEnum("fil");
        
        /**
         * Enum SW for value: "sw"
         */
        public static final FromEnum SW = new FromEnum("sw");
        
        /**
         * Enum HU for value: "hu"
         */
        public static final FromEnum HU = new FromEnum("hu");
        
        /**
         * Enum SR for value: "sr"
         */
        public static final FromEnum SR = new FromEnum("sr");
        
        /**
         * Enum MK for value: "mk"
         */
        public static final FromEnum MK = new FromEnum("mk");
        
        /**
         * Enum UK for value: "uk"
         */
        public static final FromEnum UK = new FromEnum("uk");
        
        /**
         * Enum BG for value: "bg"
         */
        public static final FromEnum BG = new FromEnum("bg");
        
        /**
         * Enum MT for value: "mt"
         */
        public static final FromEnum MT = new FromEnum("mt");
        
        /**
         * Enum EL for value: "el"
         */
        public static final FromEnum EL = new FromEnum("el");
        
        /**
         * Enum IS for value: "is"
         */
        public static final FromEnum IS = new FromEnum("is");
        
        /**
         * Enum GA for value: "ga"
         */
        public static final FromEnum GA = new FromEnum("ga");
        
        /**
         * Enum CY for value: "cy"
         */
        public static final FromEnum CY = new FromEnum("cy");
        
        /**
         * Enum HT for value: "ht"
         */
        public static final FromEnum HT = new FromEnum("ht");
        
        /**
         * Enum NO for value: "no"
         */
        public static final FromEnum NO = new FromEnum("no");
        
        /**
         * Enum SV for value: "sv"
         */
        public static final FromEnum SV = new FromEnum("sv");
        
        /**
         * Enum FI for value: "fi"
         */
        public static final FromEnum FI = new FromEnum("fi");
        
        /**
         * Enum DA for value: "da"
         */
        public static final FromEnum DA = new FromEnum("da");
        
        /**
         * Enum ZH_TW for value: "zh-tw"
         */
        public static final FromEnum ZH_TW = new FromEnum("zh-tw");
        
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
            map.put("es", ES);
            map.put("de", DE);
            map.put("ar", AR);
            map.put("pt", PT);
            map.put("th", TH);
            map.put("tr", TR);
            map.put("ko", KO);
            map.put("fr", FR);
            map.put("vi", VI);
            map.put("hi", HI);
            map.put("km", KM);
            map.put("my", MY);
            map.put("ta", TA);
            map.put("fa", FA);
            map.put("ur", UR);
            map.put("bn", BN);
            map.put("mr", MR);
            map.put("gu", GU);
            map.put("pa", PA);
            map.put("te", TE);
            map.put("he", HE);
            map.put("cs", CS);
            map.put("sk", SK);
            map.put("ro", RO);
            map.put("sq", SQ);
            map.put("lv", LV);
            map.put("et", ET);
            map.put("lt", LT);
            map.put("hr", HR);
            map.put("bs", BS);
            map.put("ka", KA);
            map.put("sl", SL);
            map.put("ca", CA);
            map.put("af", AF);
            map.put("mg", MG);
            map.put("id", ID);
            map.put("fil", FIL);
            map.put("sw", SW);
            map.put("hu", HU);
            map.put("sr", SR);
            map.put("mk", MK);
            map.put("uk", UK);
            map.put("bg", BG);
            map.put("mt", MT);
            map.put("el", EL);
            map.put("is", IS);
            map.put("ga", GA);
            map.put("cy", CY);
            map.put("ht", HT);
            map.put("no", NO);
            map.put("sv", SV);
            map.put("fi", FI);
            map.put("da", DA);
            map.put("zh-tw", ZH_TW);
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
    
    
    private FromEnum from;
    /**
     * 翻译目标语言，具体取值见支持的语言列表: 阿拉伯语 ar 德语 de 俄语 ru 法语 fr 韩语 ko 葡萄牙语 pt 日语 ja 泰语 th 土耳其语 tr 西班牙语 es 英语 en 越南语 vi 中文（简体） zh 中文（繁体） zh-tw
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
         * Enum ES for value: "es"
         */
        public static final ToEnum ES = new ToEnum("es");
        
        /**
         * Enum DE for value: "de"
         */
        public static final ToEnum DE = new ToEnum("de");
        
        /**
         * Enum AR for value: "ar"
         */
        public static final ToEnum AR = new ToEnum("ar");
        
        /**
         * Enum PT for value: "pt"
         */
        public static final ToEnum PT = new ToEnum("pt");
        
        /**
         * Enum TH for value: "th"
         */
        public static final ToEnum TH = new ToEnum("th");
        
        /**
         * Enum TR for value: "tr"
         */
        public static final ToEnum TR = new ToEnum("tr");
        
        /**
         * Enum KO for value: "ko"
         */
        public static final ToEnum KO = new ToEnum("ko");
        
        /**
         * Enum FR for value: "fr"
         */
        public static final ToEnum FR = new ToEnum("fr");
        
        /**
         * Enum VI for value: "vi"
         */
        public static final ToEnum VI = new ToEnum("vi");
        
        /**
         * Enum HI for value: "hi"
         */
        public static final ToEnum HI = new ToEnum("hi");
        
        /**
         * Enum KM for value: "km"
         */
        public static final ToEnum KM = new ToEnum("km");
        
        /**
         * Enum MY for value: "my"
         */
        public static final ToEnum MY = new ToEnum("my");
        
        /**
         * Enum TA for value: "ta"
         */
        public static final ToEnum TA = new ToEnum("ta");
        
        /**
         * Enum FA for value: "fa"
         */
        public static final ToEnum FA = new ToEnum("fa");
        
        /**
         * Enum UR for value: "ur"
         */
        public static final ToEnum UR = new ToEnum("ur");
        
        /**
         * Enum BN for value: "bn"
         */
        public static final ToEnum BN = new ToEnum("bn");
        
        /**
         * Enum MR for value: "mr"
         */
        public static final ToEnum MR = new ToEnum("mr");
        
        /**
         * Enum GU for value: "gu"
         */
        public static final ToEnum GU = new ToEnum("gu");
        
        /**
         * Enum PA for value: "pa"
         */
        public static final ToEnum PA = new ToEnum("pa");
        
        /**
         * Enum TE for value: "te"
         */
        public static final ToEnum TE = new ToEnum("te");
        
        /**
         * Enum HE for value: "he"
         */
        public static final ToEnum HE = new ToEnum("he");
        
        /**
         * Enum CS for value: "cs"
         */
        public static final ToEnum CS = new ToEnum("cs");
        
        /**
         * Enum SK for value: "sk"
         */
        public static final ToEnum SK = new ToEnum("sk");
        
        /**
         * Enum RO for value: "ro"
         */
        public static final ToEnum RO = new ToEnum("ro");
        
        /**
         * Enum SQ for value: "sq"
         */
        public static final ToEnum SQ = new ToEnum("sq");
        
        /**
         * Enum LV for value: "lv"
         */
        public static final ToEnum LV = new ToEnum("lv");
        
        /**
         * Enum ET for value: "et"
         */
        public static final ToEnum ET = new ToEnum("et");
        
        /**
         * Enum LT for value: "lt"
         */
        public static final ToEnum LT = new ToEnum("lt");
        
        /**
         * Enum HR for value: "hr"
         */
        public static final ToEnum HR = new ToEnum("hr");
        
        /**
         * Enum BS for value: "bs"
         */
        public static final ToEnum BS = new ToEnum("bs");
        
        /**
         * Enum KA for value: "ka"
         */
        public static final ToEnum KA = new ToEnum("ka");
        
        /**
         * Enum SL for value: "sl"
         */
        public static final ToEnum SL = new ToEnum("sl");
        
        /**
         * Enum CA for value: "ca"
         */
        public static final ToEnum CA = new ToEnum("ca");
        
        /**
         * Enum AF for value: "af"
         */
        public static final ToEnum AF = new ToEnum("af");
        
        /**
         * Enum MG for value: "mg"
         */
        public static final ToEnum MG = new ToEnum("mg");
        
        /**
         * Enum ID for value: "id"
         */
        public static final ToEnum ID = new ToEnum("id");
        
        /**
         * Enum FIL for value: "fil"
         */
        public static final ToEnum FIL = new ToEnum("fil");
        
        /**
         * Enum SW for value: "sw"
         */
        public static final ToEnum SW = new ToEnum("sw");
        
        /**
         * Enum HU for value: "hu"
         */
        public static final ToEnum HU = new ToEnum("hu");
        
        /**
         * Enum SR for value: "sr"
         */
        public static final ToEnum SR = new ToEnum("sr");
        
        /**
         * Enum MK for value: "mk"
         */
        public static final ToEnum MK = new ToEnum("mk");
        
        /**
         * Enum UK for value: "uk"
         */
        public static final ToEnum UK = new ToEnum("uk");
        
        /**
         * Enum BG for value: "bg"
         */
        public static final ToEnum BG = new ToEnum("bg");
        
        /**
         * Enum MT for value: "mt"
         */
        public static final ToEnum MT = new ToEnum("mt");
        
        /**
         * Enum EL for value: "el"
         */
        public static final ToEnum EL = new ToEnum("el");
        
        /**
         * Enum IS for value: "is"
         */
        public static final ToEnum IS = new ToEnum("is");
        
        /**
         * Enum GA for value: "ga"
         */
        public static final ToEnum GA = new ToEnum("ga");
        
        /**
         * Enum CY for value: "cy"
         */
        public static final ToEnum CY = new ToEnum("cy");
        
        /**
         * Enum HT for value: "ht"
         */
        public static final ToEnum HT = new ToEnum("ht");
        
        /**
         * Enum NO for value: "no"
         */
        public static final ToEnum NO = new ToEnum("no");
        
        /**
         * Enum SV for value: "sv"
         */
        public static final ToEnum SV = new ToEnum("sv");
        
        /**
         * Enum FI for value: "fi"
         */
        public static final ToEnum FI = new ToEnum("fi");
        
        /**
         * Enum DA for value: "da"
         */
        public static final ToEnum DA = new ToEnum("da");
        
        /**
         * Enum ZH_TW for value: "zh-tw"
         */
        public static final ToEnum ZH_TW = new ToEnum("zh-tw");
        

        private static final Map<String, ToEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ToEnum> createStaticFields() {
            Map<String, ToEnum> map = new HashMap<>();
            map.put("zh", ZH);
            map.put("en", EN);
            map.put("ja", JA);
            map.put("ru", RU);
            map.put("es", ES);
            map.put("de", DE);
            map.put("ar", AR);
            map.put("pt", PT);
            map.put("th", TH);
            map.put("tr", TR);
            map.put("ko", KO);
            map.put("fr", FR);
            map.put("vi", VI);
            map.put("hi", HI);
            map.put("km", KM);
            map.put("my", MY);
            map.put("ta", TA);
            map.put("fa", FA);
            map.put("ur", UR);
            map.put("bn", BN);
            map.put("mr", MR);
            map.put("gu", GU);
            map.put("pa", PA);
            map.put("te", TE);
            map.put("he", HE);
            map.put("cs", CS);
            map.put("sk", SK);
            map.put("ro", RO);
            map.put("sq", SQ);
            map.put("lv", LV);
            map.put("et", ET);
            map.put("lt", LT);
            map.put("hr", HR);
            map.put("bs", BS);
            map.put("ka", KA);
            map.put("sl", SL);
            map.put("ca", CA);
            map.put("af", AF);
            map.put("mg", MG);
            map.put("id", ID);
            map.put("fil", FIL);
            map.put("sw", SW);
            map.put("hu", HU);
            map.put("sr", SR);
            map.put("mk", MK);
            map.put("uk", UK);
            map.put("bg", BG);
            map.put("mt", MT);
            map.put("el", EL);
            map.put("is", IS);
            map.put("ga", GA);
            map.put("cy", CY);
            map.put("ht", HT);
            map.put("no", NO);
            map.put("sv", SV);
            map.put("fi", FI);
            map.put("da", DA);
            map.put("zh-tw", ZH_TW);
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
    
    
    private SceneEnum scene;

    public TextTranslationReq withText(String text) {
        this.text = text;
        return this;
    }

    


    /**
     * 待翻译文本，仅支持utf-8编码，长度不超过2000字符。
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
     * 翻译原语言，具体取值见支持的语言列表: 阿拉伯语 ar 德语 de 俄语 ru 法语 fr 韩语 ko 葡萄牙语 pt 日语 ja 泰语 th 土耳其语 tr 西班牙语 es 英语 en 越南语 vi 中文（简体） zh 中文（繁体） zh-tw 自动检测输入语种并翻译成目标语种，您需要指定目标语种。 auto
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
     * 翻译目标语言，具体取值见支持的语言列表: 阿拉伯语 ar 德语 de 俄语 ru 法语 fr 韩语 ko 葡萄牙语 pt 日语 ja 泰语 th 土耳其语 tr 西班牙语 es 英语 en 越南语 vi 中文（简体） zh 中文（繁体） zh-tw
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

