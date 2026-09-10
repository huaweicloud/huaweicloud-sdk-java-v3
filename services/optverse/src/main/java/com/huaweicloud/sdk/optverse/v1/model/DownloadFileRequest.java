package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DownloadFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Need-Content")

    private Boolean xNeedContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_id")

    private String chatId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filename")

    private String filename;

    public DownloadFileRequest withXNeedContent(Boolean xNeedContent) {
        this.xNeedContent = xNeedContent;
        return this;
    }

    /**
     * **参数解释**：   返回文件内容。   **约束限制**：   不涉及 **取值范围**：   * true：返回文件内容 * false：不返回文件内容 **默认取值**：   false 
     * @return xNeedContent
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Need-Content")
    public Boolean getXNeedContent() {
        return xNeedContent;
    }

    public void setXNeedContent(Boolean xNeedContent) {
        this.xNeedContent = xNeedContent;
    }

    public DownloadFileRequest withChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * **参数解释**： 对话ID。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return chatId
     */
    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public DownloadFileRequest withFilename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * **参数解释**： 问答ID。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadFileRequest that = (DownloadFileRequest) obj;
        return Objects.equals(this.xNeedContent, that.xNeedContent) && Objects.equals(this.chatId, that.chatId)
            && Objects.equals(this.filename, that.filename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xNeedContent, chatId, filename);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadFileRequest {\n");
        sb.append("    xNeedContent: ").append(toIndentedString(xNeedContent)).append("\n");
        sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
