package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListAuditBackupRiskTemplatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    private List<RiskBackupTemplateBean> templates = null;

    public ListAuditBackupRiskTemplatesResponse withTemplates(List<RiskBackupTemplateBean> templates) {
        this.templates = templates;
        return this;
    }

    public ListAuditBackupRiskTemplatesResponse addTemplatesItem(RiskBackupTemplateBean templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ListAuditBackupRiskTemplatesResponse withTemplates(Consumer<List<RiskBackupTemplateBean>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 配置列表
     * @return templates
     */
    public List<RiskBackupTemplateBean> getTemplates() {
        return templates;
    }

    public void setTemplates(List<RiskBackupTemplateBean> templates) {
        this.templates = templates;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditBackupRiskTemplatesResponse that = (ListAuditBackupRiskTemplatesResponse) obj;
        return Objects.equals(this.templates, that.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditBackupRiskTemplatesResponse {\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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
