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
 * Flink作业参数响应，根据作业类型自动选择对应的参数结构。
 */
public class ShowFlinkJobArtifactResponse {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum FLINK_SQL_JOB for value: "FLINK_SQL_JOB"
         */
        public static final TypeEnum FLINK_SQL_JOB = new TypeEnum("FLINK_SQL_JOB");

        /**
         * Enum FLINK_JAR_JOB for value: "FLINK_JAR_JOB"
         */
        public static final TypeEnum FLINK_JAR_JOB = new TypeEnum("FLINK_JAR_JOB");

        /**
         * Enum FLINK_SQL_GATEWAY for value: "FLINK_SQL_GATEWAY"
         */
        public static final TypeEnum FLINK_SQL_GATEWAY = new TypeEnum("FLINK_SQL_GATEWAY");

        /**
         * Enum FLINK_PYTHON_JOB for value: "FLINK_PYTHON_JOB"
         */
        public static final TypeEnum FLINK_PYTHON_JOB = new TypeEnum("FLINK_PYTHON_JOB");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("FLINK_SQL_JOB", FLINK_SQL_JOB);
            map.put("FLINK_JAR_JOB", FLINK_JAR_JOB);
            map.put("FLINK_SQL_GATEWAY", FLINK_SQL_GATEWAY);
            map.put("FLINK_PYTHON_JOB", FLINK_PYTHON_JOB);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_jar")

    private String mainJar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_class")

    private String mainClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_args")

    private List<String> mainArgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_gateway_config")

    private ShowFlinkSqlGatewayConfigResponseBody sqlGatewayConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_enabled")

    private Boolean idleEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_timeout")

    private Integer idleTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_job_file")

    private String pythonJobFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entry_module")

    private String entryModule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_archives")

    private List<String> pythonArchives = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_libraries")

    private List<String> pythonLibraries = null;

    public ShowFlinkJobArtifactResponse withType(TypeEnum type) {
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

    public ShowFlinkJobArtifactResponse withSqlScriptFile(String sqlScriptFile) {
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

    public ShowFlinkJobArtifactResponse withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public ShowFlinkJobArtifactResponse addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public ShowFlinkJobArtifactResponse withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        dependencyJarsSetter.accept(this.dependencyJars);
        return this;
    }

    /**
     * **参数解释**：Python作业依赖的第三方Java JAR包OBS路径列表。
     * @return dependencyJars
     */
    public List<String> getDependencyJars() {
        return dependencyJars;
    }

    public void setDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
    }

    public ShowFlinkJobArtifactResponse withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public ShowFlinkJobArtifactResponse addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public ShowFlinkJobArtifactResponse withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        dependencyFilesSetter.accept(this.dependencyFiles);
        return this;
    }

    /**
     * **参数解释**：Python作业附加依赖文件的OBS路径列表。
     * @return dependencyFiles
     */
    public List<String> getDependencyFiles() {
        return dependencyFiles;
    }

    public void setDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
    }

    public ShowFlinkJobArtifactResponse withPythonParameter(
        ShowFlinkPythonDependencyParameterResponse pythonParameter) {
        this.pythonParameter = pythonParameter;
        return this;
    }

    public ShowFlinkJobArtifactResponse withPythonParameter(
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

    public ShowFlinkJobArtifactResponse withMainJar(String mainJar) {
        this.mainJar = mainJar;
        return this;
    }

    /**
     * **参数解释**：JAR作业主类所在JAR包的OBS路径，用于指定作业的入口JAR包。 **取值范围**：长度为1~512个字符，以obs://开头。
     * @return mainJar
     */
    public String getMainJar() {
        return mainJar;
    }

    public void setMainJar(String mainJar) {
        this.mainJar = mainJar;
    }

    public ShowFlinkJobArtifactResponse withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * **参数解释**：JAR作业入口类名称，用于指定作业的入口类。 **取值范围**：长度不超过512个字符。
     * @return mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public ShowFlinkJobArtifactResponse withMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }

    public ShowFlinkJobArtifactResponse addMainArgsItem(String mainArgsItem) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        this.mainArgs.add(mainArgsItem);
        return this;
    }

    public ShowFlinkJobArtifactResponse withMainArgs(Consumer<List<String>> mainArgsSetter) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        mainArgsSetter.accept(this.mainArgs);
        return this;
    }

    /**
     * **参数解释**：Python作业入口参数，用于传递运行参数。
     * @return mainArgs
     */
    public List<String> getMainArgs() {
        return mainArgs;
    }

    public void setMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
    }

    public ShowFlinkJobArtifactResponse withSqlGatewayConfig(ShowFlinkSqlGatewayConfigResponseBody sqlGatewayConfig) {
        this.sqlGatewayConfig = sqlGatewayConfig;
        return this;
    }

    public ShowFlinkJobArtifactResponse withSqlGatewayConfig(
        Consumer<ShowFlinkSqlGatewayConfigResponseBody> sqlGatewayConfigSetter) {
        if (this.sqlGatewayConfig == null) {
            this.sqlGatewayConfig = new ShowFlinkSqlGatewayConfigResponseBody();
            sqlGatewayConfigSetter.accept(this.sqlGatewayConfig);
        }

        return this;
    }

    /**
     * Get sqlGatewayConfig
     * @return sqlGatewayConfig
     */
    public ShowFlinkSqlGatewayConfigResponseBody getSqlGatewayConfig() {
        return sqlGatewayConfig;
    }

    public void setSqlGatewayConfig(ShowFlinkSqlGatewayConfigResponseBody sqlGatewayConfig) {
        this.sqlGatewayConfig = sqlGatewayConfig;
    }

    public ShowFlinkJobArtifactResponse withIdleEnabled(Boolean idleEnabled) {
        this.idleEnabled = idleEnabled;
        return this;
    }

    /**
     * **参数解释**：是否开启空闲自动释放。 **取值范围**：   - true：开启空闲自动释放。   - false：关闭空闲自动释放。
     * @return idleEnabled
     */
    public Boolean getIdleEnabled() {
        return idleEnabled;
    }

    public void setIdleEnabled(Boolean idleEnabled) {
        this.idleEnabled = idleEnabled;
    }

    public ShowFlinkJobArtifactResponse withIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }

    /**
     * **参数解释**：最大空闲时长，单位为分钟。空闲指会话内没有正在运行的作业，创建会话等其他操作不计为非空闲。 **取值范围**：10~1440。
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    public ShowFlinkJobArtifactResponse withPythonJobFile(String pythonJobFile) {
        this.pythonJobFile = pythonJobFile;
        return this;
    }

    /**
     * **参数解释**：Python作业文件的OBS路径，用于指定Python作业的入口脚本或作业包。 **取值范围**：长度为1~512个字符，以obs://开头。
     * @return pythonJobFile
     */
    public String getPythonJobFile() {
        return pythonJobFile;
    }

    public void setPythonJobFile(String pythonJobFile) {
        this.pythonJobFile = pythonJobFile;
    }

    public ShowFlinkJobArtifactResponse withEntryModule(String entryModule) {
        this.entryModule = entryModule;
        return this;
    }

    /**
     * **参数解释**：Python程序入口模块名，用于指定作业包内的入口模块。 **取值范围**：长度为1~512个字符。
     * @return entryModule
     */
    public String getEntryModule() {
        return entryModule;
    }

    public void setEntryModule(String entryModule) {
        this.entryModule = entryModule;
    }

    public ShowFlinkJobArtifactResponse withPythonArchives(List<String> pythonArchives) {
        this.pythonArchives = pythonArchives;
        return this;
    }

    public ShowFlinkJobArtifactResponse addPythonArchivesItem(String pythonArchivesItem) {
        if (this.pythonArchives == null) {
            this.pythonArchives = new ArrayList<>();
        }
        this.pythonArchives.add(pythonArchivesItem);
        return this;
    }

    public ShowFlinkJobArtifactResponse withPythonArchives(Consumer<List<String>> pythonArchivesSetter) {
        if (this.pythonArchives == null) {
            this.pythonArchives = new ArrayList<>();
        }
        pythonArchivesSetter.accept(this.pythonArchives);
        return this;
    }

    /**
     * **参数解释**：Python归档文件的OBS路径列表，用于指定Python运行环境或数据文件的压缩包。
     * @return pythonArchives
     */
    public List<String> getPythonArchives() {
        return pythonArchives;
    }

    public void setPythonArchives(List<String> pythonArchives) {
        this.pythonArchives = pythonArchives;
    }

    public ShowFlinkJobArtifactResponse withPythonLibraries(List<String> pythonLibraries) {
        this.pythonLibraries = pythonLibraries;
        return this;
    }

    public ShowFlinkJobArtifactResponse addPythonLibrariesItem(String pythonLibrariesItem) {
        if (this.pythonLibraries == null) {
            this.pythonLibraries = new ArrayList<>();
        }
        this.pythonLibraries.add(pythonLibrariesItem);
        return this;
    }

    public ShowFlinkJobArtifactResponse withPythonLibraries(Consumer<List<String>> pythonLibrariesSetter) {
        if (this.pythonLibraries == null) {
            this.pythonLibraries = new ArrayList<>();
        }
        pythonLibrariesSetter.accept(this.pythonLibraries);
        return this;
    }

    /**
     * **参数解释**：第三方Python依赖的OBS路径列表，用于指定Python UDF所需的依赖。
     * @return pythonLibraries
     */
    public List<String> getPythonLibraries() {
        return pythonLibraries;
    }

    public void setPythonLibraries(List<String> pythonLibraries) {
        this.pythonLibraries = pythonLibraries;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlinkJobArtifactResponse that = (ShowFlinkJobArtifactResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sqlScriptFile, that.sqlScriptFile)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.pythonParameter, that.pythonParameter) && Objects.equals(this.mainJar, that.mainJar)
            && Objects.equals(this.mainClass, that.mainClass) && Objects.equals(this.mainArgs, that.mainArgs)
            && Objects.equals(this.sqlGatewayConfig, that.sqlGatewayConfig)
            && Objects.equals(this.idleEnabled, that.idleEnabled) && Objects.equals(this.idleTimeout, that.idleTimeout)
            && Objects.equals(this.pythonJobFile, that.pythonJobFile)
            && Objects.equals(this.entryModule, that.entryModule)
            && Objects.equals(this.pythonArchives, that.pythonArchives)
            && Objects.equals(this.pythonLibraries, that.pythonLibraries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            sqlScriptFile,
            dependencyJars,
            dependencyFiles,
            pythonParameter,
            mainJar,
            mainClass,
            mainArgs,
            sqlGatewayConfig,
            idleEnabled,
            idleTimeout,
            pythonJobFile,
            entryModule,
            pythonArchives,
            pythonLibraries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkJobArtifactResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sqlScriptFile: ").append(toIndentedString(sqlScriptFile)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
        sb.append("    dependencyFiles: ").append(toIndentedString(dependencyFiles)).append("\n");
        sb.append("    pythonParameter: ").append(toIndentedString(pythonParameter)).append("\n");
        sb.append("    mainJar: ").append(toIndentedString(mainJar)).append("\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    mainArgs: ").append(toIndentedString(mainArgs)).append("\n");
        sb.append("    sqlGatewayConfig: ").append(toIndentedString(sqlGatewayConfig)).append("\n");
        sb.append("    idleEnabled: ").append(toIndentedString(idleEnabled)).append("\n");
        sb.append("    idleTimeout: ").append(toIndentedString(idleTimeout)).append("\n");
        sb.append("    pythonJobFile: ").append(toIndentedString(pythonJobFile)).append("\n");
        sb.append("    entryModule: ").append(toIndentedString(entryModule)).append("\n");
        sb.append("    pythonArchives: ").append(toIndentedString(pythonArchives)).append("\n");
        sb.append("    pythonLibraries: ").append(toIndentedString(pythonLibraries)).append("\n");
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
