package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListWorkloadsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostip")

    private List<String> hostip = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ascend")

    private Boolean ascend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListWorkloadsRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池的ID，取值自资源池详情的metadata.name字段。 **约束限制**：不涉及。 **取值范围**：只能以小写字母开头，数字、中划线组成，不能以中划线结尾，且长度为[36-63]个字符。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public ListWorkloadsRequest withHostip(List<String> hostip) {
        this.hostip = hostip;
        return this;
    }

    public ListWorkloadsRequest addHostipItem(String hostipItem) {
        if (this.hostip == null) {
            this.hostip = new ArrayList<>();
        }
        this.hostip.add(hostipItem);
        return this;
    }

    public ListWorkloadsRequest withHostip(Consumer<List<String>> hostipSetter) {
        if (this.hostip == null) {
            this.hostip = new ArrayList<>();
        }
        hostipSetter.accept(this.hostip);
        return this;
    }

    /**
     * **参数解释**：节点IP地址，用于过滤在该节点上运行的workload。支持多个IP，传递多个参数或用逗号分隔. **约束限制**：指定此参数时，不支持分页（limit/offset会被忽略）。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return hostip
     */
    public List<String> getHostip() {
        return hostip;
    }

    public void setHostip(List<String> hostip) {
        this.hostip = hostip;
    }

    public ListWorkloadsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：根据作业类型查询资源池作业列表。 **约束限制**：不涉及。 **取值范围**：可选值如下： - train：训练作业 - infer：推理服务 - notebook：Notebook作业 - x-infer：新版推理作业 **默认取值**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListWorkloadsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：根据作业状态查询资源池作业列表。 **约束限制**：不涉及。 **取值范围**：可选值如下： - Queue：排队中的作业。 - Pending：等待中的作业。 - Abnormal：异常的作业。 - Terminating：中止中的作业。 - Creating：创建中的作业。 - Running：运行中的作业。 - Completed：已完成的作业。 - Terminated：已终止的作业。 - Failed：运行失败的作业。 **默认取值**：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListWorkloadsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释**：查询资源池作业列表的排序条件。 **约束限制**：不涉及。 **取值范围**：可选值如下： - create_time：根据作业创建时间排序。 **默认取值**：不涉及。
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListWorkloadsRequest withAscend(Boolean ascend) {
        this.ascend = ascend;
        return this;
    }

    /**
     * **参数解释**：指定查询资源池作业列表是否按照升序排序。 **约束限制**：需要配合sort查询参数使用。 **取值范围**：可选值如下： - true：按照升序排序。 - false：按照降序排序。 **默认取值**：false。
     * @return ascend
     */
    public Boolean getAscend() {
        return ascend;
    }

    public void setAscend(Boolean ascend) {
        this.ascend = ascend;
    }

    public ListWorkloadsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：分页查询的偏移量。 **约束限制**：不涉及。 **取值范围**：0-2147483647。 **默认取值**：0。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListWorkloadsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：分页单次查询返回的资源数量。 **约束限制**：不涉及。 **取值范围**：0 - 500。 **默认取值**：500。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkloadsRequest that = (ListWorkloadsRequest) obj;
        return Objects.equals(this.poolName, that.poolName) && Objects.equals(this.hostip, that.hostip)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.ascend, that.ascend)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolName, hostip, type, status, sort, ascend, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkloadsRequest {\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    hostip: ").append(toIndentedString(hostip)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    ascend: ").append(toIndentedString(ascend)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
