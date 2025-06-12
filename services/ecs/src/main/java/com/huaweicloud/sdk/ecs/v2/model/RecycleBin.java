package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RecycleBin
 */
public class RecycleBin {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch")

    private String _switch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private RecycleBinPolicys policy;

    public RecycleBin withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户project_id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RecycleBin withSwitch(String _switch) {
        this._switch = _switch;
        return this;
    }

    /**
     * 回收站配置开关
     * @return _switch
     */
    public String getSwitch() {
        return _switch;
    }

    public void setSwitch(String _switch) {
        this._switch = _switch;
    }

    public RecycleBin withPolicy(RecycleBinPolicys policy) {
        this.policy = policy;
        return this;
    }

    public RecycleBin withPolicy(Consumer<RecycleBinPolicys> policySetter) {
        if (this.policy == null) {
            this.policy = new RecycleBinPolicys();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public RecycleBinPolicys getPolicy() {
        return policy;
    }

    public void setPolicy(RecycleBinPolicys policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecycleBin that = (RecycleBin) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this._switch, that._switch)
            && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, _switch, policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleBin {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
