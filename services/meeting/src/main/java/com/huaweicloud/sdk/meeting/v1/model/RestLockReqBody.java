package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 锁定会议消息体。
 */
public class RestLockReqBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isLock")
    
    private Integer isLock;

    public RestLockReqBody withIsLock(Integer isLock) {
        this.isLock = isLock;
        return this;
    }

    


    /**
     * - 0: 解锁。 - 1: 锁定。
     * @return isLock
     */
    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestLockReqBody restLockReqBody = (RestLockReqBody) o;
        return Objects.equals(this.isLock, restLockReqBody.isLock);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isLock);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestLockReqBody {\n");
        sb.append("    isLock: ").append(toIndentedString(isLock)).append("\n");
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

