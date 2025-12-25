package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建评论请求体
 */
public class CreateNoteRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "war_room_id")

    private String warRoomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note_type")

    private String noteType;

    public CreateNoteRequestBody withWarRoomId(String warRoomId) {
        this.warRoomId = warRoomId;
        return this;
    }

    /**
     * 评论的对象ID
     * @return warRoomId
     */
    public String getWarRoomId() {
        return warRoomId;
    }

    public void setWarRoomId(String warRoomId) {
        this.warRoomId = warRoomId;
    }

    public CreateNoteRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 评论的类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateNoteRequestBody withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 评论的内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CreateNoteRequestBody withNoteType(String noteType) {
        this.noteType = noteType;
        return this;
    }

    /**
     * 评论的动作类型
     * @return noteType
     */
    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNoteRequestBody that = (CreateNoteRequestBody) obj;
        return Objects.equals(this.warRoomId, that.warRoomId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.content, that.content) && Objects.equals(this.noteType, that.noteType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warRoomId, type, content, noteType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNoteRequestBody {\n");
        sb.append("    warRoomId: ").append(toIndentedString(warRoomId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    noteType: ").append(toIndentedString(noteType)).append("\n");
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
