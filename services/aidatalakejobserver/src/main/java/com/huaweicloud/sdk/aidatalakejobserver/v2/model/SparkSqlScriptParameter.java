package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Spark SQL脚本作业参数，用于配置SQL脚本作业的执行参数和依赖资源。 **约束限制**：不涉及。 
 */
public class SparkSqlScriptParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

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

    public SparkSqlScriptParameter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：作业类型。 **约束限制**：固定值为 spark_sql_scripting_job。 **取值范围**：不涉及。 **默认取值**：spark_sql_scripting_job。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SparkSqlScriptParameter withSqlScriptingFile(String sqlScriptingFile) {
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

    public SparkSqlScriptParameter withSqlScriptingParameters(List<SparkJobSqlScriptParameter> sqlScriptingParameters) {
        this.sqlScriptingParameters = sqlScriptingParameters;
        return this;
    }

    public SparkSqlScriptParameter addSqlScriptingParametersItem(
        SparkJobSqlScriptParameter sqlScriptingParametersItem) {
        if (this.sqlScriptingParameters == null) {
            this.sqlScriptingParameters = new ArrayList<>();
        }
        this.sqlScriptingParameters.add(sqlScriptingParametersItem);
        return this;
    }

    public SparkSqlScriptParameter withSqlScriptingParameters(
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

    public SparkSqlScriptParameter withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public SparkSqlScriptParameter addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public SparkSqlScriptParameter withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
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

    public SparkSqlScriptParameter withSqlScriptingResultToObs(Boolean sqlScriptingResultToObs) {
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
        SparkSqlScriptParameter that = (SparkSqlScriptParameter) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sqlScriptingFile, that.sqlScriptingFile)
            && Objects.equals(this.sqlScriptingParameters, that.sqlScriptingParameters)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.sqlScriptingResultToObs, that.sqlScriptingResultToObs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sqlScriptingFile, sqlScriptingParameters, dependencyJars, sqlScriptingResultToObs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSqlScriptParameter {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sqlScriptingFile: ").append(toIndentedString(sqlScriptingFile)).append("\n");
        sb.append("    sqlScriptingParameters: ").append(toIndentedString(sqlScriptingParameters)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
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
