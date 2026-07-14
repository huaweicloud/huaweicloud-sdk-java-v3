package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 服务限制信息。
 */
public class ServiceLimitResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate_limit")

    private RateLimitResponse rateLimit;

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

    public ServiceLimitResponse withRateLimit(RateLimitResponse rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    public ServiceLimitResponse withRateLimit(Consumer<RateLimitResponse> rateLimitSetter) {
        if (this.rateLimit == null) {
            this.rateLimit = new RateLimitResponse();
            rateLimitSetter.accept(this.rateLimit);
        }

        return this;
    }

    /**
     * Get rateLimit
     * @return rateLimit
     */
    public RateLimitResponse getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimitResponse rateLimit) {
        this.rateLimit = rateLimit;
    }

    public ServiceLimitResponse withRequestSizeLimit(Integer requestSizeLimit) {
        this.requestSizeLimit = requestSizeLimit;
        return this;
    }

    /**
     * **参数解释：** 请求大小限制。 **取值范围：** 1-50M。
     * @return requestSizeLimit
     */
    public Integer getRequestSizeLimit() {
        return requestSizeLimit;
    }

    public void setRequestSizeLimit(Integer requestSizeLimit) {
        this.requestSizeLimit = requestSizeLimit;
    }

    public ServiceLimitResponse withRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * **参数解释：** 超时时间。 **取值范围：** 1到7200秒。
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public ServiceLimitResponse withIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }

    public ServiceLimitResponse addIpWhiteListItem(String ipWhiteListItem) {
        if (this.ipWhiteList == null) {
            this.ipWhiteList = new ArrayList<>();
        }
        this.ipWhiteList.add(ipWhiteListItem);
        return this;
    }

    public ServiceLimitResponse withIpWhiteList(Consumer<List<String>> ipWhiteListSetter) {
        if (this.ipWhiteList == null) {
            this.ipWhiteList = new ArrayList<>();
        }
        ipWhiteListSetter.accept(this.ipWhiteList);
        return this;
    }

    /**
     * **参数解释：** IP白名单。
     * @return ipWhiteList
     */
    public List<String> getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }

    public ServiceLimitResponse withIpBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
        return this;
    }

    public ServiceLimitResponse addIpBlackListItem(String ipBlackListItem) {
        if (this.ipBlackList == null) {
            this.ipBlackList = new ArrayList<>();
        }
        this.ipBlackList.add(ipBlackListItem);
        return this;
    }

    public ServiceLimitResponse withIpBlackList(Consumer<List<String>> ipBlackListSetter) {
        if (this.ipBlackList == null) {
            this.ipBlackList = new ArrayList<>();
        }
        ipBlackListSetter.accept(this.ipBlackList);
        return this;
    }

    /**
     * **参数解释：** IP黑名单。
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
        ServiceLimitResponse that = (ServiceLimitResponse) obj;
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
        sb.append("class ServiceLimitResponse {\n");
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
