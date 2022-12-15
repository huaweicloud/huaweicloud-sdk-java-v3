package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * agent搜索参数。
 */
public class AgentSearchParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private Long businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    /**
     * 探针状态。
     */
    public static final class StatusEnum {

        /**
         * Enum ONLINE for value: "online"
         */
        public static final StatusEnum ONLINE = new StatusEnum("online");

        /**
         * Enum DISABLE for value: "disable"
         */
        public static final StatusEnum DISABLE = new StatusEnum("disable");

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final StatusEnum OFFLINE = new StatusEnum("offline");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("online", ONLINE);
            map.put("disable", DISABLE);
            map.put("offline", OFFLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by_status")

    private String orderByStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    public AgentSearchParam withBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id。
     * @return businessId
     */
    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public AgentSearchParam withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public AgentSearchParam withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 探针状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AgentSearchParam withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region英文名称。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AgentSearchParam withOrderByStatus(String orderByStatus) {
        this.orderByStatus = orderByStatus;
        return this;
    }

    /**
     * 是否按照采集状态排序,默认不填则不按状态排序，填y则按照状态排序。
     * @return orderByStatus
     */
    public String getOrderByStatus() {
        return orderByStatus;
    }

    public void setOrderByStatus(String orderByStatus) {
        this.orderByStatus = orderByStatus;
    }

    public AgentSearchParam withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 需要查询的页码，最小数为1。
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public AgentSearchParam withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 查询结果每页最多显示的条数。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public AgentSearchParam withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgentSearchParam agentSearchParam = (AgentSearchParam) o;
        return Objects.equals(this.businessId, agentSearchParam.businessId)
            && Objects.equals(this.envId, agentSearchParam.envId)
            && Objects.equals(this.status, agentSearchParam.status)
            && Objects.equals(this.region, agentSearchParam.region)
            && Objects.equals(this.orderByStatus, agentSearchParam.orderByStatus)
            && Objects.equals(this.page, agentSearchParam.page)
            && Objects.equals(this.pageSize, agentSearchParam.pageSize)
            && Objects.equals(this.keyword, agentSearchParam.keyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessId, envId, status, region, orderByStatus, page, pageSize, keyword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentSearchParam {\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    orderByStatus: ").append(toIndentedString(orderByStatus)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
