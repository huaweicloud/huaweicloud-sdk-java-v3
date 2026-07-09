package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池规格数据模型。
 */
public class PoolResourceFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxCount")

    private Integer maxCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParams")

    private PoolResourceFlavorExtendParams extendParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private Os os;

    public PoolResourceFlavor withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：资源规格，比如：modelarts.vm.gpu.tnt004。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public PoolResourceFlavor withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：资源规格的保障资源量。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PoolResourceFlavor withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * **参数解释**：资源规格的弹性资源量。物理池中该值和count必须一致。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return maxCount
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public PoolResourceFlavor withExtendParams(PoolResourceFlavorExtendParams extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    public PoolResourceFlavor withExtendParams(Consumer<PoolResourceFlavorExtendParams> extendParamsSetter) {
        if (this.extendParams == null) {
            this.extendParams = new PoolResourceFlavorExtendParams();
            extendParamsSetter.accept(this.extendParams);
        }

        return this;
    }

    /**
     * Get extendParams
     * @return extendParams
     */
    public PoolResourceFlavorExtendParams getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(PoolResourceFlavorExtendParams extendParams) {
        this.extendParams = extendParams;
    }

    public PoolResourceFlavor withOs(Os os) {
        this.os = os;
        return this;
    }

    public PoolResourceFlavor withOs(Consumer<Os> osSetter) {
        if (this.os == null) {
            this.os = new Os();
            osSetter.accept(this.os);
        }

        return this;
    }

    /**
     * Get os
     * @return os
     */
    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolResourceFlavor that = (PoolResourceFlavor) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.count, that.count)
            && Objects.equals(this.maxCount, that.maxCount) && Objects.equals(this.extendParams, that.extendParams)
            && Objects.equals(this.os, that.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, count, maxCount, extendParams, os);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolResourceFlavor {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
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
