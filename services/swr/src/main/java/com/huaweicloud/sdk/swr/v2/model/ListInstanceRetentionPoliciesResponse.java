package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstanceRetentionPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retentions")

    private List<ImageRetention> retentions = null;

    public ListInstanceRetentionPoliciesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 策略总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInstanceRetentionPoliciesResponse withRetentions(List<ImageRetention> retentions) {
        this.retentions = retentions;
        return this;
    }

    public ListInstanceRetentionPoliciesResponse addRetentionsItem(ImageRetention retentionsItem) {
        if (this.retentions == null) {
            this.retentions = new ArrayList<>();
        }
        this.retentions.add(retentionsItem);
        return this;
    }

    public ListInstanceRetentionPoliciesResponse withRetentions(Consumer<List<ImageRetention>> retentionsSetter) {
        if (this.retentions == null) {
            this.retentions = new ArrayList<>();
        }
        retentionsSetter.accept(this.retentions);
        return this;
    }

    /**
     * 老化策略详情
     * @return retentions
     */
    public List<ImageRetention> getRetentions() {
        return retentions;
    }

    public void setRetentions(List<ImageRetention> retentions) {
        this.retentions = retentions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceRetentionPoliciesResponse that = (ListInstanceRetentionPoliciesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.retentions, that.retentions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, retentions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceRetentionPoliciesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    retentions: ").append(toIndentedString(retentions)).append("\n");
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
