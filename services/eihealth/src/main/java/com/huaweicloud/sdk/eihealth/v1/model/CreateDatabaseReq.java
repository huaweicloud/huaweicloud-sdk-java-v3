package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建实例请求体
 */
public class CreateDatabaseReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_data")

    private ImportDatabaseDataReq importData;

    public CreateDatabaseReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDatabaseReq withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public CreateDatabaseReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 实例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDatabaseReq withImportData(ImportDatabaseDataReq importData) {
        this.importData = importData;
        return this;
    }

    public CreateDatabaseReq withImportData(Consumer<ImportDatabaseDataReq> importDataSetter) {
        if (this.importData == null) {
            this.importData = new ImportDatabaseDataReq();
            importDataSetter.accept(this.importData);
        }

        return this;
    }

    /**
     * Get importData
     * @return importData
     */
    public ImportDatabaseDataReq getImportData() {
        return importData;
    }

    public void setImportData(ImportDatabaseDataReq importData) {
        this.importData = importData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDatabaseReq that = (CreateDatabaseReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.importData, that.importData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, templateId, description, importData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    importData: ").append(toIndentedString(importData)).append("\n");
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
