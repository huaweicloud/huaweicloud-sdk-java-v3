package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListApplicationTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_templates")

    private List<ApplicationTemplateDto> applicationTemplates = null;

    public ListApplicationTemplatesResponse withApplicationTemplates(
        List<ApplicationTemplateDto> applicationTemplates) {
        this.applicationTemplates = applicationTemplates;
        return this;
    }

    public ListApplicationTemplatesResponse addApplicationTemplatesItem(
        ApplicationTemplateDto applicationTemplatesItem) {
        if (this.applicationTemplates == null) {
            this.applicationTemplates = new ArrayList<>();
        }
        this.applicationTemplates.add(applicationTemplatesItem);
        return this;
    }

    public ListApplicationTemplatesResponse withApplicationTemplates(
        Consumer<List<ApplicationTemplateDto>> applicationTemplatesSetter) {
        if (this.applicationTemplates == null) {
            this.applicationTemplates = new ArrayList<>();
        }
        applicationTemplatesSetter.accept(this.applicationTemplates);
        return this;
    }

    /**
     * 应用程序模板列表
     * @return applicationTemplates
     */
    public List<ApplicationTemplateDto> getApplicationTemplates() {
        return applicationTemplates;
    }

    public void setApplicationTemplates(List<ApplicationTemplateDto> applicationTemplates) {
        this.applicationTemplates = applicationTemplates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApplicationTemplatesResponse that = (ListApplicationTemplatesResponse) obj;
        return Objects.equals(this.applicationTemplates, that.applicationTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplicationTemplatesResponse {\n");
        sb.append("    applicationTemplates: ").append(toIndentedString(applicationTemplates)).append("\n");
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
