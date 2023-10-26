package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPermRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_cidr")

    private String ipCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rw_type")

    private String rwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    public ShowPermRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 权限规格的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowPermRuleResponse withIpCidr(String ipCidr) {
        this.ipCidr = ipCidr;
        return this;
    }

    /**
     * 授权对象的IP地址或网段
     * @return ipCidr
     */
    public String getIpCidr() {
        return ipCidr;
    }

    public void setIpCidr(String ipCidr) {
        this.ipCidr = ipCidr;
    }

    public ShowPermRuleResponse withRwType(String rwType) {
        this.rwType = rwType;
        return this;
    }

    /**
     * -| 授权对象的读写权限 rw：默认选项，以读写的方式共享 ro：以只读的方式共享
     * @return rwType
     */
    public String getRwType() {
        return rwType;
    }

    public void setRwType(String rwType) {
        this.rwType = rwType;
    }

    public ShowPermRuleResponse withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * -| 授权对象的系统用户对文件系统的访问权限。取值如下： no_root_squash：客户端使用的是root用户时，映射到NFS服务器的用户依然为root用户。 root_squash：客户端使用的是root用户时，映射到NFS服务器的用户为NFS的匿名用户（nfsnobody）。 all_squash：默认选项。所有访问NFS服务器的客户端的用户都映射为匿名用户。
     * @return userType
     */
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPermRuleResponse that = (ShowPermRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ipCidr, that.ipCidr)
            && Objects.equals(this.rwType, that.rwType) && Objects.equals(this.userType, that.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ipCidr, rwType, userType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPermRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipCidr: ").append(toIndentedString(ipCidr)).append("\n");
        sb.append("    rwType: ").append(toIndentedString(rwType)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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
