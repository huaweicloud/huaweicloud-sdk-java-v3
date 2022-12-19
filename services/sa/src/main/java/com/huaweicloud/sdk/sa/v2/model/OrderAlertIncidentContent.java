package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 事件内容
 */
public class OrderAlertIncidentContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_category")

    private String typeCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evidence_list")

    private List<String> evidenceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note_list")

    private List<String> noteList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_list")

    private List<String> attachmentList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_type")

    private OrderAlertIncidentContentIncidentType incidentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public OrderAlertIncidentContent withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 事件名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OrderAlertIncidentContent withTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
        return this;
    }

    /**
     * 事件类型
     * @return typeCategory
     */
    public String getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
    }

    public OrderAlertIncidentContent withEvidenceList(List<String> evidenceList) {
        this.evidenceList = evidenceList;
        return this;
    }

    public OrderAlertIncidentContent addEvidenceListItem(String evidenceListItem) {
        if (this.evidenceList == null) {
            this.evidenceList = new ArrayList<>();
        }
        this.evidenceList.add(evidenceListItem);
        return this;
    }

    public OrderAlertIncidentContent withEvidenceList(Consumer<List<String>> evidenceListSetter) {
        if (this.evidenceList == null) {
            this.evidenceList = new ArrayList<>();
        }
        evidenceListSetter.accept(this.evidenceList);
        return this;
    }

    /**
     * 证据列表
     * @return evidenceList
     */
    public List<String> getEvidenceList() {
        return evidenceList;
    }

    public void setEvidenceList(List<String> evidenceList) {
        this.evidenceList = evidenceList;
    }

    public OrderAlertIncidentContent withNoteList(List<String> noteList) {
        this.noteList = noteList;
        return this;
    }

    public OrderAlertIncidentContent addNoteListItem(String noteListItem) {
        if (this.noteList == null) {
            this.noteList = new ArrayList<>();
        }
        this.noteList.add(noteListItem);
        return this;
    }

    public OrderAlertIncidentContent withNoteList(Consumer<List<String>> noteListSetter) {
        if (this.noteList == null) {
            this.noteList = new ArrayList<>();
        }
        noteListSetter.accept(this.noteList);
        return this;
    }

    /**
     * 评论列表
     * @return noteList
     */
    public List<String> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<String> noteList) {
        this.noteList = noteList;
    }

    public OrderAlertIncidentContent withAttachmentList(List<String> attachmentList) {
        this.attachmentList = attachmentList;
        return this;
    }

    public OrderAlertIncidentContent addAttachmentListItem(String attachmentListItem) {
        if (this.attachmentList == null) {
            this.attachmentList = new ArrayList<>();
        }
        this.attachmentList.add(attachmentListItem);
        return this;
    }

    public OrderAlertIncidentContent withAttachmentList(Consumer<List<String>> attachmentListSetter) {
        if (this.attachmentList == null) {
            this.attachmentList = new ArrayList<>();
        }
        attachmentListSetter.accept(this.attachmentList);
        return this;
    }

    /**
     * 附件列表
     * @return attachmentList
     */
    public List<String> getAttachmentList() {
        return attachmentList;
    }

    public void setAttachmentList(List<String> attachmentList) {
        this.attachmentList = attachmentList;
    }

    public OrderAlertIncidentContent withIncidentType(OrderAlertIncidentContentIncidentType incidentType) {
        this.incidentType = incidentType;
        return this;
    }

    public OrderAlertIncidentContent withIncidentType(
        Consumer<OrderAlertIncidentContentIncidentType> incidentTypeSetter) {
        if (this.incidentType == null) {
            this.incidentType = new OrderAlertIncidentContentIncidentType();
            incidentTypeSetter.accept(this.incidentType);
        }

        return this;
    }

    /**
     * Get incidentType
     * @return incidentType
     */
    public OrderAlertIncidentContentIncidentType getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(OrderAlertIncidentContentIncidentType incidentType) {
        this.incidentType = incidentType;
    }

    public OrderAlertIncidentContent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Id value
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderAlertIncidentContent orderAlertIncidentContent = (OrderAlertIncidentContent) o;
        return Objects.equals(this.title, orderAlertIncidentContent.title)
            && Objects.equals(this.typeCategory, orderAlertIncidentContent.typeCategory)
            && Objects.equals(this.evidenceList, orderAlertIncidentContent.evidenceList)
            && Objects.equals(this.noteList, orderAlertIncidentContent.noteList)
            && Objects.equals(this.attachmentList, orderAlertIncidentContent.attachmentList)
            && Objects.equals(this.incidentType, orderAlertIncidentContent.incidentType)
            && Objects.equals(this.description, orderAlertIncidentContent.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, typeCategory, evidenceList, noteList, attachmentList, incidentType, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderAlertIncidentContent {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    typeCategory: ").append(toIndentedString(typeCategory)).append("\n");
        sb.append("    evidenceList: ").append(toIndentedString(evidenceList)).append("\n");
        sb.append("    noteList: ").append(toIndentedString(noteList)).append("\n");
        sb.append("    attachmentList: ").append(toIndentedString(attachmentList)).append("\n");
        sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
