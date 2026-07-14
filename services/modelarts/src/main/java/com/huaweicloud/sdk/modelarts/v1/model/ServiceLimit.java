package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 服务限制信息。 **约束限制：** 不涉及。
 */
public class ServiceLimit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate_limit")

    private RateLimit rateLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_size_limit")

    private Integer requestSizeLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_timeout")

    private Integer requestTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_white_list")

    private List<String> ipWhiteList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_black_list")

    private List<String> ipBlackList = null;

    public ServiceLimit withRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    public ServiceLimit withRateLimit(Consumer<RateLimit> rateLimitSetter) {
        if (this.rateLimit == null) {
            this.rateLimit = new RateLimit();
            rateLimitSetter.accept(this.rateLimit);
        }

        return this;
    }

    /**
     * Get rateLimit
     * @return rateLimit
     */
    public RateLimit getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimit rateLimit) {
        this.rateLimit = rateLimit;
    }

    public ServiceLimit withRequestSizeLimit(Integer requestSizeLimit) {
        this.requestSizeLimit = requestSizeLimit;
        return this;
    }

    /**
     * **参数解释：** 请求大小限制。 **约束限制：** 不涉及。 **取值范围：** 1-50M。 **默认取值：** 不涉及。
     * @return requestSizeLimit
     */
    public Integer getRequestSizeLimit() {
        return requestSizeLimit;
    }

    public void setRequestSizeLimit(Integer requestSizeLimit) {
        this.requestSizeLimit = requestSizeLimit;
    }

    public ServiceLimit withRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * **参数解释：** 超时时间。 **约束限制：** 不涉及。 **取值范围：** 1到7200秒。 **默认取值：** 不涉及。
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public ServiceLimit withIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }

    public ServiceLimit addIpWhiteListItem(String ipWhiteListItem) {
        if (this.ipWhiteList == null) {
            this.ipWhiteList = new ArrayList<>();
        }
        this.ipWhiteList.add(ipWhiteListItem);
        return this;
    }

    public ServiceLimit withIpWhiteList(Consumer<List<String>> ipWhiteListSetter) {
        if (this.ipWhiteList == null) {
            this.ipWhiteList = new ArrayList<>();
        }
        ipWhiteListSetter.accept(this.ipWhiteList);
        return this;
    }

    /**
     * **参数解释：** IP白名单。 **约束限制：** 不涉及。
     * @return ipWhiteList
     */
    public List<String> getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    public ServiceLimit withIpBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
        return this;
    }

    public ServiceLimit addIpBlackListItem(String ipBlackListItem) {
        if (this.ipBlackList == null) {
            this.ipBlackList = new ArrayList<>();
        }
        this.ipBlackList.add(ipBlackListItem);
        return this;
    }

    public ServiceLimit withIpBlackList(Consumer<List<String>> ipBlackListSetter) {
        if (this.ipBlackList == null) {
            this.ipBlackList = new ArrayList<>();
        }
        ipBlackListSetter.accept(this.ipBlackList);
        return this;
    }

    /**
     * **参数解释：** IP黑名单。 **约束限制：** 不涉及。
     * @return ipBlackList
     */
    public List<String> getIpBlackList() {
        return ipBlackList;
    }

    public void setIpBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceLimit that = (ServiceLimit) obj;
        return Objects.equals(this.rateLimit, that.rateLimit)
            && Objects.equals(this.requestSizeLimit, that.requestSizeLimit)
            && Objects.equals(this.requestTimeout, that.requestTimeout)
            && Objects.equals(this.ipWhiteList, that.ipWhiteList) && Objects.equals(this.ipBlackList, that.ipBlackList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateLimit, requestSizeLimit, requestTimeout, ipWhiteList, ipBlackList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceLimit {\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    requestSizeLimit: ").append(toIndentedString(requestSizeLimit)).append("\n");
        sb.append("    requestTimeout: ").append(toIndentedString(requestTimeout)).append("\n");
        sb.append("    ipWhiteList: ").append(toIndentedString(ipWhiteList)).append("\n");
        sb.append("    ipBlackList: ").append(toIndentedString(ipBlackList)).append("\n");
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
