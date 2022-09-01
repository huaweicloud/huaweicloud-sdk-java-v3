package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 申请释放主持人消息。
 */
public class RestChairTokenReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applyChair")

    @JacksonXmlProperty(localName = "applyChair")

    private Integer applyChair;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chairmanPwd")

    @JacksonXmlProperty(localName = "chairmanPwd")

    private String chairmanPwd;

    public RestChairTokenReqBody withApplyChair(Integer applyChair) {
        this.applyChair = applyChair;
        return this;
    }

    /**
     * - 0: 释放主持人。 - 1: 申请主持人。
     * @return applyChair
     */
    public Integer getApplyChair() {
        return applyChair;
    }

    public void setApplyChair(Integer applyChair) {
        this.applyChair = applyChair;
    }

    public RestChairTokenReqBody withChairmanPwd(String chairmanPwd) {
        this.chairmanPwd = chairmanPwd;
        return this;
    }

    /**
     * 当申请主持人时，携带主持人密码。
     * @return chairmanPwd
     */
    public String getChairmanPwd() {
        return chairmanPwd;
    }

    public void setChairmanPwd(String chairmanPwd) {
        this.chairmanPwd = chairmanPwd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestChairTokenReqBody restChairTokenReqBody = (RestChairTokenReqBody) o;
        return Objects.equals(this.applyChair, restChairTokenReqBody.applyChair)
            && Objects.equals(this.chairmanPwd, restChairTokenReqBody.chairmanPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyChair, chairmanPwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestChairTokenReqBody {\n");
        sb.append("    applyChair: ").append(toIndentedString(applyChair)).append("\n");
        sb.append("    chairmanPwd: ").append(toIndentedString(chairmanPwd)).append("\n");
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
