package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释** 企业项目Id或标签信息 **约束限制** 不涉及 
 */
public class EnterpriseProjectIdAndTags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private ResourceGroupTagRelation tag;

    public EnterpriseProjectIdAndTags withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释** 企业项目ID **约束限制** 不涉及 **取值范围** 由字母、数字、_和-组成，长度为[1,128]个字符 **默认取值** 不涉及 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public EnterpriseProjectIdAndTags withTag(ResourceGroupTagRelation tag) {
        this.tag = tag;
        return this;
    }

    public EnterpriseProjectIdAndTags withTag(Consumer<ResourceGroupTagRelation> tagSetter) {
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
        EnterpriseProjectIdAndTags that = (EnterpriseProjectIdAndTags) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId) && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseProjectIdAndTags {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
