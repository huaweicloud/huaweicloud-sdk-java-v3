package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Python Job Config
 */
public class PythonJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_file_name")

    private String mainFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_arguments")

    private List<String> mainArguments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_packages")

    private List<String> pythonPackages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "working_dir")

    private String workingDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec")

    private String resourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_log_path")

    private String userLogPath;

    public PythonJobConfig withMainFileName(String mainFileName) {
        this.mainFileName = mainFileName;
        return this;
    }

    /**
     * Job主文件，python文件，拼接在working_dir后可以是相对路径
     * @return mainFileName
     */
    public String getMainFileName() {
        return mainFileName;
    }

    public void setMainFileName(String mainFileName) {
        this.mainFileName = mainFileName;
    }

    public PythonJobConfig withMainArguments(List<String> mainArguments) {
        this.mainArguments = mainArguments;
        return this;
    }

    public PythonJobConfig addMainArgumentsItem(String mainArgumentsItem) {
        if (this.mainArguments == null) {
            this.mainArguments = new ArrayList<>();
        }
        this.mainArguments.add(mainArgumentsItem);
        return this;
    }

    public PythonJobConfig withMainArguments(Consumer<List<String>> mainArgumentsSetter) {
        if (this.mainArguments == null) {
            this.mainArguments = new ArrayList<>();
        }
        mainArgumentsSetter.accept(this.mainArguments);
        return this;
    }

    /**
     * Python主文件的运行参数
     * @return mainArguments
     */
    public List<String> getMainArguments() {
        return mainArguments;
    }

    public void setMainArguments(List<String> mainArguments) {
        this.mainArguments = mainArguments;
    }

    public PythonJobConfig withPythonPackages(List<String> pythonPackages) {
        this.pythonPackages = pythonPackages;
        return this;
    }

    public PythonJobConfig addPythonPackagesItem(String pythonPackagesItem) {
        if (this.pythonPackages == null) {
            this.pythonPackages = new ArrayList<>();
        }
        this.pythonPackages.add(pythonPackagesItem);
        return this;
    }

    public PythonJobConfig withPythonPackages(Consumer<List<String>> pythonPackagesSetter) {
        if (this.pythonPackages == null) {
            this.pythonPackages = new ArrayList<>();
        }
        pythonPackagesSetter.accept(this.pythonPackages);
        return this;
    }

    /**
     * 依赖的python包列表
     * @return pythonPackages
     */
    public List<String> getPythonPackages() {
        return pythonPackages;
    }

    public void setPythonPackages(List<String> pythonPackages) {
        this.pythonPackages = pythonPackages;
    }

    public PythonJobConfig withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

    /**
     * 代码目录，obs目录
     * @return workingDir
     */
    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

    public PythonJobConfig withResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }

    /**
     * 资源规格
     * @return resourceSpec
     */
    public String getResourceSpec() {
        return resourceSpec;
    }

    public void setResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    public PythonJobConfig withUserLogPath(String userLogPath) {
        this.userLogPath = userLogPath;
        return this;
    }

    /**
     * 用户日志obs存储位置
     * @return userLogPath
     */
    public String getUserLogPath() {
        return userLogPath;
    }

    public void setUserLogPath(String userLogPath) {
        this.userLogPath = userLogPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PythonJobConfig that = (PythonJobConfig) obj;
        return Objects.equals(this.mainFileName, that.mainFileName)
            && Objects.equals(this.mainArguments, that.mainArguments)
            && Objects.equals(this.pythonPackages, that.pythonPackages)
            && Objects.equals(this.workingDir, that.workingDir) && Objects.equals(this.resourceSpec, that.resourceSpec)
            && Objects.equals(this.userLogPath, that.userLogPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainFileName, mainArguments, pythonPackages, workingDir, resourceSpec, userLogPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PythonJobConfig {\n");
        sb.append("    mainFileName: ").append(toIndentedString(mainFileName)).append("\n");
        sb.append("    mainArguments: ").append(toIndentedString(mainArguments)).append("\n");
        sb.append("    pythonPackages: ").append(toIndentedString(pythonPackages)).append("\n");
        sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
        sb.append("    resourceSpec: ").append(toIndentedString(resourceSpec)).append("\n");
        sb.append("    userLogPath: ").append(toIndentedString(userLogPath)).append("\n");
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
