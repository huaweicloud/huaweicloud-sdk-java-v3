package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NPU设备信息
 */
public class NPUDetailsDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    private String npuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_core")

    private Integer aiCore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health")

    private String health;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_info")

    private List<NpuUsedInfoDTO> usedInfo = null;

    public NPUDetailsDTO withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 昇腾设备ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public NPUDetailsDTO withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /**
     * 华为AI加速卡型号，如D310推理卡、D310P推理卡、D910训练卡。
     * @return npuType
     */
    public String getNpuType() {
        return npuType;
    }

    public void setNpuType(String npuType) {
        this.npuType = npuType;
    }

    public NPUDetailsDTO withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 昇腾设备产品类型
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public NPUDetailsDTO withAiCore(Integer aiCore) {
        this.aiCore = aiCore;
        return this;
    }

    /**
     * AI加速卡包含ai核个数
     * minimum: 0
     * maximum: 64
     * @return aiCore
     */
    public Integer getAiCore() {
        return aiCore;
    }

    public void setAiCore(Integer aiCore) {
        this.aiCore = aiCore;
    }

    public NPUDetailsDTO withHealth(String health) {
        this.health = health;
        return this;
    }

    /**
     * 昇腾设备健康状态
     * @return health
     */
    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public NPUDetailsDTO withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 昇腾设备故障信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public NPUDetailsDTO withUsedInfo(List<NpuUsedInfoDTO> usedInfo) {
        this.usedInfo = usedInfo;
        return this;
    }

    public NPUDetailsDTO addUsedInfoItem(NpuUsedInfoDTO usedInfoItem) {
        if (this.usedInfo == null) {
            this.usedInfo = new ArrayList<>();
        }
        this.usedInfo.add(usedInfoItem);
        return this;
    }

    public NPUDetailsDTO withUsedInfo(Consumer<List<NpuUsedInfoDTO>> usedInfoSetter) {
        if (this.usedInfo == null) {
            this.usedInfo = new ArrayList<>();
        }
        usedInfoSetter.accept(this.usedInfo);
        return this;
    }

    /**
     * NPU使用信息
     * @return usedInfo
     */
    public List<NpuUsedInfoDTO> getUsedInfo() {
        return usedInfo;
    }

    public void setUsedInfo(List<NpuUsedInfoDTO> usedInfo) {
        this.usedInfo = usedInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NPUDetailsDTO that = (NPUDetailsDTO) obj;
        return Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.npuType, that.npuType)
            && Objects.equals(this.productName, that.productName) && Objects.equals(this.aiCore, that.aiCore)
            && Objects.equals(this.health, that.health) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.usedInfo, that.usedInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, npuType, productName, aiCore, health, errorMsg, usedInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NPUDetailsDTO {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    npuType: ").append(toIndentedString(npuType)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    aiCore: ").append(toIndentedString(aiCore)).append("\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    usedInfo: ").append(toIndentedString(usedInfo)).append("\n");
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
