package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class TagsResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    
    private String values;

    public TagsResp withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 键。  key最大长度36个字符。  key不能为空字符串。  [key只能由中文，字母，数字，“-”，“_”组成。](tag:hws,hws_hk,fcs_vm,ctc)  [key只能由字母，数字，“_”，“-”组成。](tag:dt,ocb,tlf,sbc)
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    

    public TagsResp withValues(String values) {
        this.values = values;
        return this;
    }

    


    /**
     * 值列表。  value最大长度43个字符。  value可以为空字符串。  [key只能由中文，字母，数字，“-”，“_”组成。](tag:hws,hws_hk,fcs_vm,ctc)  [key只能由字母，数字，“_”，“-”组成。](tag:dt,ocb,tlf,sbc)
     * @return values
     */
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagsResp tagsResp = (TagsResp) o;
        return Objects.equals(this.key, tagsResp.key) &&
            Objects.equals(this.values, tagsResp.values);
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagsResp {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

