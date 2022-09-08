package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDomainResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_info")

    private List<DecoupledLiveDomainInfo> domainInfo = null;

    public ShowDomainResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果的总数量
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ShowDomainResponse withDomainInfo(List<DecoupledLiveDomainInfo> domainInfo) {
        this.domainInfo = domainInfo;
        return this;
    }

    public ShowDomainResponse addDomainInfoItem(DecoupledLiveDomainInfo domainInfoItem) {
        if (this.domainInfo == null) {
            this.domainInfo = new ArrayList<>();
        }
        this.domainInfo.add(domainInfoItem);
        return this;
    }

    public ShowDomainResponse withDomainInfo(Consumer<List<DecoupledLiveDomainInfo>> domainInfoSetter) {
        if (this.domainInfo == null) {
            this.domainInfo = new ArrayList<>();
        }
        domainInfoSetter.accept(this.domainInfo);
        return this;
    }

    /**
     * 直播域名列表
     * @return domainInfo
     */
    public List<DecoupledLiveDomainInfo> getDomainInfo() {
        return domainInfo;
    }

    public void setDomainInfo(List<DecoupledLiveDomainInfo> domainInfo) {
        this.domainInfo = domainInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainResponse showDomainResponse = (ShowDomainResponse) o;
        return Objects.equals(this.total, showDomainResponse.total)
            && Objects.equals(this.domainInfo, showDomainResponse.domainInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, domainInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    domainInfo: ").append(toIndentedString(domainInfo)).append("\n");
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
