package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 项目信息。 */
public class KeystoneCreateProjectOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public KeystoneCreateProjectOption withName(String name) {
        this.name = name;
        return this;
    }

    /** 项目名称。必须以存在的\"区域ID_\"开头，长度小于等于64字符。例如区域“华北-北京一”的区域ID为“cn-north-1”，在其下创建项目时，项目名应填“cn-north-1_IAMProject”
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeystoneCreateProjectOption withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /** 区域对应的项目ID，例如区域“华北-北京一”区域对应的项目ID为：04dd42abe48026ad2fa3c01ad7fa.....，获取方式请参见：[获取账号、IAM用户、项目、用户组、委托的名称和ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * 
     * @return parentId */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public KeystoneCreateProjectOption withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 项目所属账号ID。
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoneCreateProjectOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 项目描述信息，长度小于等于255字符。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateProjectOption keystoneCreateProjectOption = (KeystoneCreateProjectOption) o;
        return Objects.equals(this.name, keystoneCreateProjectOption.name)
            && Objects.equals(this.parentId, keystoneCreateProjectOption.parentId)
            && Objects.equals(this.domainId, keystoneCreateProjectOption.domainId)
            && Objects.equals(this.description, keystoneCreateProjectOption.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, parentId, domainId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateProjectOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
