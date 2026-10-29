package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Flink SQL作业参数，包含SQL作业的脚本和依赖配置。 **约束限制**：不涉及。
 */
public class FlinkSqlParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

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

    private FlinkPythonDependencyParameter pythonParameter;

    public FlinkSqlParameter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：作业类型。 **约束限制**：固定值为 FLINK_SQL_JOB。 **取值范围**：不涉及。 **默认取值**：FLINK_SQL_JOB。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FlinkSqlParameter withSqlScriptFile(String sqlScriptFile) {
        this.sqlScriptFile = sqlScriptFile;
        return this;
    }

    /**
     * **参数解释**：SQL脚本所在的OBS文件路径，用于指定SQL作业的脚本文件。 **约束限制**：不涉及。 **取值范围**：OBS URL格式，长度为1~512个字符，以obs://开头。 **默认取值**：不涉及。
     * @return sqlScriptFile
     */
    public String getSqlScriptFile() {
        return sqlScriptFile;
    }

    public void setSqlScriptFile(String sqlScriptFile) {
        this.sqlScriptFile = sqlScriptFile;
    }

    public FlinkSqlParameter withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public FlinkSqlParameter addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public FlinkSqlParameter withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        dependencyJarsSetter.accept(this.dependencyJars);
        return this;
    }

    /**
     * **参数解释**：SQL作业依赖的JAR包OBS路径列表，用于指定作业运行所需的依赖JAR包，单个路径为OBS URL格式，长度为1~512个字符，以obs://开头。 **约束限制**：依赖JAR包数量不能超过100个。
     * @return dependencyJars
     */
    public List<String> getDependencyJars() {
        return dependencyJars;
    }

    public void setDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
    }

    public FlinkSqlParameter withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public FlinkSqlParameter addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public FlinkSqlParameter withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        dependencyFilesSetter.accept(this.dependencyFiles);
        return this;
    }

    /**
     * **参数解释**：SQL作业依赖文件的OBS路径列表，用于指定作业运行所需的依赖文件。 **约束限制**：依赖文件数量不能超过100个。单个路径为OBS URL格式，长度为1~512个字符，以obs://开头。
     * @return dependencyFiles
     */
    public List<String> getDependencyFiles() {
        return dependencyFiles;
    }

    public void setDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
    }

    public FlinkSqlParameter withPythonParameter(FlinkPythonDependencyParameter pythonParameter) {
        this.pythonParameter = pythonParameter;
        return this;
    }

    public FlinkSqlParameter withPythonParameter(Consumer<FlinkPythonDependencyParameter> pythonParameterSetter) {
        if (this.pythonParameter == null) {
            this.pythonParameter = new FlinkPythonDependencyParameter();
            pythonParameterSetter.accept(this.pythonParameter);
        }

        return this;
    }

    /**
     * Get pythonParameter
     * @return pythonParameter
     */
    public FlinkPythonDependencyParameter getPythonParameter() {
        return pythonParameter;
    }

    public void setPythonParameter(FlinkPythonDependencyParameter pythonParameter) {
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
        FlinkSqlParameter that = (FlinkSqlParameter) obj;
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
        sb.append("class FlinkSqlParameter {\n");
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
