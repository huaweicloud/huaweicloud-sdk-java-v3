package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户用例执行信息
 */
public class ExternalUserExecuteInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private NameAndIdVo executor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_count")

    private Integer executeCount;

    public ExternalUserExecuteInfo withExecutor(NameAndIdVo executor) {
        this.executor = executor;
        return this;
    }

    public ExternalUserExecuteInfo withExecutor(Consumer<NameAndIdVo> executorSetter) {
        if (this.executor == null) {
            this.executor = new NameAndIdVo();
            executorSetter.accept(this.executor);
        }

        return this;
    }

    /**
     * Get executor
     * @return executor
     */
    public NameAndIdVo getExecutor() {
        return executor;
    }

    public void setExecutor(NameAndIdVo executor) {
        this.executor = executor;
    }

    public ExternalUserExecuteInfo withExecuteCount(Integer executeCount) {
        this.executeCount = executeCount;
        return this;
    }

    /**
     * 执行用例数
     * @return executeCount
     */
    public Integer getExecuteCount() {
        return executeCount;
    }

    public void setExecuteCount(Integer executeCount) {
        this.executeCount = executeCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalUserExecuteInfo that = (ExternalUserExecuteInfo) obj;
        return Objects.equals(this.executor, that.executor) && Objects.equals(this.executeCount, that.executeCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executor, executeCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalUserExecuteInfo {\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    executeCount: ").append(toIndentedString(executeCount)).append("\n");
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
