package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 评论详情对象
 */
public class NotesDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private NotesDetailData data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Boolean isDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marked_note")

    private Boolean markedNote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note_type")

    private String noteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private NotesDetailUser user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "war_room_id")

    private String warRoomId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private Object content;

    public NotesDetail withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public NotesDetail withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public NotesDetail withData(NotesDetailData data) {
        this.data = data;
        return this;
    }

    public NotesDetail withData(Consumer<NotesDetailData> dataSetter) {
        if (this.data == null) {
            this.data = new NotesDetailData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public NotesDetailData getData() {
        return data;
    }

    public void setData(NotesDetailData data) {
        this.data = data;
    }

    public NotesDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 评论唯一UUID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NotesDetail withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否已删除
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public NotesDetail withMarkedNote(Boolean markedNote) {
        this.markedNote = markedNote;
        return this;
    }

    /**
     * 标识是否是评论
     * @return markedNote
     */
    public Boolean getMarkedNote() {
        return markedNote;
    }

    public void setMarkedNote(Boolean markedNote) {
        this.markedNote = markedNote;
    }

    public NotesDetail withNoteType(String noteType) {
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

    public NotesDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public NotesDetail withType(String type) {
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

    public NotesDetail withUser(NotesDetailUser user) {
        this.user = user;
        return this;
    }

    public NotesDetail withUser(Consumer<NotesDetailUser> userSetter) {
        if (this.user == null) {
            this.user = new NotesDetailUser();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public NotesDetailUser getUser() {
        return user;
    }

    public void setUser(NotesDetailUser user) {
        this.user = user;
    }

    public NotesDetail withWarRoomId(String warRoomId) {
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

    public NotesDetail withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 空间
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public NotesDetail withContent(Object content) {
        this.content = content;
        return this;
    }

    /**
     * 评论详情信息
     * @return content
     */
    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotesDetail that = (NotesDetail) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.data, that.data) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isDeleted, that.isDeleted) && Objects.equals(this.markedNote, that.markedNote)
            && Objects.equals(this.noteType, that.noteType) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.user, that.user)
            && Objects.equals(this.warRoomId, that.warRoomId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            updateTime,
            data,
            id,
            isDeleted,
            markedNote,
            noteType,
            projectId,
            type,
            user,
            warRoomId,
            workspaceId,
            content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotesDetail {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    markedNote: ").append(toIndentedString(markedNote)).append("\n");
        sb.append("    noteType: ").append(toIndentedString(noteType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    warRoomId: ").append(toIndentedString(warRoomId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
