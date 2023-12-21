package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重启云堡垒机实例请求对象。
 */
public class RebootCbhRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private Object serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reboot_type")

    private String rebootType;

    public RebootCbhRequestBody withServerId(Object serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * Get serverId
     * @return serverId
     */
    public Object getServerId() {
        return serverId;
    }

    public void setServerId(Object serverId) {
        this.serverId = serverId;
    }

    public RebootCbhRequestBody withRebootType(String rebootType) {
        this.rebootType = rebootType;
        return this;
    }

    /**
     * 重启方式，不区分大小写。 - SOFT：普通重启，关闭虚拟机服务 - HARD：强制重启，重启虚拟机
     * @return rebootType
     */
    public String getRebootType() {
        return rebootType;
    }

    public void setRebootType(String rebootType) {
        this.rebootType = rebootType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RebootCbhRequestBody that = (RebootCbhRequestBody) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.rebootType, that.rebootType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, rebootType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RebootCbhRequestBody {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    rebootType: ").append(toIndentedString(rebootType)).append("\n");
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
