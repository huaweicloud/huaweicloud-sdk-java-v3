package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建黑白名单规则body
 */
public class CreateWhiteBlackIpRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group_id")

    private String ipGroupId;

    public CreateWhiteBlackIpRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称只能由字母、数字、-、_和.组成，长度不能超过64个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWhiteBlackIpRuleRequestBody withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * 黑白名单ip地址，需要输入标准的ip地址或地址段，例如：42.123.120.66或42.123.120.0/16
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public CreateWhiteBlackIpRuleRequestBody withDescription(String description) {
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

    public CreateWhiteBlackIpRuleRequestBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * 防护动作：  - 0 拦截  - 1 放行   - 2 仅记录
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public CreateWhiteBlackIpRuleRequestBody withIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
        return this;
    }

    /**
     * 创建的Ip地址组id，该参数与addr参数只能使用一个；Ip地址组可在控制台中对象管理->地址组管理中添加。
     * @return ipGroupId
     */
    public String getIpGroupId() {
        return ipGroupId;
    }

    public void setIpGroupId(String ipGroupId) {
        this.ipGroupId = ipGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWhiteBlackIpRuleRequestBody createWhiteBlackIpRuleRequestBody = (CreateWhiteBlackIpRuleRequestBody) o;
        return Objects.equals(this.name, createWhiteBlackIpRuleRequestBody.name)
            && Objects.equals(this.addr, createWhiteBlackIpRuleRequestBody.addr)
            && Objects.equals(this.description, createWhiteBlackIpRuleRequestBody.description)
            && Objects.equals(this.white, createWhiteBlackIpRuleRequestBody.white)
            && Objects.equals(this.ipGroupId, createWhiteBlackIpRuleRequestBody.ipGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addr, description, white, ipGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWhiteBlackIpRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    ipGroupId: ").append(toIndentedString(ipGroupId)).append("\n");
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
