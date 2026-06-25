package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PoolStatusScope
 */
public class PoolStatusScope {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scopeType")

    private String scopeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    public PoolStatusScope withScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }

    /**
     * 业务类型。可选值如下： - Train：训练任务 - Infer：推理任务 - Notebook：Notebook作业
     * @return scopeType
     */
    public String getScopeType() {
        return scopeType;
    }

    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

    public PoolStatusScope withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 业务状态。可选值如下： - Enabling：启动中 - Enabled：已启动 - Disabling：关闭中 - Disabled：已关闭
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolStatusScope that = (PoolStatusScope) obj;
        return Objects.equals(this.scopeType, that.scopeType) && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scopeType, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolStatusScope {\n");
        sb.append("    scopeType: ").append(toIndentedString(scopeType)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
