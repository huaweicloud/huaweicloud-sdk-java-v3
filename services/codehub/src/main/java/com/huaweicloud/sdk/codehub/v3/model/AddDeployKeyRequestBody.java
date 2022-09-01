package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * AddDeployKeyRequestBody
 */
public class AddDeployKeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    @JacksonXmlProperty(localName = "application")

    private String application;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_push")

    @JacksonXmlProperty(localName = "can_push")

    private Boolean canPush;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_title")

    @JacksonXmlProperty(localName = "key_title")

    private String keyTitle;

    public AddDeployKeyRequestBody withApplication(String application) {
        this.application = application;
        return this;
    }

    /**
     * 部署key的来源
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
     * 部署key是否可以推送代码
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
     * 部署key
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
     * 部署key名称
     * @return keyTitle
     */
    public String getKeyTitle() {
        return keyTitle;
    }

    public void setKeyTitle(String keyTitle) {
        this.keyTitle = keyTitle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDeployKeyRequestBody addDeployKeyRequestBody = (AddDeployKeyRequestBody) o;
        return Objects.equals(this.application, addDeployKeyRequestBody.application)
            && Objects.equals(this.canPush, addDeployKeyRequestBody.canPush)
            && Objects.equals(this.key, addDeployKeyRequestBody.key)
            && Objects.equals(this.keyTitle, addDeployKeyRequestBody.keyTitle);
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
