package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据库参数信息体。MySQL迁移和MySQL灾备需要修改的数据库参数，部分参数的修改需重启目标库后生效，建议在迁移开始前或迁移结束后重启目标库，具体参数值与有效范围请通过“批量获取数据库参数”接口查询。约束： - 实时灾备场景：双主灾备时父任务不支持。 当前支持的参数： 常规参数： - character_set_server：服务器字符集。 - collation_server：服务器默认排序。 - connect_timeout：mysqld服务器在回Bad handshake响应之前等待连接数据包的时间（秒）。 - explicit_defaults_for_timestamp：处理TIMESTAMP字段的默认值、NULL值时是否开启非标准行为。默认该参数是关闭的，即开启非标准行为。 - innodb_flush_log_at_trx_commit：当重新安排并批量处理与提交相关的I/O操作时，可以控制提交操作在严格遵守ACID合规性和高性能之间的平衡。当值设为0时，每秒把事务日志缓存区的数据写入日志文件并刷新到磁盘；当设为默认值1时，是为了保证完整的ACID，每次提交事务时，把事务日志从缓存区写到日志文件中，并刷新日志文件的数据到磁盘上；如果设为2，每次提交事务都会把事务日志从缓存区写入日志文件，大约每隔一秒会刷新到磁盘。 - innodb_lock_wait_timeout：放弃事务前，InnoDB事务等待行锁的时间。 - max_connections：允许同时连接的客户端总数。如果设定值为default，表示该参数随内存规格变化。 - net_read_timeout：中止读数据之前从一个连接等待更多数据的秒数。 - net_write_timeout：中止写之前等待一个块被写入连接的秒数。 性能参数： - binlog_cache_size：在事务中，为二进制日志存储SQL语句的缓存容量。该参数必须设置为4096的倍数。目标库允许值：4096~16777216。 - binlog_stmt_cache_size：此变量决定在事务中，二进制日志存储下发的非事务语句的缓存空间。该参数必须设置为4096的倍数。目标库允许值：4096~16777216。 - bulk_insert_buffer_size：限制MyISAM缓存树每个线程的大小，单位为字节。目标库允许值：0~18446744073709551615。 - innodb_buffer_pool_size：对于缓存数据及其表格索引，innodb使用的内存缓存字节大小。如果设定值为default，表示该参数随内存规格变化（建议不高于目标库实例总内存的70%）。该参数必须设置为134217728的倍数。目标库允许值：536870912~1717986918。 - long_query_time：当SQL语句执行时间超过此数值时，就会被记录到慢日志中，单位为秒。目标库允许值：0.03~3600。 - read_buffer_size：对每个进行顺序扫描的线程将分配一个缓冲区。如果要进行大量顺序扫描，可增大参数值以提升性能。目标库允许值：8192~2147479552。 - read_rnd_buffer_size：在key-sort操作后按排序读取行时，避免读取磁盘。增大该参数值可提升ORDER BY操作的性能。该参数必须设置为4096的倍数。目标库允许值：1~2147483647。 - sort_buffer_size：增大该参数值可提升ORDER BY或GROUP BY操作的性能。目标库允许值：32768~18446744073709551615。 - sync_binlog：同步binlog（MySQL持久化到硬盘，或依赖于操作系统）。目标库允许值：0~4294967295。 示例： {     &#39;common&#39; : [         {\\&#39;key\\&#39;:\\&#39;character_set_server\\&#39;,\\&#39;target_value\\&#39;:\\&#39;utf8mb4\\&#39;}     ],     &#39;performance&#39; : [         {\\&#39;key\\&#39;:\\&#39;long_query_time\\&#39;,\\&#39;target_value\\&#39;:\\&#39;1\\&#39;}     ] }
 */
public class DbParamInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private List<DbParam> common = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "performance")

    private List<DbParam> performance = null;

    public DbParamInfo withCommon(List<DbParam> common) {
        this.common = common;
        return this;
    }

    public DbParamInfo addCommonItem(DbParam commonItem) {
        if (this.common == null) {
            this.common = new ArrayList<>();
        }
        this.common.add(commonItem);
        return this;
    }

    public DbParamInfo withCommon(Consumer<List<DbParam>> commonSetter) {
        if (this.common == null) {
            this.common = new ArrayList<>();
        }
        commonSetter.accept(this.common);
        return this;
    }

    /**
     * 常规参数。只有对比结果为不一致的目标库参数能被修改。
     * @return common
     */
    public List<DbParam> getCommon() {
        return common;
    }

    public void setCommon(List<DbParam> common) {
        this.common = common;
    }

    public DbParamInfo withPerformance(List<DbParam> performance) {
        this.performance = performance;
        return this;
    }

    public DbParamInfo addPerformanceItem(DbParam performanceItem) {
        if (this.performance == null) {
            this.performance = new ArrayList<>();
        }
        this.performance.add(performanceItem);
        return this;
    }

    public DbParamInfo withPerformance(Consumer<List<DbParam>> performanceSetter) {
        if (this.performance == null) {
            this.performance = new ArrayList<>();
        }
        performanceSetter.accept(this.performance);
        return this;
    }

    /**
     * 性能参数。对比结果一致也可以修改目标库的值。
     * @return performance
     */
    public List<DbParam> getPerformance() {
        return performance;
    }

    public void setPerformance(List<DbParam> performance) {
        this.performance = performance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DbParamInfo that = (DbParamInfo) obj;
        return Objects.equals(this.common, that.common) && Objects.equals(this.performance, that.performance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(common, performance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbParamInfo {\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
        sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
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
