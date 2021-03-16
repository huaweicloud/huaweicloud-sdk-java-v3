package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SwitchSslRequestBody
 */
public class SwitchSslRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_option")
    
    private String sslOption;

    public SwitchSslRequestBody withSslOption(String sslOption) {
        this.sslOption = sslOption;
        return this;
    }

    


    /**
     * SSL开关选项。取值：取“0”，表示DDS实例默认不启用SSL连接。取“1”，表示DDS实例默认启用SSL连接。
     * @return sslOption
     */
    public String getSslOption() {
        return sslOption;
    }

    public void setSslOption(String sslOption) {
        this.sslOption = sslOption;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwitchSslRequestBody switchSslRequestBody = (SwitchSslRequestBody) o;
        return Objects.equals(this.sslOption, switchSslRequestBody.sslOption);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sslOption);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchSslRequestBody {\n");
        sb.append("    sslOption: ").append(toIndentedString(sslOption)).append("\n");
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

