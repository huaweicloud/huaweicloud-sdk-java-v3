package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AttackDomainTopListInfoItems
 */
public class AttackDomainTopListInfoItems  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="num")
    
    private Integer num;

    public AttackDomainTopListInfoItems withHost(String host) {
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

    

    public AttackDomainTopListInfoItems withNum(Integer num) {
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
        AttackDomainTopListInfoItems attackDomainTopListInfoItems = (AttackDomainTopListInfoItems) o;
        return Objects.equals(this.host, attackDomainTopListInfoItems.host) &&
            Objects.equals(this.num, attackDomainTopListInfoItems.num);
    }
    @Override
    public int hashCode() {
        return Objects.hash(host, num);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttackDomainTopListInfoItems {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

