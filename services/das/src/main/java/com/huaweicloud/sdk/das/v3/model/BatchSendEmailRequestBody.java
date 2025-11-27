package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchSendEmailRequestBody
 */
public class BatchSendEmailRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id_list")

    private List<String> taskIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_uri")

    private String serviceUri;

    public BatchSendEmailRequestBody withTaskIdList(List<String> taskIdList) {
        this.taskIdList = taskIdList;
        return this;
    }

    public BatchSendEmailRequestBody addTaskIdListItem(String taskIdListItem) {
        if (this.taskIdList == null) {
            this.taskIdList = new ArrayList<>();
        }
        this.taskIdList.add(taskIdListItem);
        return this;
    }

    public BatchSendEmailRequestBody withTaskIdList(Consumer<List<String>> taskIdListSetter) {
        if (this.taskIdList == null) {
            this.taskIdList = new ArrayList<>();
        }
        taskIdListSetter.accept(this.taskIdList);
        return this;
    }

    /**
     * 报告ID列表
     * @return taskIdList
     */
    public List<String> getTaskIdList() {
        return taskIdList;
    }

    public void setTaskIdList(List<String> taskIdList) {
        this.taskIdList = taskIdList;
    }

    public BatchSendEmailRequestBody withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱地址
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BatchSendEmailRequestBody withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 主题名称
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public BatchSendEmailRequestBody withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题标识符
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public BatchSendEmailRequestBody withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * OBS桶名
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public BatchSendEmailRequestBody withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * 服务地址
     * @return serviceUri
     */
    public String getServiceUri() {
        return serviceUri;
    }

    public void setServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSendEmailRequestBody that = (BatchSendEmailRequestBody) obj;
        return Objects.equals(this.taskIdList, that.taskIdList) && Objects.equals(this.email, that.email)
            && Objects.equals(this.topic, that.topic) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.serviceUri, that.serviceUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskIdList, email, topic, topicUrn, obsBucketName, serviceUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSendEmailRequestBody {\n");
        sb.append("    taskIdList: ").append(toIndentedString(taskIdList)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    serviceUri: ").append(toIndentedString(serviceUri)).append("\n");
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
