package com.huaweicloud.sdk.cc.v3.model;

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
public class ListBandwidthPackagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    /**
    * Gets or Sets status
    */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
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

    private List<StatusEnum> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    private List<String> billingMode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private List<String> resourceId = null;

    public ListBandwidthPackagesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时，每页返回的个数。
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListBandwidthPackagesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询时，上一页最后一条记录的ID，为空时为查询第一页。 使用说明：必须与limit一起使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListBandwidthPackagesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListBandwidthPackagesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListBandwidthPackagesRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据ID过滤带宽包实例列表。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListBandwidthPackagesRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListBandwidthPackagesRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListBandwidthPackagesRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 根据名称过滤带宽包实例列表。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListBandwidthPackagesRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    public ListBandwidthPackagesRequest addStatusItem(StatusEnum statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListBandwidthPackagesRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 根据状态过滤带宽包实例列表。ACTIVE：表示状态可用。
     * @return status
     */
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    public ListBandwidthPackagesRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListBandwidthPackagesRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListBandwidthPackagesRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 根据企业项目ID过滤带宽包实例列表。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListBandwidthPackagesRequest withBillingMode(List<String> billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    public ListBandwidthPackagesRequest addBillingModeItem(String billingModeItem) {
        if (this.billingMode == null) {
            this.billingMode = new ArrayList<>();
        }
        this.billingMode.add(billingModeItem);
        return this;
    }

    public ListBandwidthPackagesRequest withBillingMode(Consumer<List<String>> billingModeSetter) {
        if (this.billingMode == null) {
            this.billingMode = new ArrayList<>();
        }
        billingModeSetter.accept(this.billingMode);
        return this;
    }

    /**
     * 根据计费方式过滤带宽包实例列表。
     * @return billingMode
     */
    public List<String> getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(List<String> billingMode) {
        this.billingMode = billingMode;
    }

    public ListBandwidthPackagesRequest withResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public ListBandwidthPackagesRequest addResourceIdItem(String resourceIdItem) {
        if (this.resourceId == null) {
            this.resourceId = new ArrayList<>();
        }
        this.resourceId.add(resourceIdItem);
        return this;
    }

    public ListBandwidthPackagesRequest withResourceId(Consumer<List<String>> resourceIdSetter) {
        if (this.resourceId == null) {
            this.resourceId = new ArrayList<>();
        }
        resourceIdSetter.accept(this.resourceId);
        return this;
    }

    /**
     * 根据绑定的资源ID过滤带宽包实例列表。
     * @return resourceId
     */
    public List<String> getResourceId() {
        return resourceId;
    }

    public void setResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBandwidthPackagesRequest listBandwidthPackagesRequest = (ListBandwidthPackagesRequest) o;
        return Objects.equals(this.limit, listBandwidthPackagesRequest.limit)
            && Objects.equals(this.marker, listBandwidthPackagesRequest.marker)
            && Objects.equals(this.id, listBandwidthPackagesRequest.id)
            && Objects.equals(this.name, listBandwidthPackagesRequest.name)
            && Objects.equals(this.status, listBandwidthPackagesRequest.status)
            && Objects.equals(this.enterpriseProjectId, listBandwidthPackagesRequest.enterpriseProjectId)
            && Objects.equals(this.billingMode, listBandwidthPackagesRequest.billingMode)
            && Objects.equals(this.resourceId, listBandwidthPackagesRequest.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, name, status, enterpriseProjectId, billingMode, resourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthPackagesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
