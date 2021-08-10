package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** OutputWatermarkPara */
public class OutputWatermarkPara {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_duration")

    private Integer timeDuration;

    public OutputWatermarkPara withTimeDuration(Integer timeDuration) {
        this.timeDuration = timeDuration;
        return this;
    }

    /** 水印时长 minimum: 0 maximum: 2147483647
     * 
     * @return timeDuration */
    public Integer getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(Integer timeDuration) {
        this.timeDuration = timeDuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputWatermarkPara outputWatermarkPara = (OutputWatermarkPara) o;
        return Objects.equals(this.timeDuration, outputWatermarkPara.timeDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputWatermarkPara {\n");
        sb.append("    timeDuration: ").append(toIndentedString(timeDuration)).append("\n");
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
