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
 * **参数解释**：作业配置信息，包含作业类型、入口参数、依赖包等信息。 
 */
public class ShowSparkJobArtifactResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private SparkSqlScriptingResultResponse result;

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

    public ShowSparkJobArtifactResponse withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * **参数解释**：Spark Jar作业入口类，用于指定作业的主类名称。 **取值范围**：完整的Java类路径格式，例如：com.example.SparkJob。 
     * @return mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public ShowSparkJobArtifactResponse withMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }

    public ShowSparkJobArtifactResponse addMainArgsItem(String mainArgsItem) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        this.mainArgs.add(mainArgsItem);
        return this;
    }

    public ShowSparkJobArtifactResponse withMainArgs(Consumer<List<String>> mainArgsSetter) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        mainArgsSetter.accept(this.mainArgs);
        return this;
    }

    /**
     * **参数解释**：Spark Python作业入口类参数列表，用于传递作业执行参数。 
     * @return mainArgs
     */
    public List<String> getMainArgs() {
        return mainArgs;
    }

    public void setMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
    }

    public ShowSparkJobArtifactResponse withMainJar(String mainJar) {
        this.mainJar = mainJar;
        return this;
    }

    /**
     * **参数解释**：Spark Jar作业主类所在Jar包的OBS路径，用于指定作业的主Jar包。 **取值范围**：OBS URL格式，长度为1~1024个字符，例如：obs://bucket/jars/spark-job.jar。 
     * @return mainJar
     */
    public String getMainJar() {
        return mainJar;
    }

    public void setMainJar(String mainJar) {
        this.mainJar = mainJar;
    }

    public ShowSparkJobArtifactResponse withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public ShowSparkJobArtifactResponse addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public ShowSparkJobArtifactResponse withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        dependencyJarsSetter.accept(this.dependencyJars);
        return this;
    }

    /**
     * **参数解释**：依赖Jar包列表，用于指定Spark作业依赖的Jar包OBS路径。 
     * @return dependencyJars
     */
    public List<String> getDependencyJars() {
        return dependencyJars;
    }

    public void setDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
    }

    public ShowSparkJobArtifactResponse withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public ShowSparkJobArtifactResponse addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public ShowSparkJobArtifactResponse withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        dependencyFilesSetter.accept(this.dependencyFiles);
        return this;
    }

    /**
     * **参数解释**：依赖文件列表，用于指定Spark作业依赖的文件OBS路径。 
     * @return dependencyFiles
     */
    public List<String> getDependencyFiles() {
        return dependencyFiles;
    }

    public void setDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
    }

    public ShowSparkJobArtifactResponse withDependencyArchives(List<String> dependencyArchives) {
        this.dependencyArchives = dependencyArchives;
        return this;
    }

    public ShowSparkJobArtifactResponse addDependencyArchivesItem(String dependencyArchivesItem) {
        if (this.dependencyArchives == null) {
            this.dependencyArchives = new ArrayList<>();
        }
        this.dependencyArchives.add(dependencyArchivesItem);
        return this;
    }

    public ShowSparkJobArtifactResponse withDependencyArchives(Consumer<List<String>> dependencyArchivesSetter) {
        if (this.dependencyArchives == null) {
            this.dependencyArchives = new ArrayList<>();
        }
        dependencyArchivesSetter.accept(this.dependencyArchives);
        return this;
    }

    /**
     * **参数解释**：依赖归档包列表，用于指定Spark作业依赖的归档包OBS路径。 
     * @return dependencyArchives
     */
    public List<String> getDependencyArchives() {
        return dependencyArchives;
    }

    public void setDependencyArchives(List<String> dependencyArchives) {
        this.dependencyArchives = dependencyArchives;
    }

    public ShowSparkJobArtifactResponse withDependencyPyFiles(List<String> dependencyPyFiles) {
        this.dependencyPyFiles = dependencyPyFiles;
        return this;
    }

    public ShowSparkJobArtifactResponse addDependencyPyFilesItem(String dependencyPyFilesItem) {
        if (this.dependencyPyFiles == null) {
            this.dependencyPyFiles = new ArrayList<>();
        }
        this.dependencyPyFiles.add(dependencyPyFilesItem);
        return this;
    }

    public ShowSparkJobArtifactResponse withDependencyPyFiles(Consumer<List<String>> dependencyPyFilesSetter) {
        if (this.dependencyPyFiles == null) {
            this.dependencyPyFiles = new ArrayList<>();
        }
        dependencyPyFilesSetter.accept(this.dependencyPyFiles);
        return this;
    }

    /**
     * **参数解释**：依赖Python文件列表，用于指定Spark作业依赖的Python包OBS路径。 
     * @return dependencyPyFiles
     */
    public List<String> getDependencyPyFiles() {
        return dependencyPyFiles;
    }

    public void setDependencyPyFiles(List<String> dependencyPyFiles) {
        this.dependencyPyFiles = dependencyPyFiles;
    }

    public ShowSparkJobArtifactResponse withMainPythonFile(String mainPythonFile) {
        this.mainPythonFile = mainPythonFile;
        return this;
    }

    /**
     * **参数解释**：主Python文件路径，用于指定Python Spark作业的主文件OBS路径。 **取值范围**：OBS URL格式，长度为1~512个字符，例如：obs://bucket/pyspark/pySpark_udf_python.py. 
     * @return mainPythonFile
     */
    public String getMainPythonFile() {
        return mainPythonFile;
    }

    public void setMainPythonFile(String mainPythonFile) {
        this.mainPythonFile = mainPythonFile;
    }

    public ShowSparkJobArtifactResponse withSqlScriptingFile(String sqlScriptingFile) {
        this.sqlScriptingFile = sqlScriptingFile;
        return this;
    }

    /**
     * **参数解释**：Spark Script SQL类型作业的SQL脚本文件OBS路径，用于指定作业执行的SQL脚本。 **取值范围**：OBS URL格式，长度为1~1024个字符，例如：obs://bucket/sparksql/script.sql。 
     * @return sqlScriptingFile
     */
    public String getSqlScriptingFile() {
        return sqlScriptingFile;
    }

    public void setSqlScriptingFile(String sqlScriptingFile) {
        this.sqlScriptingFile = sqlScriptingFile;
    }

    public ShowSparkJobArtifactResponse withSqlScriptingParameters(
        List<SparkJobSqlScriptParameter> sqlScriptingParameters) {
        this.sqlScriptingParameters = sqlScriptingParameters;
        return this;
    }

    public ShowSparkJobArtifactResponse addSqlScriptingParametersItem(
        SparkJobSqlScriptParameter sqlScriptingParametersItem) {
        if (this.sqlScriptingParameters == null) {
            this.sqlScriptingParameters = new ArrayList<>();
        }
        this.sqlScriptingParameters.add(sqlScriptingParametersItem);
        return this;
    }

    public ShowSparkJobArtifactResponse withSqlScriptingParameters(
        Consumer<List<SparkJobSqlScriptParameter>> sqlScriptingParametersSetter) {
        if (this.sqlScriptingParameters == null) {
            this.sqlScriptingParameters = new ArrayList<>();
        }
        sqlScriptingParametersSetter.accept(this.sqlScriptingParameters);
        return this;
    }

    /**
     * **参数解释**：SQL脚本占位符参数列表，用于为SQL脚本中的占位符传递参数值。 
     * @return sqlScriptingParameters
     */
    public List<SparkJobSqlScriptParameter> getSqlScriptingParameters() {
        return sqlScriptingParameters;
    }

    public void setSqlScriptingParameters(List<SparkJobSqlScriptParameter> sqlScriptingParameters) {
        this.sqlScriptingParameters = sqlScriptingParameters;
    }

    public ShowSparkJobArtifactResponse withSqlScriptingResultToObs(Boolean sqlScriptingResultToObs) {
        this.sqlScriptingResultToObs = sqlScriptingResultToObs;
        return this;
    }

    /**
     * **参数解释**：SQL脚本结果是否写入OBS，用于控制查询结果的输出方式。 **取值范围**： - true：结果写入OBS。 - false：结果不写入OBS。 
     * @return sqlScriptingResultToObs
     */
    public Boolean getSqlScriptingResultToObs() {
        return sqlScriptingResultToObs;
    }

    public void setSqlScriptingResultToObs(Boolean sqlScriptingResultToObs) {
        this.sqlScriptingResultToObs = sqlScriptingResultToObs;
    }

    public ShowSparkJobArtifactResponse withResult(SparkSqlScriptingResultResponse result) {
        this.result = result;
        return this;
    }

    public ShowSparkJobArtifactResponse withResult(Consumer<SparkSqlScriptingResultResponse> resultSetter) {
        if (this.result == null) {
            this.result = new SparkSqlScriptingResultResponse();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public SparkSqlScriptingResultResponse getResult() {
        return result;
    }

    public void setResult(SparkSqlScriptingResultResponse result) {
        this.result = result;
    }

    public ShowSparkJobArtifactResponse withType(TypeEnum type) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkJobArtifactResponse that = (ShowSparkJobArtifactResponse) obj;
        return Objects.equals(this.mainClass, that.mainClass) && Objects.equals(this.mainArgs, that.mainArgs)
            && Objects.equals(this.mainJar, that.mainJar) && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.dependencyArchives, that.dependencyArchives)
            && Objects.equals(this.dependencyPyFiles, that.dependencyPyFiles)
            && Objects.equals(this.mainPythonFile, that.mainPythonFile)
            && Objects.equals(this.sqlScriptingFile, that.sqlScriptingFile)
            && Objects.equals(this.sqlScriptingParameters, that.sqlScriptingParameters)
            && Objects.equals(this.sqlScriptingResultToObs, that.sqlScriptingResultToObs)
            && Objects.equals(this.result, that.result) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainClass,
            mainArgs,
            mainJar,
            dependencyJars,
            dependencyFiles,
            dependencyArchives,
            dependencyPyFiles,
            mainPythonFile,
            sqlScriptingFile,
            sqlScriptingParameters,
            sqlScriptingResultToObs,
            result,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkJobArtifactResponse {\n");
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
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
