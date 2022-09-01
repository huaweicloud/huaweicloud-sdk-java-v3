package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * os-change字段数据结构说明
 */
public class OsChange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminpass")

    @JacksonXmlProperty(localName = "adminpass")

    private String adminpass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyname")

    @JacksonXmlProperty(localName = "keyname")

    private String keyname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userid")

    @JacksonXmlProperty(localName = "userid")

    private String userid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageid")

    @JacksonXmlProperty(localName = "imageid")

    private String imageid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private MetadataInstall metadata;

    public OsChange withAdminpass(String adminpass) {
        this.adminpass = adminpass;
        return this;
    }

    /**
     * 裸金属服务器管理员帐号的初始登录密码。其中，Linux管理员帐户为root，Windows管理员帐户为Administrator。建议密码复杂度如下：长度为8-26位。密码至少必须包含大写字母、小写字母、数字和特殊字符（!@$%^-_=+[{}]:,./?）中的三种。密码不能包含用户名或用户名的逆序。 说明：对于Windows裸金属服务器，不能包含用户名中超过两个连续字符的部分。对于Linux裸金属服务器也可使用user_data字段实现密码注入，此时adminpass字段无效。adminpass和keyname不能同时有值。adminpass和keyname如果同时为空，此时，metadata中的user_data属性必须有值。
     * @return adminpass
     */
    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass;
    }

    public OsChange withKeyname(String keyname) {
        this.keyname = keyname;
        return this;
    }

    /**
     * 密钥名称。密钥可以通过7.10.3-创建和导入SSH密钥（OpenStack原生）API创建，或者使用7.10.1-查询SSH密钥列表（OpenStack原生）API查询已有的密钥。
     * @return keyname
     */
    public String getKeyname() {
        return keyname;
    }

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public OsChange withUserid(String userid) {
        this.userid = userid;
        return this;
    }

    /**
     * 用户ID（登录管理控制台，进入我的凭证，即可看到“用户ID”）。
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public OsChange withImageid(String imageid) {
        this.imageid = imageid;
        return this;
    }

    /**
     * 镜像ID。镜像ID可以从镜像服务控制台获取，或者参考《镜像服务API参考》的“查询镜像列表”章节查询。在使用“查询镜像列表”API查询时，可以添加过滤字段“?virtual_env_type=Ironic”来筛选裸金属服务器镜像。
     * @return imageid
     */
    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    public OsChange withMetadata(MetadataInstall metadata) {
        this.metadata = metadata;
        return this;
    }

    public OsChange withMetadata(Consumer<MetadataInstall> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new MetadataInstall();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public MetadataInstall getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataInstall metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OsChange osChange = (OsChange) o;
        return Objects.equals(this.adminpass, osChange.adminpass) && Objects.equals(this.keyname, osChange.keyname)
            && Objects.equals(this.userid, osChange.userid) && Objects.equals(this.imageid, osChange.imageid)
            && Objects.equals(this.metadata, osChange.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminpass, keyname, userid, imageid, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsChange {\n");
        sb.append("    adminpass: ").append(toIndentedString(adminpass)).append("\n");
        sb.append("    keyname: ").append(toIndentedString(keyname)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    imageid: ").append(toIndentedString(imageid)).append("\n");
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
