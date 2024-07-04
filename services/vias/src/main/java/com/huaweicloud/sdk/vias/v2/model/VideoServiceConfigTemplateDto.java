package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VideoServiceConfigTemplateDto
 */
public class VideoServiceConfigTemplateDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roi")

    private String roi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceConfig")

    private String serviceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createAt")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifyAt")

    private Long modifyAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "numTask")

    private Integer numTask;

    public VideoServiceConfigTemplateDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 算法服务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VideoServiceConfigTemplateDto withRoi(String roi) {
        this.roi = roi;
        return this;
    }

    /**
     * 公共roi
     * @return roi
     */
    public String getRoi() {
        return roi;
    }

    public void setRoi(String roi) {
        this.roi = roi;
    }

    public VideoServiceConfigTemplateDto withServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }

    /**
     * 算法服务公共配置
     * @return serviceConfig
     */
    public String getServiceConfig() {
        return serviceConfig;
    }

    public void setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    public VideoServiceConfigTemplateDto withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public VideoServiceConfigTemplateDto withModifyAt(Long modifyAt) {
        this.modifyAt = modifyAt;
        return this;
    }

    /**
     * 修改时间
     * @return modifyAt
     */
    public Long getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(Long modifyAt) {
        this.modifyAt = modifyAt;
    }

    public VideoServiceConfigTemplateDto withNumTask(Integer numTask) {
        this.numTask = numTask;
        return this;
    }

    /**
     * 已运行算法数量
     * @return numTask
     */
    public Integer getNumTask() {
        return numTask;
    }

    public void setNumTask(Integer numTask) {
        this.numTask = numTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoServiceConfigTemplateDto that = (VideoServiceConfigTemplateDto) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.roi, that.roi)
            && Objects.equals(this.serviceConfig, that.serviceConfig) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.modifyAt, that.modifyAt) && Objects.equals(this.numTask, that.numTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roi, serviceConfig, createAt, modifyAt, numTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoServiceConfigTemplateDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roi: ").append(toIndentedString(roi)).append("\n");
        sb.append("    serviceConfig: ").append(toIndentedString(serviceConfig)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    modifyAt: ").append(toIndentedString(modifyAt)).append("\n");
        sb.append("    numTask: ").append(toIndentedString(numTask)).append("\n");
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
