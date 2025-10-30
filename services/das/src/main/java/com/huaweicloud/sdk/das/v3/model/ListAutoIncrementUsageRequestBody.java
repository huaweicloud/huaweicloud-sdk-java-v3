package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListAutoIncrementUsageRequestBody
 */
public class ListAutoIncrementUsageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio")

    private String ratio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_time")

    private Boolean realTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offsite")

    private String offsite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private List<String> database = null;

    public ListAutoIncrementUsageRequestBody withRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }

    /**
     * 自增 ID 使用比例过滤值，只返回超过该比例的自增 ID 使用数据。取值为 0~1 的小数，默认为0
     * @return ratio
     */
    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public ListAutoIncrementUsageRequestBody withRealTime(Boolean realTime) {
        this.realTime = realTime;
        return this;
    }

    /**
     * 是否获取实时数据： true：实时查询实例上数据并计算。最小查询时间粒度为 10 分钟，即有 10 分钟内的数据时，即使传递 true 也不进行实时查询。 false：当有近两小时的数据时，返回该数据，否则查询实例上最新数据。
     * @return realTime
     */
    public Boolean getRealTime() {
        return realTime;
    }

    public void setRealTime(Boolean realTime) {
        this.realTime = realTime;
    }

    public ListAutoIncrementUsageRequestBody withOffsite(String offsite) {
        this.offsite = offsite;
        return this;
    }

    /**
     * 偏移值
     * @return offsite
     */
    public String getOffsite() {
        return offsite;
    }

    public void setOffsite(String offsite) {
        this.offsite = offsite;
    }

    public ListAutoIncrementUsageRequestBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次获取的数量
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListAutoIncrementUsageRequestBody withDatabase(List<String> database) {
        this.database = database;
        return this;
    }

    public ListAutoIncrementUsageRequestBody addDatabaseItem(String databaseItem) {
        if (this.database == null) {
            this.database = new ArrayList<>();
        }
        this.database.add(databaseItem);
        return this;
    }

    public ListAutoIncrementUsageRequestBody withDatabase(Consumer<List<String>> databaseSetter) {
        if (this.database == null) {
            this.database = new ArrayList<>();
        }
        databaseSetter.accept(this.database);
        return this;
    }

    /**
     * 数据库名。传入此参数时，查询指定数据库中表自增 ID 使用情况，不传入时查询实例上所有数据库的表自增 ID 使用情况。
     * @return database
     */
    public List<String> getDatabase() {
        return database;
    }

    public void setDatabase(List<String> database) {
        this.database = database;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAutoIncrementUsageRequestBody that = (ListAutoIncrementUsageRequestBody) obj;
        return Objects.equals(this.ratio, that.ratio) && Objects.equals(this.realTime, that.realTime)
            && Objects.equals(this.offsite, that.offsite) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.database, that.database);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ratio, realTime, offsite, limit, database);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoIncrementUsageRequestBody {\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("    realTime: ").append(toIndentedString(realTime)).append("\n");
        sb.append("    offsite: ").append(toIndentedString(offsite)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
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
