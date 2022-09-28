package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入模板请求体
 */
public class ImportTemplateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_templates")

    private List<TemplateSrcReq> importTemplates = null;

    public ImportTemplateReq withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源项目id
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public ImportTemplateReq withImportTemplates(List<TemplateSrcReq> importTemplates) {
        this.importTemplates = importTemplates;
        return this;
    }

    public ImportTemplateReq addImportTemplatesItem(TemplateSrcReq importTemplatesItem) {
        if (this.importTemplates == null) {
            this.importTemplates = new ArrayList<>();
        }
        this.importTemplates.add(importTemplatesItem);
        return this;
    }

    public ImportTemplateReq withImportTemplates(Consumer<List<TemplateSrcReq>> importTemplatesSetter) {
        if (this.importTemplates == null) {
            this.importTemplates = new ArrayList<>();
        }
        importTemplatesSetter.accept(this.importTemplates);
        return this;
    }

    /**
     * 导入模板列表
     * @return importTemplates
     */
    public List<TemplateSrcReq> getImportTemplates() {
        return importTemplates;
    }

    public void setImportTemplates(List<TemplateSrcReq> importTemplates) {
        this.importTemplates = importTemplates;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportTemplateReq importTemplateReq = (ImportTemplateReq) o;
        return Objects.equals(this.sourceProjectId, importTemplateReq.sourceProjectId)
            && Objects.equals(this.importTemplates, importTemplateReq.importTemplates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceProjectId, importTemplates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportTemplateReq {\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    importTemplates: ").append(toIndentedString(importTemplates)).append("\n");
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
