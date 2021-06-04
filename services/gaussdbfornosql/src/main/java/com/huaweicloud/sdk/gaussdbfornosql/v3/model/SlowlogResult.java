package com.huaweicloud.sdk.gaussdbfornosql.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SlowlogResult
 */
public class SlowlogResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_name")
    
    private String nodeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database")
    
    private String database;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query_sample")
    
    private String querySample;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;

    public SlowlogResult withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    


    /**
     * 节点名称。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    

    public SlowlogResult withDatabase(String database) {
        this.database = database;
        return this;
    }

    


    /**
     * 所属数据库。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    

    public SlowlogResult withQuerySample(String querySample) {
        this.querySample = querySample;
        return this;
    }

    


    /**
     * 执行语法。
     * @return querySample
     */
    public String getQuerySample() {
        return querySample;
    }

    public void setQuerySample(String querySample) {
        this.querySample = querySample;
    }

    

    public SlowlogResult withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 语句类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public SlowlogResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 发生时间，UTC时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlowlogResult slowlogResult = (SlowlogResult) o;
        return Objects.equals(this.nodeName, slowlogResult.nodeName) &&
            Objects.equals(this.database, slowlogResult.database) &&
            Objects.equals(this.querySample, slowlogResult.querySample) &&
            Objects.equals(this.type, slowlogResult.type) &&
            Objects.equals(this.startTime, slowlogResult.startTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeName, database, querySample, type, startTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowlogResult {\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

