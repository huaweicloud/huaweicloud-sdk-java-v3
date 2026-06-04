package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IcebergStructField
 */
public class IcebergStructField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_json")

    private String typeJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc")

    private String doc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_default")

    private String writeDefault;

    public IcebergStructField withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 字段id。
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IcebergStructField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IcebergStructField withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 字段类型, 包含 BOOLEAN, INTEGER, LONG, FLOAT, DOUBLE, DATE, TIME, TIMESTAMP, TIMESTAMP_NANO, STRING, UUID, FIXED, BINARY, DECIMAL, STRUCT, LIST, MAP
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IcebergStructField withTypeJson(String typeJson) {
        this.typeJson = typeJson;
        return this;
    }

    /**
     * 如果type字段输入了STRUCT, LIST, MAP以外的类型，此处应该为空。如果type类型输入了STRUCT, LIST, MAP，此处应该为嵌套类型json体的字符串。
     * @return typeJson
     */
    public String getTypeJson() {
        return typeJson;
    }

    public void setTypeJson(String typeJson) {
        this.typeJson = typeJson;
    }

    public IcebergStructField withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 表示这个字段是必须的还是可选的
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public IcebergStructField withDoc(String doc) {
        this.doc = doc;
        return this;
    }

    /**
     * comment
     * @return doc
     */
    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public IcebergStructField withWriteDefault(String writeDefault) {
        this.writeDefault = writeDefault;
        return this;
    }

    /**
     * 字段写入默认值, 在每次写入操作时生效，覆盖显式写入的null值。
     * @return writeDefault
     */
    public String getWriteDefault() {
        return writeDefault;
    }

    public void setWriteDefault(String writeDefault) {
        this.writeDefault = writeDefault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcebergStructField that = (IcebergStructField) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.typeJson, that.typeJson)
            && Objects.equals(this.required, that.required) && Objects.equals(this.doc, that.doc)
            && Objects.equals(this.writeDefault, that.writeDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, typeJson, required, doc, writeDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IcebergStructField {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeJson: ").append(toIndentedString(typeJson)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    doc: ").append(toIndentedString(doc)).append("\n");
        sb.append("    writeDefault: ").append(toIndentedString(writeDefault)).append("\n");
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
