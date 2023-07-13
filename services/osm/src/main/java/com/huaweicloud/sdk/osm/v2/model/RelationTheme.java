package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RelationTheme
 */
public class RelationTheme {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "theme_name")

    private String themeName;

    /**
     * - NON_PRIMARY: 主主题 - PRIMARY:  
     */
    public static final class RelationTypeEnum {

        /**
         * Enum NON_PRIMARY for value: "NON_PRIMARY"
         */
        public static final RelationTypeEnum NON_PRIMARY = new RelationTypeEnum("NON_PRIMARY");

        /**
         * Enum PRIMARY for value: "PRIMARY"
         */
        public static final RelationTypeEnum PRIMARY = new RelationTypeEnum("PRIMARY");

        private static final Map<String, RelationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RelationTypeEnum> createStaticFields() {
            Map<String, RelationTypeEnum> map = new HashMap<>();
            map.put("NON_PRIMARY", NON_PRIMARY);
            map.put("PRIMARY", PRIMARY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RelationTypeEnum(String value) {
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
        public static RelationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RelationTypeEnum(value));
        }

        public static RelationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RelationTypeEnum) {
                return this.value.equals(((RelationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private RelationTypeEnum relationType;

    public RelationTheme withThemeName(String themeName) {
        this.themeName = themeName;
        return this;
    }

    /**
     * 主题
     * @return themeName
     */
    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public RelationTheme withRelationType(RelationTypeEnum relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * - NON_PRIMARY: 主主题 - PRIMARY:  
     * @return relationType
     */
    public RelationTypeEnum getRelationType() {
        return relationType;
    }

    public void setRelationType(RelationTypeEnum relationType) {
        this.relationType = relationType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelationTheme that = (RelationTheme) obj;
        return Objects.equals(this.themeName, that.themeName) && Objects.equals(this.relationType, that.relationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(themeName, relationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationTheme {\n");
        sb.append("    themeName: ").append(toIndentedString(themeName)).append("\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
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
