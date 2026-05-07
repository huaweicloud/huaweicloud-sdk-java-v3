package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDomainStreamBackupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_backup_enable")

    private Boolean streamBackupEnable;

    public ShowDomainStreamBackupResponse withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * **参数解释**： 直播推流域名 **约束限制**： 不涉及 **取值范围**： 字符长度为[1-255]位 **默认取值**： 不涉及 
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public ShowDomainStreamBackupResponse withStreamBackupEnable(Boolean streamBackupEnable) {
        this.streamBackupEnable = streamBackupEnable;
        return this;
    }

    /**
     * **参数解释**： 主备流开关 **约束限制**： 不涉及 **取值范围**： - true： 开启主备流功能 - false：关闭主备流功能 **默认取值**： false 
     * @return streamBackupEnable
     */
    public Boolean getStreamBackupEnable() {
        return streamBackupEnable;
    }

    public void setStreamBackupEnable(Boolean streamBackupEnable) {
        this.streamBackupEnable = streamBackupEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainStreamBackupResponse that = (ShowDomainStreamBackupResponse) obj;
        return Objects.equals(this.publishDomain, that.publishDomain)
            && Objects.equals(this.streamBackupEnable, that.streamBackupEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, streamBackupEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainStreamBackupResponse {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    streamBackupEnable: ").append(toIndentedString(streamBackupEnable)).append("\n");
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
