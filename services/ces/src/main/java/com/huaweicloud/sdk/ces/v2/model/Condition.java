package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 匹配条件 
 */
public class Condition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private ResourceNameItem instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private ResourceGroupTagRelation tag;

    public Condition withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public Condition withInstanceName(ResourceNameItem instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    public Condition withInstanceName(Consumer<ResourceNameItem> instanceNameSetter) {
        if (this.instanceName == null) {
            this.instanceName = new ResourceNameItem();
            instanceNameSetter.accept(this.instanceName);
        }

        return this;
    }

    /**
     * Get instanceName
     * @return instanceName
     */
    public ResourceNameItem getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(ResourceNameItem instanceName) {
        this.instanceName = instanceName;
    }

    public Condition withTag(ResourceGroupTagRelation tag) {
        this.tag = tag;
        return this;
    }

    public Condition withTag(Consumer<ResourceGroupTagRelation> tagSetter) {
        if (this.tag == null) {
            this.tag = new ResourceGroupTagRelation();
            tagSetter.accept(this.tag);
        }

        return this;
    }

    /**
     * Get tag
     * @return tag
     */
    public ResourceGroupTagRelation getTag() {
        return tag;
    }

    public void setTag(ResourceGroupTagRelation tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Condition that = (Condition) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, instanceName, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Condition {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
