package com.huaweicloud.sdk.dris.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateDataChannelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private String platformType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_para")

    private PlatformPara platformPara;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_status")

    private String channelStatus;

    public UpdateDataChannelResponse withPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * **参数说明**：平台类型。   **取值范围**：  - DRIS：华为路网数字化平台  - LITONG：利通  - ZHONGQIYAN：中汽研
     * @return platformType
     */
    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public UpdateDataChannelResponse withPlatformPara(PlatformPara platformPara) {
        this.platformPara = platformPara;
        return this;
    }

    public UpdateDataChannelResponse withPlatformPara(Consumer<PlatformPara> platformParaSetter) {
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

    public UpdateDataChannelResponse withChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus;
        return this;
    }

    /**
     * **参数说明**：华为路网数字化平台或第三方业务平台连接状态。  **取值范围**： - ONLINE：在线 - OFFLINE：离线 - INITIAL：初始化
     * @return channelStatus
     */
    public String getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDataChannelResponse updateDataChannelResponse = (UpdateDataChannelResponse) o;
        return Objects.equals(this.platformType, updateDataChannelResponse.platformType)
            && Objects.equals(this.platformPara, updateDataChannelResponse.platformPara)
            && Objects.equals(this.channelStatus, updateDataChannelResponse.channelStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformType, platformPara, channelStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDataChannelResponse {\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
        sb.append("    platformPara: ").append(toIndentedString(platformPara)).append("\n");
        sb.append("    channelStatus: ").append(toIndentedString(channelStatus)).append("\n");
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
