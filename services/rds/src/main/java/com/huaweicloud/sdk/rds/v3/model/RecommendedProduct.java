package com.huaweicloud.sdk.rds.v3.model;

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
 * 推荐商品信息
 */
public class RecommendedProduct {

    /**
     * 推荐级别
     */
    public static final class RecommendedLevelEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final RecommendedLevelEnum _0 = new RecommendedLevelEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final RecommendedLevelEnum _1 = new RecommendedLevelEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final RecommendedLevelEnum _2 = new RecommendedLevelEnum("2");

        private static final Map<String, RecommendedLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecommendedLevelEnum> createStaticFields() {
            Map<String, RecommendedLevelEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("2", _2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecommendedLevelEnum(String value) {
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
        public static RecommendedLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecommendedLevelEnum(value));
        }

        public static RecommendedLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecommendedLevelEnum) {
                return this.value.equals(((RecommendedLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommended_level")

    private RecommendedLevelEnum recommendedLevel;

    /**
     * 应用场景
     */
    public static final class ApplicationScenariosEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final ApplicationScenariosEnum _0 = new ApplicationScenariosEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final ApplicationScenariosEnum _1 = new ApplicationScenariosEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final ApplicationScenariosEnum _2 = new ApplicationScenariosEnum("2");

        private static final Map<String, ApplicationScenariosEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApplicationScenariosEnum> createStaticFields() {
            Map<String, ApplicationScenariosEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("2", _2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApplicationScenariosEnum(String value) {
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
        public static ApplicationScenariosEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApplicationScenariosEnum(value));
        }

        public static ApplicationScenariosEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApplicationScenariosEnum) {
                return this.value.equals(((ApplicationScenariosEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_scenarios")

    private ApplicationScenariosEnum applicationScenarios;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<RecommendFlavor> flavors = null;

    public RecommendedProduct withRecommendedLevel(RecommendedLevelEnum recommendedLevel) {
        this.recommendedLevel = recommendedLevel;
        return this;
    }

    /**
     * 推荐级别
     * @return recommendedLevel
     */
    public RecommendedLevelEnum getRecommendedLevel() {
        return recommendedLevel;
    }

    public void setRecommendedLevel(RecommendedLevelEnum recommendedLevel) {
        this.recommendedLevel = recommendedLevel;
    }

    public RecommendedProduct withApplicationScenarios(ApplicationScenariosEnum applicationScenarios) {
        this.applicationScenarios = applicationScenarios;
        return this;
    }

    /**
     * 应用场景
     * @return applicationScenarios
     */
    public ApplicationScenariosEnum getApplicationScenarios() {
        return applicationScenarios;
    }

    public void setApplicationScenarios(ApplicationScenariosEnum applicationScenarios) {
        this.applicationScenarios = applicationScenarios;
    }

    public RecommendedProduct withFlavors(List<RecommendFlavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    public RecommendedProduct addFlavorsItem(RecommendFlavor flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public RecommendedProduct withFlavors(Consumer<List<RecommendFlavor>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 规格信息
     * @return flavors
     */
    public List<RecommendFlavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<RecommendFlavor> flavors) {
        this.flavors = flavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecommendedProduct that = (RecommendedProduct) obj;
        return Objects.equals(this.recommendedLevel, that.recommendedLevel)
            && Objects.equals(this.applicationScenarios, that.applicationScenarios)
            && Objects.equals(this.flavors, that.flavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendedLevel, applicationScenarios, flavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecommendedProduct {\n");
        sb.append("    recommendedLevel: ").append(toIndentedString(recommendedLevel)).append("\n");
        sb.append("    applicationScenarios: ").append(toIndentedString(applicationScenarios)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
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
