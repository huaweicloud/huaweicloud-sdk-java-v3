package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * **参数解释**： 自定义节点池纳管节点参数。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
 */
public class AddNodesToNodePool {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serverID")

    private UUID serverID;

    public AddNodesToNodePool withServerID(UUID serverID) {
        this.serverID = serverID;
        return this;
    }

    /**
     * **参数解释**： 服务器ID，从ECS/BMS控制台获取。 > 获取方式：在控制台的“服务列表”中，单击“计算 > 弹性云服务器 ECS/裸金属服务器 BMS”，单击服务器的名称，在服务器详情页的“基本信息”页签下找到“ID”字段复制即可。  **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return serverID
     */
    public UUID getServerID() {
        return serverID;
    }

    public void setServerID(UUID serverID) {
        this.serverID = serverID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddNodesToNodePool that = (AddNodesToNodePool) obj;
        return Objects.equals(this.serverID, that.serverID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddNodesToNodePool {\n");
        sb.append("    serverID: ").append(toIndentedString(serverID)).append("\n");
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
