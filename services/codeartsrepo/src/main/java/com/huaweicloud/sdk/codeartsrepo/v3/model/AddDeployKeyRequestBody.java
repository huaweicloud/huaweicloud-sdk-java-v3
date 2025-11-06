package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddDeployKeyRequestBody
 */
public class AddDeployKeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    private String application;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_push")

    private Boolean canPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_title")

    private String keyTitle;

    public AddDeployKeyRequestBody withApplication(String application) {
        this.application = application;
        return this;
    }

    /**
     * 部署使用的SSH密钥的来源
     * @return application
     */
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public AddDeployKeyRequestBody withCanPush(Boolean canPush) {
        this.canPush = canPush;
        return this;
    }

    /**
     * 部署使用的SSH密钥是否可以推送代码
     * @return canPush
     */
    public Boolean getCanPush() {
        return canPush;
    }

    public void setCanPush(Boolean canPush) {
        this.canPush = canPush;
    }

    public AddDeployKeyRequestBody withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 部署使用的SSH密钥
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public AddDeployKeyRequestBody withKeyTitle(String keyTitle) {
        this.keyTitle = keyTitle;
        return this;
    }

    /**
     * 部署使用的SSH密钥名称
     * @return keyTitle
     */
    public String getKeyTitle() {
        return keyTitle;
    }

    public void setKeyTitle(String keyTitle) {
        this.keyTitle = keyTitle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddDeployKeyRequestBody that = (AddDeployKeyRequestBody) obj;
        return Objects.equals(this.application, that.application) && Objects.equals(this.canPush, that.canPush)
            && Objects.equals(this.key, that.key) && Objects.equals(this.keyTitle, that.keyTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(application, canPush, key, keyTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDeployKeyRequestBody {\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    canPush: ").append(toIndentedString(canPush)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    keyTitle: ").append(toIndentedString(keyTitle)).append("\n");
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
