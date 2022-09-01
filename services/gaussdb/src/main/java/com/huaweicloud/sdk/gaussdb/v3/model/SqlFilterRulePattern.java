package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SQL限流规则和最大并发数
 */
public class SqlFilterRulePattern  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pattern")
    
    @JacksonXmlProperty(localName = "pattern")
    
    private String pattern;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_concurrency")
    
    @JacksonXmlProperty(localName = "max_concurrency")
    
    private Integer maxConcurrency;

    public SqlFilterRulePattern withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    


    /**
     * SQL限流规则。
     * @return pattern
     */
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    

    public SqlFilterRulePattern withMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    


    /**
     * 最大并发数。
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlFilterRulePattern sqlFilterRulePattern = (SqlFilterRulePattern) o;
        return Objects.equals(this.pattern, sqlFilterRulePattern.pattern) &&
            Objects.equals(this.maxConcurrency, sqlFilterRulePattern.maxConcurrency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pattern, maxConcurrency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlFilterRulePattern {\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
        sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
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

