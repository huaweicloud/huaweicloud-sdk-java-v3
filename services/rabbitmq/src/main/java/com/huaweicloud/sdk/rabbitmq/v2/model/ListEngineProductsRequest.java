package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEngineProductsRequest {

    /**
     * **参数解释**： 消息引擎的类型。 **约束限制**： 不涉及。 **取值范围**： rabbitmq：RabbitMQ引擎。 **默认取值**： 不涉及。
     */
    public static final class EngineEnum {

        /**
         * Enum RABBITMQ for value: "rabbitmq"
         */
        public static final EngineEnum RABBITMQ = new EngineEnum("rabbitmq");

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("rabbitmq", RABBITMQ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineEnum(String value) {
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
        public static EngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineEnum(value));
        }

        public static EngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private EngineEnum engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    public ListEngineProductsRequest withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * **参数解释**： 消息引擎的类型。 **约束限制**： 不涉及。 **取值范围**： rabbitmq：RabbitMQ引擎。 **默认取值**： 不涉及。
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public ListEngineProductsRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * **参数解释**： 产品ID。 **约束限制**： 不涉及。 **取值范围**： - c6.2u4g.single：对应规格rabbitmq.2u4g.single。 - c6.4u8g.single：对应规格rabbitmq.4u8g.single。 - c6.8u16g.single：对应规格rabbitmq.8u16g.single。 - c6.16u32g.single：对应规格rabbitmq.16u32g.single。 - c6.24u48g.single：对应规格rabbitmq.24u48g.single。 - c6.2u4g.cluster：对应规格rabbitmq.2u4g.cluster。 - c6.4u8g.cluster：对应规格rabbitmq.4u8g.cluster。 - c6.8u16g.cluster：对应规格rabbitmq.8u16g.cluster。 - c6.12u24g.cluster：对应规格rabbitmq.12u24g.cluster。 - c6.16u32g.cluster：对应规格rabbitmq.16u32g.cluster。 - c6.24u48g.cluster：对应规格rabbitmq.24u48g.cluster。 - c6.32u64g.cluster：对应规格rabbitmq.32u64g.cluster。 **默认取值**： 不涉及。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEngineProductsRequest that = (ListEngineProductsRequest) obj;
        return Objects.equals(this.engine, that.engine) && Objects.equals(this.productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEngineProductsRequest {\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
