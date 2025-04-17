package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源分组修改请求体
 */
public class PutResourceGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceGroupTagRelation> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id_and_tags")

    private List<EnterpriseProjectIdAndTags> enterpriseProjectIdAndTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_relation_ids")

    private List<String> extendRelationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances")

    private List<Instance> instances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_names")

    private String productNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comb_relation")

    private CombRelation combRelation;

    public PutResourceGroupReq withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 资源分组名称，只能为字母、数字、汉字、-、_，最大长度为128
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public PutResourceGroupReq withTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
        return this;
    }

    public PutResourceGroupReq addTagsItem(ResourceGroupTagRelation tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PutResourceGroupReq withTags(Consumer<List<ResourceGroupTagRelation>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签动态匹配时的关联标签,type为TAG时该字段不为空
     * @return tags
     */
    public List<ResourceGroupTagRelation> getTags() {
        return tags;
    }

    public void setTags(List<ResourceGroupTagRelation> tags) {
        this.tags = tags;
    }

    public PutResourceGroupReq withEnterpriseProjectIdAndTags(
        List<EnterpriseProjectIdAndTags> enterpriseProjectIdAndTags) {
        this.enterpriseProjectIdAndTags = enterpriseProjectIdAndTags;
        return this;
    }

    public PutResourceGroupReq addEnterpriseProjectIdAndTagsItem(
        EnterpriseProjectIdAndTags enterpriseProjectIdAndTagsItem) {
        if (this.enterpriseProjectIdAndTags == null) {
            this.enterpriseProjectIdAndTags = new ArrayList<>();
        }
        this.enterpriseProjectIdAndTags.add(enterpriseProjectIdAndTagsItem);
        return this;
    }

    public PutResourceGroupReq withEnterpriseProjectIdAndTags(
        Consumer<List<EnterpriseProjectIdAndTags>> enterpriseProjectIdAndTagsSetter) {
        if (this.enterpriseProjectIdAndTags == null) {
            this.enterpriseProjectIdAndTags = new ArrayList<>();
        }
        enterpriseProjectIdAndTagsSetter.accept(this.enterpriseProjectIdAndTags);
        return this;
    }

    /**
     * 资源匹配规则为组合匹配时传入的参数
     * @return enterpriseProjectIdAndTags
     */
    public List<EnterpriseProjectIdAndTags> getEnterpriseProjectIdAndTags() {
        return enterpriseProjectIdAndTags;
    }

    public void setEnterpriseProjectIdAndTags(List<EnterpriseProjectIdAndTags> enterpriseProjectIdAndTags) {
        this.enterpriseProjectIdAndTags = enterpriseProjectIdAndTags;
    }

    public PutResourceGroupReq withExtendRelationIds(List<String> extendRelationIds) {
        this.extendRelationIds = extendRelationIds;
        return this;
    }

    public PutResourceGroupReq addExtendRelationIdsItem(String extendRelationIdsItem) {
        if (this.extendRelationIds == null) {
            this.extendRelationIds = new ArrayList<>();
        }
        this.extendRelationIds.add(extendRelationIdsItem);
        return this;
    }

    public PutResourceGroupReq withExtendRelationIds(Consumer<List<String>> extendRelationIdsSetter) {
        if (this.extendRelationIds == null) {
            this.extendRelationIds = new ArrayList<>();
        }
        extendRelationIdsSetter.accept(this.extendRelationIds);
        return this;
    }

    /**
     * 智能添加时企业项目匹配传入参数
     * @return extendRelationIds
     */
    public List<String> getExtendRelationIds() {
        return extendRelationIds;
    }

    public void setExtendRelationIds(List<String> extendRelationIds) {
        this.extendRelationIds = extendRelationIds;
    }

    public PutResourceGroupReq withInstances(List<Instance> instances) {
        this.instances = instances;
        return this;
    }

    public PutResourceGroupReq addInstancesItem(Instance instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    public PutResourceGroupReq withInstances(Consumer<List<Instance>> instancesSetter) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        instancesSetter.accept(this.instances);
        return this;
    }

    /**
     * 实例名称匹配参数
     * @return instances
     */
    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public PutResourceGroupReq withProductNames(String productNames) {
        this.productNames = productNames;
        return this;
    }

    /**
     * 修改资源层级为云产品时的云产品的取值，一般由\"服务命名空间,服务首层维度名称\"组成，如\"SYS.ECS,instance_id\"。多个云产品则用“;”隔开，如\"SERVICE.BMS,instance_id;SYS.ECS,instance_id\"。
     * @return productNames
     */
    public String getProductNames() {
        return productNames;
    }

    public void setProductNames(String productNames) {
        this.productNames = productNames;
    }

    public PutResourceGroupReq withCombRelation(CombRelation combRelation) {
        this.combRelation = combRelation;
        return this;
    }

    public PutResourceGroupReq withCombRelation(Consumer<CombRelation> combRelationSetter) {
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
        PutResourceGroupReq that = (PutResourceGroupReq) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectIdAndTags, that.enterpriseProjectIdAndTags)
            && Objects.equals(this.extendRelationIds, that.extendRelationIds)
            && Objects.equals(this.instances, that.instances) && Objects.equals(this.productNames, that.productNames)
            && Objects.equals(this.combRelation, that.combRelation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName,
            tags,
            enterpriseProjectIdAndTags,
            extendRelationIds,
            instances,
            productNames,
            combRelation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutResourceGroupReq {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectIdAndTags: ").append(toIndentedString(enterpriseProjectIdAndTags)).append("\n");
        sb.append("    extendRelationIds: ").append(toIndentedString(extendRelationIds)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
        sb.append("    productNames: ").append(toIndentedString(productNames)).append("\n");
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
