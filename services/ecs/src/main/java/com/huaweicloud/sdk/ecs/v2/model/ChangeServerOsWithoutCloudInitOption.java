package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重装操作系统body体。
 */
public class ChangeServerOsWithoutCloudInitOption {

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
    @JsonProperty(value = "imageid")

    private String imageid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ChangeSeversOsMetadataWithoutCloudInitOption metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private String isAutoPay;

    public ChangeServerOsWithoutCloudInitOption withAdminpass(String adminpass) {
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

    public ChangeServerOsWithoutCloudInitOption withKeyname(String keyname) {
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

    public ChangeServerOsWithoutCloudInitOption withUserid(String userid) {
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

    public ChangeServerOsWithoutCloudInitOption withImageid(String imageid) {
        this.imageid = imageid;
        return this;
    }

    /**
     * 切换系统所使用的新镜像的ID，格式为UUID。  镜像的ID可以从控制台或者参考[《镜像服务API参考》](https://support.huaweicloud.com/api-ims/ims_03_0702.html)的“查询镜像列表”的章节获取。
     * @return imageid
     */
    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    public ChangeServerOsWithoutCloudInitOption withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 取值为withStopServer ，支持开机状态下切换弹性云服务器操作系统。  mode取值为withStopServer时，对开机状态的  弹性云服务器执行切换操作系统操作，系统自动对云服务器先执行关机，再切换操作系统。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ChangeServerOsWithoutCloudInitOption withMetadata(ChangeSeversOsMetadataWithoutCloudInitOption metadata) {
        this.metadata = metadata;
        return this;
    }

    public ChangeServerOsWithoutCloudInitOption withMetadata(
        Consumer<ChangeSeversOsMetadataWithoutCloudInitOption> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ChangeSeversOsMetadataWithoutCloudInitOption();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ChangeSeversOsMetadataWithoutCloudInitOption getMetadata() {
        return metadata;
    }

    public void setMetadata(ChangeSeversOsMetadataWithoutCloudInitOption metadata) {
        this.metadata = metadata;
    }

    public ChangeServerOsWithoutCloudInitOption withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 下单订购后，是否自动从客户的账户中支付，而不需要客户手动去进行支付。
     * @return isAutoPay
     */
    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeServerOsWithoutCloudInitOption that = (ChangeServerOsWithoutCloudInitOption) obj;
        return Objects.equals(this.adminpass, that.adminpass) && Objects.equals(this.keyname, that.keyname)
            && Objects.equals(this.userid, that.userid) && Objects.equals(this.imageid, that.imageid)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.isAutoPay, that.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminpass, keyname, userid, imageid, mode, metadata, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeServerOsWithoutCloudInitOption {\n");
        sb.append("    adminpass: ").append(toIndentedString(adminpass)).append("\n");
        sb.append("    keyname: ").append(toIndentedString(keyname)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    imageid: ").append(toIndentedString(imageid)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
