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
public class ListSupportBindingConnectionBandwidthsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area")

    private String localArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_area")

    private String remoteArea;

    /**
     * 根据支持绑定实例类型过滤全域互联带宽列表。实例类型： - CC: 云连接 - GEIP: 全域弹性公网IP - GCN: 中心网络 - GSN: 分支网络
     */
    public static final class BindingServiceEnum {

        /**
         * Enum CC for value: "CC"
         */
        public static final BindingServiceEnum CC = new BindingServiceEnum("CC");

        /**
         * Enum GEIP for value: "GEIP"
         */
        public static final BindingServiceEnum GEIP = new BindingServiceEnum("GEIP");

        /**
         * Enum GCN for value: "GCN"
         */
        public static final BindingServiceEnum GCN = new BindingServiceEnum("GCN");

        /**
         * Enum GSN for value: "GSN"
         */
        public static final BindingServiceEnum GSN = new BindingServiceEnum("GSN");

        private static final Map<String, BindingServiceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BindingServiceEnum> createStaticFields() {
            Map<String, BindingServiceEnum> map = new HashMap<>();
            map.put("CC", CC);
            map.put("GEIP", GEIP);
            map.put("GCN", GCN);
            map.put("GSN", GSN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BindingServiceEnum(String value) {
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
        public static BindingServiceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BindingServiceEnum(value));
        }

        public static BindingServiceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BindingServiceEnum) {
                return this.value.equals(((BindingServiceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_service")

    private BindingServiceEnum bindingService;

    public ListSupportBindingConnectionBandwidthsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页返回的个数。 取值范围：1~1000。
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

    public ListSupportBindingConnectionBandwidthsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 翻页信息，从上次API调用返回的翻页数据中获取，可填写前一页marker或者后一页marker，填入前一页previous_marker就向前翻页，后一页next_marker就向后翻页。 翻页过程中，查询条件不能修改，包括过滤条件、排序条件、limit。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSupportBindingConnectionBandwidthsRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListSupportBindingConnectionBandwidthsRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListSupportBindingConnectionBandwidthsRequest withEnterpriseProjectId(
        Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 根据企业项目ID过滤列表。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListSupportBindingConnectionBandwidthsRequest withLocalArea(String localArea) {
        this.localArea = localArea;
        return this;
    }

    /**
     * 功能说明：本端接入点。   如果是region类型，则返回所有满足条件的城域带宽，不进行该字段的匹配过滤   如果是其他类型，则会用该字段跟全域互联带宽的local_area进行匹配过滤   附带过滤条件：会通过local_area和remote_area推算最佳全域互联带宽类型进行过滤查询   限制：local_area和remote_area同为空或者同不为空，且站点类型需一致
     * @return localArea
     */
    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    public ListSupportBindingConnectionBandwidthsRequest withRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
        return this;
    }

    /**
     * 功能说明：远端接入点。   如果是region类型，则返回所有满足条件的城域带宽，不进行该字段的匹配过滤   如果是其他类型，则会用该字段跟全域互联带宽的remote_area进行匹配过滤   附带过滤条件：会通过local_area和remote_area推算最佳全域互联带宽类型进行过滤查询   限制：local_area和remote_area同为空或者同不为空，且站点类型需一致
     * @return remoteArea
     */
    public String getRemoteArea() {
        return remoteArea;
    }

    public void setRemoteArea(String remoteArea) {
        this.remoteArea = remoteArea;
    }

    public ListSupportBindingConnectionBandwidthsRequest withBindingService(BindingServiceEnum bindingService) {
        this.bindingService = bindingService;
        return this;
    }

    /**
     * 根据支持绑定实例类型过滤全域互联带宽列表。实例类型： - CC: 云连接 - GEIP: 全域弹性公网IP - GCN: 中心网络 - GSN: 分支网络
     * @return bindingService
     */
    public BindingServiceEnum getBindingService() {
        return bindingService;
    }

    public void setBindingService(BindingServiceEnum bindingService) {
        this.bindingService = bindingService;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSupportBindingConnectionBandwidthsRequest that = (ListSupportBindingConnectionBandwidthsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.localArea, that.localArea) && Objects.equals(this.remoteArea, that.remoteArea)
            && Objects.equals(this.bindingService, that.bindingService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, enterpriseProjectId, localArea, remoteArea, bindingService);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSupportBindingConnectionBandwidthsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    localArea: ").append(toIndentedString(localArea)).append("\n");
        sb.append("    remoteArea: ").append(toIndentedString(remoteArea)).append("\n");
        sb.append("    bindingService: ").append(toIndentedString(bindingService)).append("\n");
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
