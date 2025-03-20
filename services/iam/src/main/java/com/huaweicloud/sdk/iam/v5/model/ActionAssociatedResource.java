package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 与该授权项关联的资源。
 */
public class ActionAssociatedResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn_template")

    private String urnTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_keys")

    private List<String> conditionKeys = null;

    public ActionAssociatedResource withUrnTemplate(String urnTemplate) {
        this.urnTemplate = urnTemplate;
        return this;
    }

    /**
     * 统一资源名称模板，表示可以通过这类资源的统一资源名称对该授权项进行资源粒度的授权。
     * @return urnTemplate
     */
    public String getUrnTemplate() {
        return urnTemplate;
    }

    public void setUrnTemplate(String urnTemplate) {
        this.urnTemplate = urnTemplate;
    }

    public ActionAssociatedResource withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 标识该资源类型是否是这个授权项必选的，即授权项一定涉及对这类资源的操作；例如subnet是vpc:subnets:get的必选资源类型；而ou是organizations::tagResource的可选资源类型，因为organizations::tagResource操作的资源还可能是account或者policy。
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public ActionAssociatedResource withConditionKeys(List<String> conditionKeys) {
        this.conditionKeys = conditionKeys;
        return this;
    }

    public ActionAssociatedResource addConditionKeysItem(String conditionKeysItem) {
        if (this.conditionKeys == null) {
            this.conditionKeys = new ArrayList<>();
        }
        this.conditionKeys.add(conditionKeysItem);
        return this;
    }

    public ActionAssociatedResource withConditionKeys(Consumer<List<String>> conditionKeysSetter) {
        if (this.conditionKeys == null) {
            this.conditionKeys = new ArrayList<>();
        }
        conditionKeysSetter.accept(this.conditionKeys);
        return this;
    }

    /**
     * 针对该授权项和资源的服务自定义条件属性以及部分全局属性，只有授权项和资源同时匹配时才会生效。
     * @return conditionKeys
     */
    public List<String> getConditionKeys() {
        return conditionKeys;
    }

    public void setConditionKeys(List<String> conditionKeys) {
        this.conditionKeys = conditionKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionAssociatedResource that = (ActionAssociatedResource) obj;
        return Objects.equals(this.urnTemplate, that.urnTemplate) && Objects.equals(this.required, that.required)
            && Objects.equals(this.conditionKeys, that.conditionKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urnTemplate, required, conditionKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionAssociatedResource {\n");
        sb.append("    urnTemplate: ").append(toIndentedString(urnTemplate)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    conditionKeys: ").append(toIndentedString(conditionKeys)).append("\n");
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
