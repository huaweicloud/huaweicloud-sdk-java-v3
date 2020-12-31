package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CompareTableInfoWithToken  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="table_name")
    
    private String tableName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_token")
    
    private String minToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_token")
    
    private String maxToken;

    public CompareTableInfoWithToken withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    


    /**
     * 表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public CompareTableInfoWithToken withMinToken(String minToken) {
        this.minToken = minToken;
        return this;
    }

    


    /**
     * 该表的min token。
     * @return minToken
     */
    public String getMinToken() {
        return minToken;
    }

    public void setMinToken(String minToken) {
        this.minToken = minToken;
    }

    public CompareTableInfoWithToken withMaxToken(String maxToken) {
        this.maxToken = maxToken;
        return this;
    }

    


    /**
     * 该表的max token。
     * @return maxToken
     */
    public String getMaxToken() {
        return maxToken;
    }

    public void setMaxToken(String maxToken) {
        this.maxToken = maxToken;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompareTableInfoWithToken compareTableInfoWithToken = (CompareTableInfoWithToken) o;
        return Objects.equals(this.tableName, compareTableInfoWithToken.tableName) &&
            Objects.equals(this.minToken, compareTableInfoWithToken.minToken) &&
            Objects.equals(this.maxToken, compareTableInfoWithToken.maxToken);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tableName, minToken, maxToken);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareTableInfoWithToken {\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    minToken: ").append(toIndentedString(minToken)).append("\n");
        sb.append("    maxToken: ").append(toIndentedString(maxToken)).append("\n");
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

