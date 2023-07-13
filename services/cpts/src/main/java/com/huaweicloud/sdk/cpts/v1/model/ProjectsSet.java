package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProjectsSet
 */
public class ProjectsSet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CreateTime")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "UpdateTime")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private Integer source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_params")

    private Object externalParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables_no_file")

    private List<String> variablesNoFile = null;

    public ProjectsSet withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ProjectsSet withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ProjectsSet withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectsSet withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 工程id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProjectsSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工程名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectsSet withSource(Integer source) {
        this.source = source;
        return this;
    }

    /**
     * 工程来源 0：PerfTest，2：CloudTest
     * minimum: 0
     * maximum: 2147483647
     * @return source
     */
    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public ProjectsSet withExternalParams(Object externalParams) {
        this.externalParams = externalParams;
        return this;
    }

    /**
     * 外部参数
     * @return externalParams
     */
    public Object getExternalParams() {
        return externalParams;
    }

    public void setExternalParams(Object externalParams) {
        this.externalParams = externalParams;
    }

    public ProjectsSet withVariablesNoFile(List<String> variablesNoFile) {
        this.variablesNoFile = variablesNoFile;
        return this;
    }

    public ProjectsSet addVariablesNoFileItem(String variablesNoFileItem) {
        if (this.variablesNoFile == null) {
            this.variablesNoFile = new ArrayList<>();
        }
        this.variablesNoFile.add(variablesNoFileItem);
        return this;
    }

    public ProjectsSet withVariablesNoFile(Consumer<List<String>> variablesNoFileSetter) {
        if (this.variablesNoFile == null) {
            this.variablesNoFile = new ArrayList<>();
        }
        variablesNoFileSetter.accept(this.variablesNoFile);
        return this;
    }

    /**
     * 文件变量
     * @return variablesNoFile
     */
    public List<String> getVariablesNoFile() {
        return variablesNoFile;
    }

    public void setVariablesNoFile(List<String> variablesNoFile) {
        this.variablesNoFile = variablesNoFile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectsSet that = (ProjectsSet) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.source, that.source)
            && Objects.equals(this.externalParams, that.externalParams)
            && Objects.equals(this.variablesNoFile, that.variablesNoFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, updateTime, description, id, name, source, externalParams, variablesNoFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsSet {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    externalParams: ").append(toIndentedString(externalParams)).append("\n");
        sb.append("    variablesNoFile: ").append(toIndentedString(variablesNoFile)).append("\n");
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
