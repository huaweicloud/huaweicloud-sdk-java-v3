package com.huaweicloud.sdk.ddm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SlowLogList
 */
public class SlowLogList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    private String users;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database")
    
    private String database;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="querySample")
    
    private String querySample;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logTime")
    
    private String logTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private String time;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shards")
    
    private String shards;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rowsExamined")
    
    private String rowsExamined;

    public SlowLogList withUsers(String users) {
        this.users = users;
        return this;
    }

    


    /**
     * 执行慢sql的DDM账号名称。
     * @return users
     */
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    

    public SlowLogList withDatabase(String database) {
        this.database = database;
        return this;
    }

    


    /**
     * 慢sql所属逻辑库的名称。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    

    public SlowLogList withQuerySample(String querySample) {
        this.querySample = querySample;
        return this;
    }

    


    /**
     * 慢sql执行语法。
     * @return querySample
     */
    public String getQuerySample() {
        return querySample;
    }

    public void setQuerySample(String querySample) {
        this.querySample = querySample;
    }

    

    public SlowLogList withLogTime(String logTime) {
        this.logTime = logTime;
        return this;
    }

    


    /**
     * DDM慢sql开始执行时间。
     * @return logTime
     */
    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    

    public SlowLogList withTime(String time) {
        this.time = time;
        return this;
    }

    


    /**
     * 慢sql的执行时长，精确到毫秒。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    

    public SlowLogList withShards(String shards) {
        this.shards = shards;
        return this;
    }

    


    /**
     * 逻辑库物理分片名称。
     * @return shards
     */
    public String getShards() {
        return shards;
    }

    public void setShards(String shards) {
        this.shards = shards;
    }

    

    public SlowLogList withRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    


    /**
     * 慢sql影响行数。
     * @return rowsExamined
     */
    public String getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(String rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlowLogList slowLogList = (SlowLogList) o;
        return Objects.equals(this.users, slowLogList.users) &&
            Objects.equals(this.database, slowLogList.database) &&
            Objects.equals(this.querySample, slowLogList.querySample) &&
            Objects.equals(this.logTime, slowLogList.logTime) &&
            Objects.equals(this.time, slowLogList.time) &&
            Objects.equals(this.shards, slowLogList.shards) &&
            Objects.equals(this.rowsExamined, slowLogList.rowsExamined);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users, database, querySample, logTime, time, shards, rowsExamined);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLogList {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    querySample: ").append(toIndentedString(querySample)).append("\n");
        sb.append("    logTime: ").append(toIndentedString(logTime)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    shards: ").append(toIndentedString(shards)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
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

