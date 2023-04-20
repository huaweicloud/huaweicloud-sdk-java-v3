package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.CreateRes;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecutePostCreateImagesResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    

    private String url;

    public ExecutePostCreateImagesResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 图片id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ExecutePostCreateImagesResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ExecutePostCreateImagesResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 访问地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecutePostCreateImagesResponse executePostCreateImagesResponse = (ExecutePostCreateImagesResponse) o;
        return Objects.equals(this.id, executePostCreateImagesResponse.id) &&
            Objects.equals(this.name, executePostCreateImagesResponse.name) &&
            Objects.equals(this.url, executePostCreateImagesResponse.url);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, url);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutePostCreateImagesResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

