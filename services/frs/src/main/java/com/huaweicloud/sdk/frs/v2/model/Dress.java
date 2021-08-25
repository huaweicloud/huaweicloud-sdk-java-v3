package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Dress */
public class Dress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "glass")

    private String glass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hat")

    private String hat;

    public Dress withGlass(String glass) {
        this.glass = glass;
        return this;
    }

    /** 是否带眼镜： • yes：带眼镜 • dark：带墨镜 • none：未戴眼镜 • unknown：未知
     * 
     * @return glass */
    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public Dress withHat(String hat) {
        this.hat = hat;
        return this;
    }

    /** 是否戴帽子： • yes：戴帽子 • none：未戴帽子 • unknown：未知
     * 
     * @return hat */
    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dress dress = (Dress) o;
        return Objects.equals(this.glass, dress.glass) && Objects.equals(this.hat, dress.hat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(glass, hat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dress {\n");
        sb.append("    glass: ").append(toIndentedString(glass)).append("\n");
        sb.append("    hat: ").append(toIndentedString(hat)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
