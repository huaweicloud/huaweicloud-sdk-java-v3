package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 各终端厂商的审核状态。
 */
public class FactoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "factory_type")

    private String factoryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public FactoryInfo withFactoryType(String factoryType) {
        this.factoryType = factoryType;
        return this;
    }

    /**
     * 厂商类型。  - HUAWEI：表示华为厂商 - XIAOMI：表示小米厂商 - OPPO：表示OPPO厂商 - VIVO：表示VIVO厂商 - MEIZU：表示魅族厂商 
     * @return factoryType
     */
    public String getFactoryType() {
        return factoryType;
    }

    public void setFactoryType(String factoryType) {
        this.factoryType = factoryType;
    }

    public FactoryInfo withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 模板状态。  - 1：激活  - 其他：未激活 
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public FactoryInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 厂商版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FactoryInfo that = (FactoryInfo) obj;
        return Objects.equals(this.factoryType, that.factoryType) && Objects.equals(this.state, that.state)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factoryType, state, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactoryInfo {\n");
        sb.append("    factoryType: ").append(toIndentedString(factoryType)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
