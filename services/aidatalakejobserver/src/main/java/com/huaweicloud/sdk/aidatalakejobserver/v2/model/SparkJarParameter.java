package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Spark Jar作业参数，用于配置Spark Jar作业的执行参数和依赖资源。 **约束限制**：不涉及。 
 */
public class SparkJarParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

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

    public SparkJarParameter withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：作业类型。 **约束限制**：固定值为 spark_jar_job。 **取值范围**：不涉及。 **默认取值**：spark_jar_job。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SparkJarParameter withMainClass(String mainClass) {
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

    public SparkJarParameter withMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
        return this;
    }

    public SparkJarParameter addMainArgsItem(String mainArgsItem) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        this.mainArgs.add(mainArgsItem);
        return this;
    }

    public SparkJarParameter withMainArgs(Consumer<List<String>> mainArgsSetter) {
        if (this.mainArgs == null) {
            this.mainArgs = new ArrayList<>();
        }
        mainArgsSetter.accept(this.mainArgs);
        return this;
    }

    /**
     * **参数解释**：主类参数列表，用于传递给Spark Jar作业入口类的参数。多个参数之间空格分隔。 **约束限制**：参数数量不能超过100个。 
     * @return mainArgs
     */
    public List<String> getMainArgs() {
        return mainArgs;
    }

    public void setMainArgs(List<String> mainArgs) {
        this.mainArgs = mainArgs;
    }

    public SparkJarParameter withMainJar(String mainJar) {
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

    public SparkJarParameter withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public SparkJarParameter addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public SparkJarParameter withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
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

    public SparkJarParameter withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public SparkJarParameter addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public SparkJarParameter withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
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

    public SparkJarParameter withDependencyArchives(List<String> dependencyArchives) {
        this.dependencyArchives = dependencyArchives;
        return this;
    }

    public SparkJarParameter addDependencyArchivesItem(String dependencyArchivesItem) {
        if (this.dependencyArchives == null) {
            this.dependencyArchives = new ArrayList<>();
        }
        this.dependencyArchives.add(dependencyArchivesItem);
        return this;
    }

    public SparkJarParameter withDependencyArchives(Consumer<List<String>> dependencyArchivesSetter) {
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

    public SparkJarParameter withDependencyPyFiles(List<String> dependencyPyFiles) {
        this.dependencyPyFiles = dependencyPyFiles;
        return this;
    }

    public SparkJarParameter addDependencyPyFilesItem(String dependencyPyFilesItem) {
        if (this.dependencyPyFiles == null) {
            this.dependencyPyFiles = new ArrayList<>();
        }
        this.dependencyPyFiles.add(dependencyPyFilesItem);
        return this;
    }

    public SparkJarParameter withDependencyPyFiles(Consumer<List<String>> dependencyPyFilesSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkJarParameter that = (SparkJarParameter) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.mainClass, that.mainClass)
            && Objects.equals(this.mainArgs, that.mainArgs) && Objects.equals(this.mainJar, that.mainJar)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.dependencyArchives, that.dependencyArchives)
            && Objects.equals(this.dependencyPyFiles, that.dependencyPyFiles);
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
            dependencyPyFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkJarParameter {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
