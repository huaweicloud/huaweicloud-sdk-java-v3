package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SqlSessionStatisticsRequest
 */
public class SqlSessionStatisticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private List<String> dbId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Duration time;

    public SqlSessionStatisticsRequest withDbId(List<String> dbId) {
        this.dbId = dbId;
        return this;
    }

    public SqlSessionStatisticsRequest addDbIdItem(String dbIdItem) {
        if (this.dbId == null) {
            this.dbId = new ArrayList<>();
        }
        this.dbId.add(dbIdItem);
        return this;
    }

    public SqlSessionStatisticsRequest withDbId(Consumer<List<String>> dbIdSetter) {
        if (this.dbId == null) {
            this.dbId = new ArrayList<>();
        }
        dbIdSetter.accept(this.dbId);
        return this;
    }

    /**
     * 数据库ID
     * @return dbId
     */
    public List<String> getDbId() {
        return dbId;
    }

    public void setDbId(List<String> dbId) {
        this.dbId = dbId;
    }

    public SqlSessionStatisticsRequest withTime(Duration time) {
        this.time = time;
        return this;
    }

    public SqlSessionStatisticsRequest withTime(Consumer<Duration> timeSetter) {
        if (this.time == null) {
            this.time = new Duration();
            timeSetter.accept(this.time);
        }

        return this;
    }

    /**
     * Get time
     * @return time
     */
    public Duration getTime() {
        return time;
    }

    public void setTime(Duration time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlSessionStatisticsRequest that = (SqlSessionStatisticsRequest) obj;
        return Objects.equals(this.dbId, that.dbId) && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlSessionStatisticsRequest {\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
