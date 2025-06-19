package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListQueuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_type")

    private String queueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with-charge-info")

    private Boolean withChargeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with-priv")

    private Boolean withPriv;

    public ListQueuesRequest withQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }

    /**
     * 参数解释:  队列的类型 示例: sql 约束限制:  无 取值范围: sql, general, all 默认取值: sql
     * @return queueType
     */
    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public ListQueuesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 参数解释: 查询根据标签进行过滤 示例: taga=tagb,owner=ph 约束限制:  符合“key1=value1,key2=value2”的字符串 取值范围: 无 默认取值: 无
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListQueuesRequest withWithChargeInfo(Boolean withChargeInfo) {
        this.withChargeInfo = withChargeInfo;
        return this;
    }

    /**
     * 是否返回收费信息 示例: true 约束限制:  无 取值范围: true, false 默认取值: 无
     * @return withChargeInfo
     */
    public Boolean getWithChargeInfo() {
        return withChargeInfo;
    }

    public void setWithChargeInfo(Boolean withChargeInfo) {
        this.withChargeInfo = withChargeInfo;
    }

    public ListQueuesRequest withWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
        return this;
    }

    /**
     * 是否返回权限信息 示例: true 约束限制:  无 取值范围: true, false 默认取值: 无
     * @return withPriv
     */
    public Boolean getWithPriv() {
        return withPriv;
    }

    public void setWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQueuesRequest that = (ListQueuesRequest) obj;
        return Objects.equals(this.queueType, that.queueType) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.withChargeInfo, that.withChargeInfo) && Objects.equals(this.withPriv, that.withPriv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueType, tags, withChargeInfo, withPriv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQueuesRequest {\n");
        sb.append("    queueType: ").append(toIndentedString(queueType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    withChargeInfo: ").append(toIndentedString(withChargeInfo)).append("\n");
        sb.append("    withPriv: ").append(toIndentedString(withPriv)).append("\n");
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
