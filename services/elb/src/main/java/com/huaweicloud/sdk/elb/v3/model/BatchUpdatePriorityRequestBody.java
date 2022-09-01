package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 批量更新转发策略优先级的请求参数。
 */
public class BatchUpdatePriorityRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    @JacksonXmlProperty(localName = "priority")

    private Integer priority;

    public BatchUpdatePriorityRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 待更新的l7policy的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchUpdatePriorityRequestBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 转发策略的优先级。共享型实例该字段无意义。当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。共享型负载均衡器下的转发策略不支持该字段。   数字越小表示优先级越高，同一监听器下不允许重复。   当action为REDIRECT_TO_LISTENER时，仅支持指定为0，优先级最高。   当关联的listener没有开启enhance_l7policy_enable，按原有policy的排序逻辑，自动排序。各域名之间优先级独立，相同域名下，按path的compare_type排序，精确>前缀>正则，匹配类型相同时，path的长度越长优先级越高。若policy下只有域名rule，没有路径rule，默认path为前缀匹配/。  当关联的listener开启了enhance_l7policy_enable，且不传该字段，则新创建的转发策略的优先级的值为：同一监听器下已有转发策略的优先级的最大值+1。因此，若当前已有转发策略的优先级的最大值是10000，新创建会因超出取值范围10000而失败。此时可通过传入指定priority，或调整原有policy的优先级来避免错误。若监听器下没有转发策略，则新建的转发策略的优先级为1。  [  不支持该字段，请勿使用。](tag:dt,dt_test)
     * minimum: 1
     * maximum: 10000
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpdatePriorityRequestBody batchUpdatePriorityRequestBody = (BatchUpdatePriorityRequestBody) o;
        return Objects.equals(this.id, batchUpdatePriorityRequestBody.id)
            && Objects.equals(this.priority, batchUpdatePriorityRequestBody.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePriorityRequestBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
