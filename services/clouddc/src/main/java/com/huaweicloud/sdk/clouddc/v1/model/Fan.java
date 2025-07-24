package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 风扇的摘要信息，如型号、厂商等
 */
public class Fan {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reading")

    private String reading;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reading_units")

    private String readingUnits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "part_number")

    private String partNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_ratio")

    private String speedRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    public Fan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fan withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Fan withReading(String reading) {
        this.reading = reading;
        return this;
    }

    /**
     * 转速
     * @return reading
     */
    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public Fan withReadingUnits(String readingUnits) {
        this.readingUnits = readingUnits;
        return this;
    }

    /**
     * 转速单位
     * @return readingUnits
     */
    public String getReadingUnits() {
        return readingUnits;
    }

    public void setReadingUnits(String readingUnits) {
        this.readingUnits = readingUnits;
    }

    public Fan withPartNumber(String partNumber) {
        this.partNumber = partNumber;
        return this;
    }

    /**
     * 固件编码
     * @return partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Fan withSpeedRatio(String speedRatio) {
        this.speedRatio = speedRatio;
        return this;
    }

    /**
     * 速率比
     * @return speedRatio
     */
    public String getSpeedRatio() {
        return speedRatio;
    }

    public void setSpeedRatio(String speedRatio) {
        this.speedRatio = speedRatio;
    }

    public Fan withStatus(Status status) {
        this.status = status;
        return this;
    }

    public Fan withStatus(Consumer<Status> statusSetter) {
        if (this.status == null) {
            this.status = new Status();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fan that = (Fan) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.model, that.model)
            && Objects.equals(this.reading, that.reading) && Objects.equals(this.readingUnits, that.readingUnits)
            && Objects.equals(this.partNumber, that.partNumber) && Objects.equals(this.speedRatio, that.speedRatio)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, reading, readingUnits, partNumber, speedRatio, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Fan {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    reading: ").append(toIndentedString(reading)).append("\n");
        sb.append("    readingUnits: ").append(toIndentedString(readingUnits)).append("\n");
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    speedRatio: ").append(toIndentedString(speedRatio)).append("\n");
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
