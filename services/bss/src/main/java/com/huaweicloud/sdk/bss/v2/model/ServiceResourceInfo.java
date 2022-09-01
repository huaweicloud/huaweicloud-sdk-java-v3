package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServiceResourceInfo
 */
public class ServiceResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_info")

    @JacksonXmlProperty(localName = "basic_info")

    private ResourceBasicInfo basicInfo;

    public ServiceResourceInfo withBasicInfo(ResourceBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ServiceResourceInfo withBasicInfo(Consumer<ResourceBasicInfo> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new ResourceBasicInfo();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public ResourceBasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(ResourceBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceResourceInfo serviceResourceInfo = (ServiceResourceInfo) o;
        return Objects.equals(this.basicInfo, serviceResourceInfo.basicInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceResourceInfo {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
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
