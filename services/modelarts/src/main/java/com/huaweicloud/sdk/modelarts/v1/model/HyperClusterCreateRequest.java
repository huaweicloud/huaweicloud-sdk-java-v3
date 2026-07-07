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
 * HyperClusterCreateRequest
 */
public class HyperClusterCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyper_cluster_subnet_id")

    private String hyperClusterSubnetId;

    /**
     * **参数解释**：服务器类型。 **约束限制**：不涉及。 **取值范围**： - HPS：超节点服务 - ECS：弹性云服务 **默认取值**：不涉及。
     */
    public static final class TypeEnum {

        /**
         * Enum HPS for value: "HPS"
         */
        public static final TypeEnum HPS = new TypeEnum("HPS");

        /**
         * Enum ECS for value: "ECS"
         */
        public static final TypeEnum ECS = new TypeEnum("ECS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("HPS", HPS);
            map.put("ECS", ECS);
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

    public HyperClusterCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：hyper cluster的名称。 **取值范围**：^[-_.a-zA-Z0-9]{1,64}$。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HyperClusterCreateRequest withHyperClusterSubnetId(String hyperClusterSubnetId) {
        this.hyperClusterSubnetId = hyperClusterSubnetId;
        return this;
    }

    /**
     * **参数解释**：hyper cluster的ID。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return hyperClusterSubnetId
     */
    public String getHyperClusterSubnetId() {
        return hyperClusterSubnetId;
    }

    public void setHyperClusterSubnetId(String hyperClusterSubnetId) {
        this.hyperClusterSubnetId = hyperClusterSubnetId;
    }

    public HyperClusterCreateRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：服务器类型。 **约束限制**：不涉及。 **取值范围**： - HPS：超节点服务 - ECS：弹性云服务 **默认取值**：不涉及。
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
        HyperClusterCreateRequest that = (HyperClusterCreateRequest) obj;
        return Objects.equals(this.name, that.name)
            && Objects.equals(this.hyperClusterSubnetId, that.hyperClusterSubnetId)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hyperClusterSubnetId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperClusterCreateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hyperClusterSubnetId: ").append(toIndentedString(hyperClusterSubnetId)).append("\n");
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
