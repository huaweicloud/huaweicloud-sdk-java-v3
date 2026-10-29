package com.huaweicloud.sdk.aidatalake.v2.model;

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
 * **参数解释**：SQL作业参数，包含SQL作业的详细配置信息。
 */
public class ShowFlinkSqlParameterResponse {

    /**
     * **参数解释**：作业类型，用于区分SQL作业、Jar作业和SQL Gateway作业。 **约束限制**：不涉及。 **取值范围**：   - FLINK_SQL_JOB：SQL作业。 
     */
    public static final class TypeEnum {

        /**
         * Enum FLINK_SQL_JOB for value: "FLINK_SQL_JOB"
         */
        public static final TypeEnum FLINK_SQL_JOB = new TypeEnum("FLINK_SQL_JOB");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("FLINK_SQL_JOB", FLINK_SQL_JOB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_script_file")

    private String sqlScriptFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_jars")

    private List<String> dependencyJars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_files")

    private List<String> dependencyFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_parameter")

    private ShowFlinkPythonDependencyParameterResponse pythonParameter;

    public ShowFlinkSqlParameterResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：作业类型，用于区分SQL作业、Jar作业和SQL Gateway作业。 **约束限制**：不涉及。 **取值范围**：   - FLINK_SQL_JOB：SQL作业。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowFlinkSqlParameterResponse withSqlScriptFile(String sqlScriptFile) {
        this.sqlScriptFile = sqlScriptFile;
        return this;
    }

    /**
     * **参数解释**：SQL脚本所在的OBS文件路径，用于指定SQL作业的脚本文件。 **取值范围**：OBS URL格式，长度为1~512个字符，以obs://开头。
     * @return sqlScriptFile
     */
    public String getSqlScriptFile() {
        return sqlScriptFile;
    }

    public void setSqlScriptFile(String sqlScriptFile) {
        this.sqlScriptFile = sqlScriptFile;
    }

    public ShowFlinkSqlParameterResponse withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public ShowFlinkSqlParameterResponse addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public ShowFlinkSqlParameterResponse withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        dependencyJarsSetter.accept(this.dependencyJars);
        return this;
    }

    /**
     * **参数解释**：SQL作业依赖的JAR包OBS路径列表，用于指定作业运行所需的依赖JAR包，单个路径为OBS URL格式，长度为1~512个字符，以obs://开头。
     * @return dependencyJars
     */
    public List<String> getDependencyJars() {
        return dependencyJars;
    }

    public void setDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
    }

    public ShowFlinkSqlParameterResponse withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public ShowFlinkSqlParameterResponse addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public ShowFlinkSqlParameterResponse withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        dependencyFilesSetter.accept(this.dependencyFiles);
        return this;
    }

    /**
     * **参数解释**：SQL作业依赖文件的OBS路径列表，用于指定作业运行所需的依赖文件。
     * @return dependencyFiles
     */
    public List<String> getDependencyFiles() {
        return dependencyFiles;
    }

    public void setDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
    }

    public ShowFlinkSqlParameterResponse withPythonParameter(
        ShowFlinkPythonDependencyParameterResponse pythonParameter) {
        this.pythonParameter = pythonParameter;
        return this;
    }

    public ShowFlinkSqlParameterResponse withPythonParameter(
        Consumer<ShowFlinkPythonDependencyParameterResponse> pythonParameterSetter) {
        if (this.pythonParameter == null) {
            this.pythonParameter = new ShowFlinkPythonDependencyParameterResponse();
            pythonParameterSetter.accept(this.pythonParameter);
        }

        return this;
    }

    /**
     * Get pythonParameter
     * @return pythonParameter
     */
    public ShowFlinkPythonDependencyParameterResponse getPythonParameter() {
        return pythonParameter;
    }

    public void setPythonParameter(ShowFlinkPythonDependencyParameterResponse pythonParameter) {
        this.pythonParameter = pythonParameter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlinkSqlParameterResponse that = (ShowFlinkSqlParameterResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sqlScriptFile, that.sqlScriptFile)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.pythonParameter, that.pythonParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sqlScriptFile, dependencyJars, dependencyFiles, pythonParameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkSqlParameterResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sqlScriptFile: ").append(toIndentedString(sqlScriptFile)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
        sb.append("    dependencyFiles: ").append(toIndentedString(dependencyFiles)).append("\n");
        sb.append("    pythonParameter: ").append(toIndentedString(pythonParameter)).append("\n");
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
