package com.huaweicloud.sdk.ces.v2.model;

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
 * CreateResourceGroupRequestBody
 */
public class CreateResourceGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceGroupTagRelation> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_ep_ids")

    private List<String> associationEpIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "providers")

    private String providers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id_and_tags")

    private List<EnterpriseProjectIdAndTags> enterpriseProjectIdAndTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<Resource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_resources")

    private List<ProductResource> productResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<Instance> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_names")

    private String productNames;

    /**
     * **参数解释** 资源层级，资源生效范围。选择云产品，则云产品及其子层级均可进入该资源分组，选择子维度，则只生效具体的子维度。 **约束限制** 不涉及。 **取值范围** - product: 云产品 - dimension: 子维度 **默认取值** 不涉及。 
     */
    public static final class ResourceLevelEnum {

        /**
         * Enum PRODUCT for value: "product"
         */
        public static final ResourceLevelEnum PRODUCT = new ResourceLevelEnum("product");

        /**
         * Enum DIMENSION for value: "dimension"
         */
        public static final ResourceLevelEnum DIMENSION = new ResourceLevelEnum("dimension");

        private static final Map<String, ResourceLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceLevelEnum> createStaticFields() {
            Map<String, ResourceLevelEnum> map = new HashMap<>();
            map.put("product", PRODUCT);
            map.put("dimension", DIMENSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceLevelEnum(String value) {
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
        public static ResourceLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceLevelEnum(value));
        }

        public static ResourceLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceLevelEnum) {
                return this.value.equals(((ResourceLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level")

    private ResourceLevelEnum resourceLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comb_relation")

    private CombRelation combRelation;

    public CreateResourceGroupRequestBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释** 资源分组的名称 **约束限制** 不涉及 **取值范围** 只能为字母、数字、汉字、-或_，长度为[1,128]个字符 **默认取值** 不涉及 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public CreateResourceGroupRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释** 资源分组归属企业项目ID **约束限制** 不涉及 **取值范围** 由数字、字母和-组成，或者为0（默认企业项目ID）。 **默认取值** 不涉及 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateResourceGroupRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释** 资源分组添加资源方式 **约束限制** 不涉及 **取值范围** 取值只能为EPS（同步企业项目），TAG（标签动态匹配），NAME（实例名称），COMB（组合匹配），不传为手动添加。 **默认取值** 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateResourceGroupRequestBody withTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
        return this;
    }

    public CreateResourceGroupRequestBody addTagsItem(ResourceGroupTagRelation tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateResourceGroupRequestBody withTags(Consumer<List<ResourceGroupTagRelation>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释** 标签动态匹配时的关联标签。 **约束限制** type为TAG时必传，不超过50个标签。 
     * @return tags
     */
    public List<ResourceGroupTagRelation> getTags() {
        return tags;
    }

    public void setTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
    }

    public CreateResourceGroupRequestBody withAssociationEpIds(List<String> associationEpIds) {
        this.associationEpIds = associationEpIds;
        return this;
    }

    public CreateResourceGroupRequestBody addAssociationEpIdsItem(String associationEpIdsItem) {
        if (this.associationEpIds == null) {
            this.associationEpIds = new ArrayList<>();
        }
        this.associationEpIds.add(associationEpIdsItem);
        return this;
    }

    public CreateResourceGroupRequestBody withAssociationEpIds(Consumer<List<String>> associationEpIdsSetter) {
        if (this.associationEpIds == null) {
            this.associationEpIds = new ArrayList<>();
        }
        associationEpIdsSetter.accept(this.associationEpIds);
        return this;
    }

    /**
     * **参数解释** 该资源分组内包含的资源来源的企业项目ID。 **约束限制** type为EPS时必传，不超过50个企业项目ID。 
     * @return associationEpIds
     */
    public List<String> getAssociationEpIds() {
        return associationEpIds;
    }

    public void setAssociationEpIds(List<String> associationEpIds) {
        this.associationEpIds = associationEpIds;
    }

    public CreateResourceGroupRequestBody withProviders(String providers) {
        this.providers = providers;
        return this;
    }

    /**
     * **参数解释** 云服务名称,格式为\"dcs,ecs\",支持的云服务providers请参考《配置审计API参考》中的\"支持的服务和资源类型\"章节 **约束限制** 不涉及 **取值范围** 长度为[0,512]个字符 **默认取值** 不涉及 
     * @return providers
     */
    public String getProviders() {
        return providers;
    }

    public void setProviders(String providers) {
        this.providers = providers;
    }

    public CreateResourceGroupRequestBody withEnterpriseProjectIdAndTags(
        List<EnterpriseProjectIdAndTags> enterpriseProjectIdAndTags) {
        this.enterpriseProjectIdAndTags = enterpriseProjectIdAndTags;
        return this;
    }

    public CreateResourceGroupRequestBody addEnterpriseProjectIdAndTagsItem(
        EnterpriseProjectIdAndTags enterpriseProjectIdAndTagsItem) {
        if (this.enterpriseProjectIdAndTags == null) {
            this.enterpriseProjectIdAndTags = new ArrayList<>();
        }
        this.enterpriseProjectIdAndTags.add(enterpriseProjectIdAndTagsItem);
        return this;
    }

    public CreateResourceGroupRequestBody withEnterpriseProjectIdAndTags(
        Consumer<List<EnterpriseProjectIdAndTags>> enterpriseProjectIdAndTagsSetter) {
        if (this.enterpriseProjectIdAndTags == null) {
            this.enterpriseProjectIdAndTags = new ArrayList<>();
        }
        enterpriseProjectIdAndTagsSetter.accept(this.enterpriseProjectIdAndTags);
        return this;
    }

    /**
     * **参数解释** 匹配企业项目或匹配标签参数。 **约束限制** 不超过50个条件。 
     * @return enterpriseProjectIdAndTags
     */
    public List<EnterpriseProjectIdAndTags> getEnterpriseProjectIdAndTags() {
        return enterpriseProjectIdAndTags;
    }

    public void setEnterpriseProjectIdAndTags(List<EnterpriseProjectIdAndTags> enterpriseProjectIdAndTags) {
        this.enterpriseProjectIdAndTags = enterpriseProjectIdAndTags;
    }

    public CreateResourceGroupRequestBody withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public CreateResourceGroupRequestBody addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public CreateResourceGroupRequestBody withResources(Consumer<List<Resource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释** 手动创建时的资源详情。 **约束限制** 不超过1000个资源。 
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public CreateResourceGroupRequestBody withProductResources(List<ProductResource> productResources) {
        this.productResources = productResources;
        return this;
    }

    public CreateResourceGroupRequestBody addProductResourcesItem(ProductResource productResourcesItem) {
        if (this.productResources == null) {
            this.productResources = new ArrayList<>();
        }
        this.productResources.add(productResourcesItem);
        return this;
    }

    public CreateResourceGroupRequestBody withProductResources(Consumer<List<ProductResource>> productResourcesSetter) {
        if (this.productResources == null) {
            this.productResources = new ArrayList<>();
        }
        productResourcesSetter.accept(this.productResources);
        return this;
    }

    /**
     * **参数解释** 手动创建，选择资源层级为云产品时的资源详情。 **约束限制** 不超过50个资源。 
     * @return productResources
     */
    public List<ProductResource> getProductResources() {
        return productResources;
    }

    public void setProductResources(List<ProductResource> productResources) {
        this.productResources = productResources;
    }

    public CreateResourceGroupRequestBody withInstances(List<Instance> instances) {
        this.instances = instances;
        return this;
    }

    public CreateResourceGroupRequestBody addInstancesItem(Instance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public CreateResourceGroupRequestBody withInstances(Consumer<List<Instance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * **参数解释** 实例名称匹配参数。 **约束限制** type为NAME时必传，不超过50个实例。 
     * @return instances
     */
    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public CreateResourceGroupRequestBody withProductNames(String productNames) {
        this.productNames = productNames;
        return this;
    }

    /**
     * **参数解释** 创建资源层级为云产品时的云产品名称，一般由\"服务命名空间,服务首层维度名称\"组成，如\"SYS.ECS,instance_id\"。多个云产品则用“;”隔开，如\"SERVICE.BMS,instance_id;SYS.ECS,instance_id\"。 **约束限制** 不涉及。 **取值范围** 长度[0,10240]个字符 **默认取值** 不涉及。
     * @return productNames
     */
    public String getProductNames() {
        return productNames;
    }

    public void setProductNames(String productNames) {
        this.productNames = productNames;
    }

    public CreateResourceGroupRequestBody withResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    /**
     * **参数解释** 资源层级，资源生效范围。选择云产品，则云产品及其子层级均可进入该资源分组，选择子维度，则只生效具体的子维度。 **约束限制** 不涉及。 **取值范围** - product: 云产品 - dimension: 子维度 **默认取值** 不涉及。 
     * @return resourceLevel
     */
    public ResourceLevelEnum getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(ResourceLevelEnum resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public CreateResourceGroupRequestBody withCombRelation(CombRelation combRelation) {
        this.combRelation = combRelation;
        return this;
    }

    public CreateResourceGroupRequestBody withCombRelation(Consumer<CombRelation> combRelationSetter) {
        if (this.combRelation == null) {
            this.combRelation = new CombRelation();
            combRelationSetter.accept(this.combRelation);
        }

        return this;
    }

    /**
     * Get combRelation
     * @return combRelation
     */
    public CombRelation getCombRelation() {
        return combRelation;
    }

    public void setCombRelation(CombRelation combRelation) {
        this.combRelation = combRelation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResourceGroupRequestBody that = (CreateResourceGroupRequestBody) obj;
        return Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.associationEpIds, that.associationEpIds)
            && Objects.equals(this.providers, that.providers)
            && Objects.equals(this.enterpriseProjectIdAndTags, that.enterpriseProjectIdAndTags)
            && Objects.equals(this.resources, that.resources)
            && Objects.equals(this.productResources, that.productResources)
            && Objects.equals(this.instances, that.instances) && Objects.equals(this.productNames, that.productNames)
            && Objects.equals(this.resourceLevel, that.resourceLevel)
            && Objects.equals(this.combRelation, that.combRelation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName,
            enterpriseProjectId,
            type,
            tags,
            associationEpIds,
            providers,
            enterpriseProjectIdAndTags,
            resources,
            productResources,
            instances,
            productNames,
            resourceLevel,
            combRelation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceGroupRequestBody {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    associationEpIds: ").append(toIndentedString(associationEpIds)).append("\n");
        sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
        sb.append("    enterpriseProjectIdAndTags: ").append(toIndentedString(enterpriseProjectIdAndTags)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    productResources: ").append(toIndentedString(productResources)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    productNames: ").append(toIndentedString(productNames)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    combRelation: ").append(toIndentedString(combRelation)).append("\n");
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
