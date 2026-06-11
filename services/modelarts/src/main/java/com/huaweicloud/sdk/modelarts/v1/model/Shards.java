package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Shards
 */
public class Shards {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_urls")

    private List<String> objectUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public Shards withObjectUrls(List<String> objectUrls) {
        this.objectUrls = objectUrls;
        return this;
    }

    public Shards addObjectUrlsItem(String objectUrlsItem) {
        if (this.objectUrls == null) {
            this.objectUrls = new ArrayList<>();
        }
        this.objectUrls.add(objectUrlsItem);
        return this;
    }

    public Shards withObjectUrls(Consumer<List<String>> objectUrlsSetter) {
        if (this.objectUrls == null) {
            this.objectUrls = new ArrayList<>();
        }
        objectUrlsSetter.accept(this.objectUrls);
        return this;
    }

    /**
     * **参数解释**：日志分片的obs下载链接集。 **取值范围**：不涉及。
     * @return objectUrls
     */
    public List<String> getObjectUrls() {
        return objectUrls;
    }

    public void setObjectUrls(List<String> objectUrls) {
        this.objectUrls = objectUrls;
    }

    public Shards withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：本次请求返回的日志分片数。 **取值范围**：不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Shards withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：本次请求命中的日志分片总数。 **取值范围**：不涉及。
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
        Shards that = (Shards) obj;
        return Objects.equals(this.objectUrls, that.objectUrls) && Objects.equals(this.count, that.count)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectUrls, count, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Shards {\n");
        sb.append("    objectUrls: ").append(toIndentedString(objectUrls)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
