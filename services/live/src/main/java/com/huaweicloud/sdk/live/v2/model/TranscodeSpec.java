package com.huaweicloud.sdk.live.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TranscodeSpec
 */
public class TranscodeSpec  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private Double value;

    public TranscodeSpec withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 转码规格，格式是“编码格式_分辨率档位”（未开启高清低码）和“编码格式_PVC_分辨率档位”（开启高清低码）。  其中编码格式包括H264、H265，分辨率档位包括：  4K（3840 x 2160）及以下，2K（2560 x 1440）及以下，FHD（1920 x 1080）及以下，HD（1280 x 720）及以下，SD（640 x 480）及以下。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public TranscodeSpec withValue(Double value) {
        this.value = value;
        return this;
    }

    


    /**
     * 采样时间点转码时长，单位为分钟，保留两位小数。
     * minimum: 0
     * maximum: 1.7976931348623157E+308
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TranscodeSpec transcodeSpec = (TranscodeSpec) o;
        return Objects.equals(this.type, transcodeSpec.type) &&
            Objects.equals(this.value, transcodeSpec.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscodeSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

