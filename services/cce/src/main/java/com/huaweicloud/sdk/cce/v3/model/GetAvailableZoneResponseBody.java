package com.huaweicloud.sdk.cce.v3.model;

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
 * **参数解释**： 可用区详情
 */
public class GetAvailableZoneResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayName")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azGroupIds")

    private List<String> azGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PublicBorderGroup")

    private String publicBorderGroup;

    /**
     * **参数解释**： 可用区分类 **取值范围**： - Default: 中心云可用区 - IES: 专属云可用区 - HomeZone: 智能边缘云可用区
     */
    public static final class CategoryEnum {

        /**
         * Enum DEFAULT for value: "Default"
         */
        public static final CategoryEnum DEFAULT = new CategoryEnum("Default");

        /**
         * Enum IES for value: "IES"
         */
        public static final CategoryEnum IES = new CategoryEnum("IES");

        /**
         * Enum HOMEZONE for value: "HomeZone"
         */
        public static final CategoryEnum HOMEZONE = new CategoryEnum("HomeZone");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("Default", DEFAULT);
            map.put("IES", IES);
            map.put("HomeZone", HOMEZONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    public GetAvailableZoneResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 可用区ID **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetAvailableZoneResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 可用区名称 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetAvailableZoneResponseBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 可用区按所在区域显示的名称 **取值范围**： 不涉及
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public GetAvailableZoneResponseBody withAzGroupIds(List<String> azGroupIds) {
        this.azGroupIds = azGroupIds;
        return this;
    }

    public GetAvailableZoneResponseBody addAzGroupIdsItem(String azGroupIdsItem) {
        if (this.azGroupIds == null) {
            this.azGroupIds = new ArrayList<>();
        }
        this.azGroupIds.add(azGroupIdsItem);
        return this;
    }

    public GetAvailableZoneResponseBody withAzGroupIds(Consumer<List<String>> azGroupIdsSetter) {
        if (this.azGroupIds == null) {
            this.azGroupIds = new ArrayList<>();
        }
        azGroupIdsSetter.accept(this.azGroupIds);
        return this;
    }

    /**
     * **参数解释**： 可用区所属的可用区组，一个可用区可能属于多个可用区组 **取值范围**： 不涉及
     * @return azGroupIds
     */
    public List<String> getAzGroupIds() {
        return azGroupIds;
    }

    public void setAzGroupIds(List<String> azGroupIds) {
        this.azGroupIds = azGroupIds;
    }

    public GetAvailableZoneResponseBody withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * **参数解释**： EIP所属的组，IES边缘场景为可用区ID，中心区统一为“center” **取值范围**： 不涉及
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public GetAvailableZoneResponseBody withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 可用区分类 **取值范围**： - Default: 中心云可用区 - IES: 专属云可用区 - HomeZone: 智能边缘云可用区
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public GetAvailableZoneResponseBody withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * **参数解释**： 可用区名称别名 **取值范围**： 不涉及
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetAvailableZoneResponseBody that = (GetAvailableZoneResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.azGroupIds, that.azGroupIds)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.category, that.category) && Objects.equals(this.alias, that.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, displayName, azGroupIds, publicBorderGroup, category, alias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAvailableZoneResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    azGroupIds: ").append(toIndentedString(azGroupIds)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
