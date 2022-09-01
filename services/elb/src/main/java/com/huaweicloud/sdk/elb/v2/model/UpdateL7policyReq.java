package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 更新转发策略对象请求体
 */
public class UpdateL7policyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    @JacksonXmlProperty(localName = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_listener_id")

    @JacksonXmlProperty(localName = "redirect_listener_id")

    private String redirectListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pool_id")

    @JacksonXmlProperty(localName = "redirect_pool_id")

    private String redirectPoolId;

    public UpdateL7policyReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 转发策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateL7policyReq withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 转发策略的管理状态；该字段为预留字段，暂未启用。默认为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdateL7policyReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 转发策略额描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateL7policyReq withRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    /**
     * 转发到的listener的ID，当action为REDIRECT_TO_LISTENER时生效。当action为REDIRECT_TO_LISTENER时必选
     * @return redirectListenerId
     */
    public String getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    public UpdateL7policyReq withRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    /**
     * 转发到pool的ID。当action为REDIRECT_TO_POOL时生效。使用说明：redirect_pool不能是listener的default_pool，不能已经被其他listener的l7policy所使用。当action为REDIRECT_TO_LISTENER时，不可指定。不允许更新为空。
     * @return redirectPoolId
     */
    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateL7policyReq updateL7policyReq = (UpdateL7policyReq) o;
        return Objects.equals(this.name, updateL7policyReq.name)
            && Objects.equals(this.adminStateUp, updateL7policyReq.adminStateUp)
            && Objects.equals(this.description, updateL7policyReq.description)
            && Objects.equals(this.redirectListenerId, updateL7policyReq.redirectListenerId)
            && Objects.equals(this.redirectPoolId, updateL7policyReq.redirectPoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adminStateUp, description, redirectListenerId, redirectPoolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7policyReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
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
