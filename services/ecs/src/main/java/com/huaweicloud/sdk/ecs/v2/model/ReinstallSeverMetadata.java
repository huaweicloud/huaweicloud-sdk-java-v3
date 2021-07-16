package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ReinstallSeverMetadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;

    public ReinstallSeverMetadata withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * 重装云服务器过程中注入用户数据。  支持注入文本、文本文件或gzip文件。注入内容最大长度32KB。注入内容，需要进行base64格式编码。  了解更多用户数据注入请参考[用户数据注入](https://support.huaweicloud.com/usermanual-ecs/zh-cn_topic_0032380449.html)。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReinstallSeverMetadata reinstallSeverMetadata = (ReinstallSeverMetadata) o;
        return Objects.equals(this.userData, reinstallSeverMetadata.userData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallSeverMetadata {\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

