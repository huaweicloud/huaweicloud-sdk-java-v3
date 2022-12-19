package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * indicator create request
 */
public class IndicatorCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format_version")

    private Integer formatVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_flag")

    private Boolean triggerFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_object")

    private CreateIndicatorDetail dataObject;

    public IndicatorCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指标名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IndicatorCreateRequest withFormatVersion(Integer formatVersion) {
        this.formatVersion = formatVersion;
        return this;
    }

    /**
     * 版本号
     * minimum: 1
     * maximum: 999999
     * @return formatVersion
     */
    public Integer getFormatVersion() {
        return formatVersion;
    }

    public void setFormatVersion(Integer formatVersion) {
        this.formatVersion = formatVersion;
    }

    public IndicatorCreateRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型（SIMULATION,PLAYBOOK,MANUAL,INSTANCE,DATA_SOURCE）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IndicatorCreateRequest withTriggerFlag(Boolean triggerFlag) {
        this.triggerFlag = triggerFlag;
        return this;
    }

    /**
     * 触发标志
     * @return triggerFlag
     */
    public Boolean getTriggerFlag() {
        return triggerFlag;
    }

    public void setTriggerFlag(Boolean triggerFlag) {
        this.triggerFlag = triggerFlag;
    }

    public IndicatorCreateRequest withDataObject(CreateIndicatorDetail dataObject) {
        this.dataObject = dataObject;
        return this;
    }

    public IndicatorCreateRequest withDataObject(Consumer<CreateIndicatorDetail> dataObjectSetter) {
        if (this.dataObject == null) {
            this.dataObject = new CreateIndicatorDetail();
            dataObjectSetter.accept(this.dataObject);
        }

        return this;
    }

    /**
     * Get dataObject
     * @return dataObject
     */
    public CreateIndicatorDetail getDataObject() {
        return dataObject;
    }

    public void setDataObject(CreateIndicatorDetail dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndicatorCreateRequest indicatorCreateRequest = (IndicatorCreateRequest) o;
        return Objects.equals(this.name, indicatorCreateRequest.name)
            && Objects.equals(this.formatVersion, indicatorCreateRequest.formatVersion)
            && Objects.equals(this.type, indicatorCreateRequest.type)
            && Objects.equals(this.triggerFlag, indicatorCreateRequest.triggerFlag)
            && Objects.equals(this.dataObject, indicatorCreateRequest.dataObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, formatVersion, type, triggerFlag, dataObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndicatorCreateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    triggerFlag: ").append(toIndentedString(triggerFlag)).append("\n");
        sb.append("    dataObject: ").append(toIndentedString(dataObject)).append("\n");
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
