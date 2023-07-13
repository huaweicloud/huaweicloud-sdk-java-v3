package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 升级配置
 */
public class UpgradeStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inPlaceRollingUpdate")

    private InPlaceRollingUpdate inPlaceRollingUpdate;

    public UpgradeStrategy withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 升级策略类型，当前仅支持原地升级类型\"inPlaceRollingUpdate\"
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpgradeStrategy withInPlaceRollingUpdate(InPlaceRollingUpdate inPlaceRollingUpdate) {
        this.inPlaceRollingUpdate = inPlaceRollingUpdate;
        return this;
    }

    public UpgradeStrategy withInPlaceRollingUpdate(Consumer<InPlaceRollingUpdate> inPlaceRollingUpdateSetter) {
        if (this.inPlaceRollingUpdate == null) {
            this.inPlaceRollingUpdate = new InPlaceRollingUpdate();
            inPlaceRollingUpdateSetter.accept(this.inPlaceRollingUpdate);
        }

        return this;
    }

    /**
     * Get inPlaceRollingUpdate
     * @return inPlaceRollingUpdate
     */
    public InPlaceRollingUpdate getInPlaceRollingUpdate() {
        return inPlaceRollingUpdate;
    }

    public void setInPlaceRollingUpdate(InPlaceRollingUpdate inPlaceRollingUpdate) {
        this.inPlaceRollingUpdate = inPlaceRollingUpdate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeStrategy that = (UpgradeStrategy) obj;
        return Objects.equals(this.type, that.type)
            && Objects.equals(this.inPlaceRollingUpdate, that.inPlaceRollingUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, inPlaceRollingUpdate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeStrategy {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    inPlaceRollingUpdate: ").append(toIndentedString(inPlaceRollingUpdate)).append("\n");
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
