package com.huaweicloud.sdk.eds.v1.model;

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
 * OfferResponseBodyOfferResources
 */
public class OfferResponseBodyOfferResources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_title")

    private String resourceTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    /**
     * 资源分类
     */
    public static final class ResourceCategoryEnum {

        /**
         * Enum FILE for value: "FILE"
         */
        public static final ResourceCategoryEnum FILE = new ResourceCategoryEnum("FILE");

        /**
         * Enum DATASET for value: "DATASET"
         */
        public static final ResourceCategoryEnum DATASET = new ResourceCategoryEnum("DATASET");

        private static final Map<String, ResourceCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceCategoryEnum> createStaticFields() {
            Map<String, ResourceCategoryEnum> map = new HashMap<>();
            map.put("FILE", FILE);
            map.put("DATASET", DATASET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceCategoryEnum(String value) {
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
        public static ResourceCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceCategoryEnum(value));
        }

        public static ResourceCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceCategoryEnum) {
                return this.value.equals(((ResourceCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_category")

    private ResourceCategoryEnum resourceCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_control_policies_template")

    private List<UseControlPoliciesInner> useControlPoliciesTemplate = null;

    public OfferResponseBodyOfferResources withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public OfferResponseBodyOfferResources withResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle;
        return this;
    }

    /**
     * 资源名称
     * @return resourceTitle
     */
    public String getResourceTitle() {
        return resourceTitle;
    }

    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle;
    }

    public OfferResponseBodyOfferResources withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源的文件类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public OfferResponseBodyOfferResources withResourceCategory(ResourceCategoryEnum resourceCategory) {
        this.resourceCategory = resourceCategory;
        return this;
    }

    /**
     * 资源分类
     * @return resourceCategory
     */
    public ResourceCategoryEnum getResourceCategory() {
        return resourceCategory;
    }

    public void setResourceCategory(ResourceCategoryEnum resourceCategory) {
        this.resourceCategory = resourceCategory;
    }

    public OfferResponseBodyOfferResources withUseControlPoliciesTemplate(
        List<UseControlPoliciesInner> useControlPoliciesTemplate) {
        this.useControlPoliciesTemplate = useControlPoliciesTemplate;
        return this;
    }

    public OfferResponseBodyOfferResources addUseControlPoliciesTemplateItem(
        UseControlPoliciesInner useControlPoliciesTemplateItem) {
        if (this.useControlPoliciesTemplate == null) {
            this.useControlPoliciesTemplate = new ArrayList<>();
        }
        this.useControlPoliciesTemplate.add(useControlPoliciesTemplateItem);
        return this;
    }

    public OfferResponseBodyOfferResources withUseControlPoliciesTemplate(
        Consumer<List<UseControlPoliciesInner>> useControlPoliciesTemplateSetter) {
        if (this.useControlPoliciesTemplate == null) {
            this.useControlPoliciesTemplate = new ArrayList<>();
        }
        useControlPoliciesTemplateSetter.accept(this.useControlPoliciesTemplate);
        return this;
    }

    /**
     * 合约使用控制策略列表
     * @return useControlPoliciesTemplate
     */
    public List<UseControlPoliciesInner> getUseControlPoliciesTemplate() {
        return useControlPoliciesTemplate;
    }

    public void setUseControlPoliciesTemplate(List<UseControlPoliciesInner> useControlPoliciesTemplate) {
        this.useControlPoliciesTemplate = useControlPoliciesTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OfferResponseBodyOfferResources that = (OfferResponseBodyOfferResources) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceTitle, that.resourceTitle)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceCategory, that.resourceCategory)
            && Objects.equals(this.useControlPoliciesTemplate, that.useControlPoliciesTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceTitle, resourceType, resourceCategory, useControlPoliciesTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferResponseBodyOfferResources {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceTitle: ").append(toIndentedString(resourceTitle)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceCategory: ").append(toIndentedString(resourceCategory)).append("\n");
        sb.append("    useControlPoliciesTemplate: ").append(toIndentedString(useControlPoliciesTemplate)).append("\n");
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
