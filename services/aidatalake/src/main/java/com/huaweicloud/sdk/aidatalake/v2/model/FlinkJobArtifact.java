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
 * Flink作业参数，根据作业类型自动选择对应的参数结构。
 */
public class FlinkJobArtifact {

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

    private FlinkPythonDependencyParameter pythonParameter;

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
    @JsonProperty(value = "sql_gateway_token")

    private String sqlGatewayToken;

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

    public FlinkJobArtifact withType(TypeEnum type) {
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

    public FlinkJobArtifact withSqlScriptFile(String sqlScriptFile) {
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

    public FlinkJobArtifact withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public FlinkJobArtifact addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public FlinkJobArtifact withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        dependencyJarsSetter.accept(this.dependencyJars);
        return this;
    }

    /**
     * **参数解释**：Python作业依赖JAR包的OBS路径列表，用于指定作业运行所需的依赖JAR包，单个路径为OBS URL格式，长度为1~512个字符，以obs://开头。 **约束限制**：依赖JAR包数量不能超过100个。
     * @return dependencyJars
     */
    public List<String> getDependencyJars() {
        return dependencyJars;
    }

    public void setDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
    }

    public FlinkJobArtifact withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public FlinkJobArtifact addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public FlinkJobArtifact withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        dependencyFilesSetter.accept(this.dependencyFiles);
        return this;
    }

    /**
     * **参数解释**：Python作业依赖文件的OBS路径列表，用于指定作业运行所需的依赖文件，单个路径为OBS URL格式，长度为1~512个字符，以obs://开头。 **约束限制**：依赖文件数量不能超过100个。
     * @return dependencyFiles
     */
    public List<String> getDependencyFiles() {
        return dependencyFiles;
    }

    public void setDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
    }

    public FlinkJobArtifact withPythonParameter(FlinkPythonDependencyParameter pythonParameter) {
        this.pythonParameter = pythonParameter;
        return this;
    }

    public FlinkJobArtifact withPythonParameter(Consumer<FlinkPythonDependencyParameter> pythonParameterSetter) {
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

    public FlinkJobArtifact withMainJar(String mainJar) {
        this.mainJar = mainJar;
        return this;
    }

    /**
     * **参数解释**：JAR作业主类所在JAR包的OBS路径，用于指定作业的入口JAR包。 **约束限制**：不涉及。 **取值范围**：长度为1~512个字符，以obs://开头。 **默认取值**：不涉及。
     * @return mainJar
     */
    public String getMainJar() {
        return mainJar;
    }

    public void setMainJar(String mainJar) {
        this.mainJar = mainJar;
    }

    public FlinkJobArtifact withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * **参数解释**：JAR作业入口类全限定名，用于指定作业的入口类。当主程序包manifest中已指定主类时可省略。 **约束限制**：不涉及。 **取值范围**：长度为1~512个字符，字符组成不限制。 **默认取值**：不涉及。
     * @return mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public FlinkJobArtifact withMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }

    public FlinkJobArtifact addMainArgsItem(String mainArgsItem) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        this.mainArgs.add(mainArgsItem);
        return this;
    }

    public FlinkJobArtifact withMainArgs(Consumer<List<String>> mainArgsSetter) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        mainArgsSetter.accept(this.mainArgs);
        return this;
    }

    /**
     * **参数解释**：Python作业入口参数，多个参数之间空格分隔。 **约束限制**：参数数量不能超过100个。
     * @return mainArgs
     */
    public List<String> getMainArgs() {
        return mainArgs;
    }

    public void setMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
    }

    public FlinkJobArtifact withSqlGatewayToken(String sqlGatewayToken) {
        this.sqlGatewayToken = sqlGatewayToken;
        return this;
    }

    /**
     * **参数解释**：用户自定义的SQL Gateway访问鉴权Token，调用方通过HTTP请求头 Authorization: Bearer {token} 携带。 **约束限制**：不涉及。 **取值范围**：长度为1~256个字符。 **默认取值**：不涉及。
     * @return sqlGatewayToken
     */
    public String getSqlGatewayToken() {
        return sqlGatewayToken;
    }

    public void setSqlGatewayToken(String sqlGatewayToken) {
        this.sqlGatewayToken = sqlGatewayToken;
    }

    public FlinkJobArtifact withIdleEnabled(Boolean idleEnabled) {
        this.idleEnabled = idleEnabled;
        return this;
    }

    /**
     * **参数解释**：是否开启空闲自动释放。 **约束限制**：不涉及。 **取值范围**：   - true：开启空闲自动释放。   - false：关闭空闲自动释放。 **默认取值**：false。
     * @return idleEnabled
     */
    public Boolean getIdleEnabled() {
        return idleEnabled;
    }

    public void setIdleEnabled(Boolean idleEnabled) {
        this.idleEnabled = idleEnabled;
    }

    public FlinkJobArtifact withIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }

    /**
     * **参数解释**：最大空闲时长，单位为分钟，用于指定SQL Gateway空闲多长时间后自动停止。空闲指会话内没有正在运行的作业，创建会话等其他操作不计为非空闲。 **约束限制**：不涉及。 **取值范围**：10~1440。 **默认取值**：30。
     * minimum: 10
     * maximum: 1440
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return idleTimeout;
    }

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    public FlinkJobArtifact withPythonJobFile(String pythonJobFile) {
        this.pythonJobFile = pythonJobFile;
        return this;
    }

    /**
     * **参数解释**：Python作业文件的OBS路径，用于指定Python作业的入口脚本或作业包。 **约束限制**：以 .py 结尾时不允许配置 entry_module；非 .py 时必须配置 entry_module。 **取值范围**：长度为1~512个字符，以obs://开头。 **默认取值**：不涉及。
     * @return pythonJobFile
     */
    public String getPythonJobFile() {
        return pythonJobFile;
    }

    public void setPythonJobFile(String pythonJobFile) {
        this.pythonJobFile = pythonJobFile;
    }

    public FlinkJobArtifact withEntryModule(String entryModule) {
        this.entryModule = entryModule;
        return this;
    }

    /**
     * **参数解释**：Python程序入口模块名，用于指定作业包内的入口模块。 **约束限制**：python_job_file 以 .py 结尾时必须为空；非 .py 时必填。 **取值范围**：长度为1~512个字符。 **默认取值**：不涉及。
     * @return entryModule
     */
    public String getEntryModule() {
        return entryModule;
    }

    public void setEntryModule(String entryModule) {
        this.entryModule = entryModule;
    }

    public FlinkJobArtifact withPythonArchives(List<String> pythonArchives) {
        this.pythonArchives = pythonArchives;
        return this;
    }

    public FlinkJobArtifact addPythonArchivesItem(String pythonArchivesItem) {
        if (this.pythonArchives == null) {
            this.pythonArchives = new ArrayList<>();
        }
        this.pythonArchives.add(pythonArchivesItem);
        return this;
    }

    public FlinkJobArtifact withPythonArchives(Consumer<List<String>> pythonArchivesSetter) {
        if (this.pythonArchives == null) {
            this.pythonArchives = new ArrayList<>();
        }
        pythonArchivesSetter.accept(this.pythonArchives);
        return this;
    }

    /**
     * **参数解释**：Python归档文件的OBS路径列表，用于指定Python运行环境或数据文件的压缩包。 **约束限制**：归档文件数量不能超过100个。
     * @return pythonArchives
     */
    public List<String> getPythonArchives() {
        return pythonArchives;
    }

    public void setPythonArchives(List<String> pythonArchives) {
        this.pythonArchives = pythonArchives;
    }

    public FlinkJobArtifact withPythonLibraries(List<String> pythonLibraries) {
        this.pythonLibraries = pythonLibraries;
        return this;
    }

    public FlinkJobArtifact addPythonLibrariesItem(String pythonLibrariesItem) {
        if (this.pythonLibraries == null) {
            this.pythonLibraries = new ArrayList<>();
        }
        this.pythonLibraries.add(pythonLibrariesItem);
        return this;
    }

    public FlinkJobArtifact withPythonLibraries(Consumer<List<String>> pythonLibrariesSetter) {
        if (this.pythonLibraries == null) {
            this.pythonLibraries = new ArrayList<>();
        }
        pythonLibrariesSetter.accept(this.pythonLibraries);
        return this;
    }

    /**
     * **参数解释**：第三方Python依赖的OBS路径列表，用于指定Python UDF所需的依赖。 **约束限制**：依赖文件数量不能超过100个。
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
        FlinkJobArtifact that = (FlinkJobArtifact) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sqlScriptFile, that.sqlScriptFile)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.pythonParameter, that.pythonParameter) && Objects.equals(this.mainJar, that.mainJar)
            && Objects.equals(this.mainClass, that.mainClass) && Objects.equals(this.mainArgs, that.mainArgs)
            && Objects.equals(this.sqlGatewayToken, that.sqlGatewayToken)
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
            sqlGatewayToken,
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
        sb.append("class FlinkJobArtifact {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sqlScriptFile: ").append(toIndentedString(sqlScriptFile)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
        sb.append("    dependencyFiles: ").append(toIndentedString(dependencyFiles)).append("\n");
        sb.append("    pythonParameter: ").append(toIndentedString(pythonParameter)).append("\n");
        sb.append("    mainJar: ").append(toIndentedString(mainJar)).append("\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    mainArgs: ").append(toIndentedString(mainArgs)).append("\n");
        sb.append("    sqlGatewayToken: ").append(toIndentedString(sqlGatewayToken)).append("\n");
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
