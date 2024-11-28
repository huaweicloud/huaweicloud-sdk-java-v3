package com.huaweicloud.sdk.codeartsinspector.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateCbcOrderRequestBody
 */
public class UpdateCbcOrderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_mode")

    private Integer changeMode;

    /**
     * 该请求参数为预留参数，当前不支持自动支付，使用接口时该参数请使用0 0：不自动支付 1：自动支付
     */
    public static final class IsAutoPayEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IsAutoPayEnum NUMBER_0 = new IsAutoPayEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsAutoPayEnum NUMBER_1 = new IsAutoPayEnum(1);

        private static final Map<Integer, IsAutoPayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsAutoPayEnum> createStaticFields() {
            Map<Integer, IsAutoPayEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsAutoPayEnum(Integer value) {
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
        public static IsAutoPayEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsAutoPayEnum(value));
        }

        public static IsAutoPayEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsAutoPayEnum) {
                return this.value.equals(((IsAutoPayEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private IsAutoPayEnum isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private UpdateCbcOrderRequestBodyProductInfo productInfo;

    public UpdateCbcOrderRequestBody withChangeMode(Integer changeMode) {
        this.changeMode = changeMode;
        return this;
    }

    /**
     * change_mode
     * @return changeMode
     */
    public Integer getChangeMode() {
        return changeMode;
    }

    public void setChangeMode(Integer changeMode) {
        this.changeMode = changeMode;
    }

    public UpdateCbcOrderRequestBody withIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 该请求参数为预留参数，当前不支持自动支付，使用接口时该参数请使用0 0：不自动支付 1：自动支付
     * minimum: 0
     * maximum: 1
     * @return isAutoPay
     */
    public IsAutoPayEnum getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(IsAutoPayEnum isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public UpdateCbcOrderRequestBody withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 发起规格变更操作的云服务类型
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public UpdateCbcOrderRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * project_id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateCbcOrderRequestBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源标识ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public UpdateCbcOrderRequestBody withProductInfo(UpdateCbcOrderRequestBodyProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public UpdateCbcOrderRequestBody withProductInfo(Consumer<UpdateCbcOrderRequestBodyProductInfo> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new UpdateCbcOrderRequestBodyProductInfo();
            productInfoSetter.accept(this.productInfo);
        }

        return this;
    }

    /**
     * Get productInfo
     * @return productInfo
     */
    public UpdateCbcOrderRequestBodyProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(UpdateCbcOrderRequestBodyProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCbcOrderRequestBody that = (UpdateCbcOrderRequestBody) obj;
        return Objects.equals(this.changeMode, that.changeMode) && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.productInfo, that.productInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeMode, isAutoPay, cloudServiceType, projectId, resourceId, productInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCbcOrderRequestBody {\n");
        sb.append("    changeMode: ").append(toIndentedString(changeMode)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
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
