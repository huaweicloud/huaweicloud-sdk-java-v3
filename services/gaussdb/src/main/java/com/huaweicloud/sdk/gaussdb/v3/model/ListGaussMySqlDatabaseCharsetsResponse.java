package com.huaweicloud.sdk.gaussdb.v3.model;




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
public class ListGaussMySqlDatabaseCharsetsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charsets")
    
    
    private List<String> charsets = null;
    
    public ListGaussMySqlDatabaseCharsetsResponse withCharsets(List<String> charsets) {
        this.charsets = charsets;
        return this;
    }

    
    public ListGaussMySqlDatabaseCharsetsResponse addCharsetsItem(String charsetsItem) {
        if(this.charsets == null) {
            this.charsets = new ArrayList<>();
        }
        this.charsets.add(charsetsItem);
        return this;
    }

    public ListGaussMySqlDatabaseCharsetsResponse withCharsets(Consumer<List<String>> charsetsSetter) {
        if(this.charsets == null) {
            this.charsets = new ArrayList<>();
        }
        charsetsSetter.accept(this.charsets);
        return this;
    }

    /**
     * 数据库字符集列表
     * @return charsets
     */
    public List<String> getCharsets() {
        return charsets;
    }

    public void setCharsets(List<String> charsets) {
        this.charsets = charsets;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGaussMySqlDatabaseCharsetsResponse listGaussMySqlDatabaseCharsetsResponse = (ListGaussMySqlDatabaseCharsetsResponse) o;
        return Objects.equals(this.charsets, listGaussMySqlDatabaseCharsetsResponse.charsets);
    }
    @Override
    public int hashCode() {
        return Objects.hash(charsets);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlDatabaseCharsetsResponse {\n");
        sb.append("    charsets: ").append(toIndentedString(charsets)).append("\n");
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

