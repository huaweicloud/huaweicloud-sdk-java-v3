package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建评估项目请求体。
 */
public class CreateEvaluationProjectReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_name")

    @JacksonXmlProperty(localName = "evaluation_project_name")

    private String evaluationProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_info")

    @JacksonXmlProperty(localName = "source_db_info")

    private SourceDBInfo sourceDbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas_info")

    @JacksonXmlProperty(localName = "schemas_info")

    private SchemaInfo schemasInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objects_type_info")

    @JacksonXmlProperty(localName = "objects_type_info")

    private ObjectTypeInfo objectsTypeInfo;

    public CreateEvaluationProjectReq withEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
        return this;
    }

    /**
     * 评估项目名称。长度为5-50个字符，以英文字母开头，英文字母或数字结束，允许包含下划线和中划线。不允许重复。
     * @return evaluationProjectName
     */
    public String getEvaluationProjectName() {
        return evaluationProjectName;
    }

    public void setEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
    }

    public CreateEvaluationProjectReq withSourceDbInfo(SourceDBInfo sourceDbInfo) {
        this.sourceDbInfo = sourceDbInfo;
        return this;
    }

    public CreateEvaluationProjectReq withSourceDbInfo(Consumer<SourceDBInfo> sourceDbInfoSetter) {
        if (this.sourceDbInfo == null) {
            this.sourceDbInfo = new SourceDBInfo();
            sourceDbInfoSetter.accept(this.sourceDbInfo);
        }

        return this;
    }

    /**
     * Get sourceDbInfo
     * @return sourceDbInfo
     */
    public SourceDBInfo getSourceDbInfo() {
        return sourceDbInfo;
    }

    public void setSourceDbInfo(SourceDBInfo sourceDbInfo) {
        this.sourceDbInfo = sourceDbInfo;
    }

    public CreateEvaluationProjectReq withSchemasInfo(SchemaInfo schemasInfo) {
        this.schemasInfo = schemasInfo;
        return this;
    }

    public CreateEvaluationProjectReq withSchemasInfo(Consumer<SchemaInfo> schemasInfoSetter) {
        if (this.schemasInfo == null) {
            this.schemasInfo = new SchemaInfo();
            schemasInfoSetter.accept(this.schemasInfo);
        }

        return this;
    }

    /**
     * Get schemasInfo
     * @return schemasInfo
     */
    public SchemaInfo getSchemasInfo() {
        return schemasInfo;
    }

    public void setSchemasInfo(SchemaInfo schemasInfo) {
        this.schemasInfo = schemasInfo;
    }

    public CreateEvaluationProjectReq withObjectsTypeInfo(ObjectTypeInfo objectsTypeInfo) {
        this.objectsTypeInfo = objectsTypeInfo;
        return this;
    }

    public CreateEvaluationProjectReq withObjectsTypeInfo(Consumer<ObjectTypeInfo> objectsTypeInfoSetter) {
        if (this.objectsTypeInfo == null) {
            this.objectsTypeInfo = new ObjectTypeInfo();
            objectsTypeInfoSetter.accept(this.objectsTypeInfo);
        }

        return this;
    }

    /**
     * Get objectsTypeInfo
     * @return objectsTypeInfo
     */
    public ObjectTypeInfo getObjectsTypeInfo() {
        return objectsTypeInfo;
    }

    public void setObjectsTypeInfo(ObjectTypeInfo objectsTypeInfo) {
        this.objectsTypeInfo = objectsTypeInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEvaluationProjectReq createEvaluationProjectReq = (CreateEvaluationProjectReq) o;
        return Objects.equals(this.evaluationProjectName, createEvaluationProjectReq.evaluationProjectName)
            && Objects.equals(this.sourceDbInfo, createEvaluationProjectReq.sourceDbInfo)
            && Objects.equals(this.schemasInfo, createEvaluationProjectReq.schemasInfo)
            && Objects.equals(this.objectsTypeInfo, createEvaluationProjectReq.objectsTypeInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationProjectName, sourceDbInfo, schemasInfo, objectsTypeInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEvaluationProjectReq {\n");
        sb.append("    evaluationProjectName: ").append(toIndentedString(evaluationProjectName)).append("\n");
        sb.append("    sourceDbInfo: ").append(toIndentedString(sourceDbInfo)).append("\n");
        sb.append("    schemasInfo: ").append(toIndentedString(schemasInfo)).append("\n");
        sb.append("    objectsTypeInfo: ").append(toIndentedString(objectsTypeInfo)).append("\n");
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
