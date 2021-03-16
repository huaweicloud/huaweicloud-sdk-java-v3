package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 静音会场消息体。
 */
public class RestMuteReqBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isMute")
    
    private Integer isMute;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="allowUnmuteByOneself")
    
    private Integer allowUnmuteByOneself;

    public RestMuteReqBody withIsMute(Integer isMute) {
        this.isMute = isMute;
        return this;
    }

    


    /**
     * - 0: 取消静音。 - 1: 静音。
     * @return isMute
     */
    public Integer getIsMute() {
        return isMute;
    }

    public void setIsMute(Integer isMute) {
        this.isMute = isMute;
    }

    

    public RestMuteReqBody withAllowUnmuteByOneself(Integer allowUnmuteByOneself) {
        this.allowUnmuteByOneself = allowUnmuteByOneself;
        return this;
    }

    


    /**
     * 是否允许自己解除静音（仅静音时有效），默认为允许。 - 0: 不允许。 - 1: 允许。
     * @return allowUnmuteByOneself
     */
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
        RestMuteReqBody restMuteReqBody = (RestMuteReqBody) o;
        return Objects.equals(this.isMute, restMuteReqBody.isMute) &&
            Objects.equals(this.allowUnmuteByOneself, restMuteReqBody.allowUnmuteByOneself);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isMute, allowUnmuteByOneself);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestMuteReqBody {\n");
        sb.append("    isMute: ").append(toIndentedString(isMute)).append("\n");
        sb.append("    allowUnmuteByOneself: ").append(toIndentedString(allowUnmuteByOneself)).append("\n");
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

