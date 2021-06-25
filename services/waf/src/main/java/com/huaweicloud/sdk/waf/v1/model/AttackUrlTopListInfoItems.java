package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AttackUrlTopListInfoItems
 */
public class AttackUrlTopListInfoItems  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="num")
    
    private Integer num;

    public AttackUrlTopListInfoItems withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 域名
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public AttackUrlTopListInfoItems withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * Url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public AttackUrlTopListInfoItems withNum(Integer num) {
        this.num = num;
        return this;
    }

    


    /**
     * 域名被攻击次数
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttackUrlTopListInfoItems attackUrlTopListInfoItems = (AttackUrlTopListInfoItems) o;
        return Objects.equals(this.host, attackUrlTopListInfoItems.host) &&
            Objects.equals(this.url, attackUrlTopListInfoItems.url) &&
            Objects.equals(this.num, attackUrlTopListInfoItems.num);
    }
    @Override
    public int hashCode() {
        return Objects.hash(host, url, num);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackUrlTopListInfoItems {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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

