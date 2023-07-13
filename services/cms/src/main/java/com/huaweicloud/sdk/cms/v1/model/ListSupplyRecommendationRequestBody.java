package com.huaweicloud.sdk.cms.v1.model;

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
 * This is a auto create Body Object
 */
public class ListSupplyRecommendationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_constraint")

    private FlavorConstraint flavorConstraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ids")

    private List<String> flavorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locations")

    private List<DistinctLocation> locations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private SupplyOption option;

    /**
     * 推荐的策略。 CAPACITY：容量策略 COST：成本策略
     */
    public static final class StrategyEnum {

        /**
         * Enum CAPACITY for value: "CAPACITY"
         */
        public static final StrategyEnum CAPACITY = new StrategyEnum("CAPACITY");

        /**
         * Enum COST for value: "COST"
         */
        public static final StrategyEnum COST = new StrategyEnum("COST");

        private static final Map<String, StrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StrategyEnum> createStaticFields() {
            Map<String, StrategyEnum> map = new HashMap<>();
            map.put("CAPACITY", CAPACITY);
            map.put("COST", COST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StrategyEnum(String value) {
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
        public static StrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StrategyEnum(value));
        }

        public static StrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StrategyEnum) {
                return this.value.equals(((StrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private StrategyEnum strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListSupplyRecommendationRequestBody withFlavorConstraint(FlavorConstraint flavorConstraint) {
        this.flavorConstraint = flavorConstraint;
        return this;
    }

    public ListSupplyRecommendationRequestBody withFlavorConstraint(Consumer<FlavorConstraint> flavorConstraintSetter) {
        if (this.flavorConstraint == null) {
            this.flavorConstraint = new FlavorConstraint();
            flavorConstraintSetter.accept(this.flavorConstraint);
        }

        return this;
    }

    /**
     * Get flavorConstraint
     * @return flavorConstraint
     */
    public FlavorConstraint getFlavorConstraint() {
        return flavorConstraint;
    }

    public void setFlavorConstraint(FlavorConstraint flavorConstraint) {
        this.flavorConstraint = flavorConstraint;
    }

    public ListSupplyRecommendationRequestBody withFlavorIds(List<String> flavorIds) {
        this.flavorIds = flavorIds;
        return this;
    }

    public ListSupplyRecommendationRequestBody addFlavorIdsItem(String flavorIdsItem) {
        if (this.flavorIds == null) {
            this.flavorIds = new ArrayList<>();
        }
        this.flavorIds.add(flavorIdsItem);
        return this;
    }

    public ListSupplyRecommendationRequestBody withFlavorIds(Consumer<List<String>> flavorIdsSetter) {
        if (this.flavorIds == null) {
            this.flavorIds = new ArrayList<>();
        }
        flavorIdsSetter.accept(this.flavorIds);
        return this;
    }

    /**
     * 接受推荐的规格列表
     * @return flavorIds
     */
    public List<String> getFlavorIds() {
        return flavorIds;
    }

    public void setFlavorIds(List<String> flavorIds) {
        this.flavorIds = flavorIds;
    }

    public ListSupplyRecommendationRequestBody withLocations(List<DistinctLocation> locations) {
        this.locations = locations;
        return this;
    }

    public ListSupplyRecommendationRequestBody addLocationsItem(DistinctLocation locationsItem) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        this.locations.add(locationsItem);
        return this;
    }

    public ListSupplyRecommendationRequestBody withLocations(Consumer<List<DistinctLocation>> locationsSetter) {
        if (this.locations == null) {
            this.locations = new ArrayList<>();
        }
        locationsSetter.accept(this.locations);
        return this;
    }

    /**
     * 接受推荐的地域列表，默认接受所有区域
     * @return locations
     */
    public List<DistinctLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<DistinctLocation> locations) {
        this.locations = locations;
    }

    public ListSupplyRecommendationRequestBody withOption(SupplyOption option) {
        this.option = option;
        return this;
    }

    public ListSupplyRecommendationRequestBody withOption(Consumer<SupplyOption> optionSetter) {
        if (this.option == null) {
            this.option = new SupplyOption();
            optionSetter.accept(this.option);
        }

        return this;
    }

    /**
     * Get option
     * @return option
     */
    public SupplyOption getOption() {
        return option;
    }

    public void setOption(SupplyOption option) {
        this.option = option;
    }

    public ListSupplyRecommendationRequestBody withStrategy(StrategyEnum strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * 推荐的策略。 CAPACITY：容量策略 COST：成本策略
     * @return strategy
     */
    public StrategyEnum getStrategy() {
        return strategy;
    }

    public void setStrategy(StrategyEnum strategy) {
        this.strategy = strategy;
    }

    public ListSupplyRecommendationRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回的数量限制
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSupplyRecommendationRequestBody withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 取值为上一页数据的最后一条记录的唯一标记
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSupplyRecommendationRequestBody that = (ListSupplyRecommendationRequestBody) obj;
        return Objects.equals(this.flavorConstraint, that.flavorConstraint)
            && Objects.equals(this.flavorIds, that.flavorIds) && Objects.equals(this.locations, that.locations)
            && Objects.equals(this.option, that.option) && Objects.equals(this.strategy, that.strategy)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorConstraint, flavorIds, locations, option, strategy, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSupplyRecommendationRequestBody {\n");
        sb.append("    flavorConstraint: ").append(toIndentedString(flavorConstraint)).append("\n");
        sb.append("    flavorIds: ").append(toIndentedString(flavorIds)).append("\n");
        sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
