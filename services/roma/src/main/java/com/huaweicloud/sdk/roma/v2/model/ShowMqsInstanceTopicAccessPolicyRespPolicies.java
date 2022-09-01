package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ShowMqsInstanceTopicAccessPolicyRespPolicies
 */
public class ShowMqsInstanceTopicAccessPolicyRespPolicies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    @JacksonXmlProperty(localName = "owner")

    private Boolean owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy")

    @JacksonXmlProperty(localName = "access_policy")

    private String accessPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    @JacksonXmlProperty(localName = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    @JacksonXmlProperty(localName = "tag")

    private String tag;

    public ShowMqsInstanceTopicAccessPolicyRespPolicies withOwner(Boolean owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 是否为创建topic时所选择的应用。
     * @return owner
     */
    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public ShowMqsInstanceTopicAccessPolicyRespPolicies withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 应用ID。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowMqsInstanceTopicAccessPolicyRespPolicies withAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * 权限类型。   - all：发布+订阅   - pub：发布   - sub：订阅
     * @return accessPolicy
     */
    public String getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public ShowMqsInstanceTopicAccessPolicyRespPolicies withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ShowMqsInstanceTopicAccessPolicyRespPolicies withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 权限类型对应的标签。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMqsInstanceTopicAccessPolicyRespPolicies showMqsInstanceTopicAccessPolicyRespPolicies =
            (ShowMqsInstanceTopicAccessPolicyRespPolicies) o;
        return Objects.equals(this.owner, showMqsInstanceTopicAccessPolicyRespPolicies.owner)
            && Objects.equals(this.userName, showMqsInstanceTopicAccessPolicyRespPolicies.userName)
            && Objects.equals(this.accessPolicy, showMqsInstanceTopicAccessPolicyRespPolicies.accessPolicy)
            && Objects.equals(this.appName, showMqsInstanceTopicAccessPolicyRespPolicies.appName)
            && Objects.equals(this.tag, showMqsInstanceTopicAccessPolicyRespPolicies.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, userName, accessPolicy, appName, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMqsInstanceTopicAccessPolicyRespPolicies {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
