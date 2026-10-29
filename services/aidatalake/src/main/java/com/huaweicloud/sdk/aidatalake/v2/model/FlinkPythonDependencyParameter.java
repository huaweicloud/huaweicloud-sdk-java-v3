package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：JAR/SQL 作业的 Python UDF 依赖。 **约束限制**：不涉及。
 */
public class FlinkPythonDependencyParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_archives")

    private List<String> pythonArchives = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "python_libraries")

    private List<String> pythonLibraries = null;

    public FlinkPythonDependencyParameter withPythonArchives(List<String> pythonArchives) {
        this.pythonArchives = pythonArchives;
        return this;
    }

    public FlinkPythonDependencyParameter addPythonArchivesItem(String pythonArchivesItem) {
        if (this.pythonArchives == null) {
            this.pythonArchives = new ArrayList<>();
        }
        this.pythonArchives.add(pythonArchivesItem);
        return this;
    }

    public FlinkPythonDependencyParameter withPythonArchives(Consumer<List<String>> pythonArchivesSetter) {
        if (this.pythonArchives == null) {
            this.pythonArchives = new ArrayList<>();
        }
        pythonArchivesSetter.accept(this.pythonArchives);
        return this;
    }

    /**
     * **参数解释**：Python归档文件的OBS路径列表，用于指定Python运行环境或数据文件的压缩包。 **约束限制**：归档文件数量不能超过100个。单个路径为OBS URL格式，长度为1~512个字符，以obs://开头。
     * @return pythonArchives
     */
    public List<String> getPythonArchives() {
        return pythonArchives;
    }

    public void setPythonArchives(List<String> pythonArchives) {
        this.pythonArchives = pythonArchives;
    }

    public FlinkPythonDependencyParameter withPythonLibraries(List<String> pythonLibraries) {
        this.pythonLibraries = pythonLibraries;
        return this;
    }

    public FlinkPythonDependencyParameter addPythonLibrariesItem(String pythonLibrariesItem) {
        if (this.pythonLibraries == null) {
            this.pythonLibraries = new ArrayList<>();
        }
        this.pythonLibraries.add(pythonLibrariesItem);
        return this;
    }

    public FlinkPythonDependencyParameter withPythonLibraries(Consumer<List<String>> pythonLibrariesSetter) {
        if (this.pythonLibraries == null) {
            this.pythonLibraries = new ArrayList<>();
        }
        pythonLibrariesSetter.accept(this.pythonLibraries);
        return this;
    }

    /**
     * **参数解释**：第三方Python依赖的OBS路径列表，用于指定Python UDF所需的依赖。 **约束限制**：依赖文件数量不能超过100个。单个路径为OBS URL格式，长度为1~512个字符，以obs://开头。
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
        FlinkPythonDependencyParameter that = (FlinkPythonDependencyParameter) obj;
        return Objects.equals(this.pythonArchives, that.pythonArchives)
            && Objects.equals(this.pythonLibraries, that.pythonLibraries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pythonArchives, pythonLibraries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkPythonDependencyParameter {\n");
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
