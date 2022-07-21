package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneListGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public KeystoneListGroupsRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 用户组所属账号ID，获取方式请参见：[获取账号ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoneListGroupsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户组名，长度小于等于128字符，获取方式请参见：[获取用户组名](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListGroupsRequest keystoneListGroupsRequest = (KeystoneListGroupsRequest) o;
        return Objects.equals(this.domainId, keystoneListGroupsRequest.domainId)
            && Objects.equals(this.name, keystoneListGroupsRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListGroupsRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
