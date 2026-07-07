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
 * CloudServer
 */
public class CloudServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * **参数解释**：Lite Server服务器类型。  **取值范围**： - BMS：裸金属服务器 - ECS：弹性云服务器 - HPS：超节点服务器
     */
    public static final class TypeEnum {

        /**
         * Enum BMS for value: "BMS"
         */
        public static final TypeEnum BMS = new TypeEnum("BMS");

        /**
         * Enum ECS for value: "ECS"
         */
        public static final TypeEnum ECS = new TypeEnum("ECS");

        /**
         * Enum HPS for value: "HPS"
         */
        public static final TypeEnum HPS = new TypeEnum("HPS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("BMS", BMS);
            map.put("ECS", ECS);
            map.put("HPS", HPS);
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
    @JsonProperty(value = "hps_id")

    private String hpsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hps_ecs_id")

    private String hpsEcsId;

    public CloudServer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：服务器资源id，或超节点子节点id。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CloudServer withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：Lite Server服务器类型。  **取值范围**： - BMS：裸金属服务器 - ECS：弹性云服务器 - HPS：超节点服务器
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CloudServer withHpsId(String hpsId) {
        this.hpsId = hpsId;
        return this;
    }

    /**
     * **参数解释**：服务器所属的超节点资源id。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return hpsId
     */
    public String getHpsId() {
        return hpsId;
    }

    public void setHpsId(String hpsId) {
        this.hpsId = hpsId;
    }

    public CloudServer withHpsEcsId(String hpsEcsId) {
        this.hpsEcsId = hpsEcsId;
        return this;
    }

    /**
     * **参数解释**：超节点子节点对应服务器资源id。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return hpsEcsId
     */
    public String getHpsEcsId() {
        return hpsEcsId;
    }

    public void setHpsEcsId(String hpsEcsId) {
        this.hpsEcsId = hpsEcsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudServer that = (CloudServer) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.hpsId, that.hpsId) && Objects.equals(this.hpsEcsId, that.hpsEcsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, hpsId, hpsEcsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudServer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    hpsId: ").append(toIndentedString(hpsId)).append("\n");
        sb.append("    hpsEcsId: ").append(toIndentedString(hpsEcsId)).append("\n");
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
