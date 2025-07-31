package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBaselineDirectoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_condition")

    private SecurityCheckTaskCondition taskCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_directory_list")

    private List<ShowBaselineDirectoryInfo> baselineDirectoryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_directory_list")

    private List<ShowPwdDirectoryInfo> pwdDirectoryList = null;

    public ShowBaselineDirectoryResponse withTaskCondition(SecurityCheckTaskCondition taskCondition) {
        this.taskCondition = taskCondition;
        return this;
    }

    public ShowBaselineDirectoryResponse withTaskCondition(Consumer<SecurityCheckTaskCondition> taskConditionSetter) {
        if (this.taskCondition == null) {
            this.taskCondition = new SecurityCheckTaskCondition();
            taskConditionSetter.accept(this.taskCondition);
        }

        return this;
    }

    /**
     * Get taskCondition
     * @return taskCondition
     */
    public SecurityCheckTaskCondition getTaskCondition() {
        return taskCondition;
    }

    public void setTaskCondition(SecurityCheckTaskCondition taskCondition) {
        this.taskCondition = taskCondition;
    }

    public ShowBaselineDirectoryResponse withBaselineDirectoryList(
        List<ShowBaselineDirectoryInfo> baselineDirectoryList) {
        this.baselineDirectoryList = baselineDirectoryList;
        return this;
    }

    public ShowBaselineDirectoryResponse addBaselineDirectoryListItem(
        ShowBaselineDirectoryInfo baselineDirectoryListItem) {
        if (this.baselineDirectoryList == null) {
            this.baselineDirectoryList = new ArrayList<>();
        }
        this.baselineDirectoryList.add(baselineDirectoryListItem);
        return this;
    }

    public ShowBaselineDirectoryResponse withBaselineDirectoryList(
        Consumer<List<ShowBaselineDirectoryInfo>> baselineDirectoryListSetter) {
        if (this.baselineDirectoryList == null) {
            this.baselineDirectoryList = new ArrayList<>();
        }
        baselineDirectoryListSetter.accept(this.baselineDirectoryList);
        return this;
    }

    /**
     * **参数解释** 基线检查策略目录
     * @return baselineDirectoryList
     */
    public List<ShowBaselineDirectoryInfo> getBaselineDirectoryList() {
        return baselineDirectoryList;
    }

    public void setBaselineDirectoryList(List<ShowBaselineDirectoryInfo> baselineDirectoryList) {
        this.baselineDirectoryList = baselineDirectoryList;
    }

    public ShowBaselineDirectoryResponse withPwdDirectoryList(List<ShowPwdDirectoryInfo> pwdDirectoryList) {
        this.pwdDirectoryList = pwdDirectoryList;
        return this;
    }

    public ShowBaselineDirectoryResponse addPwdDirectoryListItem(ShowPwdDirectoryInfo pwdDirectoryListItem) {
        if (this.pwdDirectoryList == null) {
            this.pwdDirectoryList = new ArrayList<>();
        }
        this.pwdDirectoryList.add(pwdDirectoryListItem);
        return this;
    }

    public ShowBaselineDirectoryResponse withPwdDirectoryList(
        Consumer<List<ShowPwdDirectoryInfo>> pwdDirectoryListSetter) {
        if (this.pwdDirectoryList == null) {
            this.pwdDirectoryList = new ArrayList<>();
        }
        pwdDirectoryListSetter.accept(this.pwdDirectoryList);
        return this;
    }

    /**
     * **参数解释** 基线检查策略目录
     * @return pwdDirectoryList
     */
    public List<ShowPwdDirectoryInfo> getPwdDirectoryList() {
        return pwdDirectoryList;
    }

    public void setPwdDirectoryList(List<ShowPwdDirectoryInfo> pwdDirectoryList) {
        this.pwdDirectoryList = pwdDirectoryList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBaselineDirectoryResponse that = (ShowBaselineDirectoryResponse) obj;
        return Objects.equals(this.taskCondition, that.taskCondition)
            && Objects.equals(this.baselineDirectoryList, that.baselineDirectoryList)
            && Objects.equals(this.pwdDirectoryList, that.pwdDirectoryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskCondition, baselineDirectoryList, pwdDirectoryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBaselineDirectoryResponse {\n");
        sb.append("    taskCondition: ").append(toIndentedString(taskCondition)).append("\n");
        sb.append("    baselineDirectoryList: ").append(toIndentedString(baselineDirectoryList)).append("\n");
        sb.append("    pwdDirectoryList: ").append(toIndentedString(pwdDirectoryList)).append("\n");
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
