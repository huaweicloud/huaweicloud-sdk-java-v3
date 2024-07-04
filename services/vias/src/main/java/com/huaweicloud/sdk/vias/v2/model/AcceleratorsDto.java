package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * accelerators
 */
public class AcceleratorsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cuda_version")

    private String cudaVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_version_section")

    private String driverVersionSection;

    public AcceleratorsDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 加速卡类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AcceleratorsDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 加速卡名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AcceleratorsDto withCudaVersion(String cudaVersion) {
        this.cudaVersion = cudaVersion;
        return this;
    }

    /**
     * CUDA版本
     * @return cudaVersion
     */
    public String getCudaVersion() {
        return cudaVersion;
    }

    public void setCudaVersion(String cudaVersion) {
        this.cudaVersion = cudaVersion;
    }

    public AcceleratorsDto withDriverVersionSection(String driverVersionSection) {
        this.driverVersionSection = driverVersionSection;
        return this;
    }

    /**
     * 昇腾驱动版本
     * @return driverVersionSection
     */
    public String getDriverVersionSection() {
        return driverVersionSection;
    }

    public void setDriverVersionSection(String driverVersionSection) {
        this.driverVersionSection = driverVersionSection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcceleratorsDto that = (AcceleratorsDto) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.cudaVersion, that.cudaVersion)
            && Objects.equals(this.driverVersionSection, that.driverVersionSection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, cudaVersion, driverVersionSection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceleratorsDto {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cudaVersion: ").append(toIndentedString(cudaVersion)).append("\n");
        sb.append("    driverVersionSection: ").append(toIndentedString(driverVersionSection)).append("\n");
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
