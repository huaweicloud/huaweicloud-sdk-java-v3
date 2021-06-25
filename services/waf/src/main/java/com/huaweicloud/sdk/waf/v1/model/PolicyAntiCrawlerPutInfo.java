package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PolicyAntiCrawlerPutInfo
 */
public class PolicyAntiCrawlerPutInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logic")
    
    private Integer logic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public PolicyAntiCrawlerPutInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 规则应用的url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public PolicyAntiCrawlerPutInfo withLogic(Integer logic) {
        this.logic = logic;
        return this;
    }

    


    /**
     * 规则匹配逻辑
     * @return logic
     */
    public Integer getLogic() {
        return logic;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    

    public PolicyAntiCrawlerPutInfo withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyAntiCrawlerPutInfo policyAntiCrawlerPutInfo = (PolicyAntiCrawlerPutInfo) o;
        return Objects.equals(this.url, policyAntiCrawlerPutInfo.url) &&
            Objects.equals(this.logic, policyAntiCrawlerPutInfo.logic) &&
            Objects.equals(this.name, policyAntiCrawlerPutInfo.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, logic, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyAntiCrawlerPutInfo {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

