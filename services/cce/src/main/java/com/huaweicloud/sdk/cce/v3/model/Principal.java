package com.huaweicloud.sdk.cce.v3.model;

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
 * Principal
 */
public class Principal {

    /**
     * **参数解释：** 授权对象的类型。 **约束限制：** 不涉及 **取值范围：** - user：用户 - group：用户组 - agency：委托账号  **默认取值：** 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum USER for value: "user"
         */
        public static final TypeEnum USER = new TypeEnum("user");

        /**
         * Enum GROUP for value: "group"
         */
        public static final TypeEnum GROUP = new TypeEnum("group");

        /**
         * Enum AGENCY for value: "agency"
         */
        public static final TypeEnum AGENCY = new TypeEnum("agency");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("user", USER);
            map.put("group", GROUP);
            map.put("agency", AGENCY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    public Principal withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 授权对象的类型。 **约束限制：** 不涉及 **取值范围：** - user：用户 - group：用户组 - agency：委托账号  **默认取值：** 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Principal withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public Principal addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public Principal withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * **参数解释：** 授权对象ID列表，根据授权对象的类型，用户、用户组和委托账号，填入对应的ID。 **约束限制：** 当前最多支持同时授权500个用户/用户组。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Principal that = (Principal) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.ids, that.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, ids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Principal {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
