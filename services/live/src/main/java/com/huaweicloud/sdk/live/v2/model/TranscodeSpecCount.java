package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TranscodeSpecCount
 */
public class TranscodeSpecCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public TranscodeSpecCount withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 转码规格，具体格式如下： - 若未开启高清低码，则格式为：编码格式_分辨率档位。 - 若已开启高清低码，则格式为：编码格式_PVC_分辨率档位。  其中，编码格式包括H264、H265，分辨率档位包括： - 4K：3840 x 2160及以下 - 2K：2560 x 1440及以下 - FHD：1920 x 1080及以下 - HD：1280 x 720及以下 - SD：640 x 480及以下  示例：若编码格式为H264，分辨率档位为FHD，则转码规格为H264_FHD。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TranscodeSpecCount withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 采样时间点转码任务数。
     * minimum: 0
     * maximum: 1844674407
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TranscodeSpecCount transcodeSpecCount = (TranscodeSpecCount) o;
        return Objects.equals(this.type, transcodeSpecCount.type)
            && Objects.equals(this.count, transcodeSpecCount.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscodeSpecCount {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
