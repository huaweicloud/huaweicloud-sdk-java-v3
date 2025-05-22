package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 待重分布表优先级请求信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class RedisPriorityConf {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private List<RedisPriorityTable> priority = null;

    public RedisPriorityConf withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数解释**： 数据库名称。 **约束限制**： 不涉及。 **取值范围**： 1~1024 **默认取值**： 不涉及。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public RedisPriorityConf withPriority(List<RedisPriorityTable> priority) {
        this.priority = priority;
        return this;
    }

    public RedisPriorityConf addPriorityItem(RedisPriorityTable priorityItem) {
        if (this.priority == null) {
            this.priority = new ArrayList<>();
        }
        this.priority.add(priorityItem);
        return this;
    }

    public RedisPriorityConf withPriority(Consumer<List<RedisPriorityTable>> prioritySetter) {
        if (this.priority == null) {
            this.priority = new ArrayList<>();
        }
        prioritySetter.accept(this.priority);
        return this;
    }

    /**
     * **参数解释**： 待重分布表优先级请求信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return priority
     */
    public List<RedisPriorityTable> getPriority() {
        return priority;
    }

    public void setPriority(List<RedisPriorityTable> priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedisPriorityConf that = (RedisPriorityConf) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisPriorityConf {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
