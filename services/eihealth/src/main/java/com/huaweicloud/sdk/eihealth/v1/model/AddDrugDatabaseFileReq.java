package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 追加数据库文件请求体
 */
public class AddDrugDatabaseFileReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private DatabaseFile file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AddDrugDatabaseFileReq withFile(DatabaseFile file) {
        this.file = file;
        return this;
    }

    public AddDrugDatabaseFileReq withFile(Consumer<DatabaseFile> fileSetter) {
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

    public AddDrugDatabaseFileReq withDescription(String description) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDrugDatabaseFileReq that = (AddDrugDatabaseFileReq) obj;
        return Objects.equals(this.file, that.file) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDrugDatabaseFileReq {\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
