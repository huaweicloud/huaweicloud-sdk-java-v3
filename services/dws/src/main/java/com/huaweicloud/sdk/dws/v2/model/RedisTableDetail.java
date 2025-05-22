package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 重分布表详情。 **取值范围**： 不涉及。
 */
public class RedisTableDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<RedisTable> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public RedisTableDetail withData(List<RedisTable> data) {
        this.data = data;
        return this;
    }

    public RedisTableDetail addDataItem(RedisTable dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public RedisTableDetail withData(Consumer<List<RedisTable>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * **参数解释**： 重分布具体数据。 **取值范围**： 不涉及。
     * @return data
     */
    public List<RedisTable> getData() {
        return data;
    }

    public void setData(List<RedisTable> data) {
        this.data = data;
    }

    public RedisTableDetail withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 重分布表张数。 **取值范围**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RedisTableDetail that = (RedisTableDetail) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisTableDetail {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
