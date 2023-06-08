package com.huaweicloud.sdk.eds.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询列表
 */
public class OfferPage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offer_name")

    private String offerName;

    public OfferPage withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public OfferPage withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 分页大小
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public OfferPage withOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }

    /**
     * 邀约名称
     * @return offerName
     */
    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OfferPage offerPage = (OfferPage) o;
        return Objects.equals(this.page, offerPage.page) && Objects.equals(this.size, offerPage.size)
            && Objects.equals(this.offerName, offerPage.offerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, size, offerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferPage {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    offerName: ").append(toIndentedString(offerName)).append("\n");
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
