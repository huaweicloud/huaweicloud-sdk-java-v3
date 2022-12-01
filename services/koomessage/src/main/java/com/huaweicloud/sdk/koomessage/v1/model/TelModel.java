package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 热线模型。
 */
public class TelModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tel")

    private String tel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private String usage;

    public TelModel withTel(String tel) {
        this.tel = tel;
        return this;
    }

    /**
     * 电话号码（只能包含数字和”-“，且开头和结尾必须为数字）。
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public TelModel withUsage(String usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 号码用途。  > 号码用途长度范围为1-30个字符，中文占2个字符，英文占1个字符。 
     * @return usage
     */
    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TelModel telModel = (TelModel) o;
        return Objects.equals(this.tel, telModel.tel) && Objects.equals(this.usage, telModel.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tel, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TelModel {\n");
        sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
