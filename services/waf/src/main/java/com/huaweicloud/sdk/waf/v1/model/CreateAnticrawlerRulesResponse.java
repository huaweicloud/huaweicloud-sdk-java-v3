package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAnticrawlerRulesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


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
    @JsonProperty(value="timestamp")
    
    private Long timestamp;

    public CreateAnticrawlerRulesResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public CreateAnticrawlerRulesResponse withUrl(String url) {
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

    

    public CreateAnticrawlerRulesResponse withLogic(Integer logic) {
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

    

    public CreateAnticrawlerRulesResponse withName(String name) {
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

    

    public CreateAnticrawlerRulesResponse withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 反爬虫类型，指定防护：anticrawler_specific_url 例外防护：anticrawler_except_url
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public CreateAnticrawlerRulesResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    


    /**
     * 创建规则时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
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
        CreateAnticrawlerRulesResponse createAnticrawlerRulesResponse = (CreateAnticrawlerRulesResponse) o;
        return Objects.equals(this.id, createAnticrawlerRulesResponse.id) &&
            Objects.equals(this.url, createAnticrawlerRulesResponse.url) &&
            Objects.equals(this.logic, createAnticrawlerRulesResponse.logic) &&
            Objects.equals(this.name, createAnticrawlerRulesResponse.name) &&
            Objects.equals(this.type, createAnticrawlerRulesResponse.type) &&
            Objects.equals(this.timestamp, createAnticrawlerRulesResponse.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, url, logic, name, type, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAnticrawlerRulesResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

