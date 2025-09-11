package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GeneralRequest
 */
public class GeneralRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_id")

    private String dbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regenerate")

    private Integer regenerate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Duration time;

    public GeneralRequest withDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }

    /**
     * 数据库ID
     * @return dbId
     */
    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public GeneralRequest withRegenerate(Integer regenerate) {
        this.regenerate = regenerate;
        return this;
    }

    /**
     * 是否重新生成  - 1：是  - 0：否
     * @return regenerate
     */
    public Integer getRegenerate() {
        return regenerate;
    }

    public void setRegenerate(Integer regenerate) {
        this.regenerate = regenerate;
    }

    public GeneralRequest withTime(Duration time) {
        this.time = time;
        return this;
    }

    public GeneralRequest withTime(Consumer<Duration> timeSetter) {
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
        GeneralRequest that = (GeneralRequest) obj;
        return Objects.equals(this.dbId, that.dbId) && Objects.equals(this.regenerate, that.regenerate)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, regenerate, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralRequest {\n");
        sb.append("    dbId: ").append(toIndentedString(dbId)).append("\n");
        sb.append("    regenerate: ").append(toIndentedString(regenerate)).append("\n");
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
