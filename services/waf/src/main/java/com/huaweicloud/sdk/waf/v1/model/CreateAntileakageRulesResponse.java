package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAntileakageRulesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    private String category;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contents")
    
    private List<String> contents = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timestamp")
    
    private Long timestamp;

    public CreateAntileakageRulesResponse withId(String id) {
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

    

    public CreateAntileakageRulesResponse withUrl(String url) {
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

    

    public CreateAntileakageRulesResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    


    /**
     * 类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    public CreateAntileakageRulesResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public CreateAntileakageRulesResponse withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    
    public CreateAntileakageRulesResponse addContentsItem(String contentsItem) {
        if(this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public CreateAntileakageRulesResponse withContents(Consumer<List<String>> contentsSetter) {
        if(this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 规则内容
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    

    public CreateAntileakageRulesResponse withTimestamp(Long timestamp) {
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
        CreateAntileakageRulesResponse createAntileakageRulesResponse = (CreateAntileakageRulesResponse) o;
        return Objects.equals(this.id, createAntileakageRulesResponse.id) &&
            Objects.equals(this.url, createAntileakageRulesResponse.url) &&
            Objects.equals(this.category, createAntileakageRulesResponse.category) &&
            Objects.equals(this.status, createAntileakageRulesResponse.status) &&
            Objects.equals(this.contents, createAntileakageRulesResponse.contents) &&
            Objects.equals(this.timestamp, createAntileakageRulesResponse.timestamp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, url, category, status, contents, timestamp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAntileakageRulesResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

