package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用户昵称
 */
public class UpdateUserNickNameRequestV4  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nick_name")
    
    private String nickName;

    public UpdateUserNickNameRequestV4 withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    


    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateUserNickNameRequestV4 updateUserNickNameRequestV4 = (UpdateUserNickNameRequestV4) o;
        return Objects.equals(this.nickName, updateUserNickNameRequestV4.nickName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nickName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserNickNameRequestV4 {\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
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

