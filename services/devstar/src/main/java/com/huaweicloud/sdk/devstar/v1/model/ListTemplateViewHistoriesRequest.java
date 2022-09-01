package com.huaweicloud.sdk.devstar.v1.model;

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
 * Request Object
 */
public class ListTemplateViewHistoriesRequest {

    /**
     * 语言类型，缺省值为“zh-cn”。  枚举值： - zh-cn：中文 - en-us：英文 
     */
    public static final class XLanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new XLanguageEnum(value);
            }
            return result;
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            XLanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    @JacksonXmlProperty(localName = "X-Language")

    private XLanguageEnum xLanguage;

    /**
     * 平台来源： - 0：查询CodeLabs中用户浏览过的模板。 - 1：查询DevStar中用户浏览过的模板。 
     */
    public static final class PlatformSourceEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final PlatformSourceEnum NUMBER_0 = new PlatformSourceEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PlatformSourceEnum NUMBER_1 = new PlatformSourceEnum(1);

        private static final Map<Integer, PlatformSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PlatformSourceEnum> createStaticFields() {
            Map<Integer, PlatformSourceEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PlatformSourceEnum(Integer value) {
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
        public static PlatformSourceEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            PlatformSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PlatformSourceEnum(value);
            }
            return result;
        }

        public static PlatformSourceEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            PlatformSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlatformSourceEnum) {
                return this.value.equals(((PlatformSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_source")

    @JacksonXmlProperty(localName = "platform_source")

    private PlatformSourceEnum platformSource;

    public ListTemplateViewHistoriesRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言类型，缺省值为“zh-cn”。  枚举值： - zh-cn：中文 - en-us：英文 
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListTemplateViewHistoriesRequest withPlatformSource(PlatformSourceEnum platformSource) {
        this.platformSource = platformSource;
        return this;
    }

    /**
     * 平台来源： - 0：查询CodeLabs中用户浏览过的模板。 - 1：查询DevStar中用户浏览过的模板。 
     * minimum: 0
     * maximum: 1
     * @return platformSource
     */
    public PlatformSourceEnum getPlatformSource() {
        return platformSource;
    }

    public void setPlatformSource(PlatformSourceEnum platformSource) {
        this.platformSource = platformSource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTemplateViewHistoriesRequest listTemplateViewHistoriesRequest = (ListTemplateViewHistoriesRequest) o;
        return Objects.equals(this.xLanguage, listTemplateViewHistoriesRequest.xLanguage)
            && Objects.equals(this.platformSource, listTemplateViewHistoriesRequest.platformSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, platformSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateViewHistoriesRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    platformSource: ").append(toIndentedString(platformSource)).append("\n");
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
