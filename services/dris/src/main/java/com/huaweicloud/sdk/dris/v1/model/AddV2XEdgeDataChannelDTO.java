package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Data Channel配置数据
 */
public class AddV2XEdgeDataChannelDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private String platformType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_para")

    private PlatformPara platformPara;

    public AddV2XEdgeDataChannelDTO withPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * **参数说明**：平台类型。  **取值范围**： - DRIS：华为路网数字化平台 - LITONG：利通 - ZHONGQIYAN：中汽研
     * @return platformType
     */
    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public AddV2XEdgeDataChannelDTO withPlatformPara(PlatformPara platformPara) {
        this.platformPara = platformPara;
        return this;
    }

    public AddV2XEdgeDataChannelDTO withPlatformPara(Consumer<PlatformPara> platformParaSetter) {
        if (this.platformPara == null) {
            this.platformPara = new PlatformPara();
            platformParaSetter.accept(this.platformPara);
        }

        return this;
    }

    /**
     * Get platformPara
     * @return platformPara
     */
    public PlatformPara getPlatformPara() {
        return platformPara;
    }

    public void setPlatformPara(PlatformPara platformPara) {
        this.platformPara = platformPara;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddV2XEdgeDataChannelDTO that = (AddV2XEdgeDataChannelDTO) obj;
        return Objects.equals(this.platformType, that.platformType)
            && Objects.equals(this.platformPara, that.platformPara);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformType, platformPara);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddV2XEdgeDataChannelDTO {\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
        sb.append("    platformPara: ").append(toIndentedString(platformPara)).append("\n");
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
