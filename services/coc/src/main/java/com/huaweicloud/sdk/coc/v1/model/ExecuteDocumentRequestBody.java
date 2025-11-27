package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExecuteDocumentRequestBody
 */
public class ExecuteDocumentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<ExecuteDocumentRequestBodyParameters> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<ExecuteDocumentRequestBodySysTags> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_parameter_name")

    private String targetParameterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<ExecuteDocumentRequestBodyTargets> targets = null;

    /**
     * 执行的作业类型
     */
    public static final class DocumentTypeEnum {

        /**
         * Enum PRIVATE for value: "PRIVATE"
         */
        public static final DocumentTypeEnum PRIVATE = new DocumentTypeEnum("PRIVATE");

        /**
         * Enum PUBLIC for value: "PUBLIC"
         */
        public static final DocumentTypeEnum PUBLIC = new DocumentTypeEnum("PUBLIC");

        private static final Map<String, DocumentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DocumentTypeEnum> createStaticFields() {
            Map<String, DocumentTypeEnum> map = new HashMap<>();
            map.put("PRIVATE", PRIVATE);
            map.put("PUBLIC", PUBLIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DocumentTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DocumentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DocumentTypeEnum(value));
        }

        public static DocumentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DocumentTypeEnum) {
                return this.value.equals(((DocumentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_type")

    private DocumentTypeEnum documentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ExecuteDocumentRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 作业版本号，若不传则默认为最新版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ExecuteDocumentRequestBody withParameters(List<ExecuteDocumentRequestBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ExecuteDocumentRequestBody addParametersItem(ExecuteDocumentRequestBodyParameters parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public ExecuteDocumentRequestBody withParameters(
        Consumer<List<ExecuteDocumentRequestBodyParameters>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 全局参数
     * @return parameters
     */
    public List<ExecuteDocumentRequestBodyParameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<ExecuteDocumentRequestBodyParameters> parameters) {
        this.parameters = parameters;
    }

    public ExecuteDocumentRequestBody withSysTags(List<ExecuteDocumentRequestBodySysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ExecuteDocumentRequestBody addSysTagsItem(ExecuteDocumentRequestBodySysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ExecuteDocumentRequestBody withSysTags(Consumer<List<ExecuteDocumentRequestBodySysTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签列表
     * @return sysTags
     */
    public List<ExecuteDocumentRequestBodySysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<ExecuteDocumentRequestBodySysTags> sysTags) {
        this.sysTags = sysTags;
    }

    public ExecuteDocumentRequestBody withTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
        return this;
    }

    /**
     * 速率控制模式下，批量执行对象的参数名
     * @return targetParameterName
     */
    public String getTargetParameterName() {
        return targetParameterName;
    }

    public void setTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
    }

    public ExecuteDocumentRequestBody withTargets(List<ExecuteDocumentRequestBodyTargets> targets) {
        this.targets = targets;
        return this;
    }

    public ExecuteDocumentRequestBody addTargetsItem(ExecuteDocumentRequestBodyTargets targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public ExecuteDocumentRequestBody withTargets(Consumer<List<ExecuteDocumentRequestBodyTargets>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 与target_parameter_name搭配使用。选择实例化target_parameter_name参数的方式。
     * @return targets
     */
    public List<ExecuteDocumentRequestBodyTargets> getTargets() {
        return targets;
    }

    public void setTargets(List<ExecuteDocumentRequestBodyTargets> targets) {
        this.targets = targets;
    }

    public ExecuteDocumentRequestBody withDocumentType(DocumentTypeEnum documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * 执行的作业类型
     * @return documentType
     */
    public DocumentTypeEnum getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeEnum documentType) {
        this.documentType = documentType;
    }

    public ExecuteDocumentRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 执行描述
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
        ExecuteDocumentRequestBody that = (ExecuteDocumentRequestBody) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.parameters, that.parameters)
            && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.targetParameterName, that.targetParameterName)
            && Objects.equals(this.targets, that.targets) && Objects.equals(this.documentType, that.documentType)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, parameters, sysTags, targetParameterName, targets, documentType, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteDocumentRequestBody {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    targetParameterName: ").append(toIndentedString(targetParameterName)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
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
