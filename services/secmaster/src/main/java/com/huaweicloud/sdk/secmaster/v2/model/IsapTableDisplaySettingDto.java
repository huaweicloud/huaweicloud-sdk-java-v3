package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 表展示设置数据传输对象
 */
public class IsapTableDisplaySettingDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<IsapTableColumnDisplaySettingDto> columns = null;

    /**
     * **参数解释**: 表展示设置 - TABLE 表展示 - RAW 原始数据展示  **约束限制** 不涉及 **取值范围**: - TABLE - RAW  **默认值** 不涉及
     */
    public static final class FormatEnum {

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final FormatEnum TABLE = new FormatEnum("TABLE");

        /**
         * Enum RAW for value: "RAW"
         */
        public static final FormatEnum RAW = new FormatEnum("RAW");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("TABLE", TABLE);
            map.put("RAW", RAW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FormatEnum(value));
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FormatEnum format;

    public IsapTableDisplaySettingDto withColumns(List<IsapTableColumnDisplaySettingDto> columns) {
        this.columns = columns;
        return this;
    }

    public IsapTableDisplaySettingDto addColumnsItem(IsapTableColumnDisplaySettingDto columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public IsapTableDisplaySettingDto withColumns(Consumer<List<IsapTableColumnDisplaySettingDto>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 表格列展示列表
     * @return columns
     */
    public List<IsapTableColumnDisplaySettingDto> getColumns() {
        return columns;
    }

    public void setColumns(List<IsapTableColumnDisplaySettingDto> columns) {
        this.columns = columns;
    }

    public IsapTableDisplaySettingDto withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * **参数解释**: 表展示设置 - TABLE 表展示 - RAW 原始数据展示  **约束限制** 不涉及 **取值范围**: - TABLE - RAW  **默认值** 不涉及
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IsapTableDisplaySettingDto that = (IsapTableDisplaySettingDto) obj;
        return Objects.equals(this.columns, that.columns) && Objects.equals(this.format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns, format);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsapTableDisplaySettingDto {\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
