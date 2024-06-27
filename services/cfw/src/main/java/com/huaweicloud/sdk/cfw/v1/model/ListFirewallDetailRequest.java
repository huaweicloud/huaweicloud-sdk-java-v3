package com.huaweicloud.sdk.cfw.v1.model;

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
public class ListFirewallDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    /**
     * 服务类型 0 南北向防火墙 1 东西向防火墙
     */
    public static final class ServiceTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ServiceTypeEnum NUMBER_0 = new ServiceTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ServiceTypeEnum NUMBER_1 = new ServiceTypeEnum(1);

        private static final Map<Integer, ServiceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ServiceTypeEnum> createStaticFields() {
            Map<Integer, ServiceTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ServiceTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ServiceTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServiceTypeEnum(value));
        }

        public static ServiceTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceTypeEnum) {
                return this.value.equals(((ServiceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private ServiceTypeEnum serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_id")

    private String fwInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ListFirewallDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListFirewallDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数，范围为1-1024
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFirewallDetailRequest withServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型 0 南北向防火墙 1 东西向防火墙
     * minimum: 0
     * maximum: 1
     * @return serviceType
     */
    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public ListFirewallDetailRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，用户支持企业项目后，由企业项目生成的id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListFirewallDetailRequest withFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
        return this;
    }

    /**
     * 防火墙实例id，创建云防火墙后用于标志防火墙由系统自动生成的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)，默认情况下，fw_instance_Id为空时，返回账号下第一个墙的信息；fw_instance_Id非空时，返回与fw_instance_Id对应墙的信息。
     * @return fwInstanceId
     */
    public String getFwInstanceId() {
        return fwInstanceId;
    }

    public void setFwInstanceId(String fwInstanceId) {
        this.fwInstanceId = fwInstanceId;
    }

    public ListFirewallDetailRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 防火墙名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFirewallDetailRequest that = (ListFirewallDetailRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.fwInstanceId, that.fwInstanceId) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, serviceType, enterpriseProjectId, fwInstanceId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFirewallDetailRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    fwInstanceId: ").append(toIndentedString(fwInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
