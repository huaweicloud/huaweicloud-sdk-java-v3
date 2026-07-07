package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建Lite Server的数据盘信息。
 */
public class ServerDataVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * **参数解释**：系统盘类型。表示数据盘的存储类型。 **约束限制**：不涉及。 **取值范围**： - ESSD：极速型SSD云硬盘 - GPSSD：通用型SSD云硬盘 - SAS：高IO云硬盘 - SATA：普通IO云硬盘 - SSD：超高IO云硬盘 **默认取值**：不涉及。
     */
    public static final class TypeEnum {

        /**
         * Enum SSD for value: "SSD"
         */
        public static final TypeEnum SSD = new TypeEnum("SSD");

        /**
         * Enum SAS for value: "SAS"
         */
        public static final TypeEnum SAS = new TypeEnum("SAS");

        /**
         * Enum SATA for value: "SATA"
         */
        public static final TypeEnum SATA = new TypeEnum("SATA");

        /**
         * Enum GPSSD for value: "GPSSD"
         */
        public static final TypeEnum GPSSD = new TypeEnum("GPSSD");

        /**
         * Enum ESSD for value: "ESSD"
         */
        public static final TypeEnum ESSD = new TypeEnum("ESSD");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SSD", SSD);
            map.put("SAS", SAS);
            map.put("SATA", SATA);
            map.put("GPSSD", GPSSD);
            map.put("ESSD", ESSD);
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
    @JsonProperty(value = "count")

    private Integer count;

    public ServerDataVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：数据盘大小。表示分配给数据盘的存储空间大小。 **约束限制**：不涉及。 **取值范围**：100 - 32768 GB **默认取值**：不涉及。
     * minimum: 100
     * maximum: 32768
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ServerDataVolume withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：系统盘类型。表示数据盘的存储类型。 **约束限制**：不涉及。 **取值范围**： - ESSD：极速型SSD云硬盘 - GPSSD：通用型SSD云硬盘 - SAS：高IO云硬盘 - SATA：普通IO云硬盘 - SSD：超高IO云硬盘 **默认取值**：不涉及。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ServerDataVolume withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：数据盘个数。表示为实例分配的数据盘数量。 **约束限制**：不涉及。 **取值范围**：1 - 8 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 8
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerDataVolume that = (ServerDataVolume) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.type, that.type)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, type, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerDataVolume {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
