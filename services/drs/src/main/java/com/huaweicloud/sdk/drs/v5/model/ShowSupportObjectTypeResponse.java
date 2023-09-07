package com.huaweicloud.sdk.drs.v5.model;

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
public class ShowSupportObjectTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_full_trans_support_object")

    private Boolean isFullTransSupportObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_incre_trans_support_object")

    private Boolean isIncreTransSupportObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_full_incre_trans_support_object")

    private Boolean isFullIncreTransSupportObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_object_import_engine")

    private List<String> supportObjectImportEngine = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_column_mapping")

    private Boolean isSupportColumnMapping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_database_support_search")

    private Boolean isDatabaseSupportSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_schema_support_search")

    private Boolean isSchemaSupportSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_table_support_search")

    private Boolean isTableSupportSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_select")

    private String previousSelect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_level")

    private String importLevel;

    public ShowSupportObjectTypeResponse withIsFullTransSupportObject(Boolean isFullTransSupportObject) {
        this.isFullTransSupportObject = isFullTransSupportObject;
        return this;
    }

    /**
     * 全量任务是否支持对象选择。
     * @return isFullTransSupportObject
     */
    public Boolean getIsFullTransSupportObject() {
        return isFullTransSupportObject;
    }

    public void setIsFullTransSupportObject(Boolean isFullTransSupportObject) {
        this.isFullTransSupportObject = isFullTransSupportObject;
    }

    public ShowSupportObjectTypeResponse withIsIncreTransSupportObject(Boolean isIncreTransSupportObject) {
        this.isIncreTransSupportObject = isIncreTransSupportObject;
        return this;
    }

    /**
     * 增量任务是否支持对象选择。
     * @return isIncreTransSupportObject
     */
    public Boolean getIsIncreTransSupportObject() {
        return isIncreTransSupportObject;
    }

    public void setIsIncreTransSupportObject(Boolean isIncreTransSupportObject) {
        this.isIncreTransSupportObject = isIncreTransSupportObject;
    }

    public ShowSupportObjectTypeResponse withIsFullIncreTransSupportObject(Boolean isFullIncreTransSupportObject) {
        this.isFullIncreTransSupportObject = isFullIncreTransSupportObject;
        return this;
    }

    /**
     * 全量加增量任务是否支持对象选择。
     * @return isFullIncreTransSupportObject
     */
    public Boolean getIsFullIncreTransSupportObject() {
        return isFullIncreTransSupportObject;
    }

    public void setIsFullIncreTransSupportObject(Boolean isFullIncreTransSupportObject) {
        this.isFullIncreTransSupportObject = isFullIncreTransSupportObject;
    }

    public ShowSupportObjectTypeResponse withSupportObjectImportEngine(List<String> supportObjectImportEngine) {
        this.supportObjectImportEngine = supportObjectImportEngine;
        return this;
    }

    public ShowSupportObjectTypeResponse addSupportObjectImportEngineItem(String supportObjectImportEngineItem) {
        if (this.supportObjectImportEngine == null) {
            this.supportObjectImportEngine = new ArrayList<>();
        }
        this.supportObjectImportEngine.add(supportObjectImportEngineItem);
        return this;
    }

    public ShowSupportObjectTypeResponse withSupportObjectImportEngine(
        Consumer<List<String>> supportObjectImportEngineSetter) {
        if (this.supportObjectImportEngine == null) {
            this.supportObjectImportEngine = new ArrayList<>();
        }
        supportObjectImportEngineSetter.accept(this.supportObjectImportEngine);
        return this;
    }

    /**
     * 支持对象导入的引引擎。
     * @return supportObjectImportEngine
     */
    public List<String> getSupportObjectImportEngine() {
        return supportObjectImportEngine;
    }

    public void setSupportObjectImportEngine(List<String> supportObjectImportEngine) {
        this.supportObjectImportEngine = supportObjectImportEngine;
    }

    public ShowSupportObjectTypeResponse withIsSupportColumnMapping(Boolean isSupportColumnMapping) {
        this.isSupportColumnMapping = isSupportColumnMapping;
        return this;
    }

    /**
     * 是否支持列映射。
     * @return isSupportColumnMapping
     */
    public Boolean getIsSupportColumnMapping() {
        return isSupportColumnMapping;
    }

    public void setIsSupportColumnMapping(Boolean isSupportColumnMapping) {
        this.isSupportColumnMapping = isSupportColumnMapping;
    }

    public ShowSupportObjectTypeResponse withIsDatabaseSupportSearch(Boolean isDatabaseSupportSearch) {
        this.isDatabaseSupportSearch = isDatabaseSupportSearch;
        return this;
    }

    /**
     * 库是否支持搜索。
     * @return isDatabaseSupportSearch
     */
    public Boolean getIsDatabaseSupportSearch() {
        return isDatabaseSupportSearch;
    }

    public void setIsDatabaseSupportSearch(Boolean isDatabaseSupportSearch) {
        this.isDatabaseSupportSearch = isDatabaseSupportSearch;
    }

    public ShowSupportObjectTypeResponse withIsSchemaSupportSearch(Boolean isSchemaSupportSearch) {
        this.isSchemaSupportSearch = isSchemaSupportSearch;
        return this;
    }

    /**
     * schema是否支持搜索。
     * @return isSchemaSupportSearch
     */
    public Boolean getIsSchemaSupportSearch() {
        return isSchemaSupportSearch;
    }

    public void setIsSchemaSupportSearch(Boolean isSchemaSupportSearch) {
        this.isSchemaSupportSearch = isSchemaSupportSearch;
    }

    public ShowSupportObjectTypeResponse withIsTableSupportSearch(Boolean isTableSupportSearch) {
        this.isTableSupportSearch = isTableSupportSearch;
        return this;
    }

    /**
     * 表是否支持搜索。
     * @return isTableSupportSearch
     */
    public Boolean getIsTableSupportSearch() {
        return isTableSupportSearch;
    }

    public void setIsTableSupportSearch(Boolean isTableSupportSearch) {
        this.isTableSupportSearch = isTableSupportSearch;
    }

    public ShowSupportObjectTypeResponse withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 对象导入支持的文件大小。
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public ShowSupportObjectTypeResponse withPreviousSelect(String previousSelect) {
        this.previousSelect = previousSelect;
        return this;
    }

    /**
     * 上一次选择迁移对象或者同步对象的方式。 - srcImportObject：当前任务上次选择的方式为导入方式
     * @return previousSelect
     */
    public String getPreviousSelect() {
        return previousSelect;
    }

    public void setPreviousSelect(String previousSelect) {
        this.previousSelect = previousSelect;
    }

    public ShowSupportObjectTypeResponse withImportLevel(String importLevel) {
        this.importLevel = importLevel;
        return this;
    }

    /**
     * 对象导入类型。 - table：表级 - database：库级
     * @return importLevel
     */
    public String getImportLevel() {
        return importLevel;
    }

    public void setImportLevel(String importLevel) {
        this.importLevel = importLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSupportObjectTypeResponse that = (ShowSupportObjectTypeResponse) obj;
        return Objects.equals(this.isFullTransSupportObject, that.isFullTransSupportObject)
            && Objects.equals(this.isIncreTransSupportObject, that.isIncreTransSupportObject)
            && Objects.equals(this.isFullIncreTransSupportObject, that.isFullIncreTransSupportObject)
            && Objects.equals(this.supportObjectImportEngine, that.supportObjectImportEngine)
            && Objects.equals(this.isSupportColumnMapping, that.isSupportColumnMapping)
            && Objects.equals(this.isDatabaseSupportSearch, that.isDatabaseSupportSearch)
            && Objects.equals(this.isSchemaSupportSearch, that.isSchemaSupportSearch)
            && Objects.equals(this.isTableSupportSearch, that.isTableSupportSearch)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.previousSelect, that.previousSelect)
            && Objects.equals(this.importLevel, that.importLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFullTransSupportObject,
            isIncreTransSupportObject,
            isFullIncreTransSupportObject,
            supportObjectImportEngine,
            isSupportColumnMapping,
            isDatabaseSupportSearch,
            isSchemaSupportSearch,
            isTableSupportSearch,
            fileSize,
            previousSelect,
            importLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSupportObjectTypeResponse {\n");
        sb.append("    isFullTransSupportObject: ").append(toIndentedString(isFullTransSupportObject)).append("\n");
        sb.append("    isIncreTransSupportObject: ").append(toIndentedString(isIncreTransSupportObject)).append("\n");
        sb.append("    isFullIncreTransSupportObject: ")
            .append(toIndentedString(isFullIncreTransSupportObject))
            .append("\n");
        sb.append("    supportObjectImportEngine: ").append(toIndentedString(supportObjectImportEngine)).append("\n");
        sb.append("    isSupportColumnMapping: ").append(toIndentedString(isSupportColumnMapping)).append("\n");
        sb.append("    isDatabaseSupportSearch: ").append(toIndentedString(isDatabaseSupportSearch)).append("\n");
        sb.append("    isSchemaSupportSearch: ").append(toIndentedString(isSchemaSupportSearch)).append("\n");
        sb.append("    isTableSupportSearch: ").append(toIndentedString(isTableSupportSearch)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    previousSelect: ").append(toIndentedString(previousSelect)).append("\n");
        sb.append("    importLevel: ").append(toIndentedString(importLevel)).append("\n");
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
