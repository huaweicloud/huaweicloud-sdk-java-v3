package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 交换IP请求体
 */
public class IpExchangeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exchanged_ip")

    private List<String> exchangedIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_exchange_domain")

    private Boolean isExchangeDomain;

    public IpExchangeRequest withExchangedIp(List<String> exchangedIp) {
        this.exchangedIp = exchangedIp;
        return this;
    }

    public IpExchangeRequest addExchangedIpItem(String exchangedIpItem) {
        if (this.exchangedIp == null) {
            this.exchangedIp = new ArrayList<>();
        }
        this.exchangedIp.add(exchangedIpItem);
        return this;
    }

    public IpExchangeRequest withExchangedIp(Consumer<List<String>> exchangedIpSetter) {
        if (this.exchangedIp == null) {
            this.exchangedIp = new ArrayList<>();
        }
        exchangedIpSetter.accept(this.exchangedIp);
        return this;
    }

    /**
     * 待交换的ip地址
     * @return exchangedIp
     */
    public List<String> getExchangedIp() {
        return exchangedIp;
    }

    public void setExchangedIp(List<String> exchangedIp) {
        this.exchangedIp = exchangedIp;
    }

    public IpExchangeRequest withIsExchangeDomain(Boolean isExchangeDomain) {
        this.isExchangeDomain = isExchangeDomain;
        return this;
    }

    /**
     * 是否交换domain
     * @return isExchangeDomain
     */
    public Boolean getIsExchangeDomain() {
        return isExchangeDomain;
    }

    public void setIsExchangeDomain(Boolean isExchangeDomain) {
        this.isExchangeDomain = isExchangeDomain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpExchangeRequest that = (IpExchangeRequest) obj;
        return Objects.equals(this.exchangedIp, that.exchangedIp)
            && Objects.equals(this.isExchangeDomain, that.isExchangeDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exchangedIp, isExchangeDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpExchangeRequest {\n");
        sb.append("    exchangedIp: ").append(toIndentedString(exchangedIp)).append("\n");
        sb.append("    isExchangeDomain: ").append(toIndentedString(isExchangeDomain)).append("\n");
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
