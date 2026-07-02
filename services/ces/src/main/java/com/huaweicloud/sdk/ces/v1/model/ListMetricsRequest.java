package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListMetricsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.0")

    private String dim0;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.1")

    private String dim1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.2")

    private String dim2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.3")

    private String dim3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * **参数解释** 用于标识结果的排序方法 **约束限制** 不涉及 **取值范围** 枚举值： - asc 升序 - desc 降序 **默认取值** asc 
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderEnum(value));
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public ListMetricsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释** 服务命名空间，样例：弹性云服务器的命名空间为SYS.ECS。 各服务命名空间请参阅[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)。 **约束限制** 不涉及 **取值范围** 格式为service.item，service和item以点号拼接组成。 service和item必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_），长度为[3,32]个字符 **默认取值** 不涉及 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListMetricsRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释** 资源的监控指标名称，样例：弹性云服务器监控指标中的cpu_util。 各服务资源的指标名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档。 **约束限制** 不涉及 **取值范围** 必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符 （-），长度为[1,96]个字符 **默认取值** 不涉及 
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ListMetricsRequest withDim0(String dim0) {
        this.dim0 = dim0;
        return this;
    }

    /**
     * **参数解释** 指标的第一个维度，目前最多支持4个维度，维度格式为dim.{i}=key,value。样例：instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d 各服务资源的维度名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档。 **约束限制** 不涉及 **取值范围** dim.0=key,value，由key、value以逗号拼接组成。 key必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符（-），长度为[1,32]个字符 value由多个字母（大写或小写）、数字、下划线（_）、连字符（-）、点（.）、斜杠（/）、井号（#）、英文左括号（(）、英文右括号（)）组合而成，首个字符可以包含星号（*），但不能以连字符（-）开头，长度为[1,256]个字符 **默认取值** 不涉及 
     * @return dim0
     */
    public String getDim0() {
        return dim0;
    }

    public void setDim0(String dim0) {
        this.dim0 = dim0;
    }

    public ListMetricsRequest withDim1(String dim1) {
        this.dim1 = dim1;
        return this;
    }

    /**
     * **参数解释** 指标的第二个维度，目前最多支持4个维度，维度格式为dim.{i}=key,value。样例：instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d 各服务资源的维度名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档。 **约束限制** 不涉及 **取值范围** dim.1=key,value，由key、value以逗号拼接组成。 key必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符（-），长度为[1,32]个字符 value由多个字母（大写或小写）、数字、下划线（_）、连字符（-）、点（.）、斜杠（/）、井号（#）、英文左括号（(）、英文右括号（)）组合而成，首个字符可以包含星号（*），但不能以连字符（-）开头，长度为[1,256]个字符 **默认取值** 不涉及 
     * @return dim1
     */
    public String getDim1() {
        return dim1;
    }

    public void setDim1(String dim1) {
        this.dim1 = dim1;
    }

    public ListMetricsRequest withDim2(String dim2) {
        this.dim2 = dim2;
        return this;
    }

    /**
     * **参数解释** 指标的第三个维度，目前最多支持4个维度，维度格式为dim.{i}=key,value。样例：instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d 各服务资源的维度名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档。 **约束限制** 不涉及 **取值范围** dim.2=key,value，由key、value以逗号拼接组成。 key必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符（-），长度为[1,32]个字符 value由多个字母（大写或小写）、数字、下划线（_）、连字符（-）、点（.）、斜杠（/）、井号（#）、英文左括号（(）、英文右括号（)）组合而成，首个字符可以包含星号（*），但不能以连字符（-）开头，长度为[1,256]个字符 **默认取值** 不涉及 
     * @return dim2
     */
    public String getDim2() {
        return dim2;
    }

    public void setDim2(String dim2) {
        this.dim2 = dim2;
    }

    public ListMetricsRequest withDim3(String dim3) {
        this.dim3 = dim3;
        return this;
    }

    /**
     * **参数解释** 指标的第四个维度，目前最多支持4个维度，维度格式为dim.{i}=key,value。样例：instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d 各服务资源的维度名称，请参阅具体云服务的文档。您可以直接从[[支持监控的服务列表](https://support.huaweicloud.com/api-ces/ces_03_0059.html)](tag:hc)[[支持监控的服务列表](https://support.huaweicloud.com/intl/zh-cn/api-ces/ces_03_0059.html)](tag:hk)[[支持监控的服务列表](https://support.huaweicloud.com/eu/en-us/api-ces/ces_03_0059.html)](tag:hws_eu)[[支持监控的服务列表](ces_03_0059.xml)](tag:ax,cmcc,ctc,dt,dt_test,hcso_dt,fcs,fcs_vm,mix,g42,hk_g42,hk_sbc,hk_tm,hk_vdf,hws_ocb,ocb,sbc,srg)页面导航至相应文档。 **约束限制** 不涉及 **取值范围** dim.3=key,value，由key、value以逗号拼接组成。 key必须以字母（大写或小写）开头，后面可以跟零个或多个字母（大写或小写）、数字、下划线（_）、连字符（-），长度为[1,32]个字符 value由多个字母（大写或小写）、数字、下划线（_）、连字符（-）、点（.）、斜杠（/）、井号（#）、英文左括号（(）、英文右括号（)）组合而成，首个字符可以包含星号（*），但不能以连字符（-）开头，长度为[1,256]个字符 **默认取值** 不涉及 
     * @return dim3
     */
    public String getDim3() {
        return dim3;
    }

    public void setDim3(String dim3) {
        this.dim3 = dim3;
    }

    public ListMetricsRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * **参数解释** 分页起始值，格式为：namespace.metric_name.key:value 例如：start=SYS.ECS.cpu_util.instance_id:d9112af5-6913-4f3b-bd0a-3f96711e004d **约束限制** 不涉及 **取值范围** 首次传空字符串，后续请求传递上一页返回值内的marker字段，作为下一页请求的分页起始值 **默认取值** 不涉及 
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public ListMetricsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释** 单次查询的条数限制 **约束限制** 不涉及 **取值范围** 条数限制为[1,1000] **默认取值** 1000 
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListMetricsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释** 用于标识结果的排序方法 **约束限制** 不涉及 **取值范围** 枚举值： - asc 升序 - desc 降序 **默认取值** asc 
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMetricsRequest that = (ListMetricsRequest) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.dim0, that.dim0) && Objects.equals(this.dim1, that.dim1)
            && Objects.equals(this.dim2, that.dim2) && Objects.equals(this.dim3, that.dim3)
            && Objects.equals(this.start, that.start) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, metricName, dim0, dim1, dim2, dim3, start, limit, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricsRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    dim0: ").append(toIndentedString(dim0)).append("\n");
        sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
        sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
        sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
