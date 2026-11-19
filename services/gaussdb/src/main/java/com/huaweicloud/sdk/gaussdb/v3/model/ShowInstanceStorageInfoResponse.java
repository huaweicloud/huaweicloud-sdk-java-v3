package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceStorageInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Double used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepaid_size")

    private Double prepaidSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Double limit;

    /**
     * **参数解释**：  存储类型。  **取值范围**：  - POOL：DL6存储类型。 - STANDARDPOOL：DL5存储类型。
     */
    public static final class TypeEnum {

        /**
         * Enum POOL for value: "POOL"
         */
        public static final TypeEnum POOL = new TypeEnum("POOL");

        /**
         * Enum STANDARDPOOL for value: "STANDARDPOOL"
         */
        public static final TypeEnum STANDARDPOOL = new TypeEnum("STANDARDPOOL");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("POOL", POOL);
            map.put("STANDARDPOOL", STANDARDPOOL);
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

    public ShowInstanceStorageInfoResponse withUsed(Double used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释**：  已使用存储空间大小，单位是GB。  **取值范围**：  大于等于0。
     * @return used
     */
    public Double getUsed() {
        return used;
    }

    public void setUsed(Double used) {
        this.used = used;
    }

    public ShowInstanceStorageInfoResponse withPrepaidSize(Double prepaidSize) {
        this.prepaidSize = prepaidSize;
        return this;
    }

    /**
     * **参数解释**：  包年/包月购买的存储空间大小，单位是GB。  **取值范围**：  大于0。
     * @return prepaidSize
     */
    public Double getPrepaidSize() {
        return prepaidSize;
    }

    public void setPrepaidSize(Double prepaidSize) {
        this.prepaidSize = prepaidSize;
    }

    public ShowInstanceStorageInfoResponse withLimit(Double limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：  实例可使用的存储空间上限，单位是GB。  **取值范围**：  大于0。
     * @return limit
     */
    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public ShowInstanceStorageInfoResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  存储类型。  **取值范围**：  - POOL：DL6存储类型。 - STANDARDPOOL：DL5存储类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceStorageInfoResponse that = (ShowInstanceStorageInfoResponse) obj;
        return Objects.equals(this.used, that.used) && Objects.equals(this.prepaidSize, that.prepaidSize)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(used, prepaidSize, limit, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceStorageInfoResponse {\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    prepaidSize: ").append(toIndentedString(prepaidSize)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
