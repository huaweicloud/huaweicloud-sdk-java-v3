package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MfaRsp
 */
public class MfaRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    public MfaRsp withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * mfa方法
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public MfaRsp withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * mfa信息
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MfaRsp mfaRsp = (MfaRsp) o;
        return Objects.equals(this.method, mfaRsp.method) && Objects.equals(this.info, mfaRsp.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, info);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MfaRsp {\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
