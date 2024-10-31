package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CaptureTaskDto
 */
public class CaptureTaskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private CaptureRuleAddressDto destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_packets")

    private Integer maxPackets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private CaptureServiceDto service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private CaptureRuleAddressDto source;

    public CaptureTaskDto withDestination(CaptureRuleAddressDto destination) {
        this.destination = destination;
        return this;
    }

    public CaptureTaskDto withDestination(Consumer<CaptureRuleAddressDto> destinationSetter) {
        if (this.destination == null) {
            this.destination = new CaptureRuleAddressDto();
            destinationSetter.accept(this.destination);
        }

        return this;
    }

    /**
     * Get destination
     * @return destination
     */
    public CaptureRuleAddressDto getDestination() {
        return destination;
    }

    public void setDestination(CaptureRuleAddressDto destination) {
        this.destination = destination;
    }

    public CaptureTaskDto withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 抓包时长，以分钟为单位
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CaptureTaskDto withMaxPackets(Integer maxPackets) {
        this.maxPackets = maxPackets;
        return this;
    }

    /**
     * 最大抓包数，以个为单位
     * maximum: 1000000
     * @return maxPackets
     */
    public Integer getMaxPackets() {
        return maxPackets;
    }

    public void setMaxPackets(Integer maxPackets) {
        this.maxPackets = maxPackets;
    }

    public CaptureTaskDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 抓包任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CaptureTaskDto withService(CaptureServiceDto service) {
        this.service = service;
        return this;
    }

    public CaptureTaskDto withService(Consumer<CaptureServiceDto> serviceSetter) {
        if (this.service == null) {
            this.service = new CaptureServiceDto();
            serviceSetter.accept(this.service);
        }

        return this;
    }

    /**
     * Get service
     * @return service
     */
    public CaptureServiceDto getService() {
        return service;
    }

    public void setService(CaptureServiceDto service) {
        this.service = service;
    }

    public CaptureTaskDto withSource(CaptureRuleAddressDto source) {
        this.source = source;
        return this;
    }

    public CaptureTaskDto withSource(Consumer<CaptureRuleAddressDto> sourceSetter) {
        if (this.source == null) {
            this.source = new CaptureRuleAddressDto();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public CaptureRuleAddressDto getSource() {
        return source;
    }

    public void setSource(CaptureRuleAddressDto source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaptureTaskDto that = (CaptureTaskDto) obj;
        return Objects.equals(this.destination, that.destination) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.maxPackets, that.maxPackets) && Objects.equals(this.name, that.name)
            && Objects.equals(this.service, that.service) && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, duration, maxPackets, name, service, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaptureTaskDto {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    maxPackets: ").append(toIndentedString(maxPackets)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
