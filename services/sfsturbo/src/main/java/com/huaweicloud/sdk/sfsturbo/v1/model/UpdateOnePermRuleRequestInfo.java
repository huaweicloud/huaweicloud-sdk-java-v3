package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 权限规格信息
 */
public class UpdateOnePermRuleRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rw_type")

    private String rwType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    public UpdateOnePermRuleRequestInfo withRwType(String rwType) {
        this.rwType = rwType;
        return this;
    }

    /**
     * 授权对象的读写权限   - rw：默认选项，以读写的方式共享   - ro：以只读的方式共享   - none: 没有权限 
     * @return rwType
     */
    public String getRwType() {
        return rwType;
    }

    public void setRwType(String rwType) {
        this.rwType = rwType;
    }

    public UpdateOnePermRuleRequestInfo withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * 授权对象的系统用户对文件系统的访问权限。取值如下：  - no_root_squash：默认选项。客户端使用包括root用户在内的任何用户，NFS服务器都保持客户端使用的用户，不做映射。  - root_squash：客户端使用的是root用户时，映射到NFS服务器的用户为NFS的匿名用户（nfsnobody）。客户端使用非root用户时，NFS服务器保持客户端使用的用户，不做映射。  - all_squash：所有访问NFS服务器的客户端的用户都映射为匿名用户。 
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
        UpdateOnePermRuleRequestInfo that = (UpdateOnePermRuleRequestInfo) obj;
        return Objects.equals(this.rwType, that.rwType) && Objects.equals(this.userType, that.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rwType, userType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOnePermRuleRequestInfo {\n");
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
