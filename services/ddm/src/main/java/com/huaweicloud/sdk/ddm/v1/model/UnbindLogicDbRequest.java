package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UnbindLogicDbRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_db_name")

    private String logicDbName;

    public UnbindLogicDbRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * DDM实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UnbindLogicDbRequest withLogicDbName(String logicDbName) {
        this.logicDbName = logicDbName;
        return this;
    }

    /**
     * 需要解绑的逻辑库名
     * @return logicDbName
     */
    public String getLogicDbName() {
        return logicDbName;
    }

    public void setLogicDbName(String logicDbName) {
        this.logicDbName = logicDbName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnbindLogicDbRequest that = (UnbindLogicDbRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.logicDbName, that.logicDbName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, logicDbName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnbindLogicDbRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    logicDbName: ").append(toIndentedString(logicDbName)).append("\n");
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
