package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 业务资产目录树
 */
public class LogicEntityNodes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_entity_guid")

    private String logicEntityGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_entity_name")

    private String logicEntityName;

    public LogicEntityNodes withLogicEntityGuid(String logicEntityGuid) {
        this.logicEntityGuid = logicEntityGuid;
        return this;
    }

    /**
     * 业务资产guid
     * @return logicEntityGuid
     */
    public String getLogicEntityGuid() {
        return logicEntityGuid;
    }

    public void setLogicEntityGuid(String logicEntityGuid) {
        this.logicEntityGuid = logicEntityGuid;
    }

    public LogicEntityNodes withLogicEntityName(String logicEntityName) {
        this.logicEntityName = logicEntityName;
        return this;
    }

    /**
     * 业务资产名称
     * @return logicEntityName
     */
    public String getLogicEntityName() {
        return logicEntityName;
    }

    public void setLogicEntityName(String logicEntityName) {
        this.logicEntityName = logicEntityName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogicEntityNodes that = (LogicEntityNodes) obj;
        return Objects.equals(this.logicEntityGuid, that.logicEntityGuid)
            && Objects.equals(this.logicEntityName, that.logicEntityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicEntityGuid, logicEntityName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicEntityNodes {\n");
        sb.append("    logicEntityGuid: ").append(toIndentedString(logicEntityGuid)).append("\n");
        sb.append("    logicEntityName: ").append(toIndentedString(logicEntityName)).append("\n");
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
