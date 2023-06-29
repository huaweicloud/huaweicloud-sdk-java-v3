package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 绑定密钥对描述消息体
 */
public class AssociateKeypairRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair_name")

    private String keypairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    private EcsServerInfo server;

    public AssociateKeypairRequestBody withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * SSH密钥对的名称
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public AssociateKeypairRequestBody withServer(EcsServerInfo server) {
        this.server = server;
        return this;
    }

    public AssociateKeypairRequestBody withServer(Consumer<EcsServerInfo> serverSetter) {
        if (this.server == null) {
            this.server = new EcsServerInfo();
            serverSetter.accept(this.server);
        }

        return this;
    }

    /**
     * Get server
     * @return server
     */
    public EcsServerInfo getServer() {
        return server;
    }

    public void setServer(EcsServerInfo server) {
        this.server = server;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateKeypairRequestBody that = (AssociateKeypairRequestBody) obj;
        return Objects.equals(this.keypairName, that.keypairName) && Objects.equals(this.server, that.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypairName, server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateKeypairRequestBody {\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
