package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNotebookResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_name")

    private String eihealthProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorInfo flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private NotebookStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private NotebookImage image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storages")

    private List<NotebookStorage> storages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<TaskEventRsp> events = null;

    public ShowNotebookResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * notebook ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowNotebookResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * notebook名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowNotebookResponse withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * **参数解释**： 空间ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public ShowNotebookResponse withEihealthProjectName(String eihealthProjectName) {
        this.eihealthProjectName = eihealthProjectName;
        return this;
    }

    /**
     * **参数解释**： 空间名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return eihealthProjectName
     */
    public String getEihealthProjectName() {
        return eihealthProjectName;
    }

    public void setEihealthProjectName(String eihealthProjectName) {
        this.eihealthProjectName = eihealthProjectName;
    }

    public ShowNotebookResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * notebook描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowNotebookResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * notebook所属用户
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowNotebookResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * notebook访问URL
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowNotebookResponse withFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
        return this;
    }

    public ShowNotebookResponse withFlavor(Consumer<FlavorInfo> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new FlavorInfo();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public FlavorInfo getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
    }

    public ShowNotebookResponse withStatus(NotebookStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public NotebookStatus getStatus() {
        return status;
    }

    public void setStatus(NotebookStatus status) {
        this.status = status;
    }

    public ShowNotebookResponse withImage(NotebookImage image) {
        this.image = image;
        return this;
    }

    public ShowNotebookResponse withImage(Consumer<NotebookImage> imageSetter) {
        if (this.image == null) {
            this.image = new NotebookImage();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public NotebookImage getImage() {
        return image;
    }

    public void setImage(NotebookImage image) {
        this.image = image;
    }

    public ShowNotebookResponse withStorages(List<NotebookStorage> storages) {
        this.storages = storages;
        return this;
    }

    public ShowNotebookResponse addStoragesItem(NotebookStorage storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    public ShowNotebookResponse withStorages(Consumer<List<NotebookStorage>> storagesSetter) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        storagesSetter.accept(this.storages);
        return this;
    }

    /**
     * notebook存储信息
     * @return storages
     */
    public List<NotebookStorage> getStorages() {
        return storages;
    }

    public void setStorages(List<NotebookStorage> storages) {
        this.storages = storages;
    }

    public ShowNotebookResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * notebook创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowNotebookResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * notebook更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowNotebookResponse withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * notebook失败信息
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public ShowNotebookResponse withEvents(List<TaskEventRsp> events) {
        this.events = events;
        return this;
    }

    public ShowNotebookResponse addEventsItem(TaskEventRsp eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ShowNotebookResponse withEvents(Consumer<List<TaskEventRsp>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * cce事件
     * @return events
     */
    public List<TaskEventRsp> getEvents() {
        return events;
    }

    public void setEvents(List<TaskEventRsp> events) {
        this.events = events;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNotebookResponse that = (ShowNotebookResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.eihealthProjectId, that.eihealthProjectId)
            && Objects.equals(this.eihealthProjectName, that.eihealthProjectName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.url, that.url) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.status, that.status) && Objects.equals(this.image, that.image)
            && Objects.equals(this.storages, that.storages) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.failedMessage, that.failedMessage) && Objects.equals(this.events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            eihealthProjectId,
            eihealthProjectName,
            description,
            creator,
            url,
            flavor,
            status,
            image,
            storages,
            createTime,
            updateTime,
            failedMessage,
            events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNotebookResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
        sb.append("    eihealthProjectName: ").append(toIndentedString(eihealthProjectName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
