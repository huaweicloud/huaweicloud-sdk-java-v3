package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重装操作系统body。
 */
public class ReinstallServerWithoutCloudInitOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminpass")

    private String adminpass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyname")

    private String keyname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userid")

    private String userid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ReinstallSeverMetadataWithoutCloudInitOption metadata;

    public ReinstallServerWithoutCloudInitOption withAdminpass(String adminpass) {
        this.adminpass = adminpass;
        return this;
    }

    /**
     * 云服务器管理员帐户的初始登录密码。  其中，Windows管理员帐户的用户名为Administrator。  建议密码复杂度如下：  - 长度为8-26位。 - 密码至少必须包含大写字母、小写字母、数字和特殊字符（!@$%^-_=+[{}]:,./?）中的三种。  > 说明： >  - 对于Windows弹性云服务器，密码不能包含用户名或用户名的逆序，不能包含用户名中超过两个连续字符的部分。 - adminpass和keyname不能同时为空。
     * @return adminpass
     */
    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }

    public ReinstallServerWithoutCloudInitOption withKeyname(String keyname) {
        this.keyname = keyname;
        return this;
    }

    /**
     * 密钥名称。  密钥可以通过密钥创建接口进行创建（请参见[创建和导入SSH密钥](https://support.huaweicloud.com/api-dew/CreateKeypair.html)），或使用SSH密钥查询接口查询已有的密钥（请参见[查询SSH密钥列表](https://support.huaweicloud.com/api-dew/ListKeypairs.html) ）。
     * @return keyname
     */
    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public ReinstallServerWithoutCloudInitOption withUserid(String userid) {
        this.userid = userid;
        return this;
    }

    /**
     * 用户ID。当传入keyname参数时，此参数为必选。
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public ReinstallServerWithoutCloudInitOption withMode(String mode) {
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

    public ReinstallServerWithoutCloudInitOption withMetadata(ReinstallSeverMetadataWithoutCloudInitOption metadata) {
        this.metadata = metadata;
        return this;
    }

    public ReinstallServerWithoutCloudInitOption withMetadata(
        Consumer<ReinstallSeverMetadataWithoutCloudInitOption> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ReinstallSeverMetadataWithoutCloudInitOption();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ReinstallSeverMetadataWithoutCloudInitOption getMetadata() {
        return metadata;
    }

    public void setMetadata(ReinstallSeverMetadataWithoutCloudInitOption metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReinstallServerWithoutCloudInitOption that = (ReinstallServerWithoutCloudInitOption) obj;
        return Objects.equals(this.adminpass, that.adminpass) && Objects.equals(this.keyname, that.keyname)
            && Objects.equals(this.userid, that.userid) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminpass, keyname, userid, mode, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallServerWithoutCloudInitOption {\n");
        sb.append("    adminpass: ").append(toIndentedString(adminpass)).append("\n");
        sb.append("    keyname: ").append(toIndentedString(keyname)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
