package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class StopCallBackResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resultcode")

    private String resultcode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resultdesc")

    private String resultdesc;

    public StopCallBackResponse withResultcode(String resultcode) {
        this.resultcode = resultcode;
        return this;
    }

    /**
     * 错误码
     * @return resultcode
     */
    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public StopCallBackResponse withResultdesc(String resultdesc) {
        this.resultdesc = resultdesc;
        return this;
    }

    /**
     * 错误描述
     * @return resultdesc
     */
    public String getResultdesc() {
        return resultdesc;
    }

    public void setResultdesc(String resultdesc) {
        this.resultdesc = resultdesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopCallBackResponse that = (StopCallBackResponse) obj;
        return Objects.equals(this.resultcode, that.resultcode) && Objects.equals(this.resultdesc, that.resultdesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultcode, resultdesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopCallBackResponse {\n");
        sb.append("    resultcode: ").append(toIndentedString(resultcode)).append("\n");
        sb.append("    resultdesc: ").append(toIndentedString(resultdesc)).append("\n");
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
