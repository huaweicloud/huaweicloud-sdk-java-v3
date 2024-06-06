package com.huaweicloud.sdk.imagesearch.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 搜索的可选参数，其中每个参数仅对部分服务类型生效，具体可参见服务类型说明。
 */
public class SearchOptionalParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "do_det")

    private Boolean doDet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "box")

    private String box;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "do_cls")

    private Boolean doCls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private Integer category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collapse_key")

    private String collapseKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_scan_num")

    private Integer maxScanNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nprobe")

    private Integer nprobe;

    /**
     * 文本字符串的语言类型枚举值。
     */
    public static final class TextLangEnum {

        /**
         * Enum AR for value: "ar"
         */
        public static final TextLangEnum AR = new TextLangEnum("ar");

        /**
         * Enum DE for value: "de"
         */
        public static final TextLangEnum DE = new TextLangEnum("de");

        /**
         * Enum RU for value: "ru"
         */
        public static final TextLangEnum RU = new TextLangEnum("ru");

        /**
         * Enum FR for value: "fr"
         */
        public static final TextLangEnum FR = new TextLangEnum("fr");

        /**
         * Enum KO for value: "ko"
         */
        public static final TextLangEnum KO = new TextLangEnum("ko");

        /**
         * Enum PT for value: "pt"
         */
        public static final TextLangEnum PT = new TextLangEnum("pt");

        /**
         * Enum JA for value: "ja"
         */
        public static final TextLangEnum JA = new TextLangEnum("ja");

        /**
         * Enum TH for value: "th"
         */
        public static final TextLangEnum TH = new TextLangEnum("th");

        /**
         * Enum TR for value: "tr"
         */
        public static final TextLangEnum TR = new TextLangEnum("tr");

        /**
         * Enum ES for value: "es"
         */
        public static final TextLangEnum ES = new TextLangEnum("es");

        /**
         * Enum EN for value: "en"
         */
        public static final TextLangEnum EN = new TextLangEnum("en");

        /**
         * Enum VI for value: "vi"
         */
        public static final TextLangEnum VI = new TextLangEnum("vi");

        /**
         * Enum ZH for value: "zh"
         */
        public static final TextLangEnum ZH = new TextLangEnum("zh");

        /**
         * Enum ZHTW for value: "zhTW"
         */
        public static final TextLangEnum ZHTW = new TextLangEnum("zhTW");

        private static final Map<String, TextLangEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TextLangEnum> createStaticFields() {
            Map<String, TextLangEnum> map = new HashMap<>();
            map.put("ar", AR);
            map.put("de", DE);
            map.put("ru", RU);
            map.put("fr", FR);
            map.put("ko", KO);
            map.put("pt", PT);
            map.put("ja", JA);
            map.put("th", TH);
            map.put("tr", TR);
            map.put("es", ES);
            map.put("en", EN);
            map.put("vi", VI);
            map.put("zh", ZH);
            map.put("zhTW", ZHTW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TextLangEnum(String value) {
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
        public static TextLangEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TextLangEnum(value));
        }

        public static TextLangEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TextLangEnum) {
                return this.value.equals(((TextLangEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_lang")

    private TextLangEnum textLang;

    public SearchOptionalParam withDoDet(Boolean doDet) {
        this.doDet = doDet;
        return this;
    }

    /**
     * 是否进行目标检测，默认为true。
     * @return doDet
     */
    public Boolean getDoDet() {
        return doDet;
    }

    public void setDoDet(Boolean doDet) {
        this.doDet = doDet;
    }

    public SearchOptionalParam withBox(String box) {
        this.box = box;
        return this;
    }

    /**
     * 目标矩形框坐标，如给定则不进行目标检测，直接使用该box作为目标。格式为“x1,y1,x2,y2”（无空格），x1/y1为目标左上角坐标，x2/y2为目标右下角坐标，具体要求如下： - 0 <= x1 < x2 <= width，默认要求x2-x1 >= 15，具体可参考服务类型说明。 - 0 <= y1 < y2 <= height，默认要求y2-y1 >= 15，具体可参考服务类型说明。
     * @return box
     */
    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public SearchOptionalParam withDoCls(Boolean doCls) {
        this.doCls = doCls;
        return this;
    }

    /**
     * 是否进行对象分类，默认为true。
     * @return doCls
     */
    public Boolean getDoCls() {
        return doCls;
    }

    public void setDoCls(Boolean doCls) {
        this.doCls = doCls;
    }

    public SearchOptionalParam withCategory(Integer category) {
        this.category = category;
        return this;
    }

    /**
     * 对象类目，如给定则不进行对象分类，直接使用该category作为类目。具体类目信息可参见对应的服务类型说明。
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public SearchOptionalParam withCollapseKey(String collapseKey) {
        this.collapseKey = collapseKey;
        return this;
    }

    /**
     * 去重标签名，必须为服务实例custom_tags中已存在的key。 - 如给定则会对该key下相同value的数据进行去重，仅保留得分最高的数据。 - 针对没有设置该标签的数据，会直接过滤。
     * @return collapseKey
     */
    public String getCollapseKey() {
        return collapseKey;
    }

    public void setCollapseKey(String collapseKey) {
        this.collapseKey = collapseKey;
    }

    public SearchOptionalParam withMaxScanNum(Integer maxScanNum) {
        this.maxScanNum = maxScanNum;
        return this;
    }

    /**
     * 扫描节点上限。值越大精度越高，查询速度变慢。默认值为10000。
     * minimum: 1000
     * maximum: 100000
     * @return maxScanNum
     */
    public Integer getMaxScanNum() {
        return maxScanNum;
    }

    public void setMaxScanNum(Integer maxScanNum) {
        this.maxScanNum = maxScanNum;
    }

    public SearchOptionalParam withNprobe(Integer nprobe) {
        this.nprobe = nprobe;
        return this;
    }

    /**
     * 查询考察中心点的数目。值越大精度越高，查询速度变慢。默认值为100。
     * minimum: 1
     * maximum: 100000
     * @return nprobe
     */
    public Integer getNprobe() {
        return nprobe;
    }

    public void setNprobe(Integer nprobe) {
        this.nprobe = nprobe;
    }

    public SearchOptionalParam withTextLang(TextLangEnum textLang) {
        this.textLang = textLang;
        return this;
    }

    /**
     * 文本字符串的语言类型枚举值。
     * @return textLang
     */
    public TextLangEnum getTextLang() {
        return textLang;
    }

    public void setTextLang(TextLangEnum textLang) {
        this.textLang = textLang;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchOptionalParam that = (SearchOptionalParam) obj;
        return Objects.equals(this.doDet, that.doDet) && Objects.equals(this.box, that.box)
            && Objects.equals(this.doCls, that.doCls) && Objects.equals(this.category, that.category)
            && Objects.equals(this.collapseKey, that.collapseKey) && Objects.equals(this.maxScanNum, that.maxScanNum)
            && Objects.equals(this.nprobe, that.nprobe) && Objects.equals(this.textLang, that.textLang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doDet, box, doCls, category, collapseKey, maxScanNum, nprobe, textLang);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchOptionalParam {\n");
        sb.append("    doDet: ").append(toIndentedString(doDet)).append("\n");
        sb.append("    box: ").append(toIndentedString(box)).append("\n");
        sb.append("    doCls: ").append(toIndentedString(doCls)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    collapseKey: ").append(toIndentedString(collapseKey)).append("\n");
        sb.append("    maxScanNum: ").append(toIndentedString(maxScanNum)).append("\n");
        sb.append("    nprobe: ").append(toIndentedString(nprobe)).append("\n");
        sb.append("    textLang: ").append(toIndentedString(textLang)).append("\n");
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
