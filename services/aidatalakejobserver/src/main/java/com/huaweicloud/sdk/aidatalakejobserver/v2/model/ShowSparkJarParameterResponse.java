package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Spark Jar作业参数，用于配置Jar作业的执行参数和依赖资源。 
 */
public class ShowSparkJarParameterResponse {

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

    public ShowSparkJarParameterResponse withMainClass(String mainClass) {
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

    public ShowSparkJarParameterResponse withMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }

    public ShowSparkJarParameterResponse addMainArgsItem(String mainArgsItem) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        this.mainArgs.add(mainArgsItem);
        return this;
    }

    public ShowSparkJarParameterResponse withMainArgs(Consumer<List<String>> mainArgsSetter) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        mainArgsSetter.accept(this.mainArgs);
        return this;
    }

    /**
     * **参数解释**：Spark Jar作业入口类参数列表，用于传递作业执行参数。 
     * @return mainArgs
     */
    public List<String> getMainArgs() {
        return mainArgs;
    }

    public void setMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
    }

    public ShowSparkJarParameterResponse withMainJar(String mainJar) {
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

    public ShowSparkJarParameterResponse withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public ShowSparkJarParameterResponse addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public ShowSparkJarParameterResponse withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
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

    public ShowSparkJarParameterResponse withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public ShowSparkJarParameterResponse addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public ShowSparkJarParameterResponse withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
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

    public ShowSparkJarParameterResponse withDependencyArchives(List<String> dependencyArchives) {
        this.dependencyArchives = dependencyArchives;
        return this;
    }

    public ShowSparkJarParameterResponse addDependencyArchivesItem(String dependencyArchivesItem) {
        if (this.dependencyArchives == null) {
            this.dependencyArchives = new ArrayList<>();
        }
        this.dependencyArchives.add(dependencyArchivesItem);
        return this;
    }

    public ShowSparkJarParameterResponse withDependencyArchives(Consumer<List<String>> dependencyArchivesSetter) {
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

    public ShowSparkJarParameterResponse withDependencyPyFiles(List<String> dependencyPyFiles) {
        this.dependencyPyFiles = dependencyPyFiles;
        return this;
    }

    public ShowSparkJarParameterResponse addDependencyPyFilesItem(String dependencyPyFilesItem) {
        if (this.dependencyPyFiles == null) {
            this.dependencyPyFiles = new ArrayList<>();
        }
        this.dependencyPyFiles.add(dependencyPyFilesItem);
        return this;
    }

    public ShowSparkJarParameterResponse withDependencyPyFiles(Consumer<List<String>> dependencyPyFilesSetter) {
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
        ShowSparkJarParameterResponse that = (ShowSparkJarParameterResponse) obj;
        return Objects.equals(this.mainClass, that.mainClass) && Objects.equals(this.mainArgs, that.mainArgs)
            && Objects.equals(this.mainJar, that.mainJar) && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.dependencyArchives, that.dependencyArchives)
            && Objects.equals(this.dependencyPyFiles, that.dependencyPyFiles);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(mainClass, mainArgs, mainJar, dependencyJars, dependencyFiles, dependencyArchives, dependencyPyFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkJarParameterResponse {\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    mainArgs: ").append(toIndentedString(mainArgs)).append("\n");
        sb.append("    mainJar: ").append(toIndentedString(mainJar)).append("\n");
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
