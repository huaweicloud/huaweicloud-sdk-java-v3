package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckParametersRes
 */
public class CheckParametersRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_id")

    private Integer checkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checker_configs")

    private List<CheckConfigsItem> checkerConfigs = null;

    public CheckParametersRes withCheckId(Integer checkId) {
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

    public CheckParametersRes withName(String name) {
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

    public CheckParametersRes withCheckerConfigs(List<CheckConfigsItem> checkerConfigs) {
        this.checkerConfigs = checkerConfigs;
        return this;
    }

    public CheckParametersRes addCheckerConfigsItem(CheckConfigsItem checkerConfigsItem) {
        if (this.checkerConfigs == null) {
            this.checkerConfigs = new ArrayList<>();
        }
        this.checkerConfigs.add(checkerConfigsItem);
        return this;
    }

    public CheckParametersRes withCheckerConfigs(Consumer<List<CheckConfigsItem>> checkerConfigsSetter) {
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
    public List<CheckConfigsItem> getCheckerConfigs() {
        return checkerConfigs;
    }

    public void setCheckerConfigs(List<CheckConfigsItem> checkerConfigs) {
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
        CheckParametersRes checkParametersRes = (CheckParametersRes) o;
        return Objects.equals(this.checkId, checkParametersRes.checkId)
            && Objects.equals(this.name, checkParametersRes.name)
            && Objects.equals(this.checkerConfigs, checkParametersRes.checkerConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkId, name, checkerConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckParametersRes {\n");
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
