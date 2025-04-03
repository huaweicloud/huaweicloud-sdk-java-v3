package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 图层旋转配置。
 */
public class LayerRotationConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "angle")

    private Integer angle;

    public LayerRotationConfig withAngle(Integer angle) {
        this.angle = angle;
        return this;
    }

    /**
     * **参数解释**： 旋转角度。 **取值范围**： 角度范围0-360度。 **默认取值**： 0度。 **约束限制**： 以素材中心点旋转。
     * minimum: 0
     * maximum: 360
     * @return angle
     */
    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LayerRotationConfig that = (LayerRotationConfig) obj;
        return Objects.equals(this.angle, that.angle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(angle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayerRotationConfig {\n");
        sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
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
