package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlProxyAvailable
 */
public class MysqlProxyAvailable  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    public MysqlProxyAvailable withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 可用区编码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    

    public MysqlProxyAvailable withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 可用区描述。
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
        MysqlProxyAvailable mysqlProxyAvailable = (MysqlProxyAvailable) o;
        return Objects.equals(this.code, mysqlProxyAvailable.code) &&
            Objects.equals(this.description, mysqlProxyAvailable.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxyAvailable {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

