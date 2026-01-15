package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 迁移详情概览。
 */
public class MigrationObjectOverviewInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_count")

    private String srcCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_count")

    private String dstCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public MigrationObjectOverviewInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型。 DATABASE：数据库 SCHEMA：SCHEMA PACKAGE：package TABLE：数据表 COLUMN：列 VIEW：视图 FUNCTION：函数 PROCEDURE：存储过程 ROUTINE：routine TRIGGER：触发器 INDEX：索引 TABLE_INDEX：普通索引，根据表汇聚 TABLE_RENAME_OR_COPY：表重命名或复制 TABLE_STRUCTURE：表结构 EVENT：事件 SYNONYM：同义词,sqlserver特有 TYPE：自定义类型,sqlserver特有 RULE：规则,sqlserver特有 DEFAULT：缺省值,sqlserver特有 PLAN_GUIDE：执行计划,sqlserver特有 FILE_GROUP：文件组,sqlserver特有 PARTITION_FUNCTION：分区函数,sqlserver特有 SHARD_KEY：mongo特有 VALIDATOR：mongo特有 SEQUENCE：序列 MATVIEW：物化视图 PARTITION_SCHEME：分区方案,sqlserver特有 ACCOUNT：账户 EXTENSION：PG 特有的一些对象:插件 AGGREGATE：PG 特有的一些对象:聚合函数 MATERIALIZED_VIEW：PG 特有的一些对象:物化视图 TEXT_SEARCH_DICTIONARY：PG 特有的一些对象:文本搜索字典 CONVERSION：PG 特有的一些对象:类型转换 DATA_TYPE：PG 特有的一些对象:数据类型 TEXT_SEARCH_CONFIGURATION：PG 特有的一些对象:文本搜索配置 STATISTICS_EXTENSION：PG 特有的一些对象:插件统计 MEMBERSHIP：PG 特有的一些对象:用户成员关系 EVENT_TRIGGER：PG 特有的一些对象:事件触发器 COLLATION：PG 特有的一些对象:排序规则 TEXT_SEARCH_PARSER：PG 特有的一些对象:文本搜索解析器 PRIVILEGES：PG 特有的一些对象:权限 FOREIGN_KEY：PG 特有的一些对象:外键 ROLE：权限
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MigrationObjectOverviewInfo withSrcCount(String srcCount) {
        this.srcCount = srcCount;
        return this;
    }

    /**
     * 待迁移数量。
     * @return srcCount
     */
    public String getSrcCount() {
        return srcCount;
    }

    public void setSrcCount(String srcCount) {
        this.srcCount = srcCount;
    }

    public MigrationObjectOverviewInfo withDstCount(String dstCount) {
        this.dstCount = dstCount;
        return this;
    }

    /**
     * 已迁移数量。
     * @return dstCount
     */
    public String getDstCount() {
        return dstCount;
    }

    public void setDstCount(String dstCount) {
        this.dstCount = dstCount;
    }

    public MigrationObjectOverviewInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态. NOT_START：未启动，TRANSFERING：迁移中，COMPLETED：已完成，FAILED：失败，TRANSFER_WHEN_END：结束后迁移
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MigrationObjectOverviewInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public MigrationObjectOverviewInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrationObjectOverviewInfo that = (MigrationObjectOverviewInfo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.srcCount, that.srcCount)
            && Objects.equals(this.dstCount, that.dstCount) && Objects.equals(this.status, that.status)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, srcCount, dstCount, status, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationObjectOverviewInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    srcCount: ").append(toIndentedString(srcCount)).append("\n");
        sb.append("    dstCount: ").append(toIndentedString(dstCount)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
