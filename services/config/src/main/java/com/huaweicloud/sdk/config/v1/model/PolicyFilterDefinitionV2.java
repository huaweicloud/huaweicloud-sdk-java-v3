package com.huaweicloud.sdk.config.v1.model;

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
 * 规则过滤器
 */
public class PolicyFilterDefinitionV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_ids")

    private List<String> regionIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private List<String> resourceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    /**
     * 参数tags的取值逻辑，例如tags设置了a:a和b:b，当取值AND时，表示规则仅对同时绑定了a:a和b:b的资源生效；当取值为OR时，表示规则对任何绑定了a:a或b:b的资源生效。
     */
    public static final class TagKeyLogicEnum {

        /**
         * Enum AND for value: "AND"
         */
        public static final TagKeyLogicEnum AND = new TagKeyLogicEnum("AND");

        /**
         * Enum OR for value: "OR"
         */
        public static final TagKeyLogicEnum OR = new TagKeyLogicEnum("OR");

        private static final Map<String, TagKeyLogicEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TagKeyLogicEnum> createStaticFields() {
            Map<String, TagKeyLogicEnum> map = new HashMap<>();
            map.put("AND", AND);
            map.put("OR", OR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TagKeyLogicEnum(String value) {
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
        public static TagKeyLogicEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TagKeyLogicEnum(value));
        }

        public static TagKeyLogicEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TagKeyLogicEnum) {
                return this.value.equals(((TagKeyLogicEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key_logic")

    private TagKeyLogicEnum tagKeyLogic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<FilterTagDetail> tags = null;

    /**
     * 参数exclude_tags的取值逻辑，例如exclude_tags设置了a:a和b:b，当取值AND时，表示规则仅对同时绑定了a:a和b:b的资源生效；当取值为OR时，表示规则对任何绑定了a:a或b:b的资源生效。
     */
    public static final class ExcludeTagKeyLogicEnum {

        /**
         * Enum AND for value: "AND"
         */
        public static final ExcludeTagKeyLogicEnum AND = new ExcludeTagKeyLogicEnum("AND");

        /**
         * Enum OR for value: "OR"
         */
        public static final ExcludeTagKeyLogicEnum OR = new ExcludeTagKeyLogicEnum("OR");

        private static final Map<String, ExcludeTagKeyLogicEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExcludeTagKeyLogicEnum> createStaticFields() {
            Map<String, ExcludeTagKeyLogicEnum> map = new HashMap<>();
            map.put("AND", AND);
            map.put("OR", OR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExcludeTagKeyLogicEnum(String value) {
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
        public static ExcludeTagKeyLogicEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExcludeTagKeyLogicEnum(value));
        }

        public static ExcludeTagKeyLogicEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExcludeTagKeyLogicEnum) {
                return this.value.equals(((ExcludeTagKeyLogicEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_tag_key_logic")

    private ExcludeTagKeyLogicEnum excludeTagKeyLogic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_tags")

    private List<FilterTagDetail> excludeTags = null;

    public PolicyFilterDefinitionV2 withRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }

    public PolicyFilterDefinitionV2 addRegionIdsItem(String regionIdsItem) {
        if (this.regionIds == null) {
            this.regionIds = new ArrayList<>();
        }
        this.regionIds.add(regionIdsItem);
        return this;
    }

    public PolicyFilterDefinitionV2 withRegionIds(Consumer<List<String>> regionIdsSetter) {
        if (this.regionIds == null) {
            this.regionIds = new ArrayList<>();
        }
        regionIdsSetter.accept(this.regionIds);
        return this;
    }

    /**
     * 区域ID列表
     * @return regionIds
     */
    public List<String> getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
    }

    public PolicyFilterDefinitionV2 withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    public PolicyFilterDefinitionV2 addResourceTypesItem(String resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public PolicyFilterDefinitionV2 withResourceTypes(Consumer<List<String>> resourceTypesSetter) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * 云服务列表
     * @return resourceTypes
     */
    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public PolicyFilterDefinitionV2 withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public PolicyFilterDefinitionV2 addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public PolicyFilterDefinitionV2 withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 资源ID列表
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public PolicyFilterDefinitionV2 withTagKeyLogic(TagKeyLogicEnum tagKeyLogic) {
        this.tagKeyLogic = tagKeyLogic;
        return this;
    }

    /**
     * 参数tags的取值逻辑，例如tags设置了a:a和b:b，当取值AND时，表示规则仅对同时绑定了a:a和b:b的资源生效；当取值为OR时，表示规则对任何绑定了a:a或b:b的资源生效。
     * @return tagKeyLogic
     */
    public TagKeyLogicEnum getTagKeyLogic() {
        return tagKeyLogic;
    }

    public void setTagKeyLogic(TagKeyLogicEnum tagKeyLogic) {
        this.tagKeyLogic = tagKeyLogic;
    }

    public PolicyFilterDefinitionV2 withTags(List<FilterTagDetail> tags) {
        this.tags = tags;
        return this;
    }

    public PolicyFilterDefinitionV2 addTagsItem(FilterTagDetail tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PolicyFilterDefinitionV2 withTags(Consumer<List<FilterTagDetail>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 生效标签列表
     * @return tags
     */
    public List<FilterTagDetail> getTags() {
        return tags;
    }

    public void setTags(List<FilterTagDetail> tags) {
        this.tags = tags;
    }

    public PolicyFilterDefinitionV2 withExcludeTagKeyLogic(ExcludeTagKeyLogicEnum excludeTagKeyLogic) {
        this.excludeTagKeyLogic = excludeTagKeyLogic;
        return this;
    }

    /**
     * 参数exclude_tags的取值逻辑，例如exclude_tags设置了a:a和b:b，当取值AND时，表示规则仅对同时绑定了a:a和b:b的资源生效；当取值为OR时，表示规则对任何绑定了a:a或b:b的资源生效。
     * @return excludeTagKeyLogic
     */
    public ExcludeTagKeyLogicEnum getExcludeTagKeyLogic() {
        return excludeTagKeyLogic;
    }

    public void setExcludeTagKeyLogic(ExcludeTagKeyLogicEnum excludeTagKeyLogic) {
        this.excludeTagKeyLogic = excludeTagKeyLogic;
    }

    public PolicyFilterDefinitionV2 withExcludeTags(List<FilterTagDetail> excludeTags) {
        this.excludeTags = excludeTags;
        return this;
    }

    public PolicyFilterDefinitionV2 addExcludeTagsItem(FilterTagDetail excludeTagsItem) {
        if (this.excludeTags == null) {
            this.excludeTags = new ArrayList<>();
        }
        this.excludeTags.add(excludeTagsItem);
        return this;
    }

    public PolicyFilterDefinitionV2 withExcludeTags(Consumer<List<FilterTagDetail>> excludeTagsSetter) {
        if (this.excludeTags == null) {
            this.excludeTags = new ArrayList<>();
        }
        excludeTagsSetter.accept(this.excludeTags);
        return this;
    }

    /**
     * 排除标签列表，排除标签列表比生效标签列表有更高的优先级
     * @return excludeTags
     */
    public List<FilterTagDetail> getExcludeTags() {
        return excludeTags;
    }

    public void setExcludeTags(List<FilterTagDetail> excludeTags) {
        this.excludeTags = excludeTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyFilterDefinitionV2 that = (PolicyFilterDefinitionV2) obj;
        return Objects.equals(this.regionIds, that.regionIds) && Objects.equals(this.resourceTypes, that.resourceTypes)
            && Objects.equals(this.resourceIds, that.resourceIds) && Objects.equals(this.tagKeyLogic, that.tagKeyLogic)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.excludeTagKeyLogic, that.excludeTagKeyLogic)
            && Objects.equals(this.excludeTags, that.excludeTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionIds, resourceTypes, resourceIds, tagKeyLogic, tags, excludeTagKeyLogic, excludeTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyFilterDefinitionV2 {\n");
        sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    tagKeyLogic: ").append(toIndentedString(tagKeyLogic)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    excludeTagKeyLogic: ").append(toIndentedString(excludeTagKeyLogic)).append("\n");
        sb.append("    excludeTags: ").append(toIndentedString(excludeTags)).append("\n");
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
