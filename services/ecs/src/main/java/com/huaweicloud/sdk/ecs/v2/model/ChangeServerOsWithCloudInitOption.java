package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.ChangeSeversOsMetadata;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 重装操作系统body体。
 */
public class ChangeServerOsWithCloudInitOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminpass")
    
    private String adminpass;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keyname")
    
    private String keyname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userid")
    
    private String userid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="imageid")
    
    private String imageid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private ChangeSeversOsMetadata metadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private String mode;

    public ChangeServerOsWithCloudInitOption withAdminpass(String adminpass) {
        this.adminpass = adminpass;
        return this;
    }

    


    /**
     * 云服务器管理员帐户的初始登录密码。  其中，Windows管理员帐户的用户名为Administrator。  建议密码复杂度如下：  - 长度为8-26位。 - 密码至少必须包含大写字母、小写字母、数字和特殊字符（!@$%^-_=+[{}]:,./?）中的三种。  > 说明： >  - Windows云服务器的密码，不能包含用户名或用户名的逆序，不能包含用户名中超过两个连续字符的部分。 - 对于Linux弹性云服务器也可使用user_data字段实现密码注入，此时adminpass字段无效。 - adminpass和keyname不能同时有值。 - adminpass和keyname如果同时为空，此时，metadata中的user_data属性必须有值。 - 对于已安装Cloud-init的云服务器，使用adminpass字段切换操作系统时，系统如果提示您使用keypair方式切换操作系统，表示当前区域暂不支持使用密码方式。
     * @return adminpass
     */
    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }

    public ChangeServerOsWithCloudInitOption withKeyname(String keyname) {
        this.keyname = keyname;
        return this;
    }

    


    /**
     * 密钥名称。
     * @return keyname
     */
    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public ChangeServerOsWithCloudInitOption withUserid(String userid) {
        this.userid = userid;
        return this;
    }

    


    /**
     * 用户ID。 说明 如果使用秘钥方式切换操作系统，则该字段为必选字段。
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public ChangeServerOsWithCloudInitOption withImageid(String imageid) {
        this.imageid = imageid;
        return this;
    }

    


    /**
     * 切换系统所使用的新镜像的ID，格式为UUID。
     * @return imageid
     */
    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    public ChangeServerOsWithCloudInitOption withMetadata(ChangeSeversOsMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ChangeServerOsWithCloudInitOption withMetadata(Consumer<ChangeSeversOsMetadata> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new ChangeSeversOsMetadata();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public ChangeSeversOsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ChangeSeversOsMetadata metadata) {
        this.metadata = metadata;
    }

    public ChangeServerOsWithCloudInitOption withMode(String mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * 取值为withStopServer ，支持开机状态下切换弹性云服务器操作系统。 mode取值为withStopServer时，对开机状态的弹性云服务器执行切换操作系统操作，系统自动对云服务器先执行关机，再切换操作系统。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeServerOsWithCloudInitOption changeServerOsWithCloudInitOption = (ChangeServerOsWithCloudInitOption) o;
        return Objects.equals(this.adminpass, changeServerOsWithCloudInitOption.adminpass) &&
            Objects.equals(this.keyname, changeServerOsWithCloudInitOption.keyname) &&
            Objects.equals(this.userid, changeServerOsWithCloudInitOption.userid) &&
            Objects.equals(this.imageid, changeServerOsWithCloudInitOption.imageid) &&
            Objects.equals(this.metadata, changeServerOsWithCloudInitOption.metadata) &&
            Objects.equals(this.mode, changeServerOsWithCloudInitOption.mode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminpass, keyname, userid, imageid, metadata, mode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerOsWithCloudInitOption {\n");
        sb.append("    adminpass: ").append(toIndentedString(adminpass)).append("\n");
        sb.append("    keyname: ").append(toIndentedString(keyname)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    imageid: ").append(toIndentedString(imageid)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

