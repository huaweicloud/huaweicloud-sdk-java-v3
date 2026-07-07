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
 * ServerVolume
 */
public class ServerVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * **参数解释**：存储类型。表示系统盘或数据盘。 **约束限制**：不涉及。 **取值范围**： - ROOT：系统盘 - DATA：数据盘  **默认取值**：不涉及。
     */
    public static final class TypeEnum {

        /**
         * Enum ROOT for value: "ROOT"
         */
        public static final TypeEnum ROOT = new TypeEnum("ROOT");

        /**
         * Enum DATA for value: "DATA"
         */
        public static final TypeEnum DATA = new TypeEnum("DATA");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ROOT", ROOT);
            map.put("DATA", DATA);
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

    /**
     * **参数解释**：EVS盘类型。表示EVS盘的存储类型。 **约束限制**：不涉及。 **取值范围**： - ESSD：极速型SSD云硬盘 - GPSSD：通用型SSD云硬盘 - SAS：高IO云硬盘 - SATA：普通IO云硬盘 - SSD：超高IO云硬盘  **默认取值**：不涉及。
     */
    public static final class EvsTypeEnum {

        /**
         * Enum ESSD for value: "ESSD"
         */
        public static final EvsTypeEnum ESSD = new EvsTypeEnum("ESSD");

        /**
         * Enum GPSSD for value: "GPSSD"
         */
        public static final EvsTypeEnum GPSSD = new EvsTypeEnum("GPSSD");

        /**
         * Enum SAS for value: "SAS"
         */
        public static final EvsTypeEnum SAS = new EvsTypeEnum("SAS");

        /**
         * Enum SATA for value: "SATA"
         */
        public static final EvsTypeEnum SATA = new EvsTypeEnum("SATA");

        /**
         * Enum SSD for value: "SSD"
         */
        public static final EvsTypeEnum SSD = new EvsTypeEnum("SSD");

        private static final Map<String, EvsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EvsTypeEnum> createStaticFields() {
            Map<String, EvsTypeEnum> map = new HashMap<>();
            map.put("ESSD", ESSD);
            map.put("GPSSD", GPSSD);
            map.put("SAS", SAS);
            map.put("SATA", SATA);
            map.put("SSD", SSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EvsTypeEnum(String value) {
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
        public static EvsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EvsTypeEnum(value));
        }

        public static EvsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EvsTypeEnum) {
                return this.value.equals(((EvsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_type")

    private EvsTypeEnum evsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_id")

    private String evsId;

    public ServerVolume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：EVS盘大小。表示分配给系统盘的存储空间大小。 **约束限制**：不涉及。 **取值范围**：100 - 1024 GB **默认取值**：不涉及。
     * minimum: 100
     * maximum: 1024
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ServerVolume withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：存储类型。表示系统盘或数据盘。 **约束限制**：不涉及。 **取值范围**： - ROOT：系统盘 - DATA：数据盘  **默认取值**：不涉及。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ServerVolume withEvsType(EvsTypeEnum evsType) {
        this.evsType = evsType;
        return this;
    }

    /**
     * **参数解释**：EVS盘类型。表示EVS盘的存储类型。 **约束限制**：不涉及。 **取值范围**： - ESSD：极速型SSD云硬盘 - GPSSD：通用型SSD云硬盘 - SAS：高IO云硬盘 - SATA：普通IO云硬盘 - SSD：超高IO云硬盘  **默认取值**：不涉及。
     * @return evsType
     */
    public EvsTypeEnum getEvsType() {
        return evsType;
    }

    public void setEvsType(EvsTypeEnum evsType) {
        this.evsType = evsType;
    }

    public ServerVolume withEvsId(String evsId) {
        this.evsId = evsId;
        return this;
    }

    /**
     * **参数解释**：EVS盘的ID。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return evsId
     */
    public String getEvsId() {
        return evsId;
    }

    public void setEvsId(String evsId) {
        this.evsId = evsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerVolume that = (ServerVolume) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.type, that.type)
            && Objects.equals(this.evsType, that.evsType) && Objects.equals(this.evsId, that.evsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, type, evsType, evsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerVolume {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    evsType: ").append(toIndentedString(evsType)).append("\n");
        sb.append("    evsId: ").append(toIndentedString(evsId)).append("\n");
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
