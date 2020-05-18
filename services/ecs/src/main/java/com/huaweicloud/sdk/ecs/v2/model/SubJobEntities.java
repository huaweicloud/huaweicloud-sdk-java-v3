package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class SubJobEntities  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nic_id")
    
    private String nicId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorcode_message")
    
    private String errorcodeMessage;

    public SubJobEntities withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * 云服务器相关操作显示server_id。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public SubJobEntities withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    


    /**
     * 网卡相关操作显示nic_id。
     * @return nicId
     */
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public SubJobEntities withErrorcodeMessage(String errorcodeMessage) {
        this.errorcodeMessage = errorcodeMessage;
        return this;
    }

    


    /**
     * 子任务执行失败的具体原因。
     * @return errorcodeMessage
     */
    public String getErrorcodeMessage() {
        return errorcodeMessage;
    }

    public void setErrorcodeMessage(String errorcodeMessage) {
        this.errorcodeMessage = errorcodeMessage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubJobEntities subJobEntities = (SubJobEntities) o;
        return Objects.equals(this.serverId, subJobEntities.serverId) &&
            Objects.equals(this.nicId, subJobEntities.nicId) &&
            Objects.equals(this.errorcodeMessage, subJobEntities.errorcodeMessage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverId, nicId, errorcodeMessage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubJobEntities {\n");
            sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
            sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
            sb.append("    errorcodeMessage: ").append(toIndentedString(errorcodeMessage)).append("\n");
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

