package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateWhiteblackipRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    @JacksonXmlProperty(localName = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    @JacksonXmlProperty(localName = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    @JacksonXmlProperty(localName = "white")

    private Integer white;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group")

    @JacksonXmlProperty(localName = "ip_group")

    private IpGroup ipGroup;

    public UpdateWhiteblackipRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateWhiteblackipRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 黑白名单规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateWhiteblackipRuleResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public UpdateWhiteblackipRuleResponse withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * 黑白名单Ip/IP段
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public UpdateWhiteblackipRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 黑白名单规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateWhiteblackipRuleResponse withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * 防护动作：  - 0 拦截  - 1 放行  - 2 仅记录
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public UpdateWhiteblackipRuleResponse withIpGroup(IpGroup ipGroup) {
        this.ipGroup = ipGroup;
        return this;
    }

    public UpdateWhiteblackipRuleResponse withIpGroup(Consumer<IpGroup> ipGroupSetter) {
        if (this.ipGroup == null) {
            this.ipGroup = new IpGroup();
            ipGroupSetter.accept(this.ipGroup);
        }

        return this;
    }

    /**
     * Get ipGroup
     * @return ipGroup
     */
    public IpGroup getIpGroup() {
        return ipGroup;
    }

    public void setIpGroup(IpGroup ipGroup) {
        this.ipGroup = ipGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateWhiteblackipRuleResponse updateWhiteblackipRuleResponse = (UpdateWhiteblackipRuleResponse) o;
        return Objects.equals(this.id, updateWhiteblackipRuleResponse.id)
            && Objects.equals(this.name, updateWhiteblackipRuleResponse.name)
            && Objects.equals(this.policyid, updateWhiteblackipRuleResponse.policyid)
            && Objects.equals(this.addr, updateWhiteblackipRuleResponse.addr)
            && Objects.equals(this.description, updateWhiteblackipRuleResponse.description)
            && Objects.equals(this.white, updateWhiteblackipRuleResponse.white)
            && Objects.equals(this.ipGroup, updateWhiteblackipRuleResponse.ipGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, policyid, addr, description, white, ipGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWhiteblackipRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    ipGroup: ").append(toIndentedString(ipGroup)).append("\n");
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
