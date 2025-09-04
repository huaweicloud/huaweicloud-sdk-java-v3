package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class TestReportCustomDetailVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private Integer display;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachments")

    private List<AttachmentVo> attachments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator")

    private String updator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_report_uri")

    private String testReportUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_timestamp")

    private Long createTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_timestamp")

    private Long updateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator_name")

    private String updatorName;

    public TestReportCustomDetailVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 测试报告自定义模块Uri
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TestReportCustomDetailVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测试报告自定义模块名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestReportCustomDetailVo withDisplay(Integer display) {
        this.display = display;
        return this;
    }

    /**
     * 是否显示(0:否，1:是)
     * @return display
     */
    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public TestReportCustomDetailVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TestReportCustomDetailVo withAttachments(List<AttachmentVo> attachments) {
        this.attachments = attachments;
        return this;
    }

    public TestReportCustomDetailVo addAttachmentsItem(AttachmentVo attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    public TestReportCustomDetailVo withAttachments(Consumer<List<AttachmentVo>> attachmentsSetter) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        attachmentsSetter.accept(this.attachments);
        return this;
    }

    /**
     * 附件信息
     * @return attachments
     */
    public List<AttachmentVo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentVo> attachments) {
        this.attachments = attachments;
    }

    public TestReportCustomDetailVo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人ID
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public TestReportCustomDetailVo withUpdator(String updator) {
        this.updator = updator;
        return this;
    }

    /**
     * 修改人ID
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public TestReportCustomDetailVo withTestReportUri(String testReportUri) {
        this.testReportUri = testReportUri;
        return this;
    }

    /**
     * 测试报告uri
     * @return testReportUri
     */
    public String getTestReportUri() {
        return testReportUri;
    }

    public void setTestReportUri(String testReportUri) {
        this.testReportUri = testReportUri;
    }

    public TestReportCustomDetailVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public TestReportCustomDetailVo withCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }

    /**
     * 创建时间戳
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public TestReportCustomDetailVo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TestReportCustomDetailVo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public TestReportCustomDetailVo withUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * 修改时间戳
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public TestReportCustomDetailVo withUpdatorName(String updatorName) {
        this.updatorName = updatorName;
        return this;
    }

    /**
     * 修改人名
     * @return updatorName
     */
    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestReportCustomDetailVo that = (TestReportCustomDetailVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.name, that.name)
            && Objects.equals(this.display, that.display) && Objects.equals(this.description, that.description)
            && Objects.equals(this.attachments, that.attachments) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.updator, that.updator) && Objects.equals(this.testReportUri, that.testReportUri)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimestamp, that.createTimestamp)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp)
            && Objects.equals(this.updatorName, that.updatorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            name,
            display,
            description,
            attachments,
            creator,
            updator,
            testReportUri,
            createTime,
            createTimestamp,
            creatorName,
            updateTime,
            updateTimestamp,
            updatorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestReportCustomDetailVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    updator: ").append(toIndentedString(updator)).append("\n");
        sb.append("    testReportUri: ").append(toIndentedString(testReportUri)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    updatorName: ").append(toIndentedString(updatorName)).append("\n");
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
