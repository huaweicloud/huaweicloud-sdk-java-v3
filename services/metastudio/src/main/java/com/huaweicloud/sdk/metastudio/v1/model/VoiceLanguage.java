package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 声音语言。 **约束限制**： 不涉及。 **取值范围**： * UNKNOW：未知 * CN：中文 * EN：英文 * GER：德语 * fr：法语 * Kr：韩语 * por：葡萄牙语 * JPN：日语 * Ita：意大利语 * ESP：西班牙语 * DBH：东北话 * GT：港台 * GXH：广西话 * HBH：湖北话 * SXH：陕西话 * SCH：四川话 * YY：粤语 * Russian: 俄罗斯语 * Filipino: 菲律宾语 * Dutch: 荷兰语 * Indonesian: 印尼语 * Vietnamese: 越南语 * Arabic: 阿拉伯语 * Turkish: 土耳其语 * Malay: 马来语 * Thai: 泰语 * Finnish: 芬兰语
 */
public class VoiceLanguage {

    /**
     * Enum UNKNOW for value: "UNKNOW"
     */
    public static final VoiceLanguage UNKNOW = new VoiceLanguage("UNKNOW");

    /**
     * Enum CN for value: "CN"
     */
    public static final VoiceLanguage CN = new VoiceLanguage("CN");

    /**
     * Enum EN for value: "EN"
     */
    public static final VoiceLanguage EN = new VoiceLanguage("EN");

    /**
     * Enum GER for value: "GER"
     */
    public static final VoiceLanguage GER = new VoiceLanguage("GER");

    /**
     * Enum FR for value: "fr"
     */
    public static final VoiceLanguage FR = new VoiceLanguage("fr");

    /**
     * Enum KR for value: "Kr"
     */
    public static final VoiceLanguage KR = new VoiceLanguage("Kr");

    /**
     * Enum POR for value: "por"
     */
    public static final VoiceLanguage POR = new VoiceLanguage("por");

    /**
     * Enum JPN for value: "JPN"
     */
    public static final VoiceLanguage JPN = new VoiceLanguage("JPN");

    /**
     * Enum ITA for value: "Ita"
     */
    public static final VoiceLanguage ITA = new VoiceLanguage("Ita");

    /**
     * Enum ESP for value: "ESP"
     */
    public static final VoiceLanguage ESP = new VoiceLanguage("ESP");

    /**
     * Enum DBH for value: "DBH"
     */
    public static final VoiceLanguage DBH = new VoiceLanguage("DBH");

    /**
     * Enum GT for value: "GT"
     */
    public static final VoiceLanguage GT = new VoiceLanguage("GT");

    /**
     * Enum GXH for value: "GXH"
     */
    public static final VoiceLanguage GXH = new VoiceLanguage("GXH");

    /**
     * Enum HBH for value: "HBH"
     */
    public static final VoiceLanguage HBH = new VoiceLanguage("HBH");

    /**
     * Enum SXH for value: "SXH"
     */
    public static final VoiceLanguage SXH = new VoiceLanguage("SXH");

    /**
     * Enum SCH for value: "SCH"
     */
    public static final VoiceLanguage SCH = new VoiceLanguage("SCH");

    /**
     * Enum YY for value: "YY"
     */
    public static final VoiceLanguage YY = new VoiceLanguage("YY");

    /**
     * Enum RUSSIAN for value: "Russian"
     */
    public static final VoiceLanguage RUSSIAN = new VoiceLanguage("Russian");

    /**
     * Enum FILIPINO for value: "Filipino"
     */
    public static final VoiceLanguage FILIPINO = new VoiceLanguage("Filipino");

    /**
     * Enum DUTCH for value: "Dutch"
     */
    public static final VoiceLanguage DUTCH = new VoiceLanguage("Dutch");

    /**
     * Enum INDONESIAN for value: "Indonesian"
     */
    public static final VoiceLanguage INDONESIAN = new VoiceLanguage("Indonesian");

    /**
     * Enum VIETNAMESE for value: "Vietnamese"
     */
    public static final VoiceLanguage VIETNAMESE = new VoiceLanguage("Vietnamese");

    /**
     * Enum ARABIC for value: "Arabic"
     */
    public static final VoiceLanguage ARABIC = new VoiceLanguage("Arabic");

    /**
     * Enum TURKISH for value: "Turkish"
     */
    public static final VoiceLanguage TURKISH = new VoiceLanguage("Turkish");

    /**
     * Enum MALAY for value: "Malay"
     */
    public static final VoiceLanguage MALAY = new VoiceLanguage("Malay");

    /**
     * Enum THAI for value: "Thai"
     */
    public static final VoiceLanguage THAI = new VoiceLanguage("Thai");

    /**
     * Enum FINNISH for value: "Finnish"
     */
    public static final VoiceLanguage FINNISH = new VoiceLanguage("Finnish");

    private static final Map<String, VoiceLanguage> STATIC_FIELDS = createStaticFields();

    private static Map<String, VoiceLanguage> createStaticFields() {
        Map<String, VoiceLanguage> map = new HashMap<>();
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

    VoiceLanguage(String value) {
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
    public static VoiceLanguage fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VoiceLanguage(value));
    }

    public static VoiceLanguage valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VoiceLanguage) {
            return this.value.equals(((VoiceLanguage) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
