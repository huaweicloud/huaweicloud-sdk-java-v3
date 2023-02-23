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
 * 分词post请求体
 */
public class SegmentRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="text")
    

    private String text;
    /**
     * 是否开启词性标注功能，1为开启，0为关闭，默认为关闭。
     */
    public static final class PosSwitchEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final PosSwitchEnum NUMBER_0 = new PosSwitchEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PosSwitchEnum NUMBER_1 = new PosSwitchEnum(1);
        

        private static final Map<Integer, PosSwitchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PosSwitchEnum> createStaticFields() {
            Map<Integer, PosSwitchEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PosSwitchEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PosSwitchEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            PosSwitchEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PosSwitchEnum(value);
            }
            return result;
        }

        public static PosSwitchEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            PosSwitchEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PosSwitchEnum) {
                return this.value.equals(((PosSwitchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pos_switch")
    

    private PosSwitchEnum posSwitch;
    /**
     * 支持的文本语言类型，目前支持中文（zh）和英文（en），默认为中文。
     */
    public static final class LangEnum {

        
        /**
         * Enum ZH for value: "zh"
         */
        public static final LangEnum ZH = new LangEnum("zh");
        
        /**
         * Enum EN for value: "en"
         */
        public static final LangEnum EN = new LangEnum("en");
        

        private static final Map<String, LangEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LangEnum> createStaticFields() {
            Map<String, LangEnum> map = new HashMap<>();
            map.put("zh", ZH);
            map.put("en", EN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LangEnum(String value) {
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
        public static LangEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            LangEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LangEnum(value);
            }
            return result;
        }

        public static LangEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LangEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LangEnum) {
                return this.value.equals(((LangEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lang")
    

    private LangEnum lang;
    /**
     * 支持的分词规范。 中文分词标准目前支持PKU（北大分词标准）、CTB（宾州中文树库标准），默认为PKU。 英文分词标准默认为Penn TreeBank（宾州树库标准），不需要传入该参数。
     */
    public static final class CriterionEnum {

        
        /**
         * Enum PKU for value: "PKU"
         */
        public static final CriterionEnum PKU = new CriterionEnum("PKU");
        
        /**
         * Enum CTB for value: "CTB"
         */
        public static final CriterionEnum CTB = new CriterionEnum("CTB");
        

        private static final Map<String, CriterionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CriterionEnum> createStaticFields() {
            Map<String, CriterionEnum> map = new HashMap<>();
            map.put("PKU", PKU);
            map.put("CTB", CTB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CriterionEnum(String value) {
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
        public static CriterionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CriterionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CriterionEnum(value);
            }
            return result;
        }

        public static CriterionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CriterionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CriterionEnum) {
                return this.value.equals(((CriterionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="criterion")
    

    private CriterionEnum criterion;

    public SegmentRequest withText(String text) {
        this.text = text;
        return this;
    }

    


    /**
     * 待分词文本，长度为1~512，文本编码为UTF-8。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    

    public SegmentRequest withPosSwitch(PosSwitchEnum posSwitch) {
        this.posSwitch = posSwitch;
        return this;
    }

    


    /**
     * 是否开启词性标注功能，1为开启，0为关闭，默认为关闭。
     * @return posSwitch
     */
    public PosSwitchEnum getPosSwitch() {
        return posSwitch;
    }

    public void setPosSwitch(PosSwitchEnum posSwitch) {
        this.posSwitch = posSwitch;
    }

    

    public SegmentRequest withLang(LangEnum lang) {
        this.lang = lang;
        return this;
    }

    


    /**
     * 支持的文本语言类型，目前支持中文（zh）和英文（en），默认为中文。
     * @return lang
     */
    public LangEnum getLang() {
        return lang;
    }

    public void setLang(LangEnum lang) {
        this.lang = lang;
    }

    

    public SegmentRequest withCriterion(CriterionEnum criterion) {
        this.criterion = criterion;
        return this;
    }

    


    /**
     * 支持的分词规范。 中文分词标准目前支持PKU（北大分词标准）、CTB（宾州中文树库标准），默认为PKU。 英文分词标准默认为Penn TreeBank（宾州树库标准），不需要传入该参数。
     * @return criterion
     */
    public CriterionEnum getCriterion() {
        return criterion;
    }

    public void setCriterion(CriterionEnum criterion) {
        this.criterion = criterion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SegmentRequest segmentRequest = (SegmentRequest) o;
        return Objects.equals(this.text, segmentRequest.text) &&
            Objects.equals(this.posSwitch, segmentRequest.posSwitch) &&
            Objects.equals(this.lang, segmentRequest.lang) &&
            Objects.equals(this.criterion, segmentRequest.criterion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(text, posSwitch, lang, criterion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SegmentRequest {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    posSwitch: ").append(toIndentedString(posSwitch)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
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

