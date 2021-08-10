package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 允许来宾自己解除静音请求体。 */
public class RestAllowUnMuteReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowUnmuteByOneself")

    private Integer allowUnmuteByOneself;

    public RestAllowUnMuteReqBody withAllowUnmuteByOneself(Integer allowUnmuteByOneself) {
        this.allowUnmuteByOneself = allowUnmuteByOneself;
        return this;
    }

    /** 是否允许自己解除静音（仅静音时有效），默认为允许。 - 0: 不允许。 - 1: 允许。
     * 
     * @return allowUnmuteByOneself */
    public Integer getAllowUnmuteByOneself() {
        return allowUnmuteByOneself;
    }

    public void setAllowUnmuteByOneself(Integer allowUnmuteByOneself) {
        this.allowUnmuteByOneself = allowUnmuteByOneself;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestAllowUnMuteReqBody restAllowUnMuteReqBody = (RestAllowUnMuteReqBody) o;
        return Objects.equals(this.allowUnmuteByOneself, restAllowUnMuteReqBody.allowUnmuteByOneself);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowUnmuteByOneself);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestAllowUnMuteReqBody {\n");
        sb.append("    allowUnmuteByOneself: ").append(toIndentedString(allowUnmuteByOneself)).append("\n");
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
