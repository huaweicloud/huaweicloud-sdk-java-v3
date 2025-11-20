package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**： 带宽信息 **约束限制**： 不涉及 
 */
public class EipSpecBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * **参数解释**： 带宽大小 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SharetypeEnum(value));
        }

        public static SharetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private SharetypeEnum sharetype;

    public EipSpecBandwidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**： 带宽大小 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
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
     * **参数解释**： 带宽大小 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return sharetype
     */
    public SharetypeEnum getSharetype() {
        return sharetype;
    }

    public void setSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EipSpecBandwidth that = (EipSpecBandwidth) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.sharetype, that.sharetype);
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
