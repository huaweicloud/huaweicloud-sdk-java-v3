package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

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
 * Spark作业参数，根据作业类型自动选择对应的参数结构。
 */
public class SparkJobArtifact {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum SPARK_JAR_JOB for value: "spark_jar_job"
         */
        public static final TypeEnum SPARK_JAR_JOB = new TypeEnum("spark_jar_job");

        /**
         * Enum SPARK_PYTHON_JOB for value: "spark_python_job"
         */
        public static final TypeEnum SPARK_PYTHON_JOB = new TypeEnum("spark_python_job");

        /**
         * Enum SPARK_SQL_SCRIPTING_JOB for value: "spark_sql_scripting_job"
         */
        public static final TypeEnum SPARK_SQL_SCRIPTING_JOB = new TypeEnum("spark_sql_scripting_job");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("spark_jar_job", SPARK_JAR_JOB);
            map.put("spark_python_job", SPARK_PYTHON_JOB);
            map.put("spark_sql_scripting_job", SPARK_SQL_SCRIPTING_JOB);
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
    @JsonProperty(value = "main_class")

    private String mainClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_args")

    private List<String> mainArgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_jar")

    private String mainJar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_jars")

    private List<String> dependencyJars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_files")

    private List<String> dependencyFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_archives")

    private List<String> dependencyArchives = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_py_files")

    private List<String> dependencyPyFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_python_file")

    private String mainPythonFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_scripting_file")

    private String sqlScriptingFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_scripting_parameters")

    private List<SparkJobSqlScriptParameter> sqlScriptingParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_scripting_result_to_obs")

    private Boolean sqlScriptingResultToObs;

    public SparkJobArtifact withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SparkJobArtifact withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * **参数解释**：主类名称，用于指定Spark Jar作业的入口类。 **约束限制**：不涉及。 **取值范围**：长度为1~512个字符。 **默认取值**：不涉及。 
     * @return mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public SparkJobArtifact withMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }

    public SparkJobArtifact addMainArgsItem(String mainArgsItem) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        this.mainArgs.add(mainArgsItem);
        return this;
    }

    public SparkJobArtifact withMainArgs(Consumer<List<String>> mainArgsSetter) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        mainArgsSetter.accept(this.mainArgs);
        return this;
    }

    /**
     * **参数解释**：主类参数列表，用于传递给Python Spark作业的参数。多个参数之间空格分隔。 **约束限制**：参数数量不能超过100个。 
     * @return mainArgs
     */
    public List<String> getMainArgs() {
        return mainArgs;
    }

    public void setMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
    }

    public SparkJobArtifact withMainJar(String mainJar) {
        this.mainJar = mainJar;
        return this;
    }

    /**
     * **参数解释**：主Jar包路径，用于指定Spark Jar作业主类所在Jar包的OBS路径。当作业类型为“spark_jar_job”时，此参数必填。 **约束限制**：不涉及。 **取值范围**：长度为1~512个字符，格式为OBS路径，例如：“obs://bucket_name/path/to/jar.jar”。 **默认取值**：不涉及。 
     * @return mainJar
     */
    public String getMainJar() {
        return mainJar;
    }

    public void setMainJar(String mainJar) {
        this.mainJar = mainJar;
    }

    public SparkJobArtifact withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public SparkJobArtifact addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public SparkJobArtifact withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        dependencyJarsSetter.accept(this.dependencyJars);
        return this;
    }

    /**
     * **参数解释**：依赖Jar包列表，用于指定Spark作业依赖的Jar包OBS路径。 **约束限制**：依赖Jar包数量不能超过100个。 
     * @return dependencyJars
     */
    public List<String> getDependencyJars() {
        return dependencyJars;
    }

    public void setDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
    }

    public SparkJobArtifact withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public SparkJobArtifact addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public SparkJobArtifact withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        dependencyFilesSetter.accept(this.dependencyFiles);
        return this;
    }

    /**
     * **参数解释**：依赖文件列表，用于指定Spark作业依赖的文件OBS路径。 **约束限制**：依赖文件数量不能超过100个。 
     * @return dependencyFiles
     */
    public List<String> getDependencyFiles() {
        return dependencyFiles;
    }

    public void setDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
    }

    public SparkJobArtifact withDependencyArchives(List<String> dependencyArchives) {
        this.dependencyArchives = dependencyArchives;
        return this;
    }

    public SparkJobArtifact addDependencyArchivesItem(String dependencyArchivesItem) {
        if (this.dependencyArchives == null) {
            this.dependencyArchives = new ArrayList<>();
        }
        this.dependencyArchives.add(dependencyArchivesItem);
        return this;
    }

    public SparkJobArtifact withDependencyArchives(Consumer<List<String>> dependencyArchivesSetter) {
        if (this.dependencyArchives == null) {
            this.dependencyArchives = new ArrayList<>();
        }
        dependencyArchivesSetter.accept(this.dependencyArchives);
        return this;
    }

    /**
     * **参数解释**：依赖归档包列表，用于指定Spark作业依赖的归档包OBS路径。 **约束限制**：依赖归档包数量不能超过100个。 
     * @return dependencyArchives
     */
    public List<String> getDependencyArchives() {
        return dependencyArchives;
    }

    public void setDependencyArchives(List<String> dependencyArchives) {
        this.dependencyArchives = dependencyArchives;
    }

    public SparkJobArtifact withDependencyPyFiles(List<String> dependencyPyFiles) {
        this.dependencyPyFiles = dependencyPyFiles;
        return this;
    }

    public SparkJobArtifact addDependencyPyFilesItem(String dependencyPyFilesItem) {
        if (this.dependencyPyFiles == null) {
            this.dependencyPyFiles = new ArrayList<>();
        }
        this.dependencyPyFiles.add(dependencyPyFilesItem);
        return this;
    }

    public SparkJobArtifact withDependencyPyFiles(Consumer<List<String>> dependencyPyFilesSetter) {
        if (this.dependencyPyFiles == null) {
            this.dependencyPyFiles = new ArrayList<>();
        }
        dependencyPyFilesSetter.accept(this.dependencyPyFiles);
        return this;
    }

    /**
     * **参数解释**：依赖Python文件列表，用于指定Spark作业依赖的Python包OBS路径。 **约束限制**：依赖Python文件数量不能超过100个。 
     * @return dependencyPyFiles
     */
    public List<String> getDependencyPyFiles() {
        return dependencyPyFiles;
    }

    public void setDependencyPyFiles(List<String> dependencyPyFiles) {
        this.dependencyPyFiles = dependencyPyFiles;
    }

    public SparkJobArtifact withMainPythonFile(String mainPythonFile) {
        this.mainPythonFile = mainPythonFile;
        return this;
    }

    /**
     * **参数解释**：主Python文件路径，用于指定Python Spark作业的主文件OBS路径。 **约束限制**：不涉及。 **取值范围**：长度为1~512个字符，格式为OBS路径，例如：“obs://bucket/pyspark/pySpark_udf_python.py”。 **默认取值**：不涉及。 
     * @return mainPythonFile
     */
    public String getMainPythonFile() {
        return mainPythonFile;
    }

    public void setMainPythonFile(String mainPythonFile) {
        this.mainPythonFile = mainPythonFile;
    }

    public SparkJobArtifact withSqlScriptingFile(String sqlScriptingFile) {
        this.sqlScriptingFile = sqlScriptingFile;
        return this;
    }

    /**
     * **参数解释**：SQL脚本文件路径，用于指定Spark Script SQL作业的脚本文件OBS路径。 **约束限制**：不涉及。 **取值范围**：长度为1~512个字符，格式为OBS路径，例如：“obs://bucket/sparksqlscript/script.sql”。 **默认取值**：不涉及。 
     * @return sqlScriptingFile
     */
    public String getSqlScriptingFile() {
        return sqlScriptingFile;
    }

    public void setSqlScriptingFile(String sqlScriptingFile) {
        this.sqlScriptingFile = sqlScriptingFile;
    }

    public SparkJobArtifact withSqlScriptingParameters(List<SparkJobSqlScriptParameter> sqlScriptingParameters) {
        this.sqlScriptingParameters = sqlScriptingParameters;
        return this;
    }

    public SparkJobArtifact addSqlScriptingParametersItem(SparkJobSqlScriptParameter sqlScriptingParametersItem) {
        if (this.sqlScriptingParameters == null) {
            this.sqlScriptingParameters = new ArrayList<>();
        }
        this.sqlScriptingParameters.add(sqlScriptingParametersItem);
        return this;
    }

    public SparkJobArtifact withSqlScriptingParameters(
        Consumer<List<SparkJobSqlScriptParameter>> sqlScriptingParametersSetter) {
        if (this.sqlScriptingParameters == null) {
            this.sqlScriptingParameters = new ArrayList<>();
        }
        sqlScriptingParametersSetter.accept(this.sqlScriptingParameters);
        return this;
    }

    /**
     * **参数解释**：SQL脚本占位符参数列表，用于配置SQL脚本中的参数化变量。数组中的每个元素为SparkJobSqlScriptParameter对象，包含占位符的键、值和类型信息。 **约束限制**：占位符参数数量不能超过16条。 
     * @return sqlScriptingParameters
     */
    public List<SparkJobSqlScriptParameter> getSqlScriptingParameters() {
        return sqlScriptingParameters;
    }

    public void setSqlScriptingParameters(List<SparkJobSqlScriptParameter> sqlScriptingParameters) {
        this.sqlScriptingParameters = sqlScriptingParameters;
    }

    public SparkJobArtifact withSqlScriptingResultToObs(Boolean sqlScriptingResultToObs) {
        this.sqlScriptingResultToObs = sqlScriptingResultToObs;
        return this;
    }

    /**
     * **参数解释**：结果写入OBS标识，用于控制SQL脚本作业的执行结果是否写入OBS。 **约束限制**：不涉及。 **取值范围**： - true：结果写入OBS。 - false：结果不写入OBS。 **默认取值**：不涉及。 
     * @return sqlScriptingResultToObs
     */
    public Boolean getSqlScriptingResultToObs() {
        return sqlScriptingResultToObs;
    }

    public void setSqlScriptingResultToObs(Boolean sqlScriptingResultToObs) {
        this.sqlScriptingResultToObs = sqlScriptingResultToObs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkJobArtifact that = (SparkJobArtifact) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.mainClass, that.mainClass)
            && Objects.equals(this.mainArgs, that.mainArgs) && Objects.equals(this.mainJar, that.mainJar)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.dependencyArchives, that.dependencyArchives)
            && Objects.equals(this.dependencyPyFiles, that.dependencyPyFiles)
            && Objects.equals(this.mainPythonFile, that.mainPythonFile)
            && Objects.equals(this.sqlScriptingFile, that.sqlScriptingFile)
            && Objects.equals(this.sqlScriptingParameters, that.sqlScriptingParameters)
            && Objects.equals(this.sqlScriptingResultToObs, that.sqlScriptingResultToObs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            mainClass,
            mainArgs,
            mainJar,
            dependencyJars,
            dependencyFiles,
            dependencyArchives,
            dependencyPyFiles,
            mainPythonFile,
            sqlScriptingFile,
            sqlScriptingParameters,
            sqlScriptingResultToObs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkJobArtifact {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    mainArgs: ").append(toIndentedString(mainArgs)).append("\n");
        sb.append("    mainJar: ").append(toIndentedString(mainJar)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
        sb.append("    dependencyFiles: ").append(toIndentedString(dependencyFiles)).append("\n");
        sb.append("    dependencyArchives: ").append(toIndentedString(dependencyArchives)).append("\n");
        sb.append("    dependencyPyFiles: ").append(toIndentedString(dependencyPyFiles)).append("\n");
        sb.append("    mainPythonFile: ").append(toIndentedString(mainPythonFile)).append("\n");
        sb.append("    sqlScriptingFile: ").append(toIndentedString(sqlScriptingFile)).append("\n");
        sb.append("    sqlScriptingParameters: ").append(toIndentedString(sqlScriptingParameters)).append("\n");
        sb.append("    sqlScriptingResultToObs: ").append(toIndentedString(sqlScriptingResultToObs)).append("\n");
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
