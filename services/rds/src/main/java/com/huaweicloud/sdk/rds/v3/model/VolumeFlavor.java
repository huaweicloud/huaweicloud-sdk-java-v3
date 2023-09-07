package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 磁盘规格信息
 */
public class VolumeFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private List<String> period = null;

    public VolumeFlavor withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public VolumeFlavor withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 磁盘规格码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public VolumeFlavor withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 磁盘类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VolumeFlavor withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘大小
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public VolumeFlavor withPeriod(List<String> period) {
        this.period = period;
        return this;
    }

    public VolumeFlavor addPeriodItem(String periodItem) {
        if (this.period == null) {
            this.period = new ArrayList<>();
        }
        this.period.add(periodItem);
        return this;
    }

    public VolumeFlavor withPeriod(Consumer<List<String>> periodSetter) {
        if (this.period == null) {
            this.period = new ArrayList<>();
        }
        periodSetter.accept(this.period);
        return this;
    }

    /**
     * 订购周期
     * @return period
     */
    public List<String> getPeriod() {
        return period;
    }

    public void setPeriod(List<String> period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeFlavor that = (VolumeFlavor) obj;
        return Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.code, that.code)
            && Objects.equals(this.type, that.type) && Objects.equals(this.size, that.size)
            && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineVersion, code, type, size, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeFlavor {\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
