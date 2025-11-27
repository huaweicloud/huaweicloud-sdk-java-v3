package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 描述
 */
public class ApplicationViewQueryResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_domain_id")

    private String relatedDomainId;

    public ApplicationViewQueryResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** CMDB分配的uuid。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApplicationViewQueryResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 应用或分组或组件的名称。 **取值范围：** 字符串，长度在[3,50]之间。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationViewQueryResponseData withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释：** 应用或分组或组件code。 **取值范围：** 字符串，长度在[3,50]之间。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ApplicationViewQueryResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 应用或分组或组件。 **取值范围：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ApplicationViewQueryResponseData withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释：** 父节点id，即查询结果所在路径的父节点id。 **取值范围：** 字符串，长度24。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public ApplicationViewQueryResponseData withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释：** 组件id。 **取值范围：** 字符串，长度24。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ApplicationViewQueryResponseData withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * **参数解释：** 应用id。 **取值范围：** 字符串，长度24。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ApplicationViewQueryResponseData withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 节点所在路径，由应用，组件，分组等id组成。 **取值范围：** 不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ApplicationViewQueryResponseData withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * **参数解释：** 云厂商信息。 **取值范围：** - RMS：华为云厂商。 - ALI：阿里云厂商。 - OTHER：其他厂商。
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public ApplicationViewQueryResponseData withRelatedDomainId(String relatedDomainId) {
        this.relatedDomainId = relatedDomainId;
        return this;
    }

    /**
     * **参数解释：** 跨账号资源所属的domainId。 **取值范围：** 不涉及。
     * @return relatedDomainId
     */
    public String getRelatedDomainId() {
        return relatedDomainId;
    }

    public void setRelatedDomainId(String relatedDomainId) {
        this.relatedDomainId = relatedDomainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationViewQueryResponseData that = (ApplicationViewQueryResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.code, that.code) && Objects.equals(this.type, that.type)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.path, that.path)
            && Objects.equals(this.vendor, that.vendor) && Objects.equals(this.relatedDomainId, that.relatedDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code, type, parentId, componentId, applicationId, path, vendor, relatedDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationViewQueryResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    relatedDomainId: ").append(toIndentedString(relatedDomainId)).append("\n");
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
