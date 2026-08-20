package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Spark Python作业参数，用于配置Python Spark作业的执行参数和依赖资源。 
 */
public class ShowSparkPyParameterResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_python_file")

    private String mainPythonFile;

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
    @JsonProperty(value = "dependency_archives")

    private List<String> dependencyArchives = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_py_files")

    private List<String> dependencyPyFiles = null;

    public ShowSparkPyParameterResponse withMainPythonFile(String mainPythonFile) {
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

    public ShowSparkPyParameterResponse withMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }

    public ShowSparkPyParameterResponse addMainArgsItem(String mainArgsItem) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        this.mainArgs.add(mainArgsItem);
        return this;
    }

    public ShowSparkPyParameterResponse withMainArgs(Consumer<List<String>> mainArgsSetter) {
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

    public ShowSparkPyParameterResponse withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public ShowSparkPyParameterResponse addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public ShowSparkPyParameterResponse withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
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

    public ShowSparkPyParameterResponse withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public ShowSparkPyParameterResponse addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public ShowSparkPyParameterResponse withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
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

    public ShowSparkPyParameterResponse withDependencyArchives(List<String> dependencyArchives) {
        this.dependencyArchives = dependencyArchives;
        return this;
    }

    public ShowSparkPyParameterResponse addDependencyArchivesItem(String dependencyArchivesItem) {
        if (this.dependencyArchives == null) {
            this.dependencyArchives = new ArrayList<>();
        }
        this.dependencyArchives.add(dependencyArchivesItem);
        return this;
    }

    public ShowSparkPyParameterResponse withDependencyArchives(Consumer<List<String>> dependencyArchivesSetter) {
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

    public ShowSparkPyParameterResponse withDependencyPyFiles(List<String> dependencyPyFiles) {
        this.dependencyPyFiles = dependencyPyFiles;
        return this;
    }

    public ShowSparkPyParameterResponse addDependencyPyFilesItem(String dependencyPyFilesItem) {
        if (this.dependencyPyFiles == null) {
            this.dependencyPyFiles = new ArrayList<>();
        }
        this.dependencyPyFiles.add(dependencyPyFilesItem);
        return this;
    }

    public ShowSparkPyParameterResponse withDependencyPyFiles(Consumer<List<String>> dependencyPyFilesSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkPyParameterResponse that = (ShowSparkPyParameterResponse) obj;
        return Objects.equals(this.mainPythonFile, that.mainPythonFile) && Objects.equals(this.mainArgs, that.mainArgs)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.dependencyArchives, that.dependencyArchives)
            && Objects.equals(this.dependencyPyFiles, that.dependencyPyFiles);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(mainPythonFile, mainArgs, dependencyJars, dependencyFiles, dependencyArchives, dependencyPyFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkPyParameterResponse {\n");
        sb.append("    mainPythonFile: ").append(toIndentedString(mainPythonFile)).append("\n");
        sb.append("    mainArgs: ").append(toIndentedString(mainArgs)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
        sb.append("    dependencyFiles: ").append(toIndentedString(dependencyFiles)).append("\n");
        sb.append("    dependencyArchives: ").append(toIndentedString(dependencyArchives)).append("\n");
        sb.append("    dependencyPyFiles: ").append(toIndentedString(dependencyPyFiles)).append("\n");
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
