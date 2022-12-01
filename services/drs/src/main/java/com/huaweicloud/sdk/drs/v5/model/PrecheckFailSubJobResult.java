package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 失败子任务详情。
 */
public class PrecheckFailSubJobResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private String checkResult;

    public PrecheckFailSubJobResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 子任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PrecheckFailSubJobResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 子任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrecheckFailSubJobResult withCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * 子任务检查结果。
     * @return checkResult
     */
    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrecheckFailSubJobResult precheckFailSubJobResult = (PrecheckFailSubJobResult) o;
        return Objects.equals(this.id, precheckFailSubJobResult.id)
            && Objects.equals(this.name, precheckFailSubJobResult.name)
            && Objects.equals(this.checkResult, precheckFailSubJobResult.checkResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, checkResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrecheckFailSubJobResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
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
