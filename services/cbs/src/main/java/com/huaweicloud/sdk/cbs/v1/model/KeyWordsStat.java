package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class KeyWordsStat  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keyword")
    

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="freq")
    

    private Long freq;

    public KeyWordsStat withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    


    /**
     * 关键词。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    

    public KeyWordsStat withFreq(Long freq) {
        this.freq = freq;
        return this;
    }

    


    /**
     * 关键词频次。
     * @return freq
     */
    public Long getFreq() {
        return freq;
    }

    public void setFreq(Long freq) {
        this.freq = freq;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyWordsStat keyWordsStat = (KeyWordsStat) o;
        return Objects.equals(this.keyword, keyWordsStat.keyword) &&
            Objects.equals(this.freq, keyWordsStat.freq);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyword, freq);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyWordsStat {\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    freq: ").append(toIndentedString(freq)).append("\n");
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

