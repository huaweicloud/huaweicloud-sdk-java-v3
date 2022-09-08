package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DynamicDataMask
 */
public class DynamicDataMask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_strategies")

    private List<MaskStrategies> maskStrategies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<Map<String, Object>> data = null;

    public DynamicDataMask withMaskStrategies(List<MaskStrategies> maskStrategies) {
        this.maskStrategies = maskStrategies;
        return this;
    }

    public DynamicDataMask addMaskStrategiesItem(MaskStrategies maskStrategiesItem) {
        if (this.maskStrategies == null) {
            this.maskStrategies = new ArrayList<>();
        }
        this.maskStrategies.add(maskStrategiesItem);
        return this;
    }

    public DynamicDataMask withMaskStrategies(Consumer<List<MaskStrategies>> maskStrategiesSetter) {
        if (this.maskStrategies == null) {
            this.maskStrategies = new ArrayList<>();
        }
        maskStrategiesSetter.accept(this.maskStrategies);
        return this;
    }

    /**
     * 脱敏策略列表，每一个策略对应一个字段，脱敏策略数最多100个。
     * @return maskStrategies
     */
    public List<MaskStrategies> getMaskStrategies() {
        return maskStrategies;
    }

    public void setMaskStrategies(List<MaskStrategies> maskStrategies) {
        this.maskStrategies = maskStrategies;
    }

    public DynamicDataMask withData(List<Map<String, Object>> data) {
        this.data = data;
        return this;
    }

    public DynamicDataMask addDataItem(Map<String, Object> dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public DynamicDataMask withData(Consumer<List<Map<String, Object>>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 数据列表。
     * @return data
     */
    public List<Map<String, Object>> getData() {
        return data;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DynamicDataMask dynamicDataMask = (DynamicDataMask) o;
        return Objects.equals(this.maskStrategies, dynamicDataMask.maskStrategies)
            && Objects.equals(this.data, dynamicDataMask.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maskStrategies, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicDataMask {\n");
        sb.append("    maskStrategies: ").append(toIndentedString(maskStrategies)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
