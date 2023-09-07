package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstancesRecommendationResponse extends SdkResponse {

    /**
     * 引擎类型
     */
    public static final class EngineEnum {

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EngineEnum MYSQL = new EngineEnum("mysql");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final EngineEnum POSTGRESQL = new EngineEnum("postgresql");

        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final EngineEnum SQLSERVER = new EngineEnum("sqlserver");

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("postgresql", POSTGRESQL);
            map.put("sqlserver", SQLSERVER);
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
    @JsonProperty(value = "recommended_products")

    private List<RecommendedProduct> recommendedProducts = null;

    public ListInstancesRecommendationResponse withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 引擎类型
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public ListInstancesRecommendationResponse withRecommendedProducts(List<RecommendedProduct> recommendedProducts) {
        this.recommendedProducts = recommendedProducts;
        return this;
    }

    public ListInstancesRecommendationResponse addRecommendedProductsItem(RecommendedProduct recommendedProductsItem) {
        if (this.recommendedProducts == null) {
            this.recommendedProducts = new ArrayList<>();
        }
        this.recommendedProducts.add(recommendedProductsItem);
        return this;
    }

    public ListInstancesRecommendationResponse withRecommendedProducts(
        Consumer<List<RecommendedProduct>> recommendedProductsSetter) {
        if (this.recommendedProducts == null) {
            this.recommendedProducts = new ArrayList<>();
        }
        recommendedProductsSetter.accept(this.recommendedProducts);
        return this;
    }

    /**
     * 推荐商品信息
     * @return recommendedProducts
     */
    public List<RecommendedProduct> getRecommendedProducts() {
        return recommendedProducts;
    }

    public void setRecommendedProducts(List<RecommendedProduct> recommendedProducts) {
        this.recommendedProducts = recommendedProducts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesRecommendationResponse that = (ListInstancesRecommendationResponse) obj;
        return Objects.equals(this.engine, that.engine)
            && Objects.equals(this.recommendedProducts, that.recommendedProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, recommendedProducts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRecommendationResponse {\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    recommendedProducts: ").append(toIndentedString(recommendedProducts)).append("\n");
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
