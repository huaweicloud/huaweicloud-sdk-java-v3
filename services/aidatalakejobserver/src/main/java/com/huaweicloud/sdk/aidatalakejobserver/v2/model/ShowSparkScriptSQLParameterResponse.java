package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Spark Script SQL作业参数，用于配置SQL脚本作业的执行参数和依赖资源。 
 */
public class ShowSparkScriptSQLParameterResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_scripting_file")

    private String sqlScriptingFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_scripting_parameters")

    private List<SparkJobSqlScriptParameter> sqlScriptingParameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_jars")

    private List<String> dependencyJars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_scripting_result_to_obs")

    private Boolean sqlScriptingResultToObs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private SparkSqlScriptingResultResponse result;

    public ShowSparkScriptSQLParameterResponse withSqlScriptingFile(String sqlScriptingFile) {
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

    public ShowSparkScriptSQLParameterResponse withSqlScriptingParameters(
        List<SparkJobSqlScriptParameter> sqlScriptingParameters) {
        this.sqlScriptingParameters = sqlScriptingParameters;
        return this;
    }

    public ShowSparkScriptSQLParameterResponse addSqlScriptingParametersItem(
        SparkJobSqlScriptParameter sqlScriptingParametersItem) {
        if (this.sqlScriptingParameters == null) {
            this.sqlScriptingParameters = new ArrayList<>();
        }
        this.sqlScriptingParameters.add(sqlScriptingParametersItem);
        return this;
    }

    public ShowSparkScriptSQLParameterResponse withSqlScriptingParameters(
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

    public ShowSparkScriptSQLParameterResponse withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public ShowSparkScriptSQLParameterResponse addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public ShowSparkScriptSQLParameterResponse withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
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

    public ShowSparkScriptSQLParameterResponse withSqlScriptingResultToObs(Boolean sqlScriptingResultToObs) {
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

    public ShowSparkScriptSQLParameterResponse withResult(SparkSqlScriptingResultResponse result) {
        this.result = result;
        return this;
    }

    public ShowSparkScriptSQLParameterResponse withResult(Consumer<SparkSqlScriptingResultResponse> resultSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkScriptSQLParameterResponse that = (ShowSparkScriptSQLParameterResponse) obj;
        return Objects.equals(this.sqlScriptingFile, that.sqlScriptingFile)
            && Objects.equals(this.sqlScriptingParameters, that.sqlScriptingParameters)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.sqlScriptingResultToObs, that.sqlScriptingResultToObs)
            && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlScriptingFile, sqlScriptingParameters, dependencyJars, sqlScriptingResultToObs, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkScriptSQLParameterResponse {\n");
        sb.append("    sqlScriptingFile: ").append(toIndentedString(sqlScriptingFile)).append("\n");
        sb.append("    sqlScriptingParameters: ").append(toIndentedString(sqlScriptingParameters)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
        sb.append("    sqlScriptingResultToObs: ").append(toIndentedString(sqlScriptingResultToObs)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
