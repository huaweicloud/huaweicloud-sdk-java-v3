package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVpnAccessPolicyRequestBodyContent
 */
public class CreateVpnAccessPolicyRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_id")

    private String userGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_ip_cidrs")

    private List<String> destIpCidrs = null;

    public CreateVpnAccessPolicyRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 访问策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVpnAccessPolicyRequestBodyContent withUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }

    /**
     * 关联用户组ID
     * @return userGroupId
     */
    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public CreateVpnAccessPolicyRequestBodyContent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 访问策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVpnAccessPolicyRequestBodyContent withDestIpCidrs(List<String> destIpCidrs) {
        this.destIpCidrs = destIpCidrs;
        return this;
    }

    public CreateVpnAccessPolicyRequestBodyContent addDestIpCidrsItem(String destIpCidrsItem) {
        if (this.destIpCidrs == null) {
            this.destIpCidrs = new ArrayList<>();
        }
        this.destIpCidrs.add(destIpCidrsItem);
        return this;
    }

    public CreateVpnAccessPolicyRequestBodyContent withDestIpCidrs(Consumer<List<String>> destIpCidrsSetter) {
        if (this.destIpCidrs == null) {
            this.destIpCidrs = new ArrayList<>();
        }
        destIpCidrsSetter.accept(this.destIpCidrs);
        return this;
    }

    /**
     * 目的IP网段列表，至少有一个网段
     * @return destIpCidrs
     */
    public List<String> getDestIpCidrs() {
        return destIpCidrs;
    }

    public void setDestIpCidrs(List<String> destIpCidrs) {
        this.destIpCidrs = destIpCidrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpnAccessPolicyRequestBodyContent that = (CreateVpnAccessPolicyRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.userGroupId, that.userGroupId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.destIpCidrs, that.destIpCidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userGroupId, description, destIpCidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpnAccessPolicyRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    destIpCidrs: ").append(toIndentedString(destIpCidrs)).append("\n");
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
