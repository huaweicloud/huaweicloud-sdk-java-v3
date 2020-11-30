package com.huaweicloud.sdk.live.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UserInfo
 */
public class UserInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_num")
    
    private Integer userNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private String timestamp;

    public UserInfo withUserNum(Integer userNum) {
        this.userNum = userNum;
        return this;
    }

    


    /**
     * 直播流的在线人数
     * @return userNum
     */
    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public UserInfo withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 操作执行的时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(this.userNum, userInfo.userNum) &&
            Objects.equals(this.timestamp, userInfo.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userNum, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserInfo {\n");
        sb.append("    userNum: ").append(toIndentedString(userNum)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

