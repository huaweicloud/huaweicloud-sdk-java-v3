package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateDnsServersRequestBodyDnsServer
 */
public class UpdateDnsServersRequestBodyDnsServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_customized")

    private Integer isCustomized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_applied")

    private Integer isApplied;

    public UpdateDnsServersRequestBodyDnsServer withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * **参数解释**： DNS服务器IP，可通过[查询DNS服务器列表接口](ListDnsServers.xml)查询获得，通过返回值中的data.server_ip（.表示各对象之间层级的区分）获得。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public UpdateDnsServersRequestBodyDnsServer withIsCustomized(Integer isCustomized) {
        this.isCustomized = isCustomized;
        return this;
    }

    /**
     * **参数解释**： 是否是用户自定义的dns服务器 **约束限制**： 不涉及 **取值范围**： - 0：否 - 1：是 **默认取值**： 不涉及
     * @return isCustomized
     */
    public Integer getIsCustomized() {
        return isCustomized;
    }

    public void setIsCustomized(Integer isCustomized) {
        this.isCustomized = isCustomized;
    }

    public UpdateDnsServersRequestBodyDnsServer withIsApplied(Integer isApplied) {
        this.isApplied = isApplied;
        return this;
    }

    /**
     * **参数解释**： 是否应用 **约束限制**： 不涉及 **取值范围**： - 0：否 - 1：是 **默认取值**： 不涉及
     * @return isApplied
     */
    public Integer getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Integer isApplied) {
        this.isApplied = isApplied;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDnsServersRequestBodyDnsServer that = (UpdateDnsServersRequestBodyDnsServer) obj;
        return Objects.equals(this.serverIp, that.serverIp) && Objects.equals(this.isCustomized, that.isCustomized)
            && Objects.equals(this.isApplied, that.isApplied);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverIp, isCustomized, isApplied);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDnsServersRequestBodyDnsServer {\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    isCustomized: ").append(toIndentedString(isCustomized)).append("\n");
        sb.append("    isApplied: ").append(toIndentedString(isApplied)).append("\n");
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
