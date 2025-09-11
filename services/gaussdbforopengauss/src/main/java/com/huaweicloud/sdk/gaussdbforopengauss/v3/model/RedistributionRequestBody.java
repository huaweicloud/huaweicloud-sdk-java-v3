package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RedistributionRequestBody
 */
public class RedistributionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_join_tables")

    private List<List<String>> redisJoinTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_parallel_jobs")

    private Integer redisParallelJobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_resource_level")

    private String redisResourceLevel;

    public RedistributionRequestBody withRedisJoinTables(List<List<String>> redisJoinTables) {
        this.redisJoinTables = redisJoinTables;
        return this;
    }

    public RedistributionRequestBody addRedisJoinTablesItem(List<String> redisJoinTablesItem) {
        if (this.redisJoinTables == null) {
            this.redisJoinTables = new ArrayList<>();
        }
        this.redisJoinTables.add(redisJoinTablesItem);
        return this;
    }

    public RedistributionRequestBody withRedisJoinTables(Consumer<List<List<String>>> redisJoinTablesSetter) {
        if (this.redisJoinTables == null) {
            this.redisJoinTables = new ArrayList<>();
        }
        redisJoinTablesSetter.accept(this.redisJoinTables);
        return this;
    }

    /**
     * 具有JOIN关系的表，指定该参数则启用多表扩容模式，扩容前设置生效。 如果指定过该参数，后续调用可以传入空数组清除多表扩容配置。  本次扩容结束后自动清除该配置，下次扩容需要重新设置。 按照“database名称、schema1名称、table1名称、schema2名称、table2名称...”的格式指定，带有大小写或特殊字符的表名需要加\"\"转义。 多个数组则表示存在多个join group。
     * @return redisJoinTables
     */
    public List<List<String>> getRedisJoinTables() {
        return redisJoinTables;
    }

    public void setRedisJoinTables(List<List<String>> redisJoinTables) {
        this.redisJoinTables = redisJoinTables;
    }

    public RedistributionRequestBody withRedisParallelJobs(Integer redisParallelJobs) {
        this.redisParallelJobs = redisParallelJobs;
        return this;
    }

    /**
     * 重分布并发数，扩容前设置生效。
     * @return redisParallelJobs
     */
    public Integer getRedisParallelJobs() {
        return redisParallelJobs;
    }

    public void setRedisParallelJobs(Integer redisParallelJobs) {
        this.redisParallelJobs = redisParallelJobs;
    }

    public RedistributionRequestBody withRedisResourceLevel(String redisResourceLevel) {
        this.redisResourceLevel = redisResourceLevel;
        return this;
    }

    /**
     * 重分布资源管控级别，扩容前或扩容重分布结束前设置生效。
     * @return redisResourceLevel
     */
    public String getRedisResourceLevel() {
        return redisResourceLevel;
    }

    public void setRedisResourceLevel(String redisResourceLevel) {
        this.redisResourceLevel = redisResourceLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedistributionRequestBody that = (RedistributionRequestBody) obj;
        return Objects.equals(this.redisJoinTables, that.redisJoinTables)
            && Objects.equals(this.redisParallelJobs, that.redisParallelJobs)
            && Objects.equals(this.redisResourceLevel, that.redisResourceLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redisJoinTables, redisParallelJobs, redisResourceLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedistributionRequestBody {\n");
        sb.append("    redisJoinTables: ").append(toIndentedString(redisJoinTables)).append("\n");
        sb.append("    redisParallelJobs: ").append(toIndentedString(redisParallelJobs)).append("\n");
        sb.append("    redisResourceLevel: ").append(toIndentedString(redisResourceLevel)).append("\n");
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
