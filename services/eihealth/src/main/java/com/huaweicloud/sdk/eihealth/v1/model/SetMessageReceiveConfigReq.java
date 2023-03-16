package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户邮件接收配置请求体
 */
public class SetMessageReceiveConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_types")

    private List<String> resourceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    public SetMessageReceiveConfigReq withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 接收范围（不接收消息(none)、仅接收自己操作的消息(mine)、接收全部消息(all)）
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public SetMessageReceiveConfigReq withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    public SetMessageReceiveConfigReq addResourceTypesItem(String resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    public SetMessageReceiveConfigReq withResourceTypes(Consumer<List<String>> resourceTypesSetter) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        resourceTypesSetter.accept(this.resourceTypes);
        return this;
    }

    /**
     * 资源类型
     * @return resourceTypes
     */
    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public SetMessageReceiveConfigReq withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetMessageReceiveConfigReq setMessageReceiveConfigReq = (SetMessageReceiveConfigReq) o;
        return Objects.equals(this.scope, setMessageReceiveConfigReq.scope)
            && Objects.equals(this.resourceTypes, setMessageReceiveConfigReq.resourceTypes)
            && Objects.equals(this.language, setMessageReceiveConfigReq.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, resourceTypes, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetMessageReceiveConfigReq {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
