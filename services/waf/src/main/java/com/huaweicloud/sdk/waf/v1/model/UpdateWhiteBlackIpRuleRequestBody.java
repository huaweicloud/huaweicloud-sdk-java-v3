package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 创建黑白名单规则body */
public class UpdateWhiteBlackIpRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    public UpdateWhiteBlackIpRuleRequestBody withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /** 黑白名单地址
     * 
     * @return addr */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public UpdateWhiteBlackIpRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 黑白名单规则描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateWhiteBlackIpRuleRequestBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /** 设置的ip地址类型，1放行，0拦截，2仅记录
     * 
     * @return white */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateWhiteBlackIpRuleRequestBody updateWhiteBlackIpRuleRequestBody = (UpdateWhiteBlackIpRuleRequestBody) o;
        return Objects.equals(this.addr, updateWhiteBlackIpRuleRequestBody.addr)
            && Objects.equals(this.description, updateWhiteBlackIpRuleRequestBody.description)
            && Objects.equals(this.white, updateWhiteBlackIpRuleRequestBody.white);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addr, description, white);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWhiteBlackIpRuleRequestBody {\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
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
