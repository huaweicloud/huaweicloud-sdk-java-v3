package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateFeedbackV2Req
 */
public class CreateFeedbackV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files")

    private List<String> files = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private IntellectualPropertyV2 ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts")

    private ContactWayInfoV2 contacts;

    public CreateFeedbackV2Req withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 举报类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateFeedbackV2Req withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 涉案的华为云产品或服务; 举报网址
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateFeedbackV2Req withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 侵权详情说明或举报内容及说明
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CreateFeedbackV2Req withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    public CreateFeedbackV2Req addFilesItem(String filesItem) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(filesItem);
        return this;
    }

    public CreateFeedbackV2Req withFiles(Consumer<List<String>> filesSetter) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        filesSetter.accept(this.files);
        return this;
    }

    /**
     * 相关证明附件列表
     * @return files
     */
    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public CreateFeedbackV2Req withIp(IntellectualPropertyV2 ip) {
        this.ip = ip;
        return this;
    }

    public CreateFeedbackV2Req withIp(Consumer<IntellectualPropertyV2> ipSetter) {
        if (this.ip == null) {
            this.ip = new IntellectualPropertyV2();
            ipSetter.accept(this.ip);
        }

        return this;
    }

    /**
     * Get ip
     * @return ip
     */
    public IntellectualPropertyV2 getIp() {
        return ip;
    }

    public void setIp(IntellectualPropertyV2 ip) {
        this.ip = ip;
    }

    public CreateFeedbackV2Req withContacts(ContactWayInfoV2 contacts) {
        this.contacts = contacts;
        return this;
    }

    public CreateFeedbackV2Req withContacts(Consumer<ContactWayInfoV2> contactsSetter) {
        if (this.contacts == null) {
            this.contacts = new ContactWayInfoV2();
            contactsSetter.accept(this.contacts);
        }

        return this;
    }

    /**
     * Get contacts
     * @return contacts
     */
    public ContactWayInfoV2 getContacts() {
        return contacts;
    }

    public void setContacts(ContactWayInfoV2 contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFeedbackV2Req createFeedbackV2Req = (CreateFeedbackV2Req) o;
        return Objects.equals(this.type, createFeedbackV2Req.type)
            && Objects.equals(this.title, createFeedbackV2Req.title)
            && Objects.equals(this.content, createFeedbackV2Req.content)
            && Objects.equals(this.files, createFeedbackV2Req.files) && Objects.equals(this.ip, createFeedbackV2Req.ip)
            && Objects.equals(this.contacts, createFeedbackV2Req.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, content, files, ip, contacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFeedbackV2Req {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
