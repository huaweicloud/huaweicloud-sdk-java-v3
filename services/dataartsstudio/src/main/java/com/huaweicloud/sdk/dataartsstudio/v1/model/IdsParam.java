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

    private List<Long> ids = null;

    /**
    * 删除物理表
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
            DelTypesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DelTypesEnum(value);
            }
            return result;
        }

        public static DelTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DelTypesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public IdsParam withIds(List<Long> ids) {
        this.ids = ids;
        return this;
    }

    public IdsParam addIdsItem(Long idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public IdsParam withIds(Consumer<List<Long>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * ID列表
     * @return ids
     */
    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public IdsParam withDelTypes(DelTypesEnum delTypes) {
        this.delTypes = delTypes;
        return this;
    }

    /**
     * 删除物理表
     * @return delTypes
     */
    public DelTypesEnum getDelTypes() {
        return delTypes;
    }

    public void setDelTypes(DelTypesEnum delTypes) {
        this.delTypes = delTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdsParam idsParam = (IdsParam) o;
        return Objects.equals(this.ids, idsParam.ids) && Objects.equals(this.delTypes, idsParam.delTypes);
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
