package com.huaweicloud.sdk.cce.v3.model;

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
 * EipSpecBandwidth
 */
public class EipSpecBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    /**
     * 带宽类型
     */
    public static final class SharetypeEnum {

        /**
         * Enum PER for value: "PER"
         */
        public static final SharetypeEnum PER = new SharetypeEnum("PER");

        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final SharetypeEnum WHOLE = new SharetypeEnum("WHOLE");

        private static final Map<String, SharetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SharetypeEnum> createStaticFields() {
            Map<String, SharetypeEnum> map = new HashMap<>();
            map.put("PER", PER);
            map.put("WHOLE", WHOLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SharetypeEnum(String value) {
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
        public static SharetypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SharetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SharetypeEnum(value);
            }
            return result;
        }

        public static SharetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SharetypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SharetypeEnum) {
                return this.value.equals(((SharetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharetype")

    @JacksonXmlProperty(localName = "sharetype")

    private SharetypeEnum sharetype;

    public EipSpecBandwidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 带宽大小
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public EipSpecBandwidth withSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
        return this;
    }

    /**
     * 带宽类型
     * @return sharetype
     */
    public SharetypeEnum getSharetype() {
        return sharetype;
    }

    public void setSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EipSpecBandwidth eipSpecBandwidth = (EipSpecBandwidth) o;
        return Objects.equals(this.size, eipSpecBandwidth.size)
            && Objects.equals(this.sharetype, eipSpecBandwidth.sharetype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, sharetype);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipSpecBandwidth {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sharetype: ").append(toIndentedString(sharetype)).append("\n");
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
