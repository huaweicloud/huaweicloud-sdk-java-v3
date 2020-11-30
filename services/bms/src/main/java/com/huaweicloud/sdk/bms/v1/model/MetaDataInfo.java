package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * metadata字段数据结构说明
 */
public class MetaDataInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="op_svc_userid")
    
    private String opSvcUserid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_pass")
    
    private String adminPass;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="BYOL")
    
    private String byol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency_name")
    
    private String agencyName;

    public MetaDataInfo withOpSvcUserid(String opSvcUserid) {
        this.opSvcUserid = opSvcUserid;
        return this;
    }

    


    /**
     * 用户ID（登录管理控制台，进入我的凭证，即可看到“用户ID”）。
     * @return opSvcUserid
     */
    public String getOpSvcUserid() {
        return opSvcUserid;
    }

    public void setOpSvcUserid(String opSvcUserid) {
        this.opSvcUserid = opSvcUserid;
    }

    public MetaDataInfo withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    


    /**
     * 以Windows镜像创建的裸金属服务器Administrator用户的密码，示例：cloud.1234。密码复杂度要求：长度为8-26位。密码至少必须包含大写字母、小写字母、数字和特殊字符（!@$%^-_=+[{}]:,./?）中的三种。密码不能包含用户名或用户名的逆序，不能包含用户名中超过两个连续字符的部分。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public MetaDataInfo withByol(String byol) {
        this.byol = byol;
        return this;
    }

    


    /**
     * 否自带许可，取值“true”或“false”。
     * @return byol
     */
    public String getByol() {
        return byol;
    }

    public void setByol(String byol) {
        this.byol = byol;
    }

    public MetaDataInfo withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    


    /**
     * 委托的名称。委托是由租户管理员在统一身份认证服务（Identity and Access Management，IAM）上创建的，可以作为其他租户访问此裸金属服务器的临时凭证。 说明:委托获取、更新请参考如下步骤：使用IAM服务提供的查询委托列表，获取有效可用的委托名称。使用更新裸金属服务器元数据接口，更新metadata中agency_name字段为新的委托名称。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetaDataInfo metaDataInfo = (MetaDataInfo) o;
        return Objects.equals(this.opSvcUserid, metaDataInfo.opSvcUserid) &&
            Objects.equals(this.adminPass, metaDataInfo.adminPass) &&
            Objects.equals(this.byol, metaDataInfo.byol) &&
            Objects.equals(this.agencyName, metaDataInfo.agencyName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(opSvcUserid, adminPass, byol, agencyName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaDataInfo {\n");
        sb.append("    opSvcUserid: ").append(toIndentedString(opSvcUserid)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    byol: ").append(toIndentedString(byol)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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

