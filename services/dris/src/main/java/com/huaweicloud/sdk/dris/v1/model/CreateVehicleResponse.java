package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateVehicleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_id")

    private String vehicleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plate_no")

    private String plateNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vin")

    private String vin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obu_id")

    private String obuId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imei")

    private String imei;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brand")

    private String brand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style")

    private String style;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuel_type")

    private String fuelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plate_color")

    private String plateColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private String accessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_time")

    private OffsetDateTime lastModifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_online_time")

    private OffsetDateTime lastOnlineTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CreateVehicleResponse withVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
        return this;
    }

    /**
     * **参数说明**：车辆唯一标识符。  **取值范围**：长度不超过128，只允许字母、数字、以及_-等字符的组合。 
     * @return vehicleId
     */
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public CreateVehicleResponse withPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }

    /**
     * **参数说明**：车牌号。  **取值范围**：长度最小1最大64，支持中文、字母、数字、下划线（_）、横杠（-）的组合。 
     * @return plateNo
     */
    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public CreateVehicleResponse withVin(String vin) {
        this.vin = vin;
        return this;
    }

    /**
     * **参数说明**：VIN码，车辆的17位VIN码。  **取值范围**：长度不超过17，只允许字母、数字字符的组合。 
     * @return vin
     */
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public CreateVehicleResponse withObuId(String obuId) {
        this.obuId = obuId;
        return this;
    }

    /**
     * \"**参数说明**：车载OBU的唯一标识。  **取值范围**：长度不超过128，只允许字母、数字、以及_-等字符的组合。 
     * @return obuId
     */
    public String getObuId() {
        return obuId;
    }

    public void setObuId(String obuId) {
        this.obuId = obuId;
    }

    public CreateVehicleResponse withImei(String imei) {
        this.imei = imei;
        return this;
    }

    /**
     * **参数说明**：IMEI，OBU上电子序列号。  **取值范围**：长度最小1最大255，支持纯数字的组合。 
     * @return imei
     */
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public CreateVehicleResponse withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * **参数说明**：车俩品牌。  **取值范围**：长度最小1最大64，支持中文、字母、数字、下划线（_）、横杠（-）的组合。 
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CreateVehicleResponse withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * **参数说明**：车牌型号。  **取值范围**：长度最小1最大64，支持字母、数字、下划线（_）、横杠（-）的组合。 
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CreateVehicleResponse withStyle(String style) {
        this.style = style;
        return this;
    }

    /**
     * **参数说明**：车辆年款。  **取值范围**：长度最小1最大64，支持纯数字的组合。 
     * @return style
     */
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public CreateVehicleResponse withFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    /**
     * **参数说明**：定义车辆的燃料动力类。  **取值范围**： - unknownFuel：未知 - gasoline：汽油 - ethanol：乙醇 - diesel：柴油 - electric：电动 - hybrid：混合燃料类型 - hydrogen：氢气 - natGasLiquid：液化天然气 - natGasComp：压缩天然气 - propane：丙烷\" 
     * @return fuelType
     */
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public CreateVehicleResponse withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * **参数说明**：车辆颜色。  **取值范围**： - black：黑色 - white：白色 - gray：灰色 - red：红色 - blue：蓝色 - yellow：黄色 - orange：橙色 - brown：棕色 - green：绿色 - purple：紫色 - cyan：青色 - pink：粉红色 - transparent：透明色 - other：其他\" 
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CreateVehicleResponse withPlateColor(String plateColor) {
        this.plateColor = plateColor;
        return this;
    }

    /**
     * **参数说明**：车辆颜色。  **取值范围**： - black：黑色 - white：白色 - blue：蓝色 - yellow：黄色 - green：绿色 
     * @return plateColor
     */
    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public CreateVehicleResponse withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * **参数说明**：车辆接入网络的方式。  **取值范围**： - 5g - 4g  - 3g  - 2g - pc5Only  - pc5And5g  - pc5And4g  - pc5And3g  - pc5And2g 
     * @return accessType
     */
    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public CreateVehicleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：描述。  **取值范围**：长度不超过2048，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVehicleResponse withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * **参数说明**：最后修改的时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z' 例如 2020-09-01T01:37:01Z
     * @return lastModifiedTime
     */
    public OffsetDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public CreateVehicleResponse withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数说明**：创建的时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z' 例如 2020-09-01T01:37:01Z
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public CreateVehicleResponse withLastOnlineTime(OffsetDateTime lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
        return this;
    }

    /**
     * **参数说明**：最后的在线时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z' 例如 2020-09-01T01:37:01Z
     * @return lastOnlineTime
     */
    public OffsetDateTime getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(OffsetDateTime lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }

    public CreateVehicleResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：设备状态。  **取值范围**： - ONLINE：在线 - OFFLINE：离线 - UNKNOWN：未知状态 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVehicleResponse createVehicleResponse = (CreateVehicleResponse) o;
        return Objects.equals(this.vehicleId, createVehicleResponse.vehicleId)
            && Objects.equals(this.plateNo, createVehicleResponse.plateNo)
            && Objects.equals(this.vin, createVehicleResponse.vin)
            && Objects.equals(this.obuId, createVehicleResponse.obuId)
            && Objects.equals(this.imei, createVehicleResponse.imei)
            && Objects.equals(this.brand, createVehicleResponse.brand)
            && Objects.equals(this.model, createVehicleResponse.model)
            && Objects.equals(this.style, createVehicleResponse.style)
            && Objects.equals(this.fuelType, createVehicleResponse.fuelType)
            && Objects.equals(this.color, createVehicleResponse.color)
            && Objects.equals(this.plateColor, createVehicleResponse.plateColor)
            && Objects.equals(this.accessType, createVehicleResponse.accessType)
            && Objects.equals(this.description, createVehicleResponse.description)
            && Objects.equals(this.lastModifiedTime, createVehicleResponse.lastModifiedTime)
            && Objects.equals(this.createdTime, createVehicleResponse.createdTime)
            && Objects.equals(this.lastOnlineTime, createVehicleResponse.lastOnlineTime)
            && Objects.equals(this.status, createVehicleResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId,
            plateNo,
            vin,
            obuId,
            imei,
            brand,
            model,
            style,
            fuelType,
            color,
            plateColor,
            accessType,
            description,
            lastModifiedTime,
            createdTime,
            lastOnlineTime,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVehicleResponse {\n");
        sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
        sb.append("    plateNo: ").append(toIndentedString(plateNo)).append("\n");
        sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
        sb.append("    obuId: ").append(toIndentedString(obuId)).append("\n");
        sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    plateColor: ").append(toIndentedString(plateColor)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    lastOnlineTime: ").append(toIndentedString(lastOnlineTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
