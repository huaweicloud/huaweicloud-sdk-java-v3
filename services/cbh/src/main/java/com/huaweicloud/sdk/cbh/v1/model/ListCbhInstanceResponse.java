package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCbhInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_detail")

    @JacksonXmlProperty(localName = "quota_detail")

    private QuotaDetail quotaDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    @JacksonXmlProperty(localName = "instance")

    private List<InstanceDetail> instance = null;

    public ListCbhInstanceResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 实例总数
     * minimum: 0
     * maximum: 100
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListCbhInstanceResponse withQuotaDetail(QuotaDetail quotaDetail) {
        this.quotaDetail = quotaDetail;
        return this;
    }

    public ListCbhInstanceResponse withQuotaDetail(Consumer<QuotaDetail> quotaDetailSetter) {
        if (this.quotaDetail == null) {
            this.quotaDetail = new QuotaDetail();
            quotaDetailSetter.accept(this.quotaDetail);
        }

        return this;
    }

    /**
     * Get quotaDetail
     * @return quotaDetail
     */
    public QuotaDetail getQuotaDetail() {
        return quotaDetail;
    }

    public void setQuotaDetail(QuotaDetail quotaDetail) {
        this.quotaDetail = quotaDetail;
    }

    public ListCbhInstanceResponse withInstance(List<InstanceDetail> instance) {
        this.instance = instance;
        return this;
    }

    public ListCbhInstanceResponse addInstanceItem(InstanceDetail instanceItem) {
        if (this.instance == null) {
            this.instance = new ArrayList<>();
        }
        this.instance.add(instanceItem);
        return this;
    }

    public ListCbhInstanceResponse withInstance(Consumer<List<InstanceDetail>> instanceSetter) {
        if (this.instance == null) {
            this.instance = new ArrayList<>();
        }
        instanceSetter.accept(this.instance);
        return this;
    }

    /**
     * 实例列表
     * @return instance
     */
    public List<InstanceDetail> getInstance() {
        return instance;
    }

    public void setInstance(List<InstanceDetail> instance) {
        this.instance = instance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCbhInstanceResponse listCbhInstanceResponse = (ListCbhInstanceResponse) o;
        return Objects.equals(this.total, listCbhInstanceResponse.total)
            && Objects.equals(this.quotaDetail, listCbhInstanceResponse.quotaDetail)
            && Objects.equals(this.instance, listCbhInstanceResponse.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, quotaDetail, instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCbhInstanceResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    quotaDetail: ").append(toIndentedString(quotaDetail)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
