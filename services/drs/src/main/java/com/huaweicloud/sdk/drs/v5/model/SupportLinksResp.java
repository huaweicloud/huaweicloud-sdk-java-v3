package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询可用链路信息响应体
 */
public class SupportLinksResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_links")

    private List<SupportLinkInfo> supportLinks = null;

    public SupportLinksResp withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 列表中的项目总数，与分页无关。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public SupportLinksResp withSupportLinks(List<SupportLinkInfo> supportLinks) {
        this.supportLinks = supportLinks;
        return this;
    }

    public SupportLinksResp addSupportLinksItem(SupportLinkInfo supportLinksItem) {
        if (this.supportLinks == null) {
            this.supportLinks = new ArrayList<>();
        }
        this.supportLinks.add(supportLinksItem);
        return this;
    }

    public SupportLinksResp withSupportLinks(Consumer<List<SupportLinkInfo>> supportLinksSetter) {
        if (this.supportLinks == null) {
            this.supportLinks = new ArrayList<>();
        }
        supportLinksSetter.accept(this.supportLinks);
        return this;
    }

    /**
     * 支持的链路
     * @return supportLinks
     */
    public List<SupportLinkInfo> getSupportLinks() {
        return supportLinks;
    }

    public void setSupportLinks(List<SupportLinkInfo> supportLinks) {
        this.supportLinks = supportLinks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupportLinksResp that = (SupportLinksResp) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.supportLinks, that.supportLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, supportLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportLinksResp {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    supportLinks: ").append(toIndentedString(supportLinks)).append("\n");
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
