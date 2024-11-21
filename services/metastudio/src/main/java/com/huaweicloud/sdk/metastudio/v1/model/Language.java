package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 声音语言。 **约束限制**： 不涉及。 **取值范围**： * UNKNOW：未知 * CN：中文 * EN：英文 * GER：德语 * fr：法语 * Kr：韩语 * por：葡萄牙语 * JPN：日语 * Ita：意大利语 * ESP：西班牙语 * DBH：东北话 * GT：港台 * GXH：广西话 * HBH：湖北话 * SXH：陕西话 * SCH：四川话 * YY：粤语 * Russian: 俄罗斯语 * Filipino: 菲律宾语 * Dutch: 荷兰语 * Indonesian: 印尼语 * Vietnamese: 越南语 * Arabic: 阿拉伯语 * Turkish: 土耳其语 * Malay: 马来语 * Thai: 泰语 * Finnish: 芬兰语
 */
public class Language {

    /**
     * Enum UNKNOW for value: "UNKNOW"
     */
    public static final Language UNKNOW = new Language("UNKNOW");

    /**
     * Enum CN for value: "CN"
     */
    public static final Language CN = new Language("CN");

    /**
     * Enum EN for value: "EN"
     */
    public static final Language EN = new Language("EN");

    /**
     * Enum GER for value: "GER"
     */
    public static final Language GER = new Language("GER");

    /**
     * Enum FR for value: "fr"
     */
    public static final Language FR = new Language("fr");

    /**
     * Enum KR for value: "Kr"
     */
    public static final Language KR = new Language("Kr");

    /**
     * Enum POR for value: "por"
     */
    public static final Language POR = new Language("por");

    /**
     * Enum JPN for value: "JPN"
     */
    public static final Language JPN = new Language("JPN");

    /**
     * Enum ITA for value: "Ita"
     */
    public static final Language ITA = new Language("Ita");

    /**
     * Enum ESP for value: "ESP"
     */
    public static final Language ESP = new Language("ESP");

    /**
     * Enum DBH for value: "DBH"
     */
    public static final Language DBH = new Language("DBH");

    /**
     * Enum GT for value: "GT"
     */
    public static final Language GT = new Language("GT");

    /**
     * Enum GXH for value: "GXH"
     */
    public static final Language GXH = new Language("GXH");

    /**
     * Enum HBH for value: "HBH"
     */
    public static final Language HBH = new Language("HBH");

    /**
     * Enum SXH for value: "SXH"
     */
    public static final Language SXH = new Language("SXH");

    /**
     * Enum SCH for value: "SCH"
     */
    public static final Language SCH = new Language("SCH");

    /**
     * Enum YY for value: "YY"
     */
    public static final Language YY = new Language("YY");

    /**
     * Enum RUSSIAN for value: "Russian"
     */
    public static final Language RUSSIAN = new Language("Russian");

    /**
     * Enum FILIPINO for value: "Filipino"
     */
    public static final Language FILIPINO = new Language("Filipino");

    /**
     * Enum DUTCH for value: "Dutch"
     */
    public static final Language DUTCH = new Language("Dutch");

    /**
     * Enum INDONESIAN for value: "Indonesian"
     */
    public static final Language INDONESIAN = new Language("Indonesian");

    /**
     * Enum VIETNAMESE for value: "Vietnamese"
     */
    public static final Language VIETNAMESE = new Language("Vietnamese");

    /**
     * Enum ARABIC for value: "Arabic"
     */
    public static final Language ARABIC = new Language("Arabic");

    /**
     * Enum TURKISH for value: "Turkish"
     */
    public static final Language TURKISH = new Language("Turkish");

    /**
     * Enum MALAY for value: "Malay"
     */
    public static final Language MALAY = new Language("Malay");

    /**
     * Enum THAI for value: "Thai"
     */
    public static final Language THAI = new Language("Thai");

    /**
     * Enum FINNISH for value: "Finnish"
     */
    public static final Language FINNISH = new Language("Finnish");

    private static final Map<String, Language> STATIC_FIELDS = createStaticFields();

    private static Map<String, Language> createStaticFields() {
        Map<String, Language> map = new HashMap<>();
        map.put("UNKNOW", UNKNOW);
        map.put("CN", CN);
        map.put("EN", EN);
        map.put("GER", GER);
        map.put("fr", FR);
        map.put("Kr", KR);
        map.put("por", POR);
        map.put("JPN", JPN);
        map.put("Ita", ITA);
        map.put("ESP", ESP);
        map.put("DBH", DBH);
        map.put("GT", GT);
        map.put("GXH", GXH);
        map.put("HBH", HBH);
        map.put("SXH", SXH);
        map.put("SCH", SCH);
        map.put("YY", YY);
        map.put("Russian", RUSSIAN);
        map.put("Filipino", FILIPINO);
        map.put("Dutch", DUTCH);
        map.put("Indonesian", INDONESIAN);
        map.put("Vietnamese", VIETNAMESE);
        map.put("Arabic", ARABIC);
        map.put("Turkish", TURKISH);
        map.put("Malay", MALAY);
        map.put("Thai", THAI);
        map.put("Finnish", FINNISH);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Language(String value) {
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
    public static Language fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Language(value));
    }

    public static Language valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Language) {
            return this.value.equals(((Language) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
