package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ModifyOttChannelInfoRecordSettingsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Internal")

    private String accessControlAllowInternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-External")

    private String accessControlAllowExternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyOttChannelRecordSettings body;

    public ModifyOttChannelInfoRecordSettingsRequest withAccessControlAllowInternal(String accessControlAllowInternal) {
        this.accessControlAllowInternal = accessControlAllowInternal;
        return this;
    }

    /**
     * 服务鉴权Token，服务开启鉴权，必须携带Access-Control-Allow-Internal访问服务。
     * @return accessControlAllowInternal
     */
    public String getAccessControlAllowInternal() {
        return accessControlAllowInternal;
    }

    public void setAccessControlAllowInternal(String accessControlAllowInternal) {
        this.accessControlAllowInternal = accessControlAllowInternal;
    }

    public ModifyOttChannelInfoRecordSettingsRequest withAccessControlAllowExternal(String accessControlAllowExternal) {
        this.accessControlAllowExternal = accessControlAllowExternal;
        return this;
    }

    /**
     * 服务鉴权Token，服务开启鉴权，必须携带Access-Control-Allow-External访问服务。
     * @return accessControlAllowExternal
     */
    public String getAccessControlAllowExternal() {
        return accessControlAllowExternal;
    }

    public void setAccessControlAllowExternal(String accessControlAllowExternal) {
        this.accessControlAllowExternal = accessControlAllowExternal;
    }

    public ModifyOttChannelInfoRecordSettingsRequest withBody(ModifyOttChannelRecordSettings body) {
        this.body = body;
        return this;
    }

    public ModifyOttChannelInfoRecordSettingsRequest withBody(Consumer<ModifyOttChannelRecordSettings> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyOttChannelRecordSettings();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyOttChannelRecordSettings getBody() {
        return body;
    }

    public void setBody(ModifyOttChannelRecordSettings body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyOttChannelInfoRecordSettingsRequest that = (ModifyOttChannelInfoRecordSettingsRequest) obj;
        return Objects.equals(this.accessControlAllowInternal, that.accessControlAllowInternal)
            && Objects.equals(this.accessControlAllowExternal, that.accessControlAllowExternal)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessControlAllowInternal, accessControlAllowExternal, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyOttChannelInfoRecordSettingsRequest {\n");
        sb.append("    accessControlAllowInternal: ").append(toIndentedString(accessControlAllowInternal)).append("\n");
        sb.append("    accessControlAllowExternal: ").append(toIndentedString(accessControlAllowExternal)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
