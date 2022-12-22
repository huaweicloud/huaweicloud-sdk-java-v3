package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListSimCardsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_search_type")

    private Integer mainSearchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_search_key")

    private String mainSearchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_status")

    private Integer simStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_status")

    private Integer deviceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private List<Long> tagId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_type")

    private Integer simType;

    /**
     * 排序的顺序，asc表示顺序排序，desc表示倒序排序，不传则默认asc
     */
    public static final class OrderEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
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
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OrderEnum(value);
            }
            return result;
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private OrderEnum order;

    /**
     * 排序的属性，目前支持:cid（容器ID）、flow_used（已用流量）、flow_left（剩余流量）、act_date（激活时间）、expire_time（到期时间）
     */
    public static final class SortEnum {

        /**
         * Enum CID for value: "cid"
         */
        public static final SortEnum CID = new SortEnum("cid");

        /**
         * Enum FLOW_USED for value: "flow_used"
         */
        public static final SortEnum FLOW_USED = new SortEnum("flow_used");

        /**
         * Enum FLOW_LEFT for value: "flow_left"
         */
        public static final SortEnum FLOW_LEFT = new SortEnum("flow_left");

        /**
         * Enum ACT_DATE for value: "act_date"
         */
        public static final SortEnum ACT_DATE = new SortEnum("act_date");

        /**
         * Enum EXPIRE_TIME for value: "expire_time"
         */
        public static final SortEnum EXPIRE_TIME = new SortEnum("expire_time");

        private static final Map<String, SortEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortEnum> createStaticFields() {
            Map<String, SortEnum> map = new HashMap<>();
            map.put("cid", CID);
            map.put("flow_used", FLOW_USED);
            map.put("flow_left", FLOW_LEFT);
            map.put("act_date", ACT_DATE);
            map.put("expire_time", EXPIRE_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortEnum(String value) {
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
        public static SortEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortEnum(value);
            }
            return result;
        }

        public static SortEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortEnum) {
                return this.value.equals(((SortEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private SortEnum sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msisdn")

    private String msisdn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute1")

    private String customerAttribute1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute2")

    private String customerAttribute2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute3")

    private String customerAttribute3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute4")

    private String customerAttribute4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute5")

    private String customerAttribute5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_attribute6")

    private String customerAttribute6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_used_flow")

    private Long minUsedFlow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_used_flow")

    private Long maxUsedFlow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_left_flow")

    private Long minLeftFlow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_left_flow")

    private Long maxLeftFlow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_named")

    private Boolean realNamed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private Long orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_downtime_period")

    private Boolean filterDowntimePeriod;

    public ListSimCardsRequest withMainSearchType(Integer mainSearchType) {
        this.mainSearchType = mainSearchType;
        return this;
    }

    /**
     * 查询关键标识类型： 1.容器ID(不同类型卡含义如下:ICCID(实体卡)，EID（eSIM）CID（vSIM)) 2.批次号 3.设备IMEI
     * minimum: 0
     * maximum: 2147483647
     * @return mainSearchType
     */
    public Integer getMainSearchType() {
        return mainSearchType;
    }

    public void setMainSearchType(Integer mainSearchType) {
        this.mainSearchType = mainSearchType;
    }

    public ListSimCardsRequest withMainSearchKey(String mainSearchKey) {
        this.mainSearchKey = mainSearchKey;
        return this;
    }

    /**
     * 查询关键标识值：根据查询关键标识类型进行查询，例如想根据ICCID=xxx进行查询，则main_search_type=1&main_search_key=xxx
     * @return mainSearchKey
     */
    public String getMainSearchKey() {
        return mainSearchKey;
    }

    public void setMainSearchKey(String mainSearchKey) {
        this.mainSearchKey = mainSearchKey;
    }

    public ListSimCardsRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时每页显示的记录数，默认值为10，取值范围为10-500的整数
     * minimum: 10
     * maximum: 500
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListSimCardsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询时的页码数，默认值为1，取值范围为1-1000000的整数
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListSimCardsRequest withSimStatus(Integer simStatus) {
        this.simStatus = simStatus;
        return this;
    }

    /**
     * sim卡状态：  10.可测试  11.未激活  13.可激活  14.已停用  20.在用  30.已拆机
     * minimum: 0
     * maximum: 2147483647
     * @return simStatus
     */
    public Integer getSimStatus() {
        return simStatus;
    }

    public void setSimStatus(Integer simStatus) {
        this.simStatus = simStatus;
    }

    public ListSimCardsRequest withDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }

    /**
     * 设备状态: 1.注册 2.重启 3.在线 4.离线
     * minimum: 0
     * maximum: 2147483647
     * @return deviceStatus
     */
    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public ListSimCardsRequest withTagId(List<Long> tagId) {
        this.tagId = tagId;
        return this;
    }

    public ListSimCardsRequest addTagIdItem(Long tagIdItem) {
        if (this.tagId == null) {
            this.tagId = new ArrayList<>();
        }
        this.tagId.add(tagIdItem);
        return this;
    }

    public ListSimCardsRequest withTagId(Consumer<List<Long>> tagIdSetter) {
        if (this.tagId == null) {
            this.tagId = new ArrayList<>();
        }
        tagIdSetter.accept(this.tagId);
        return this;
    }

    /**
     * 标签ID，最多支持传10个
     * @return tagId
     */
    public List<Long> getTagId() {
        return tagId;
    }

    public void setTagId(List<Long> tagId) {
        this.tagId = tagId;
    }

    public ListSimCardsRequest withSimType(Integer simType) {
        this.simType = simType;
        return this;
    }

    /**
     * sim卡类型：  1.vSIM  2.eSIM  3.实体卡
     * minimum: 0
     * maximum: 2147483647
     * @return simType
     */
    public Integer getSimType() {
        return simType;
    }

    public void setSimType(Integer simType) {
        this.simType = simType;
    }

    public ListSimCardsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 排序的顺序，asc表示顺序排序，desc表示倒序排序，不传则默认asc
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public ListSimCardsRequest withSort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序的属性，目前支持:cid（容器ID）、flow_used（已用流量）、flow_left（剩余流量）、act_date（激活时间）、expire_time（到期时间）
     * @return sort
     */
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    public ListSimCardsRequest withMsisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }

    /**
     * MSISDN
     * @return msisdn
     */
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public ListSimCardsRequest withCustomerAttribute1(String customerAttribute1) {
        this.customerAttribute1 = customerAttribute1;
        return this;
    }

    /**
     * 自定义属性一
     * @return customerAttribute1
     */
    public String getCustomerAttribute1() {
        return customerAttribute1;
    }

    public void setCustomerAttribute1(String customerAttribute1) {
        this.customerAttribute1 = customerAttribute1;
    }

    public ListSimCardsRequest withCustomerAttribute2(String customerAttribute2) {
        this.customerAttribute2 = customerAttribute2;
        return this;
    }

    /**
     * 自定义属性二
     * @return customerAttribute2
     */
    public String getCustomerAttribute2() {
        return customerAttribute2;
    }

    public void setCustomerAttribute2(String customerAttribute2) {
        this.customerAttribute2 = customerAttribute2;
    }

    public ListSimCardsRequest withCustomerAttribute3(String customerAttribute3) {
        this.customerAttribute3 = customerAttribute3;
        return this;
    }

    /**
     * 自定义属性三
     * @return customerAttribute3
     */
    public String getCustomerAttribute3() {
        return customerAttribute3;
    }

    public void setCustomerAttribute3(String customerAttribute3) {
        this.customerAttribute3 = customerAttribute3;
    }

    public ListSimCardsRequest withCustomerAttribute4(String customerAttribute4) {
        this.customerAttribute4 = customerAttribute4;
        return this;
    }

    /**
     * 自定义属性四
     * @return customerAttribute4
     */
    public String getCustomerAttribute4() {
        return customerAttribute4;
    }

    public void setCustomerAttribute4(String customerAttribute4) {
        this.customerAttribute4 = customerAttribute4;
    }

    public ListSimCardsRequest withCustomerAttribute5(String customerAttribute5) {
        this.customerAttribute5 = customerAttribute5;
        return this;
    }

    /**
     * 自定义属性五
     * @return customerAttribute5
     */
    public String getCustomerAttribute5() {
        return customerAttribute5;
    }

    public void setCustomerAttribute5(String customerAttribute5) {
        this.customerAttribute5 = customerAttribute5;
    }

    public ListSimCardsRequest withCustomerAttribute6(String customerAttribute6) {
        this.customerAttribute6 = customerAttribute6;
        return this;
    }

    /**
     * 自定义属性六
     * @return customerAttribute6
     */
    public String getCustomerAttribute6() {
        return customerAttribute6;
    }

    public void setCustomerAttribute6(String customerAttribute6) {
        this.customerAttribute6 = customerAttribute6;
    }

    public ListSimCardsRequest withMinUsedFlow(Long minUsedFlow) {
        this.minUsedFlow = minUsedFlow;
        return this;
    }

    /**
     * 最小使用流量(MB)
     * minimum: 0
     * maximum: 2147483647
     * @return minUsedFlow
     */
    public Long getMinUsedFlow() {
        return minUsedFlow;
    }

    public void setMinUsedFlow(Long minUsedFlow) {
        this.minUsedFlow = minUsedFlow;
    }

    public ListSimCardsRequest withMaxUsedFlow(Long maxUsedFlow) {
        this.maxUsedFlow = maxUsedFlow;
        return this;
    }

    /**
     * 最大使用流量(MB)
     * minimum: 0
     * maximum: 2147483647
     * @return maxUsedFlow
     */
    public Long getMaxUsedFlow() {
        return maxUsedFlow;
    }

    public void setMaxUsedFlow(Long maxUsedFlow) {
        this.maxUsedFlow = maxUsedFlow;
    }

    public ListSimCardsRequest withMinLeftFlow(Long minLeftFlow) {
        this.minLeftFlow = minLeftFlow;
        return this;
    }

    /**
     * 最小剩余流量(MB)
     * minimum: 0
     * maximum: 2147483647
     * @return minLeftFlow
     */
    public Long getMinLeftFlow() {
        return minLeftFlow;
    }

    public void setMinLeftFlow(Long minLeftFlow) {
        this.minLeftFlow = minLeftFlow;
    }

    public ListSimCardsRequest withMaxLeftFlow(Long maxLeftFlow) {
        this.maxLeftFlow = maxLeftFlow;
        return this;
    }

    /**
     * 最大剩余流量(MB)
     * minimum: 0
     * maximum: 2147483647
     * @return maxLeftFlow
     */
    public Long getMaxLeftFlow() {
        return maxLeftFlow;
    }

    public void setMaxLeftFlow(Long maxLeftFlow) {
        this.maxLeftFlow = maxLeftFlow;
    }

    public ListSimCardsRequest withRealNamed(Boolean realNamed) {
        this.realNamed = realNamed;
        return this;
    }

    /**
     * 是否已实名认证: true表示是，false表示否，系统SIM卡实名认证状态非实时。
     * @return realNamed
     */
    public Boolean getRealNamed() {
        return realNamed;
    }

    public void setRealNamed(Boolean realNamed) {
        this.realNamed = realNamed;
    }

    public ListSimCardsRequest withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单号
     * minimum: 0
     * maximum: 9223372036854774784
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public ListSimCardsRequest withFilterDowntimePeriod(Boolean filterDowntimePeriod) {
        this.filterDowntimePeriod = filterDowntimePeriod;
        return this;
    }

    /**
     * 是否过滤停机保号的卡
     * @return filterDowntimePeriod
     */
    public Boolean getFilterDowntimePeriod() {
        return filterDowntimePeriod;
    }

    public void setFilterDowntimePeriod(Boolean filterDowntimePeriod) {
        this.filterDowntimePeriod = filterDowntimePeriod;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSimCardsRequest listSimCardsRequest = (ListSimCardsRequest) o;
        return Objects.equals(this.mainSearchType, listSimCardsRequest.mainSearchType)
            && Objects.equals(this.mainSearchKey, listSimCardsRequest.mainSearchKey)
            && Objects.equals(this.limit, listSimCardsRequest.limit)
            && Objects.equals(this.offset, listSimCardsRequest.offset)
            && Objects.equals(this.simStatus, listSimCardsRequest.simStatus)
            && Objects.equals(this.deviceStatus, listSimCardsRequest.deviceStatus)
            && Objects.equals(this.tagId, listSimCardsRequest.tagId)
            && Objects.equals(this.simType, listSimCardsRequest.simType)
            && Objects.equals(this.order, listSimCardsRequest.order)
            && Objects.equals(this.sort, listSimCardsRequest.sort)
            && Objects.equals(this.msisdn, listSimCardsRequest.msisdn)
            && Objects.equals(this.customerAttribute1, listSimCardsRequest.customerAttribute1)
            && Objects.equals(this.customerAttribute2, listSimCardsRequest.customerAttribute2)
            && Objects.equals(this.customerAttribute3, listSimCardsRequest.customerAttribute3)
            && Objects.equals(this.customerAttribute4, listSimCardsRequest.customerAttribute4)
            && Objects.equals(this.customerAttribute5, listSimCardsRequest.customerAttribute5)
            && Objects.equals(this.customerAttribute6, listSimCardsRequest.customerAttribute6)
            && Objects.equals(this.minUsedFlow, listSimCardsRequest.minUsedFlow)
            && Objects.equals(this.maxUsedFlow, listSimCardsRequest.maxUsedFlow)
            && Objects.equals(this.minLeftFlow, listSimCardsRequest.minLeftFlow)
            && Objects.equals(this.maxLeftFlow, listSimCardsRequest.maxLeftFlow)
            && Objects.equals(this.realNamed, listSimCardsRequest.realNamed)
            && Objects.equals(this.orderId, listSimCardsRequest.orderId)
            && Objects.equals(this.filterDowntimePeriod, listSimCardsRequest.filterDowntimePeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainSearchType,
            mainSearchKey,
            limit,
            offset,
            simStatus,
            deviceStatus,
            tagId,
            simType,
            order,
            sort,
            msisdn,
            customerAttribute1,
            customerAttribute2,
            customerAttribute3,
            customerAttribute4,
            customerAttribute5,
            customerAttribute6,
            minUsedFlow,
            maxUsedFlow,
            minLeftFlow,
            maxLeftFlow,
            realNamed,
            orderId,
            filterDowntimePeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSimCardsRequest {\n");
        sb.append("    mainSearchType: ").append(toIndentedString(mainSearchType)).append("\n");
        sb.append("    mainSearchKey: ").append(toIndentedString(mainSearchKey)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    simStatus: ").append(toIndentedString(simStatus)).append("\n");
        sb.append("    deviceStatus: ").append(toIndentedString(deviceStatus)).append("\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    simType: ").append(toIndentedString(simType)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
        sb.append("    customerAttribute1: ").append(toIndentedString(customerAttribute1)).append("\n");
        sb.append("    customerAttribute2: ").append(toIndentedString(customerAttribute2)).append("\n");
        sb.append("    customerAttribute3: ").append(toIndentedString(customerAttribute3)).append("\n");
        sb.append("    customerAttribute4: ").append(toIndentedString(customerAttribute4)).append("\n");
        sb.append("    customerAttribute5: ").append(toIndentedString(customerAttribute5)).append("\n");
        sb.append("    customerAttribute6: ").append(toIndentedString(customerAttribute6)).append("\n");
        sb.append("    minUsedFlow: ").append(toIndentedString(minUsedFlow)).append("\n");
        sb.append("    maxUsedFlow: ").append(toIndentedString(maxUsedFlow)).append("\n");
        sb.append("    minLeftFlow: ").append(toIndentedString(minLeftFlow)).append("\n");
        sb.append("    maxLeftFlow: ").append(toIndentedString(maxLeftFlow)).append("\n");
        sb.append("    realNamed: ").append(toIndentedString(realNamed)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    filterDowntimePeriod: ").append(toIndentedString(filterDowntimePeriod)).append("\n");
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
