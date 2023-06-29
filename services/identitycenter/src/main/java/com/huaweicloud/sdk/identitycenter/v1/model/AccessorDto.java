package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AccessorDto
 */
public class AccessorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * Gets or Sets accessorType
     */
    public static final class AccessorTypeEnum {

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final AccessorTypeEnum GROUP = new AccessorTypeEnum("GROUP");

        /**
         * Enum USER for value: "USER"
         */
        public static final AccessorTypeEnum USER = new AccessorTypeEnum("USER");

        private static final Map<String, AccessorTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessorTypeEnum> createStaticFields() {
            Map<String, AccessorTypeEnum> map = new HashMap<>();
            map.put("GROUP", GROUP);
            map.put("USER", USER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessorTypeEnum(String value) {
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
        public static AccessorTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessorTypeEnum(value));
        }

        public static AccessorTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessorTypeEnum) {
                return this.value.equals(((AccessorTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessor_type")

    private AccessorTypeEnum accessorType;

    public AccessorDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccessorDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccessorDto withAccessorType(AccessorTypeEnum accessorType) {
        this.accessorType = accessorType;
        return this;
    }

    /**
     * Get accessorType
     * @return accessorType
     */
    public AccessorTypeEnum getAccessorType() {
        return accessorType;
    }

    public void setAccessorType(AccessorTypeEnum accessorType) {
        this.accessorType = accessorType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessorDto that = (AccessorDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.accessorType, that.accessorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, accessorType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessorDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accessorType: ").append(toIndentedString(accessorType)).append("\n");
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
