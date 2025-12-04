package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowInstanceMessagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asc")

    private Boolean asc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download")

    private Boolean download;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_offset")

    private String messageOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition")

    private String partition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include")

    private String include;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude")

    private String exclude;

    public ShowInstanceMessagesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。获取方法如下：调用“查询所有实例列表”接口，从响应体中获取实例ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowInstanceMessagesRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数解释**： Topic名称。 **约束限制**： Topic名称必须以字母开头且只支持大小写字母、中横线、下划线以及数字。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ShowInstanceMessagesRequest withAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }

    /**
     * **参数解释**： 是否按照时间排序。 **约束限制**： 不涉及。 **取值范围**： - true：按照时间排序。 - false：不按照时间排序。 **默认取值**： 不涉及。
     * @return asc
     */
    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public ShowInstanceMessagesRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间。  Unix毫秒时间戳。  **约束限制**： 查询消息偏移量时，为必选参数。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowInstanceMessagesRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间。  Unix毫秒时间戳。  **约束限制**： 查询消息偏移量时，为必选参数。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowInstanceMessagesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 每一页显示的消息数量。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ShowInstanceMessagesRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 页数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ShowInstanceMessagesRequest withDownload(Boolean download) {
        this.download = download;
        return this;
    }

    /**
     * **参数解释**： 是否下载消息到本地。 **约束限制**： 不涉及。 **取值范围**： - true：下载。 - false：不下载。 **默认取值**： 不涉及。
     * @return download
     */
    public Boolean getDownload() {
        return download;
    }

    public void setDownload(Boolean download) {
        this.download = download;
    }

    public ShowInstanceMessagesRequest withMessageOffset(String messageOffset) {
        this.messageOffset = messageOffset;
        return this;
    }

    /**
     * **参数解释**： 消息偏移量。 **约束限制**： 查询消息内容时，为必选参数。  若start_time、end_time参数不为空，该参数无效。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return messageOffset
     */
    public String getMessageOffset() {
        return messageOffset;
    }

    public void setMessageOffset(String messageOffset) {
        this.messageOffset = messageOffset;
    }

    public ShowInstanceMessagesRequest withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * **参数解释**： 分区。 **约束限制**： 查询消息内容时，为必选参数。  若start_time、end_time参数不为空，该参数无效。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return partition
     */
    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public ShowInstanceMessagesRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * **参数解释**： 设置查询消息的关键词。 **约束限制**： 不涉及。 **取值范围**： 0~50字符。 **默认取值**： 不涉及。
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ShowInstanceMessagesRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**： 设置消息的KEY，查询结果为包含KEY的所有消息。 **约束限制**： 由于查询资源和性能限制，最大搜索10000条消息且所有消息总大小不超过200MB，最多返回包含KEY的前10条消息。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ShowInstanceMessagesRequest withInclude(String include) {
        this.include = include;
        return this;
    }

    /**
     * **参数解释**： 设置消息正文中包含的关键词，查询结果为包含此关键词的消息。 **约束限制**： 多个关键字用%2C隔开，%2C是“,”的URL编码形式。 **取值范围**： include与exclude的关键词总数不得超过20个。 **默认取值**： 不涉及。
     * @return include
     */
    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public ShowInstanceMessagesRequest withExclude(String exclude) {
        this.exclude = exclude;
        return this;
    }

    /**
     * **参数解释**： 设置消息正文中需要排除的关键词，查询结果为不包含此关键词的消息。 **约束限制**： 多个关键字用%2C隔开，%2C是“,”的URL编码形式。 **取值范围**： include与exclude的关键词总数不得超过20个。 **默认取值**： 不涉及。
     * @return exclude
     */
    public String getExclude() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude = exclude;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceMessagesRequest that = (ShowInstanceMessagesRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.asc, that.asc) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.download, that.download)
            && Objects.equals(this.messageOffset, that.messageOffset) && Objects.equals(this.partition, that.partition)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.key, that.key)
            && Objects.equals(this.include, that.include) && Objects.equals(this.exclude, that.exclude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            topic,
            asc,
            startTime,
            endTime,
            limit,
            offset,
            download,
            messageOffset,
            partition,
            keyword,
            key,
            include,
            exclude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceMessagesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    download: ").append(toIndentedString(download)).append("\n");
        sb.append("    messageOffset: ").append(toIndentedString(messageOffset)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    include: ").append(toIndentedString(include)).append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
