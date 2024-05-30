package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * IdsParam
 */
public class IdsParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    /**
     * 删除物理表。 枚举值：   - PHYSICAL_TABLE: 关系建模 
     */
    public static final class DelTypesEnum {

        /**
         * Enum PHYSICAL_TABLE for value: "PHYSICAL_TABLE"
         */
        public static final DelTypesEnum PHYSICAL_TABLE = new DelTypesEnum("PHYSICAL_TABLE");

        private static final Map<String, DelTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DelTypesEnum> createStaticFields() {
            Map<String, DelTypesEnum> map = new HashMap<>();
            map.put("PHYSICAL_TABLE", PHYSICAL_TABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DelTypesEnum(String value) {
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
        public static DelTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DelTypesEnum(value));
        }

        public static DelTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DelTypesEnum) {
                return this.value.equals(((DelTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "del_types")

    private DelTypesEnum delTypes;

    public IdsParam withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public IdsParam addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public IdsParam withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * ID列表，填写String类型替代Long类型。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public IdsParam withDelTypes(DelTypesEnum delTypes) {
        this.delTypes = delTypes;
        return this;
    }

    /**
     * 删除物理表。 枚举值：   - PHYSICAL_TABLE: 关系建模 
     * @return delTypes
     */
    public DelTypesEnum getDelTypes() {
        return delTypes;
    }

    public void setDelTypes(DelTypesEnum delTypes) {
        this.delTypes = delTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdsParam that = (IdsParam) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.delTypes, that.delTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, delTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdsParam {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    delTypes: ").append(toIndentedString(delTypes)).append("\n");
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
