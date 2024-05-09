package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建药物数据库请求体
 */
public class CreateDatabaseReq2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_id")

    private String cssId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private DatabaseFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "columns")

    private List<String> columns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareable")

    private Boolean shareable;

    public CreateDatabaseReq2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库名称，长度为5-32个字符，首位需以小写英文字母开头，仅可以使用小写字母、数字、下划线“_”和中划线“-”
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDatabaseReq2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 数据库描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDatabaseReq2 withCssId(String cssId) {
        this.cssId = cssId;
        return this;
    }

    /**
     * css集群id
     * @return cssId
     */
    public String getCssId() {
        return cssId;
    }

    public void setCssId(String cssId) {
        this.cssId = cssId;
    }

    public CreateDatabaseReq2 withFile(DatabaseFile file) {
        this.file = file;
        return this;
    }

    public CreateDatabaseReq2 withFile(Consumer<DatabaseFile> fileSetter) {
        if (this.file == null) {
            this.file = new DatabaseFile();
            fileSetter.accept(this.file);
        }

        return this;
    }

    /**
     * Get file
     * @return file
     */
    public DatabaseFile getFile() {
        return file;
    }

    public void setFile(DatabaseFile file) {
        this.file = file;
    }

    public CreateDatabaseReq2 withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    public CreateDatabaseReq2 addColumnsItem(String columnsItem) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        this.columns.add(columnsItem);
        return this;
    }

    public CreateDatabaseReq2 withColumns(Consumer<List<String>> columnsSetter) {
        if (this.columns == null) {
            this.columns = new ArrayList<>();
        }
        columnsSetter.accept(this.columns);
        return this;
    }

    /**
     * 数据文件列名
     * @return columns
     */
    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public CreateDatabaseReq2 withShareable(Boolean shareable) {
        this.shareable = shareable;
        return this;
    }

    /**
     * 是否打开组织共享
     * @return shareable
     */
    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDatabaseReq2 that = (CreateDatabaseReq2) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.cssId, that.cssId) && Objects.equals(this.file, that.file)
            && Objects.equals(this.columns, that.columns) && Objects.equals(this.shareable, that.shareable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, cssId, file, columns, shareable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseReq2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cssId: ").append(toIndentedString(cssId)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
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
