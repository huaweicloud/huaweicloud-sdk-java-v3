package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数说明**：分发通道，至少指定一个通道。
 */
public class Channel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "by_lte_pc5")

    private Boolean byLtePc5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "by_lte_uu")

    private Boolean byLteUu;

    public Channel withByLtePc5(Boolean byLtePc5) {
        this.byLtePc5 = byLtePc5;
        return this;
    }

    /**
     * **参数说明**：LTE-PC5传输通道。若通过LTE-PC5传输通道下发事件，该字段为true。
     * @return byLtePc5
     */
    public Boolean getByLtePc5() {
        return byLtePc5;
    }

    public void setByLtePc5(Boolean byLtePc5) {
        this.byLtePc5 = byLtePc5;
    }

    public Channel withByLteUu(Boolean byLteUu) {
        this.byLteUu = byLteUu;
        return this;
    }

    /**
     * **参数说明**：LTE-Uu的传输通道。若通过LTE-Uu的传输通道下发事件，该字段为true。
     * @return byLteUu
     */
    public Boolean getByLteUu() {
        return byLteUu;
    }

    public void setByLteUu(Boolean byLteUu) {
        this.byLteUu = byLteUu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Channel that = (Channel) obj;
        return Objects.equals(this.byLtePc5, that.byLtePc5) && Objects.equals(this.byLteUu, that.byLteUu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(byLtePc5, byLteUu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Channel {\n");
        sb.append("    byLtePc5: ").append(toIndentedString(byLtePc5)).append("\n");
        sb.append("    byLteUu: ").append(toIndentedString(byLteUu)).append("\n");
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
