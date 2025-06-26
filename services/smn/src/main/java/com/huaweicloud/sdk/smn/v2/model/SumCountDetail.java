package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SumCountDetail
 */
public class SumCountDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms")

    private Integer sms;

    public SumCountDetail withSms(Integer sms) {
        this.sms = sms;
        return this;
    }

    /**
     * 短信发送总量
     * @return sms
     */
    public Integer getSms() {
        return sms;
    }

    public void setSms(Integer sms) {
        this.sms = sms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SumCountDetail that = (SumCountDetail) obj;
        return Objects.equals(this.sms, that.sms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SumCountDetail {\n");
        sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
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
