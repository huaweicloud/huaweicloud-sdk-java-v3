package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateKeypairRequestBodyServers
 */
public class UpdateKeypairRequestBodyServers {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair_name")

    @JacksonXmlProperty(localName = "keypair_name")

    private String keypairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    @JacksonXmlProperty(localName = "server_id")

    private String serverId;

    public UpdateKeypairRequestBodyServers withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * 密钥对名称
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public UpdateKeypairRequestBodyServers withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机服务器ID，不得超过32个字节
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateKeypairRequestBodyServers updateKeypairRequestBodyServers = (UpdateKeypairRequestBodyServers) o;
        return Objects.equals(this.keypairName, updateKeypairRequestBodyServers.keypairName)
            && Objects.equals(this.serverId, updateKeypairRequestBodyServers.serverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypairName, serverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeypairRequestBodyServers {\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
