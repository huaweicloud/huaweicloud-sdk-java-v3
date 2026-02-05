package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AppCreate
 */
public class AppCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_key")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_secret")

    private String appSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_domain_id")

    private String relatedDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_project_id")

    private String relatedProjectId;

    public AppCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * APP的名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3 ~ 64个字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppCreate withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * APP描述。字符长度不能大于255。 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public AppCreate withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * APP凭据的key。支持英文，数字，“_”，“-”，且只能以英文或数字开头，8 ~ 200个字符。
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public AppCreate withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    /**
     * 密钥。支持英文，数字，“_”，“-”，“!”，“@”，“#”，“$”，“%”，且只能以英文或数字开头，8 ~ 128个字符。
     * @return appSecret
     */
    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public AppCreate withRelatedDomainId(String relatedDomainId) {
        this.relatedDomainId = relatedDomainId;
        return this;
    }

    /**
     * 凭据关联的账号ID。
     * @return relatedDomainId
     */
    public String getRelatedDomainId() {
        return relatedDomainId;
    }

    public void setRelatedDomainId(String relatedDomainId) {
        this.relatedDomainId = relatedDomainId;
    }

    public AppCreate withRelatedProjectId(String relatedProjectId) {
        this.relatedProjectId = relatedProjectId;
        return this;
    }

    /**
     * 凭据关联的项目ID。
     * @return relatedProjectId
     */
    public String getRelatedProjectId() {
        return relatedProjectId;
    }

    public void setRelatedProjectId(String relatedProjectId) {
        this.relatedProjectId = relatedProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppCreate that = (AppCreate) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.appKey, that.appKey) && Objects.equals(this.appSecret, that.appSecret)
            && Objects.equals(this.relatedDomainId, that.relatedDomainId)
            && Objects.equals(this.relatedProjectId, that.relatedProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, remark, appKey, appSecret, relatedDomainId, relatedProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppCreate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
        sb.append("    relatedDomainId: ").append(toIndentedString(relatedDomainId)).append("\n");
        sb.append("    relatedProjectId: ").append(toIndentedString(relatedProjectId)).append("\n");
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
