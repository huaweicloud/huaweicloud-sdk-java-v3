package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ContentCompareDiff  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_select_sql")
    
    private String targetSelectSql;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_select_sql")
    
    private String sourceSelectSql;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_key_value")
    
    private List<String> sourceKeyValue = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_key_value")
    
    private List<String> targetKeyValue = new ArrayList<>();
    
    public ContentCompareDiff withTargetSelectSql(String targetSelectSql) {
        this.targetSelectSql = targetSelectSql;
        return this;
    }

    


    /**
     * 查询目标库的SQL。
     * @return targetSelectSql
     */
    public String getTargetSelectSql() {
        return targetSelectSql;
    }

    public void setTargetSelectSql(String targetSelectSql) {
        this.targetSelectSql = targetSelectSql;
    }

    public ContentCompareDiff withSourceSelectSql(String sourceSelectSql) {
        this.sourceSelectSql = sourceSelectSql;
        return this;
    }

    


    /**
     * 查询源库的SQL。
     * @return sourceSelectSql
     */
    public String getSourceSelectSql() {
        return sourceSelectSql;
    }

    public void setSourceSelectSql(String sourceSelectSql) {
        this.sourceSelectSql = sourceSelectSql;
    }

    public ContentCompareDiff withSourceKeyValue(List<String> sourceKeyValue) {
        this.sourceKeyValue = sourceKeyValue;
        return this;
    }

    
    public ContentCompareDiff addSourceKeyValueItem(String sourceKeyValueItem) {
        this.sourceKeyValue.add(sourceKeyValueItem);
        return this;
    }

    public ContentCompareDiff withSourceKeyValue(Consumer<List<String>> sourceKeyValueSetter) {
        if(this.sourceKeyValue == null ){
            this.sourceKeyValue = new ArrayList<>();
        }
        sourceKeyValueSetter.accept(this.sourceKeyValue);
        return this;
    }

    /**
     * 源库KEY值列表。
     * @return sourceKeyValue
     */
    public List<String> getSourceKeyValue() {
        return sourceKeyValue;
    }

    public void setSourceKeyValue(List<String> sourceKeyValue) {
        this.sourceKeyValue = sourceKeyValue;
    }

    public ContentCompareDiff withTargetKeyValue(List<String> targetKeyValue) {
        this.targetKeyValue = targetKeyValue;
        return this;
    }

    
    public ContentCompareDiff addTargetKeyValueItem(String targetKeyValueItem) {
        this.targetKeyValue.add(targetKeyValueItem);
        return this;
    }

    public ContentCompareDiff withTargetKeyValue(Consumer<List<String>> targetKeyValueSetter) {
        if(this.targetKeyValue == null ){
            this.targetKeyValue = new ArrayList<>();
        }
        targetKeyValueSetter.accept(this.targetKeyValue);
        return this;
    }

    /**
     * 目标库KEY值列表。
     * @return targetKeyValue
     */
    public List<String> getTargetKeyValue() {
        return targetKeyValue;
    }

    public void setTargetKeyValue(List<String> targetKeyValue) {
        this.targetKeyValue = targetKeyValue;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentCompareDiff contentCompareDiff = (ContentCompareDiff) o;
        return Objects.equals(this.targetSelectSql, contentCompareDiff.targetSelectSql) &&
            Objects.equals(this.sourceSelectSql, contentCompareDiff.sourceSelectSql) &&
            Objects.equals(this.sourceKeyValue, contentCompareDiff.sourceKeyValue) &&
            Objects.equals(this.targetKeyValue, contentCompareDiff.targetKeyValue);
    }
    @Override
    public int hashCode() {
        return Objects.hash(targetSelectSql, sourceSelectSql, sourceKeyValue, targetKeyValue);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentCompareDiff {\n");
        sb.append("    targetSelectSql: ").append(toIndentedString(targetSelectSql)).append("\n");
        sb.append("    sourceSelectSql: ").append(toIndentedString(sourceSelectSql)).append("\n");
        sb.append("    sourceKeyValue: ").append(toIndentedString(sourceKeyValue)).append("\n");
        sb.append("    targetKeyValue: ").append(toIndentedString(targetKeyValue)).append("\n");
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

