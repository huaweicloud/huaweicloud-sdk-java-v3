package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskCheckParamters
 */
public class TaskCheckParamters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_id")

    private Integer checkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checker_configs")

    private List<CheckConfigInfo> checkerConfigs = null;

    public TaskCheckParamters withCheckId(Integer checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * 检查工具ID
     * @return checkId
     */
    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public TaskCheckParamters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 编译参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskCheckParamters withCheckerConfigs(List<CheckConfigInfo> checkerConfigs) {
        this.checkerConfigs = checkerConfigs;
        return this;
    }

    public TaskCheckParamters addCheckerConfigsItem(CheckConfigInfo checkerConfigsItem) {
        if (this.checkerConfigs == null) {
            this.checkerConfigs = new ArrayList<>();
        }
        this.checkerConfigs.add(checkerConfigsItem);
        return this;
    }

    public TaskCheckParamters withCheckerConfigs(Consumer<List<CheckConfigInfo>> checkerConfigsSetter) {
        if (this.checkerConfigs == null) {
            this.checkerConfigs = new ArrayList<>();
        }
        checkerConfigsSetter.accept(this.checkerConfigs);
        return this;
    }

    /**
     * 检查参数配置信息
     * @return checkerConfigs
     */
    public List<CheckConfigInfo> getCheckerConfigs() {
        return checkerConfigs;
    }

    public void setCheckerConfigs(List<CheckConfigInfo> checkerConfigs) {
        this.checkerConfigs = checkerConfigs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskCheckParamters taskCheckParamters = (TaskCheckParamters) o;
        return Objects.equals(this.checkId, taskCheckParamters.checkId)
            && Objects.equals(this.name, taskCheckParamters.name)
            && Objects.equals(this.checkerConfigs, taskCheckParamters.checkerConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkId, name, checkerConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskCheckParamters {\n");
        sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    checkerConfigs: ").append(toIndentedString(checkerConfigs)).append("\n");
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
