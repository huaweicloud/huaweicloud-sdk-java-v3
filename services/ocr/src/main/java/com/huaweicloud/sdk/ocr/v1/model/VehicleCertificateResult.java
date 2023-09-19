package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VehicleCertificateResult
 */
public class VehicleCertificateResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_number")

    private String certificateNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacture_name")

    private String manufactureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_brand")

    private String vehicleBrand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_name")

    private String vehicleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_model")

    private String vehicleModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vin")

    private String vin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_color")

    private String vehicleColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chassis_model")

    private String chassisModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chassis_id")

    private String chassisId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chassis_certificate_number")

    private String chassisCertificateNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_model")

    private String engineModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_number")

    private String engineNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuel_type")

    private String fuelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displacement")

    private String displacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power")

    private String power;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emission_standard")

    private String emissionStandard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuel_consumption")

    private String fuelConsumption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overall_dimension_length")

    private String overallDimensionLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overall_dimension_width")

    private String overallDimensionWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overall_dimension_height")

    private String overallDimensionHeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_dimension_length")

    private String containerDimensionLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_dimension_width")

    private String containerDimensionWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_dimension_height")

    private String containerDimensionHeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spring_quantity")

    private String springQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tire_quantity")

    private String tireQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tire_size")

    private String tireSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "front_wheel_track")

    private String frontWheelTrack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rear_wheel_track")

    private String rearWheelTrack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wheelbase")

    private String wheelbase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "axle_load")

    private String axleLoad;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "axle_quantity")

    private String axleQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steering_form")

    private String steeringForm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_weight")

    private String totalWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equipment_weight")

    private String equipmentWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_laden_mass")

    private String maximumLadenMass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mass_utilization_coefficient")

    private String massUtilizationCoefficient;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traction_weight")

    private String tractionWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_load_mass")

    private String maximumLoadMass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cab_passenger_capacity")

    private String cabPassengerCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passenger_capacity")

    private String passengerCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_design_speed")

    private String maxDesignSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacture_date")

    private String manufactureDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    public VehicleCertificateResult withCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }

    /**
     * 合格证编号。 
     * @return certificateNumber
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public VehicleCertificateResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 发证日期。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public VehicleCertificateResult withManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
        return this;
    }

    /**
     * 车辆制造企业名称。 
     * @return manufactureName
     */
    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public VehicleCertificateResult withVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
        return this;
    }

    /**
     * 车辆品牌。 
     * @return vehicleBrand
     */
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public VehicleCertificateResult withVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
        return this;
    }

    /**
     * 车辆名称。 
     * @return vehicleName
     */
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public VehicleCertificateResult withVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }

    /**
     * 车辆型号。 
     * @return vehicleModel
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public VehicleCertificateResult withVin(String vin) {
        this.vin = vin;
        return this;
    }

    /**
     * 车架号。 
     * @return vin
     */
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public VehicleCertificateResult withVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
        return this;
    }

    /**
     * 车身颜色。 
     * @return vehicleColor
     */
    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public VehicleCertificateResult withChassisModel(String chassisModel) {
        this.chassisModel = chassisModel;
        return this;
    }

    /**
     * 底盘型号。 
     * @return chassisModel
     */
    public String getChassisModel() {
        return chassisModel;
    }

    public void setChassisModel(String chassisModel) {
        this.chassisModel = chassisModel;
    }

    public VehicleCertificateResult withChassisId(String chassisId) {
        this.chassisId = chassisId;
        return this;
    }

    /**
     * 底盘ID。 
     * @return chassisId
     */
    public String getChassisId() {
        return chassisId;
    }

    public void setChassisId(String chassisId) {
        this.chassisId = chassisId;
    }

    public VehicleCertificateResult withChassisCertificateNumber(String chassisCertificateNumber) {
        this.chassisCertificateNumber = chassisCertificateNumber;
        return this;
    }

    /**
     * 底盘合格证编号。 
     * @return chassisCertificateNumber
     */
    public String getChassisCertificateNumber() {
        return chassisCertificateNumber;
    }

    public void setChassisCertificateNumber(String chassisCertificateNumber) {
        this.chassisCertificateNumber = chassisCertificateNumber;
    }

    public VehicleCertificateResult withEngineModel(String engineModel) {
        this.engineModel = engineModel;
        return this;
    }

    /**
     * 发动机型号。 
     * @return engineModel
     */
    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public VehicleCertificateResult withEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
        return this;
    }

    /**
     * 发动机号。 
     * @return engineNumber
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public VehicleCertificateResult withFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    /**
     * 燃料种类。 
     * @return fuelType
     */
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public VehicleCertificateResult withDisplacement(String displacement) {
        this.displacement = displacement;
        return this;
    }

    /**
     * 排量。 
     * @return displacement
     */
    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public VehicleCertificateResult withPower(String power) {
        this.power = power;
        return this;
    }

    /**
     * 功率。 
     * @return power
     */
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public VehicleCertificateResult withEmissionStandard(String emissionStandard) {
        this.emissionStandard = emissionStandard;
        return this;
    }

    /**
     * 排放标准。 
     * @return emissionStandard
     */
    public String getEmissionStandard() {
        return emissionStandard;
    }

    public void setEmissionStandard(String emissionStandard) {
        this.emissionStandard = emissionStandard;
    }

    public VehicleCertificateResult withFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    /**
     * 油耗。 
     * @return fuelConsumption
     */
    public String getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public VehicleCertificateResult withOverallDimensionLength(String overallDimensionLength) {
        this.overallDimensionLength = overallDimensionLength;
        return this;
    }

    /**
     * 外廓尺寸-长。 
     * @return overallDimensionLength
     */
    public String getOverallDimensionLength() {
        return overallDimensionLength;
    }

    public void setOverallDimensionLength(String overallDimensionLength) {
        this.overallDimensionLength = overallDimensionLength;
    }

    public VehicleCertificateResult withOverallDimensionWidth(String overallDimensionWidth) {
        this.overallDimensionWidth = overallDimensionWidth;
        return this;
    }

    /**
     * 外廓尺寸-宽。 
     * @return overallDimensionWidth
     */
    public String getOverallDimensionWidth() {
        return overallDimensionWidth;
    }

    public void setOverallDimensionWidth(String overallDimensionWidth) {
        this.overallDimensionWidth = overallDimensionWidth;
    }

    public VehicleCertificateResult withOverallDimensionHeight(String overallDimensionHeight) {
        this.overallDimensionHeight = overallDimensionHeight;
        return this;
    }

    /**
     * 外廓尺寸-高。 
     * @return overallDimensionHeight
     */
    public String getOverallDimensionHeight() {
        return overallDimensionHeight;
    }

    public void setOverallDimensionHeight(String overallDimensionHeight) {
        this.overallDimensionHeight = overallDimensionHeight;
    }

    public VehicleCertificateResult withContainerDimensionLength(String containerDimensionLength) {
        this.containerDimensionLength = containerDimensionLength;
        return this;
    }

    /**
     * 货厢内部尺寸-长。 
     * @return containerDimensionLength
     */
    public String getContainerDimensionLength() {
        return containerDimensionLength;
    }

    public void setContainerDimensionLength(String containerDimensionLength) {
        this.containerDimensionLength = containerDimensionLength;
    }

    public VehicleCertificateResult withContainerDimensionWidth(String containerDimensionWidth) {
        this.containerDimensionWidth = containerDimensionWidth;
        return this;
    }

    /**
     * 货厢内部尺寸-宽。 
     * @return containerDimensionWidth
     */
    public String getContainerDimensionWidth() {
        return containerDimensionWidth;
    }

    public void setContainerDimensionWidth(String containerDimensionWidth) {
        this.containerDimensionWidth = containerDimensionWidth;
    }

    public VehicleCertificateResult withContainerDimensionHeight(String containerDimensionHeight) {
        this.containerDimensionHeight = containerDimensionHeight;
        return this;
    }

    /**
     * 货厢内部尺寸-高。 
     * @return containerDimensionHeight
     */
    public String getContainerDimensionHeight() {
        return containerDimensionHeight;
    }

    public void setContainerDimensionHeight(String containerDimensionHeight) {
        this.containerDimensionHeight = containerDimensionHeight;
    }

    public VehicleCertificateResult withSpringQuantity(String springQuantity) {
        this.springQuantity = springQuantity;
        return this;
    }

    /**
     * 钢板弹簧片数。 
     * @return springQuantity
     */
    public String getSpringQuantity() {
        return springQuantity;
    }

    public void setSpringQuantity(String springQuantity) {
        this.springQuantity = springQuantity;
    }

    public VehicleCertificateResult withTireQuantity(String tireQuantity) {
        this.tireQuantity = tireQuantity;
        return this;
    }

    /**
     * 轮胎数。 
     * @return tireQuantity
     */
    public String getTireQuantity() {
        return tireQuantity;
    }

    public void setTireQuantity(String tireQuantity) {
        this.tireQuantity = tireQuantity;
    }

    public VehicleCertificateResult withTireSize(String tireSize) {
        this.tireSize = tireSize;
        return this;
    }

    /**
     * 轮胎规格。 
     * @return tireSize
     */
    public String getTireSize() {
        return tireSize;
    }

    public void setTireSize(String tireSize) {
        this.tireSize = tireSize;
    }

    public VehicleCertificateResult withFrontWheelTrack(String frontWheelTrack) {
        this.frontWheelTrack = frontWheelTrack;
        return this;
    }

    /**
     * 轮距-前。 
     * @return frontWheelTrack
     */
    public String getFrontWheelTrack() {
        return frontWheelTrack;
    }

    public void setFrontWheelTrack(String frontWheelTrack) {
        this.frontWheelTrack = frontWheelTrack;
    }

    public VehicleCertificateResult withRearWheelTrack(String rearWheelTrack) {
        this.rearWheelTrack = rearWheelTrack;
        return this;
    }

    /**
     * 轮距-后。 
     * @return rearWheelTrack
     */
    public String getRearWheelTrack() {
        return rearWheelTrack;
    }

    public void setRearWheelTrack(String rearWheelTrack) {
        this.rearWheelTrack = rearWheelTrack;
    }

    public VehicleCertificateResult withWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
        return this;
    }

    /**
     * 轴距。 
     * @return wheelbase
     */
    public String getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
    }

    public VehicleCertificateResult withAxleLoad(String axleLoad) {
        this.axleLoad = axleLoad;
        return this;
    }

    /**
     * 轴荷。 
     * @return axleLoad
     */
    public String getAxleLoad() {
        return axleLoad;
    }

    public void setAxleLoad(String axleLoad) {
        this.axleLoad = axleLoad;
    }

    public VehicleCertificateResult withAxleQuantity(String axleQuantity) {
        this.axleQuantity = axleQuantity;
        return this;
    }

    /**
     * 轴数。 
     * @return axleQuantity
     */
    public String getAxleQuantity() {
        return axleQuantity;
    }

    public void setAxleQuantity(String axleQuantity) {
        this.axleQuantity = axleQuantity;
    }

    public VehicleCertificateResult withSteeringForm(String steeringForm) {
        this.steeringForm = steeringForm;
        return this;
    }

    /**
     * 转向形式。 
     * @return steeringForm
     */
    public String getSteeringForm() {
        return steeringForm;
    }

    public void setSteeringForm(String steeringForm) {
        this.steeringForm = steeringForm;
    }

    public VehicleCertificateResult withTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    /**
     * 总质量。 
     * @return totalWeight
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    public VehicleCertificateResult withEquipmentWeight(String equipmentWeight) {
        this.equipmentWeight = equipmentWeight;
        return this;
    }

    /**
     * 整备质量。 
     * @return equipmentWeight
     */
    public String getEquipmentWeight() {
        return equipmentWeight;
    }

    public void setEquipmentWeight(String equipmentWeight) {
        this.equipmentWeight = equipmentWeight;
    }

    public VehicleCertificateResult withMaximumLadenMass(String maximumLadenMass) {
        this.maximumLadenMass = maximumLadenMass;
        return this;
    }

    /**
     * 额定载质量。 
     * @return maximumLadenMass
     */
    public String getMaximumLadenMass() {
        return maximumLadenMass;
    }

    public void setMaximumLadenMass(String maximumLadenMass) {
        this.maximumLadenMass = maximumLadenMass;
    }

    public VehicleCertificateResult withMassUtilizationCoefficient(String massUtilizationCoefficient) {
        this.massUtilizationCoefficient = massUtilizationCoefficient;
        return this;
    }

    /**
     * 载质量利用系数。 
     * @return massUtilizationCoefficient
     */
    public String getMassUtilizationCoefficient() {
        return massUtilizationCoefficient;
    }

    public void setMassUtilizationCoefficient(String massUtilizationCoefficient) {
        this.massUtilizationCoefficient = massUtilizationCoefficient;
    }

    public VehicleCertificateResult withTractionWeight(String tractionWeight) {
        this.tractionWeight = tractionWeight;
        return this;
    }

    /**
     * 准牵引总质量。 
     * @return tractionWeight
     */
    public String getTractionWeight() {
        return tractionWeight;
    }

    public void setTractionWeight(String tractionWeight) {
        this.tractionWeight = tractionWeight;
    }

    public VehicleCertificateResult withMaximumLoadMass(String maximumLoadMass) {
        this.maximumLoadMass = maximumLoadMass;
        return this;
    }

    /**
     * 半挂车鞍座最大允许总质量。 
     * @return maximumLoadMass
     */
    public String getMaximumLoadMass() {
        return maximumLoadMass;
    }

    public void setMaximumLoadMass(String maximumLoadMass) {
        this.maximumLoadMass = maximumLoadMass;
    }

    public VehicleCertificateResult withCabPassengerCapacity(String cabPassengerCapacity) {
        this.cabPassengerCapacity = cabPassengerCapacity;
        return this;
    }

    /**
     * 驾驶室准乘人数。 
     * @return cabPassengerCapacity
     */
    public String getCabPassengerCapacity() {
        return cabPassengerCapacity;
    }

    public void setCabPassengerCapacity(String cabPassengerCapacity) {
        this.cabPassengerCapacity = cabPassengerCapacity;
    }

    public VehicleCertificateResult withPassengerCapacity(String passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
        return this;
    }

    /**
     * 额定载客。 
     * @return passengerCapacity
     */
    public String getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(String passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public VehicleCertificateResult withMaxDesignSpeed(String maxDesignSpeed) {
        this.maxDesignSpeed = maxDesignSpeed;
        return this;
    }

    /**
     * 最高设计车速。 
     * @return maxDesignSpeed
     */
    public String getMaxDesignSpeed() {
        return maxDesignSpeed;
    }

    public void setMaxDesignSpeed(String maxDesignSpeed) {
        this.maxDesignSpeed = maxDesignSpeed;
    }

    public VehicleCertificateResult withManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }

    /**
     * 车辆制造日期。 
     * @return manufactureDate
     */
    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public VehicleCertificateResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 字段的置信度，取值范围0~1。 置信度越大，本次识别的字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于字段的准确率。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    public VehicleCertificateResult withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /**
     * 对应所有在原图上识别到的字段位置信息，包含所有文字区域四个顶点的二维坐标（x,y）。采用图像坐标系，坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return textLocation
     */
    public Object getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Object textLocation) {
        this.textLocation = textLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleCertificateResult that = (VehicleCertificateResult) obj;
        return Objects.equals(this.certificateNumber, that.certificateNumber)
            && Objects.equals(this.issueDate, that.issueDate)
            && Objects.equals(this.manufactureName, that.manufactureName)
            && Objects.equals(this.vehicleBrand, that.vehicleBrand)
            && Objects.equals(this.vehicleName, that.vehicleName)
            && Objects.equals(this.vehicleModel, that.vehicleModel) && Objects.equals(this.vin, that.vin)
            && Objects.equals(this.vehicleColor, that.vehicleColor)
            && Objects.equals(this.chassisModel, that.chassisModel) && Objects.equals(this.chassisId, that.chassisId)
            && Objects.equals(this.chassisCertificateNumber, that.chassisCertificateNumber)
            && Objects.equals(this.engineModel, that.engineModel)
            && Objects.equals(this.engineNumber, that.engineNumber) && Objects.equals(this.fuelType, that.fuelType)
            && Objects.equals(this.displacement, that.displacement) && Objects.equals(this.power, that.power)
            && Objects.equals(this.emissionStandard, that.emissionStandard)
            && Objects.equals(this.fuelConsumption, that.fuelConsumption)
            && Objects.equals(this.overallDimensionLength, that.overallDimensionLength)
            && Objects.equals(this.overallDimensionWidth, that.overallDimensionWidth)
            && Objects.equals(this.overallDimensionHeight, that.overallDimensionHeight)
            && Objects.equals(this.containerDimensionLength, that.containerDimensionLength)
            && Objects.equals(this.containerDimensionWidth, that.containerDimensionWidth)
            && Objects.equals(this.containerDimensionHeight, that.containerDimensionHeight)
            && Objects.equals(this.springQuantity, that.springQuantity)
            && Objects.equals(this.tireQuantity, that.tireQuantity) && Objects.equals(this.tireSize, that.tireSize)
            && Objects.equals(this.frontWheelTrack, that.frontWheelTrack)
            && Objects.equals(this.rearWheelTrack, that.rearWheelTrack)
            && Objects.equals(this.wheelbase, that.wheelbase) && Objects.equals(this.axleLoad, that.axleLoad)
            && Objects.equals(this.axleQuantity, that.axleQuantity)
            && Objects.equals(this.steeringForm, that.steeringForm)
            && Objects.equals(this.totalWeight, that.totalWeight)
            && Objects.equals(this.equipmentWeight, that.equipmentWeight)
            && Objects.equals(this.maximumLadenMass, that.maximumLadenMass)
            && Objects.equals(this.massUtilizationCoefficient, that.massUtilizationCoefficient)
            && Objects.equals(this.tractionWeight, that.tractionWeight)
            && Objects.equals(this.maximumLoadMass, that.maximumLoadMass)
            && Objects.equals(this.cabPassengerCapacity, that.cabPassengerCapacity)
            && Objects.equals(this.passengerCapacity, that.passengerCapacity)
            && Objects.equals(this.maxDesignSpeed, that.maxDesignSpeed)
            && Objects.equals(this.manufactureDate, that.manufactureDate)
            && Objects.equals(this.confidence, that.confidence) && Objects.equals(this.textLocation, that.textLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateNumber,
            issueDate,
            manufactureName,
            vehicleBrand,
            vehicleName,
            vehicleModel,
            vin,
            vehicleColor,
            chassisModel,
            chassisId,
            chassisCertificateNumber,
            engineModel,
            engineNumber,
            fuelType,
            displacement,
            power,
            emissionStandard,
            fuelConsumption,
            overallDimensionLength,
            overallDimensionWidth,
            overallDimensionHeight,
            containerDimensionLength,
            containerDimensionWidth,
            containerDimensionHeight,
            springQuantity,
            tireQuantity,
            tireSize,
            frontWheelTrack,
            rearWheelTrack,
            wheelbase,
            axleLoad,
            axleQuantity,
            steeringForm,
            totalWeight,
            equipmentWeight,
            maximumLadenMass,
            massUtilizationCoefficient,
            tractionWeight,
            maximumLoadMass,
            cabPassengerCapacity,
            passengerCapacity,
            maxDesignSpeed,
            manufactureDate,
            confidence,
            textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VehicleCertificateResult {\n");
        sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    manufactureName: ").append(toIndentedString(manufactureName)).append("\n");
        sb.append("    vehicleBrand: ").append(toIndentedString(vehicleBrand)).append("\n");
        sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
        sb.append("    vehicleModel: ").append(toIndentedString(vehicleModel)).append("\n");
        sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
        sb.append("    vehicleColor: ").append(toIndentedString(vehicleColor)).append("\n");
        sb.append("    chassisModel: ").append(toIndentedString(chassisModel)).append("\n");
        sb.append("    chassisId: ").append(toIndentedString(chassisId)).append("\n");
        sb.append("    chassisCertificateNumber: ").append(toIndentedString(chassisCertificateNumber)).append("\n");
        sb.append("    engineModel: ").append(toIndentedString(engineModel)).append("\n");
        sb.append("    engineNumber: ").append(toIndentedString(engineNumber)).append("\n");
        sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
        sb.append("    displacement: ").append(toIndentedString(displacement)).append("\n");
        sb.append("    power: ").append(toIndentedString(power)).append("\n");
        sb.append("    emissionStandard: ").append(toIndentedString(emissionStandard)).append("\n");
        sb.append("    fuelConsumption: ").append(toIndentedString(fuelConsumption)).append("\n");
        sb.append("    overallDimensionLength: ").append(toIndentedString(overallDimensionLength)).append("\n");
        sb.append("    overallDimensionWidth: ").append(toIndentedString(overallDimensionWidth)).append("\n");
        sb.append("    overallDimensionHeight: ").append(toIndentedString(overallDimensionHeight)).append("\n");
        sb.append("    containerDimensionLength: ").append(toIndentedString(containerDimensionLength)).append("\n");
        sb.append("    containerDimensionWidth: ").append(toIndentedString(containerDimensionWidth)).append("\n");
        sb.append("    containerDimensionHeight: ").append(toIndentedString(containerDimensionHeight)).append("\n");
        sb.append("    springQuantity: ").append(toIndentedString(springQuantity)).append("\n");
        sb.append("    tireQuantity: ").append(toIndentedString(tireQuantity)).append("\n");
        sb.append("    tireSize: ").append(toIndentedString(tireSize)).append("\n");
        sb.append("    frontWheelTrack: ").append(toIndentedString(frontWheelTrack)).append("\n");
        sb.append("    rearWheelTrack: ").append(toIndentedString(rearWheelTrack)).append("\n");
        sb.append("    wheelbase: ").append(toIndentedString(wheelbase)).append("\n");
        sb.append("    axleLoad: ").append(toIndentedString(axleLoad)).append("\n");
        sb.append("    axleQuantity: ").append(toIndentedString(axleQuantity)).append("\n");
        sb.append("    steeringForm: ").append(toIndentedString(steeringForm)).append("\n");
        sb.append("    totalWeight: ").append(toIndentedString(totalWeight)).append("\n");
        sb.append("    equipmentWeight: ").append(toIndentedString(equipmentWeight)).append("\n");
        sb.append("    maximumLadenMass: ").append(toIndentedString(maximumLadenMass)).append("\n");
        sb.append("    massUtilizationCoefficient: ").append(toIndentedString(massUtilizationCoefficient)).append("\n");
        sb.append("    tractionWeight: ").append(toIndentedString(tractionWeight)).append("\n");
        sb.append("    maximumLoadMass: ").append(toIndentedString(maximumLoadMass)).append("\n");
        sb.append("    cabPassengerCapacity: ").append(toIndentedString(cabPassengerCapacity)).append("\n");
        sb.append("    passengerCapacity: ").append(toIndentedString(passengerCapacity)).append("\n");
        sb.append("    maxDesignSpeed: ").append(toIndentedString(maxDesignSpeed)).append("\n");
        sb.append("    manufactureDate: ").append(toIndentedString(manufactureDate)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
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
