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
 * **参数解释**：Flink Python作业参数，包含Python作业的详细配置信息。
 */
public class ShowFlinkPythonParameterResponse {

    /**
     * **参数解释**：作业类型。 **约束限制**：不涉及。 **取值范围**：   - FLINK_PYTHON_JOB：Flink Python作业。 
     */
    public static final class TypeEnum {

        /**
         * Enum FLINK_PYTHON_JOB for value: "FLINK_PYTHON_JOB"
         */
        public static final TypeEnum FLINK_PYTHON_JOB = new TypeEnum("FLINK_PYTHON_JOB");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
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
    @JsonProperty(value = "python_job_file")

    private String pythonJobFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entry_module")

    private String entryModule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_args")

    private List<String> mainArgs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_jars")

    private List<String> dependencyJars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_files")

    private List<String> dependencyFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_archives")

    private List<String> pythonArchives = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_libraries")

    private List<String> pythonLibraries = null;

    public ShowFlinkPythonParameterResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：作业类型。 **约束限制**：不涉及。 **取值范围**：   - FLINK_PYTHON_JOB：Flink Python作业。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowFlinkPythonParameterResponse withPythonJobFile(String pythonJobFile) {
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

    public ShowFlinkPythonParameterResponse withEntryModule(String entryModule) {
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

    public ShowFlinkPythonParameterResponse withMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }

    public ShowFlinkPythonParameterResponse addMainArgsItem(String mainArgsItem) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        this.mainArgs.add(mainArgsItem);
        return this;
    }

    public ShowFlinkPythonParameterResponse withMainArgs(Consumer<List<String>> mainArgsSetter) {
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

    public ShowFlinkPythonParameterResponse withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public ShowFlinkPythonParameterResponse addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public ShowFlinkPythonParameterResponse withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
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

    public ShowFlinkPythonParameterResponse withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public ShowFlinkPythonParameterResponse addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public ShowFlinkPythonParameterResponse withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
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

    public ShowFlinkPythonParameterResponse withPythonArchives(List<String> pythonArchives) {
        this.pythonArchives = pythonArchives;
        return this;
    }

    public ShowFlinkPythonParameterResponse addPythonArchivesItem(String pythonArchivesItem) {
        if (this.pythonArchives == null) {
            this.pythonArchives = new ArrayList<>();
        }
        this.pythonArchives.add(pythonArchivesItem);
        return this;
    }

    public ShowFlinkPythonParameterResponse withPythonArchives(Consumer<List<String>> pythonArchivesSetter) {
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

    public ShowFlinkPythonParameterResponse withPythonLibraries(List<String> pythonLibraries) {
        this.pythonLibraries = pythonLibraries;
        return this;
    }

    public ShowFlinkPythonParameterResponse addPythonLibrariesItem(String pythonLibrariesItem) {
        if (this.pythonLibraries == null) {
            this.pythonLibraries = new ArrayList<>();
        }
        this.pythonLibraries.add(pythonLibrariesItem);
        return this;
    }

    public ShowFlinkPythonParameterResponse withPythonLibraries(Consumer<List<String>> pythonLibrariesSetter) {
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
        ShowFlinkPythonParameterResponse that = (ShowFlinkPythonParameterResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.pythonJobFile, that.pythonJobFile)
            && Objects.equals(this.entryModule, that.entryModule) && Objects.equals(this.mainArgs, that.mainArgs)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.pythonArchives, that.pythonArchives)
            && Objects.equals(this.pythonLibraries, that.pythonLibraries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            pythonJobFile,
            entryModule,
            mainArgs,
            dependencyJars,
            dependencyFiles,
            pythonArchives,
            pythonLibraries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkPythonParameterResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    pythonJobFile: ").append(toIndentedString(pythonJobFile)).append("\n");
        sb.append("    entryModule: ").append(toIndentedString(entryModule)).append("\n");
        sb.append("    mainArgs: ").append(toIndentedString(mainArgs)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
        sb.append("    dependencyFiles: ").append(toIndentedString(dependencyFiles)).append("\n");
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
