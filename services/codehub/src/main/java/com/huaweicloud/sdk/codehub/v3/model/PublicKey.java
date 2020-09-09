package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PublicKey
 */
public class PublicKey  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    private String title;

    public PublicKey withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 密钥id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicKey withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 密钥
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public PublicKey withTitle(String title) {
        this.title = title;
        return this;
    }

    


    /**
     * 密钥名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicKey publicKey = (PublicKey) o;
        return Objects.equals(this.id, publicKey.id) &&
            Objects.equals(this.key, publicKey.key) &&
            Objects.equals(this.title, publicKey.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, key, title);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicKey {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

