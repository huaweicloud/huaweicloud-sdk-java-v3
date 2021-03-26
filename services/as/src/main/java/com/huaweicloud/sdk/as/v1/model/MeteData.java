package com.huaweicloud.sdk.as.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用户自定义键值对
 */
public class MeteData  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="User-defined_key-value_pairs")
    
    private String userDefinedKeyValuePairs;

    public MeteData withUserDefinedKeyValuePairs(String userDefinedKeyValuePairs) {
        this.userDefinedKeyValuePairs = userDefinedKeyValuePairs;
        return this;
    }

    


    /**
     * metadata键、值。
     * @return userDefinedKeyValuePairs
     */
    public String getUserDefinedKeyValuePairs() {
        return userDefinedKeyValuePairs;
    }

    public void setUserDefinedKeyValuePairs(String userDefinedKeyValuePairs) {
        this.userDefinedKeyValuePairs = userDefinedKeyValuePairs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MeteData meteData = (MeteData) o;
        return Objects.equals(this.userDefinedKeyValuePairs, meteData.userDefinedKeyValuePairs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userDefinedKeyValuePairs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeteData {\n");
        sb.append("    userDefinedKeyValuePairs: ").append(toIndentedString(userDefinedKeyValuePairs)).append("\n");
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

