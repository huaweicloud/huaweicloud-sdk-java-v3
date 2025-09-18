package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 子步骤信息
 */
public class StepInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_offset")

    private Integer currentOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elapsed_time")

    private Long elapsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "faq_url")

    private String faqUrl;

    public StepInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 请求的region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public StepInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 应用id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StepInfo withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public StepInfo withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public StepInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 步骤名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StepInfo withCurrentOffset(Integer currentOffset) {
        this.currentOffset = currentOffset;
        return this;
    }

    /**
     * 当前偏移量
     * @return currentOffset
     */
    public Integer getCurrentOffset() {
        return currentOffset;
    }

    public void setCurrentOffset(Integer currentOffset) {
        this.currentOffset = currentOffset;
    }

    public StepInfo withElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    /**
     * 任务执行时长
     * @return elapsedTime
     */
    public Long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public StepInfo withFaqUrl(String faqUrl) {
        this.faqUrl = faqUrl;
        return this;
    }

    /**
     * 常见问题
     * @return faqUrl
     */
    public String getFaqUrl() {
        return faqUrl;
    }

    public void setFaqUrl(String faqUrl) {
        this.faqUrl = faqUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StepInfo that = (StepInfo) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.id, that.id)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.name, that.name) && Objects.equals(this.currentOffset, that.currentOffset)
            && Objects.equals(this.elapsedTime, that.elapsedTime) && Objects.equals(this.faqUrl, that.faqUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, id, offset, enable, name, currentOffset, elapsedTime, faqUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StepInfo {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    currentOffset: ").append(toIndentedString(currentOffset)).append("\n");
        sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
        sb.append("    faqUrl: ").append(toIndentedString(faqUrl)).append("\n");
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
