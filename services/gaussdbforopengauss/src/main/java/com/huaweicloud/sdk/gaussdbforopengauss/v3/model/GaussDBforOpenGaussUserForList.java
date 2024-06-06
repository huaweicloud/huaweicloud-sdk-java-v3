package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库用户信息。
 */
public class GaussDBforOpenGaussUserForList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attribute")

    private GaussDBforOpenGaussUserForListAttribute attribute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memberof")

    private String memberof;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private Boolean lockStatus;

    public GaussDBforOpenGaussUserForList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 帐号名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GaussDBforOpenGaussUserForList withAttribute(GaussDBforOpenGaussUserForListAttribute attribute) {
        this.attribute = attribute;
        return this;
    }

    public GaussDBforOpenGaussUserForList withAttribute(
        Consumer<GaussDBforOpenGaussUserForListAttribute> attributeSetter) {
        if (this.attribute == null) {
            this.attribute = new GaussDBforOpenGaussUserForListAttribute();
            attributeSetter.accept(this.attribute);
        }

        return this;
    }

    /**
     * Get attribute
     * @return attribute
     */
    public GaussDBforOpenGaussUserForListAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(GaussDBforOpenGaussUserForListAttribute attribute) {
        this.attribute = attribute;
    }

    public GaussDBforOpenGaussUserForList withMemberof(String memberof) {
        this.memberof = memberof;
        return this;
    }

    /**
     * 用户的默认权限。
     * @return memberof
     */
    public String getMemberof() {
        return memberof;
    }

    public void setMemberof(String memberof) {
        this.memberof = memberof;
    }

    public GaussDBforOpenGaussUserForList withLockStatus(Boolean lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * 用户是否被锁，取值为“true”或“false”。
     * @return lockStatus
     */
    public Boolean getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Boolean lockStatus) {
        this.lockStatus = lockStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GaussDBforOpenGaussUserForList that = (GaussDBforOpenGaussUserForList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.attribute, that.attribute)
            && Objects.equals(this.memberof, that.memberof) && Objects.equals(this.lockStatus, that.lockStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attribute, memberof, lockStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBforOpenGaussUserForList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    memberof: ").append(toIndentedString(memberof)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
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
