package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DataDiskCleanUpOption
 */
public class DataDiskCleanUpOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "onFailure")

    private String onFailure;

    public DataDiskCleanUpOption withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释：** 该参数用于控制腾挪节点时，是否擦除节点的除系统盘外的数据盘。 **约束限制：** 不涉及 **取值范围：** - false：腾挪节点时，不擦除节点的除系统盘外的数据盘。           - true：腾挪节点时，擦除节点的除系统盘外的数据盘。  **默认取值：** false
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public DataDiskCleanUpOption withOnFailure(String onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    /**
     * **参数解释：** 该参数用于控制腾挪节点时，擦除节点的数据盘失败时的处理策略。 **约束限制：** 不涉及 **取值范围：** - ignore：表示清理数据盘失败时忽略错误，继续执行。 - abort：表示清理数据盘失败时立即停止，并向上报错。  **默认取值：** ignore
     * @return onFailure
     */
    public String getOnFailure() {
        return onFailure;
    }

    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataDiskCleanUpOption that = (DataDiskCleanUpOption) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.onFailure, that.onFailure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, onFailure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataDiskCleanUpOption {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    onFailure: ").append(toIndentedString(onFailure)).append("\n");
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
