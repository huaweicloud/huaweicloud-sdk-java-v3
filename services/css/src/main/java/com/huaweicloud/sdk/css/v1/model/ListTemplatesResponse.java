package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemTemplates")

    private List<SystemTemplates> systemTemplates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customTemplates")

    private List<CustomTemplates> customTemplates = null;

    public ListTemplatesResponse withSystemTemplates(List<SystemTemplates> systemTemplates) {
        this.systemTemplates = systemTemplates;
        return this;
    }

    public ListTemplatesResponse addSystemTemplatesItem(SystemTemplates systemTemplatesItem) {
        if (this.systemTemplates == null) {
            this.systemTemplates = new ArrayList<>();
        }
        this.systemTemplates.add(systemTemplatesItem);
        return this;
    }

    public ListTemplatesResponse withSystemTemplates(Consumer<List<SystemTemplates>> systemTemplatesSetter) {
        if (this.systemTemplates == null) {
            this.systemTemplates = new ArrayList<>();
        }
        systemTemplatesSetter.accept(this.systemTemplates);
        return this;
    }

    /**
     * 系统模板列表。
     * @return systemTemplates
     */
    public List<SystemTemplates> getSystemTemplates() {
        return systemTemplates;
    }

    public void setSystemTemplates(List<SystemTemplates> systemTemplates) {
        this.systemTemplates = systemTemplates;
    }

    public ListTemplatesResponse withCustomTemplates(List<CustomTemplates> customTemplates) {
        this.customTemplates = customTemplates;
        return this;
    }

    public ListTemplatesResponse addCustomTemplatesItem(CustomTemplates customTemplatesItem) {
        if (this.customTemplates == null) {
            this.customTemplates = new ArrayList<>();
        }
        this.customTemplates.add(customTemplatesItem);
        return this;
    }

    public ListTemplatesResponse withCustomTemplates(Consumer<List<CustomTemplates>> customTemplatesSetter) {
        if (this.customTemplates == null) {
            this.customTemplates = new ArrayList<>();
        }
        customTemplatesSetter.accept(this.customTemplates);
        return this;
    }

    /**
     * 自定义模板列表。
     * @return customTemplates
     */
    public List<CustomTemplates> getCustomTemplates() {
        return customTemplates;
    }

    public void setCustomTemplates(List<CustomTemplates> customTemplates) {
        this.customTemplates = customTemplates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTemplatesResponse that = (ListTemplatesResponse) obj;
        return Objects.equals(this.systemTemplates, that.systemTemplates)
            && Objects.equals(this.customTemplates, that.customTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemTemplates, customTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplatesResponse {\n");
        sb.append("    systemTemplates: ").append(toIndentedString(systemTemplates)).append("\n");
        sb.append("    customTemplates: ").append(toIndentedString(customTemplates)).append("\n");
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
