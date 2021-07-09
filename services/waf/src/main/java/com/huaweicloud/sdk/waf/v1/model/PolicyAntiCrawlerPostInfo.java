package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PolicyAntiCrawlerPostInfo
 */
public class PolicyAntiCrawlerPostInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logic")
    
    private Integer logic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public PolicyAntiCrawlerPostInfo withUrl(String url) {
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

    

    public PolicyAntiCrawlerPostInfo withLogic(Integer logic) {
        this.logic = logic;
        return this;
    }

    


    /**
     * 规则匹配逻辑（说明：1：包含，2：不包含，3：等于，4：不等于，5：前缀为，6：前缀不为，7：后缀为，8：后缀不为）
     * @return logic
     */
    public Integer getLogic() {
        return logic;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    

    public PolicyAntiCrawlerPostInfo withName(String name) {
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

    

    public PolicyAntiCrawlerPostInfo withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 规则url，默认为anticrawler_specific_url
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public PolicyAntiCrawlerPostInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyAntiCrawlerPostInfo policyAntiCrawlerPostInfo = (PolicyAntiCrawlerPostInfo) o;
        return Objects.equals(this.url, policyAntiCrawlerPostInfo.url) &&
            Objects.equals(this.logic, policyAntiCrawlerPostInfo.logic) &&
            Objects.equals(this.name, policyAntiCrawlerPostInfo.name) &&
            Objects.equals(this.type, policyAntiCrawlerPostInfo.type) &&
            Objects.equals(this.description, policyAntiCrawlerPostInfo.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, logic, name, type, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyAntiCrawlerPostInfo {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

