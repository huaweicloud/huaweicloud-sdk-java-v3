package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检查云堡垒机实例网络请求信息。
 */
public class NetworkRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nics> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    public NetworkRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 云堡垒机实例状态，枚举值如下： - create  创建 - renewals  更新 - change  变更 状态为renewals或change时server_id必传。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NetworkRequestBody withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public NetworkRequestBody addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NetworkRequestBody withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 云堡垒升级实例所在安全组信息。
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public NetworkRequestBody withNics(List<Nics> nics) {
        this.nics = nics;
        return this;
    }

    public NetworkRequestBody addNicsItem(Nics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public NetworkRequestBody withNics(Consumer<List<Nics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 云堡垒机实例的网卡信息。
     * @return nics
     */
    public List<Nics> getNics() {
        return nics;
    }

    public void setNics(List<Nics> nics) {
        this.nics = nics;
    }

    public NetworkRequestBody withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云堡垒机实例ID。
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
        NetworkRequestBody networkRequestBody = (NetworkRequestBody) o;
        return Objects.equals(this.type, networkRequestBody.type)
            && Objects.equals(this.securityGroups, networkRequestBody.securityGroups)
            && Objects.equals(this.nics, networkRequestBody.nics)
            && Objects.equals(this.serverId, networkRequestBody.serverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, securityGroups, nics, serverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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
